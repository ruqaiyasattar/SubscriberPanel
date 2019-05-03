package ha.ecz.com.subscriberpanel


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.seatgeek.placesautocomplete.PlacesApi
import com.seatgeek.placesautocomplete.adapter.AbstractPlacesAutocompleteAdapter
import com.seatgeek.placesautocomplete.history.AutocompleteHistoryManager
import com.seatgeek.placesautocomplete.model.AutocompleteResultType
import com.seatgeek.placesautocomplete.model.Place



class TestPlacesAutocompleteAdapter (
    context: Context,
    api: PlacesApi,
    autocompleteResultType: AutocompleteResultType?,
    history: AutocompleteHistoryManager?
) : AbstractPlacesAutocompleteAdapter(context, api, autocompleteResultType, history) {
    override fun newView(p0: ViewGroup?): View {
        val view = LayoutInflater.from(context).inflate(ha.ecz.com.subscriberpanel.R.layout.places_autocomplete_item, p0, false)
        return view
    }

    override fun bindView(p0: View?, p1: Place?) {
        (p0 as TextView).text = p1?.description
    }


}