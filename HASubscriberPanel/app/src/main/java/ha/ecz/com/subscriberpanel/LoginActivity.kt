package ha.ecz.com.subscriberpanel

import android.content.Context
import android.content.Intent
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

import com.android.volley.Request
import com.daimajia.slider.library.SliderLayout
import com.daimajia.slider.library.SliderTypes.BaseSliderView
import com.daimajia.slider.library.SliderTypes.TextSliderView
import com.daimajia.slider.library.Tricks.ViewPagerEx

import org.json.JSONException
import org.json.JSONObject

import java.util.HashMap

import ha.ecz.com.subscriberpanel.RESTService.CVJSONObjectResp
import ha.ecz.com.subscriberpanel.RESTService.VolleyCallback
import ha.ecz.com.subscriberpanel.Utils.Utilities
import kotlinx.android.synthetic.main.activity_login.*


@Suppress("DEPRECATION")
class LoginActivity : AppCompatActivity(), ViewPagerEx.OnPageChangeListener {

    private var _objContext: Context? = null
    private var _imgMenubutton: ImageView? = null// Actionbar
    private var _topSlider: SliderLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        _objContext = applicationContext

        SetCustomActionBar()

        initSlider()

        btnSignIn.setOnClickListener {
            when {
                txtUserEmail.text.toString().isEmpty() -> Toast.makeText(_objContext, "Please enter valid Email Address",
                        Toast.LENGTH_SHORT).show()
                txtUserPassword.text.toString().isEmpty() -> Toast.makeText(_objContext, "Please enter valid Password",
                        Toast.LENGTH_SHORT).show()
                else -> {
                    val params = HashMap<String, String>()
                    params["UserEmail"] = txtUserEmail.text.toString()
                    params["Password"] = txtUserPassword.text.toString()

                    val objRR = CVJSONObjectResp()
                    objRR.JSONReqResp(this@LoginActivity, Request.Method.POST,
                            "ApplicationUsers/POSTLogIn", object : VolleyCallback {
                        @Throws(JSONException::class)
                        override fun onSuccess(result: JSONObject?) {
                            //JSONObject objRes = result;
                            if (result != null) {
                                if (result.length() > 0) {
                                    //ApplicationUser objApp = _objGSON.fromJson(result.toString(), ApplicationUser.class);

                                    Utilities.setPreference(_objContext, "adminObj", result.toString())

                                    val i = Intent(this@LoginActivity, DashboardActivity::class.java)
                                    startActivity(i)
                                    finish()
                                }
                            }
                        }

                        @Throws(Exception::class)
                        override fun onError(result: String) {
                            Log.e("Err From Out Call", result)
                            Toast.makeText(_objContext, result,
                                    Toast.LENGTH_SHORT).show()
                        }
                    }, params)
                }
            }
        }

        btnSignIn.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    v.background.setColorFilter(-0x1ff1a1a, PorterDuff.Mode.SRC_ATOP)
                    v.invalidate()
                }
                MotionEvent.ACTION_UP -> {
                    v.background.clearColorFilter()
                    v.invalidate()
                }
            }
            false
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

    private fun initSlider() {
        _topSlider = findViewById<View>(R.id.slider) as SliderLayout

        val file_maps = HashMap<String, Int>()
        file_maps["One"] = R.drawable.slider_image_1
        file_maps["Two"] = R.drawable.slider_image_2
        file_maps["Three"] = R.drawable.slider_image_3

        for (name in file_maps.keys) {
            val textSliderView = TextSliderView(this)
            // initialize a SliderLayout
            textSliderView
                    .image(file_maps[name]!!).scaleType = BaseSliderView.ScaleType.Fit

            //add your extra information
            textSliderView.bundle(Bundle())
            textSliderView.bundle
                    .putString("extra", name)

            _topSlider!!.addSlider(textSliderView)
        }
        _topSlider!!.setPresetTransformer(SliderLayout.Transformer.Background2Foreground)
        _topSlider!!.setDuration(2000)
        _topSlider!!.addOnPageChangeListener(this)
    }

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {}

    override fun onPageSelected(position: Int) {
        Log.d("Slider Demo", "Page Changed: $position")
    }

    override fun onPageScrollStateChanged(state: Int) {}
}
