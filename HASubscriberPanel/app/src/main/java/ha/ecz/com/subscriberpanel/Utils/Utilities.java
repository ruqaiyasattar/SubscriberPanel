package ha.ecz.com.subscriberpanel.Utils;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.preference.PreferenceManager;
import android.view.Gravity;
import android.widget.Toast;

public class Utilities {

    public static ProgressDialog _objProgDialog;

    public static boolean isConnectingToInternet(Context context){
        ConnectivityManager objCon = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        if(objCon != null){
            NetworkInfo[] info = objCon.getAllNetworkInfo();
            if(info != null){
                for(int i = 0; i < info.length; i++){
                    if(info[i].getState() == NetworkInfo.State.CONNECTED){
                        return true;
                    }
                }
            }
        }

        Toast.makeText(context, "Please check internet connection", Toast.LENGTH_LONG).show();
        return false;
    }

    public static void showProgressDialogue(Context context)
    {
        if (_objProgDialog == null) {
            _objProgDialog = new ProgressDialog(context);
            _objProgDialog.setTitle("Please Wait");
            _objProgDialog.setMessage("Loading...");
            _objProgDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            _objProgDialog.setCancelable(false);
            _objProgDialog.setCanceledOnTouchOutside(false);
            _objProgDialog.getWindow().getAttributes().gravity = Gravity.CENTER;
            _objProgDialog.show();
        }
    }

    public static void hideProgressDialogue()
    {
        if (_objProgDialog != null) {
            _objProgDialog.hide();
            _objProgDialog.dismiss();
            _objProgDialog = null;
        }
    }

    public static void setPreference(Context context, String key, String value) {

        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getPreference(Context context, String key,
                                       String defaultValue) {
        SharedPreferences preferences = PreferenceManager
                .getDefaultSharedPreferences(context);
        return preferences.getString(key, defaultValue);
    }

    public enum KEYS_DOCTOR {doctorID,Experience,Specialization,Doctorname}
}
