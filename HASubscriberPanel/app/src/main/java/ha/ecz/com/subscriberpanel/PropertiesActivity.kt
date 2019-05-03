package ha.ecz.com.subscriberpanel

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

import com.android.volley.Request
import com.google.gson.Gson

import ha.ecz.com.subscriberpanel.Adapter.PropertiesAdapter
import ha.ecz.com.subscriberpanel.Models.ApplicationUser
import ha.ecz.com.subscriberpanel.Models.ManageProperty
import ha.ecz.com.subscriberpanel.Models.Property
import ha.ecz.com.subscriberpanel.RESTService.CVStringResp
import ha.ecz.com.subscriberpanel.RESTService.VolleyStrCallback
import ha.ecz.com.subscriberpanel.Utils.Utilities
import kotlinx.android.synthetic.main.activity_properties.*

@Suppress("DEPRECATION")
class PropertiesActivity : AppCompatActivity() {

    private var _objContext: Context? = null
    private val _objGSON = Gson()
    private var _objApp: ApplicationUser? = null
    private var _imgMenubutton: ImageView? = null// Actionbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_properties)

        _objContext = applicationContext

        _objApp = _objGSON.fromJson(Utilities.getPreference(_objContext, "adminObj", ""), ApplicationUser::class.java)

        SetCustomActionBar()

        rvProperties.layoutManager = LinearLayoutManager(this@PropertiesActivity)
        val sbParams = StringBuilder()
        sbParams.append("UserID=" + Integer.toString(_objApp!!.UserId))
        sbParams.append("&SubsID=" + Integer.toString(_objApp!!.SubscriberId))
        sbParams.append("&AuthToken=" + _objApp!!.AuthToken)

        val objRR = CVStringResp()
        objRR.STRINGReqResp(this@PropertiesActivity, Request.Method.GET,
                "Properties/GETPropertiesSearch?$sbParams", object : VolleyStrCallback {
            @Throws(Exception::class)
            override fun onSuccess(result: String?) {
                if (result != null) {
                    if (result.isNotEmpty() && result !== "[]") {

                        val objPA = PropertiesAdapter(_objGSON.fromJson(result, Array<Property>::class.java))
                        rvProperties.adapter = objPA
                    } else {
                        Toast.makeText(_objContext, "No record found", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Toast.makeText(_objContext, "No record found", Toast.LENGTH_SHORT).show()
                }
            }

            @Throws(Exception::class)
            override fun onError(result: String) {
                Log.e("Err From Out Call", result)
                Toast.makeText(_objContext, result, Toast.LENGTH_SHORT).show()
            }
        }, null)

        btnAddProperty.setOnClickListener {

            val intent = Intent(this@PropertiesActivity, ManagePropertyMasterActivity::class.java)

            val UserId = Integer.toString(_objApp!!.UserId)
            val SubId = Integer.toString(_objApp!!.SubscriberId)

            intent.putExtra("userId", UserId.toString())
            intent.putExtra("subId", SubId.toString())
            startActivity(intent)

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true
    }

    private fun SetCustomActionBar() {

        supportActionBar!!.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM
        supportActionBar!!.setCustomView(R.layout.custom_action_bar)
        supportActionBar!!.setDisplayShowTitleEnabled(false)
        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar!!.setDisplayUseLogoEnabled(false)
        supportActionBar!!.setDisplayShowHomeEnabled(false)
        supportActionBar!!.setBackgroundDrawable(_objContext!!.resources.getDrawable(
                R.drawable.drawable_actionbar_back))
        _imgMenubutton = findViewById<View>(R.id.imgMenu) as ImageView
        _imgMenubutton!!.visibility = View.GONE
    }

}
