package ha.ecz.com.subscriberpanel.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001c\u0010-\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\f\"\u0004\b/\u0010\u000eR\u001c\u00100\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000eR\u001c\u00103\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\f\"\u0004\b5\u0010\u000eR\u001c\u00106\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\f\"\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\bR\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010K\u001a\u0004\u0018\u00010LX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001a\u0010Q\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u001b\"\u0004\bS\u0010\u001dR\u001c\u0010T\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\f\"\u0004\bV\u0010\u000eR\u001a\u0010W\u001a\u00020FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010H\"\u0004\bY\u0010JR\u001c\u0010Z\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\f\"\u0004\b\\\u0010\u000eR\u001c\u0010]\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\f\"\u0004\b_\u0010\u000eR\u001a\u0010`\u001a\u00020FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010H\"\u0004\bb\u0010JR\u001c\u0010c\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\f\"\u0004\be\u0010\u000eR\u001a\u0010f\u001a\u00020FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010H\"\u0004\bh\u0010JR\u001a\u0010i\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u001b\"\u0004\bk\u0010\u001dR\u001c\u0010l\u001a\u0004\u0018\u00010mX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001a\u0010r\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u001b\"\u0004\bt\u0010\u001dR\u001a\u0010u\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u001b\"\u0004\bw\u0010\u001dR\u001c\u0010x\u001a\u0004\u0018\u00010yX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}R\u001b\u0010~\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u001b\"\u0005\b\u0080\u0001\u0010\u001dR\u001f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\f\"\u0005\b\u0083\u0001\u0010\u000eR\u001f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\f\"\u0005\b\u0086\u0001\u0010\u000eR\u001d\u0010\u0087\u0001\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u001b\"\u0005\b\u0089\u0001\u0010\u001dR\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\f\"\u0005\b\u008c\u0001\u0010\u000e\u00a8\u0006\u008d\u0001"}, d2 = {"Lha/ecz/com/subscriberpanel/Models/Property;", "", "()V", "Active", "", "getActive", "()Z", "setActive", "(Z)V", "Address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "Address_Component", "getAddress_Component", "setAddress_Component", "City", "Lha/ecz/com/subscriberpanel/Models/City;", "getCity", "()Lha/ecz/com/subscriberpanel/Models/City;", "setCity", "(Lha/ecz/com/subscriberpanel/Models/City;)V", "CityID", "", "getCityID", "()I", "setCityID", "(I)V", "CreatedBy", "getCreatedBy", "setCreatedBy", "CreatedDate", "getCreatedDate", "setCreatedDate", "Currency", "Lha/ecz/com/subscriberpanel/Models/Currency;", "getCurrency", "()Lha/ecz/com/subscriberpanel/Models/Currency;", "setCurrency", "(Lha/ecz/com/subscriberpanel/Models/Currency;)V", "CurrencyID", "getCurrencyID", "setCurrencyID", "Description", "getDescription", "setDescription", "DescriptionInText", "getDescriptionInText", "setDescriptionInText", "DistrictZone", "getDistrictZone", "setDistrictZone", "ImageURL", "getImageURL", "setImageURL", "IsFeatured", "getIsFeatured", "setIsFeatured", "IsHot", "getIsHot", "setIsHot", "IsPopOut", "getIsPopOut", "setIsPopOut", "IsPromo", "getIsPromo", "setIsPromo", "LandArea", "", "getLandArea", "()D", "setLandArea", "(D)V", "LandAreaUnit", "Lha/ecz/com/subscriberpanel/Models/Unit;", "getLandAreaUnit", "()Lha/ecz/com/subscriberpanel/Models/Unit;", "setLandAreaUnit", "(Lha/ecz/com/subscriberpanel/Models/Unit;)V", "LandAreaUnitID", "getLandAreaUnitID", "setLandAreaUnitID", "LastUpdated", "getLastUpdated", "setLastUpdated", "Latitude", "getLatitude", "setLatitude", "LocalAreaName", "getLocalAreaName", "setLocalAreaName", "LocationAlias", "getLocationAlias", "setLocationAlias", "Longitude", "getLongitude", "setLongitude", "PostalCode", "getPostalCode", "setPostalCode", "PriceBudget", "getPriceBudget", "setPriceBudget", "Privacy", "getPrivacy", "setPrivacy", "PropertyCategory", "Lha/ecz/com/subscriberpanel/Models/PropertyCategory;", "getPropertyCategory", "()Lha/ecz/com/subscriberpanel/Models/PropertyCategory;", "setPropertyCategory", "(Lha/ecz/com/subscriberpanel/Models/PropertyCategory;)V", "PropertyCategoryID", "getPropertyCategoryID", "setPropertyCategoryID", "PropertyID", "getPropertyID", "setPropertyID", "Purpose", "Lha/ecz/com/subscriberpanel/Models/Purpose;", "getPurpose", "()Lha/ecz/com/subscriberpanel/Models/Purpose;", "setPurpose", "(Lha/ecz/com/subscriberpanel/Models/Purpose;)V", "PurposeID", "getPurposeID", "setPurposeID", "StreetRoadName", "getStreetRoadName", "setStreetRoadName", "SubLocalityLevel", "getSubLocalityLevel", "setSubLocalityLevel", "SubscriberID", "getSubscriberID", "setSubscriberID", "Title", "getTitle", "setTitle", "app_release"})
public final class Property {
    private int PropertyID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Title;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Description;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Address;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String StreetRoadName;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String DistrictZone;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String PostalCode;
    private int CityID;
    @org.jetbrains.annotations.Nullable()
    private ha.ecz.com.subscriberpanel.Models.City City;
    private int PropertyCategoryID;
    @org.jetbrains.annotations.Nullable()
    private ha.ecz.com.subscriberpanel.Models.PropertyCategory PropertyCategory;
    private int PurposeID;
    @org.jetbrains.annotations.Nullable()
    private ha.ecz.com.subscriberpanel.Models.Purpose Purpose;
    private double LandArea;
    private int LandAreaUnitID;
    @org.jetbrains.annotations.Nullable()
    private ha.ecz.com.subscriberpanel.Models.Unit LandAreaUnit;
    private double PriceBudget;
    private int CurrencyID;
    @org.jetbrains.annotations.Nullable()
    private ha.ecz.com.subscriberpanel.Models.Currency Currency;
    private double Latitude;
    private double Longitude;
    private int Privacy;
    private boolean IsHot;
    private boolean IsFeatured;
    private boolean IsPromo;
    private boolean IsPopOut;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String ImageURL;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String LocalAreaName;
    private boolean Active;
    private int SubscriberID;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String CreatedDate;
    private int CreatedBy;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String LastUpdated;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String DescriptionInText;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String Address_Component;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String LocationAlias;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String SubLocalityLevel;
    
    public final int getPropertyID() {
        return 0;
    }
    
    public final void setPropertyID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress() {
        return null;
    }
    
    public final void setAddress(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStreetRoadName() {
        return null;
    }
    
    public final void setStreetRoadName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDistrictZone() {
        return null;
    }
    
    public final void setDistrictZone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPostalCode() {
        return null;
    }
    
    public final void setPostalCode(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getCityID() {
        return 0;
    }
    
    public final void setCityID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ha.ecz.com.subscriberpanel.Models.City getCity() {
        return null;
    }
    
    public final void setCity(@org.jetbrains.annotations.Nullable()
    ha.ecz.com.subscriberpanel.Models.City p0) {
    }
    
    public final int getPropertyCategoryID() {
        return 0;
    }
    
    public final void setPropertyCategoryID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ha.ecz.com.subscriberpanel.Models.PropertyCategory getPropertyCategory() {
        return null;
    }
    
    public final void setPropertyCategory(@org.jetbrains.annotations.Nullable()
    ha.ecz.com.subscriberpanel.Models.PropertyCategory p0) {
    }
    
    public final int getPurposeID() {
        return 0;
    }
    
    public final void setPurposeID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ha.ecz.com.subscriberpanel.Models.Purpose getPurpose() {
        return null;
    }
    
    public final void setPurpose(@org.jetbrains.annotations.Nullable()
    ha.ecz.com.subscriberpanel.Models.Purpose p0) {
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
    
    @org.jetbrains.annotations.Nullable()
    public final ha.ecz.com.subscriberpanel.Models.Unit getLandAreaUnit() {
        return null;
    }
    
    public final void setLandAreaUnit(@org.jetbrains.annotations.Nullable()
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
    
    @org.jetbrains.annotations.Nullable()
    public final ha.ecz.com.subscriberpanel.Models.Currency getCurrency() {
        return null;
    }
    
    public final void setCurrency(@org.jetbrains.annotations.Nullable()
    ha.ecz.com.subscriberpanel.Models.Currency p0) {
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
    
    public final boolean getIsHot() {
        return false;
    }
    
    public final void setIsHot(boolean p0) {
    }
    
    public final boolean getIsFeatured() {
        return false;
    }
    
    public final void setIsFeatured(boolean p0) {
    }
    
    public final boolean getIsPromo() {
        return false;
    }
    
    public final void setIsPromo(boolean p0) {
    }
    
    public final boolean getIsPopOut() {
        return false;
    }
    
    public final void setIsPopOut(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImageURL() {
        return null;
    }
    
    public final void setImageURL(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalAreaName() {
        return null;
    }
    
    public final void setLocalAreaName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getActive() {
        return false;
    }
    
    public final void setActive(boolean p0) {
    }
    
    public final int getSubscriberID() {
        return 0;
    }
    
    public final void setSubscriberID(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    public final void setCreatedDate(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final int getCreatedBy() {
        return 0;
    }
    
    public final void setCreatedBy(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final void setLastUpdated(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescriptionInText() {
        return null;
    }
    
    public final void setDescriptionInText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAddress_Component() {
        return null;
    }
    
    public final void setAddress_Component(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocationAlias() {
        return null;
    }
    
    public final void setLocationAlias(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubLocalityLevel() {
        return null;
    }
    
    public final void setSubLocalityLevel(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public Property() {
        super();
    }
}