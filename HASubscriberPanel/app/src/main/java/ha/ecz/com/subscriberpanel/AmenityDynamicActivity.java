package ha.ecz.com.subscriberpanel;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import ha.ecz.com.subscriberpanel.Utils.Parser;

public class AmenityDynamicActivity extends AppCompatActivity {
    private AmenityDynamicTask objMyTask = null;
    private Context context;
    private ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amenity_dynamic);
        AmenityDynamicTask obj = new AmenityDynamicTask();
        obj.execute();
        TextView textView  = (TextView) findViewById(R.id.txtamenity);
    }

    public class AmenityDynamicTask extends AsyncTask<Void,Void,String>{
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd = new ProgressDialog(AmenityDynamicActivity.this);
            pd.setIndeterminate(false);
            pd.setTitle("Please wait");
            pd.setMessage("Loading...");
            pd.show();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            pd.hide();
            Toast.makeText(AmenityDynamicActivity.this,"Testing",Toast.LENGTH_LONG).show();
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
        }

        @Override
        protected String doInBackground(Void... voids) {

            String url = "http://rehajomobileapi.hundredalpha.com/api/Amenities/GETAmenityDynamicControls/?PropertyID=1046&CategID=4";
            String content = Parser.Get(url);
            return content;
        }
    }
}
