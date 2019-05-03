package ha.ecz.com.subscriberpanel.Adapter


import android.content.Intent
import android.content.Intent.getIntent
import android.graphics.Bitmap
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import ha.ecz.com.subscriberpanel.Models.ManageProperty
import java.io.ByteArrayOutputStream
import android.net.Uri
import android.provider.MediaStore.*
import ha.ecz.com.subscriberpanel.Models.Property
import ha.ecz.com.subscriberpanel.R


class PropertiesAdapter(private val _propsData: Array<Property>) : RecyclerView.Adapter<PropertiesAdapter.PropertiesViewHolder>() {

    companion object {
        lateinit var bitmm: Bitmap
    }

    val getimgstring = Intent().getStringExtra("base64String")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PropertiesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.property_listitem, parent, false)
        return PropertiesViewHolder(view)
    }

    override fun onBindViewHolder(holder: PropertiesViewHolder, position: Int) {

        val objProp = _propsData[position]
        holder._txtPropTitle.text = objProp.Title
        holder._txtLocation.text = objProp.StreetRoadName
        holder._txtPrice.text = java.lang.Double.toString(objProp.PriceBudget)
        holder._txtArea.text = java.lang.Double.toString(objProp.LandArea)
      //  val baos = ByteArrayOutputStream()
       //  bitmm = Images.Media.getBitmap(holder.itemView.context.contentResolver, Uri.parse(getimgstring)) // filePath is our BASE64 string

      //  holder._imgProp.setImageBitmap(bm) = objProp.ImageURL

    }

    override fun getItemCount(): Int {
        return _propsData.size
    }

    inner class PropertiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val _imgProp: ImageView = itemView.findViewById<View>(R.id.imgProperty) as ImageView
        val _txtPropTitle: TextView = itemView.findViewById<View>(R.id.txtPropTitle) as TextView
        val _txtLocation: TextView = itemView.findViewById<View>(R.id.txtLocation) as TextView
        val _txtPrice: TextView = itemView.findViewById<View>(R.id.txtPrice) as TextView
        val _txtArea: TextView = itemView.findViewById<View>(R.id.txtArea) as TextView

        init {
        }
    }

}
