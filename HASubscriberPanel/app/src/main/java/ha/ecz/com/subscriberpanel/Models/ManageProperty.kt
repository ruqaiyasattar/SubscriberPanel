package ha.ecz.com.subscriberpanel.Models


class ManageProperty {
    var propertyID: Int = 0
     var title: String= ""
    lateinit var description: String
    lateinit var address: String
    var streetRoadName: String = ""
    lateinit var districtZone: String
    lateinit var postalCode: String
    var cityID: Int = 0
    var propertyCategoryID: Int = 0
    var purposeID: Int = 0
    var landArea: Double = 0.toDouble()
    var landAreaUnitID: Int = 0
    lateinit var landAreaUnit: Unit
    var priceBudget: Double = 0.toDouble()
    var currencyID: Int = 0
    var latitude: Double = 0.toDouble()
    var longitude: Double = 0.toDouble()
    var privacy: Int = 0
    var isHot: Boolean = false
    var isFeatured: Boolean = false
    var isPromo: Boolean = false
    var isPopOut: Boolean = false
     var imageURL: String = ""
    lateinit var localAreaName: String
    var isActive: Int = 0
    var subscriberID: Int = 0
    lateinit var createdDate: String
    var createdBy: Int = 0
    lateinit var lastUpdated: String
    lateinit var descriptionInText: String
    lateinit var address_Component: String
    lateinit var locationAlias: String
    lateinit var subLocalityLevel: String

}
