package ha.ecz.com.subscriberpanel.Models

data class PropertyAddRequest(
        val Active: Boolean,
        val Address: Any,
        val Address_Component: Any,
        val City: Any,
        val CityID: Int,
        val CreatedBy: Int,
        val CreatedDate: String,
        val Currency: Any,
        val CurrencyID: Int,
        val Description: Any,
        val DescriptionInText: Any,
        val DistrictZone: Any,
        val FrontImage: Any,
        val ImageURL: Any,
        val IsFeatured: Boolean,
        val IsHot: Boolean,
        val IsPopOut: Boolean,
        val IsPromo: Boolean,
        val LandArea: Double,
        val LandAreaUnit: Any,
        val LandAreaUnitID: Int,
        val LastUpdated: String,
        val Latitude: Double,
        val LocalAreaName: Any,
        val LocationAlias: Any,
        val Longitude: Double,
        val Message: String,
        val PostalCode: Any,
        val PriceBudget: Double,
        val Privacy: Int,
        val PropertyCategory: Any,
        val PropertyCategoryID: Int,
        val PropertyID: Int,
        val Purpose: Any,
        val PurposeID: Int,
        val SubLocalityLevel: Any,
        val SubscriberID: Int,
        val Title: Any,
        val UnitID: Int,
        val streetName: Any
)