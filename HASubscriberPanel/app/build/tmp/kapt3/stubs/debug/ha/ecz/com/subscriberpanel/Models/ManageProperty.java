package ha.ecz.com.subscriberpanel.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b5\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u000f\"\u0004\b(\u0010\u0011R\u001a\u0010)\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010+\"\u0004\b/\u0010-R\u001a\u00100\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010+\"\u0004\b1\u0010-R\u001a\u00102\u001a\u00020*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010:\u001a\u00020;X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u000f\"\u0004\bB\u0010\u0011R\u001a\u0010C\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0006\"\u0004\bE\u0010\bR\u001a\u0010F\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u00107\"\u0004\bH\u00109R\u001a\u0010I\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0006\"\u0004\bK\u0010\bR\u001a\u0010L\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0006\"\u0004\bN\u0010\bR\u001a\u0010O\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u00107\"\u0004\bQ\u00109R\u001a\u0010R\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0006\"\u0004\bT\u0010\bR\u001a\u0010U\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bV\u00107\"\u0004\bW\u00109R\u001a\u0010X\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010\u000f\"\u0004\bZ\u0010\u0011R\u001a\u0010[\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u000f\"\u0004\b]\u0010\u0011R\u001a\u0010^\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010\u000f\"\u0004\b`\u0010\u0011R\u001a\u0010a\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bb\u0010\u000f\"\u0004\bc\u0010\u0011R\u001a\u0010d\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010\u0006\"\u0004\bf\u0010\bR\u001a\u0010g\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010\u0006\"\u0004\bi\u0010\bR\u001a\u0010j\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010\u000f\"\u0004\bl\u0010\u0011R\u001a\u0010m\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0006\"\u0004\bo\u0010\b\u00a8\u0006p"}, d2 = {"Lha/ecz/com/subscriberpanel/Models/ManageProperty;", "", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "address_Component", "getAddress_Component", "setAddress_Component", "cityID", "", "getCityID", "()I", "setCityID", "(I)V", "createdBy", "getCreatedBy", "setCreatedBy", "createdDate", "getCreatedDate", "setCreatedDate", "currencyID", "getCurrencyID", "setCurrencyID", "description", "getDescription", "setDescription", "descriptionInText", "getDescriptionInText", "setDescriptionInText", "districtZone", "getDistrictZone", "setDistrictZone", "imageURL", "getImageURL", "setImageURL", "isActive", "setActive", "isFeatured", "", "()Z", "setFeatured", "(Z)V", "isHot", "setHot", "isPopOut", "setPopOut", "isPromo", "setPromo", "landArea", "", "getLandArea", "()D", "setLandArea", "(D)V", "landAreaUnit", "Lha/ecz/com/subscriberpanel/Models/Unit;", "getLandAreaUnit", "()Lha/ecz/com/subscriberpanel/Models/Unit;", "setLandAreaUnit", "(Lha/ecz/com/subscriberpanel/Models/Unit;)V", "landAreaUnitID", "getLandAreaUnitID", "setLandAreaUnitID", "lastUpdated", "getLastUpdated", "setLastUpdated", "latitude", "getLatitude", "setLatitude", "localAreaName", "getLocalAreaName", "setLocalAreaName", "locationAlias", "getLocationAlias", "setLocationAlias", "longitude", "getLongitude", "setLongitude", "postalCode", "getPostalCode", "setPostalCode", "priceBudget", "getPriceBudget", "setPriceBudget", "privacy", "getPrivacy", "setPrivacy", "propertyCategoryID", "getPropertyCategoryID", "setPropertyCategoryID", "propertyID", "getPropertyID", "setPropertyID", "purposeID", "getPurposeID", "setPurposeID", "streetRoadName", "getStreetRoadName", "setStreetRoadName", "subLocalityLevel", "getSubLocalityLevel", "setSubLocalityLevel", "subscriberID", "getSubscriberID", "setSubscriberID", "title", "getTitle", "setTitle", "app_debug"})
public final class ManageProperty {
    private int propertyID;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String description;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String address;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String streetRoadName;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String districtZone;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String postalCode;
    private int cityID;
    private int propertyCategoryID;
    private int purposeID;
    private double landArea;
    private int landAreaUnitID;
    @org.jetbrains.annotations.NotNull()
    public ha.ecz.com.subscriberpanel.Models.Unit landAreaUnit;
    private double priceBudget;
    private int currencyID;
    private double latitude;
    private double longitude;
    private int privacy;
    private boolean isHot;
    private boolean isFeatured;
    private boolean isPromo;
    private boolean isPopOut;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imageURL;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String localAreaName;
    private int isActive;
    private int subscriberID;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String createdDate;
    private int createdBy;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String lastUpdated;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String descriptionInText;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String address_Component;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String locationAlias;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String subLocalityLevel;
    
    public final int getPropertyID() {
        return 0;
    }
    
    public final void setPropertyID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreetRoadName() {
        return null;
    }
    
    public final void setStreetRoadName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDistrictZone() {
        return null;
    }
    
    public final void setDistrictZone(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    public final void setPostalCode(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCityID() {
        return 0;
    }
    
    public final void setCityID(int p0) {
    }
    
    public final int getPropertyCategoryID() {
        return 0;
    }
    
    public final void setPropertyCategoryID(int p0) {
    }
    
    public final int getPurposeID() {
        return 0;
    }
    
    public final void setPurposeID(int p0) {
    }
    
    public final double getLandArea() {
        return 0.0;
    }
    
    public final void setLandArea(double p0) {
    }
    
    public final int getLandAreaUnitID() {
        return 0;
    }
    
    public final void setLandAreaUnitID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ha.ecz.com.subscriberpanel.Models.Unit getLandAreaUnit() {
        return null;
    }
    
    public final void setLandAreaUnit(@org.jetbrains.annotations.NotNull()
    ha.ecz.com.subscriberpanel.Models.Unit p0) {
    }
    
    public final double getPriceBudget() {
        return 0.0;
    }
    
    public final void setPriceBudget(double p0) {
    }
    
    public final int getCurrencyID() {
        return 0;
    }
    
    public final void setCurrencyID(int p0) {
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    public final void setLatitude(double p0) {
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    public final void setLongitude(double p0) {
    }
    
    public final int getPrivacy() {
        return 0;
    }
    
    public final void setPrivacy(int p0) {
    }
    
    public final boolean isHot() {
        return false;
    }
    
    public final void setHot(boolean p0) {
    }
    
    public final boolean isFeatured() {
        return false;
    }
    
    public final void setFeatured(boolean p0) {
    }
    
    public final boolean isPromo() {
        return false;
    }
    
    public final void setPromo(boolean p0) {
    }
    
    public final boolean isPopOut() {
        return false;
    }
    
    public final void setPopOut(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImageURL() {
        return null;
    }
    
    public final void setImageURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocalAreaName() {
        return null;
    }
    
    public final void setLocalAreaName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int isActive() {
        return 0;
    }
    
    public final void setActive(int p0) {
    }
    
    public final int getSubscriberID() {
        return 0;
    }
    
    public final void setSubscriberID(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final void setCreatedDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCreatedBy() {
        return 0;
    }
    
    public final void setCreatedBy(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final void setLastUpdated(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescriptionInText() {
        return null;
    }
    
    public final void setDescriptionInText(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddress_Component() {
        return null;
    }
    
    public final void setAddress_Component(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocationAlias() {
        return null;
    }
    
    public final void setLocationAlias(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubLocalityLevel() {
        return null;
    }
    
    public final void setSubLocalityLevel(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public ManageProperty() {
        super();
    }
}