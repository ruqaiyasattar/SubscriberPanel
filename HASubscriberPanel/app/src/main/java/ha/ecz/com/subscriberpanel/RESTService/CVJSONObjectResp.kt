package ha.ecz.com.subscriberpanel.RESTService

import android.content.Context
import android.widget.Toast

import com.android.volley.NetworkResponse
import com.android.volley.Response
import com.android.volley.VolleyError
import ha.ecz.com.subscriberpanel.Utils.Utilities

import org.json.JSONException
import org.json.JSONObject

class CVJSONObjectResp {

    // Custom JSON GET | POST Request Response Handler
    fun JSONReqResp(context: Context, method: Int, url: String,
                    callback: VolleyCallback, params: Map<String, String>) {
        if (Utilities.isConnectingToInternet(context.applicationContext)) {

            //Utilities.showProgressDialogue(context)
            //Request.Method. 0GET  | 1POST
            val rq = object : CVJSONObjectReq(method, url, null,
                    Response.Listener<JSONObject> { response ->
                        //Pass response to success callback
                        try {
                            callback.onSuccess(response)
                        } catch (e: Exception) {
                            //Log.e("ResponseEx", e.toString());
                            e.printStackTrace()
                            Toast.makeText(context.applicationContext, e.toString(), Toast.LENGTH_SHORT).show()
                        } finally {
                            Utilities.hideProgressDialogue()
                        }
                    },
                    Response.ErrorListener { error ->
                        val networkResponse = error.networkResponse
                        if (networkResponse != null && networkResponse.data != null) {

                            try {
                                val strError = String(networkResponse.data)
                                val jsonError = JSONObject(strError)
                                Toast.makeText(context.applicationContext, jsonError.getString("Message"), Toast.LENGTH_LONG).show()
                            } catch (e: JSONException) {
                                val strError = String(networkResponse.data)
                                Toast.makeText(context.applicationContext, strError, Toast.LENGTH_LONG).show()
                            }

                        }
                        //Log.e("VolleyError", error.toString() + " Throwable " + error.getCause());
                        Utilities.hideProgressDialogue()
                    }) {
                //            @Override
                //            public Map<String, String> getHeaders() throws AuthFailureError {
                //                HashMap<String, String> headers = new HashMap<>();
                //                headers.put("Accept", "application/json");
                //                headers.put("Content-Type", "application/json");
                //                return headers;
                //            }

                override fun getParams(): Map<String, String> {
                    //                Map<String, String> params = new HashMap<String, String>();
                    return params
                }
            }

            // Request added to the RequestQueue
            VolleyController.getInstance(context.applicationContext).addToRequestQueue(rq)
        }
    }

}
