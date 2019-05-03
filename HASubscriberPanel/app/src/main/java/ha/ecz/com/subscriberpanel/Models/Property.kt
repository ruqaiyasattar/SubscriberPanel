package ha.ecz.com.subscriberpanel.Models

class Property {
    var PropertyID: Int = 0
    var Title: String? = null
    var Description: String? = null
    var Address: String? = null
    var StreetRoadName: String? = null
    var DistrictZone: String? = null
    var PostalCode: String? = null
    var CityID: Int = 0
    var City: City? = null
    var PropertyCategoryID: Int = 0
    var PropertyCategory: PropertyCategory? = null
    var PurposeID: Int = 0
    var Purpose: Purpose? = null
    var LandArea: Double = 0.toDouble()
    var LandAreaUnitID: Int = 0
    var LandAreaUnit: Unit? = null
    var PriceBudget: Double = 0.toDouble()
    var CurrencyID: Int = 0
    var Currency: Currency? = null
    var Latitude: Double = 0.toDouble()
    var Longitude: Double = 0.toDouble()
    var Privacy: Int = 0
    var IsHot: Boolean = false
    var IsFeatured: Boolean = false
    var IsPromo: Boolean = false
    var IsPopOut: Boolean = false
    var ImageURL: String? = null
    var LocalAreaName: String? = null
    var Active: Boolean = false
    var SubscriberID: Int = 0
    var CreatedDate: String? = null
    var CreatedBy: Int = 0
    var LastUpdated: String? = null
    var DescriptionInText: String? = null
    var Address_Component: String? = null
    var LocationAlias: String? = null
    var SubLocalityLevel: String? = null

}
