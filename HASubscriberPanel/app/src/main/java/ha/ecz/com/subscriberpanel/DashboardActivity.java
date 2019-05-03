package ha.ecz.com.subscriberpanel;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class DashboardActivity extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout _btnManageProperty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        _btnManageProperty = findViewById(R.id.btnManageProperty);
        _btnManageProperty.setOnClickListener(this);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.btnManageProperty:
                Intent sa = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(sa);
                break;
            case R.id.layout_medicine:
                Intent ma = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(ma);
                break;
            case R.id.layout_disease:
                Intent da = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(da);
                break;
            case R.id.layout_device_issued:
                Intent di = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(di);
                break;
            case R.id.layout_prescription:
                Intent pi = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(pi);
                break;
            case R.id.layout_test:
                Intent ti = new Intent(DashboardActivity.this, PropertiesActivity.class);
                startActivity(ti);
                break;
        }

    }
}
