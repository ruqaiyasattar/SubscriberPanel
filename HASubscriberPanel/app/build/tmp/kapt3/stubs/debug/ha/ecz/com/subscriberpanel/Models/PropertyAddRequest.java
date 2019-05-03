package ha.ecz.com.subscriberpanel.Models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\bq\b\u0086\b\u0018\u00002\u00020\u0001B\u00c5\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0001\u0012\u0006\u0010\u0010\u001a\u00020\u0001\u0012\u0006\u0010\u0011\u001a\u00020\u0001\u0012\u0006\u0010\u0012\u001a\u00020\u0001\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0018\u0012\u0006\u0010\u0019\u001a\u00020\u0001\u0012\u0006\u0010\u001a\u001a\u00020\b\u0012\u0006\u0010\u001b\u001a\u00020\u000b\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u0001\u0012\u0006\u0010\u001e\u001a\u00020\u0001\u0012\u0006\u0010\u001f\u001a\u00020\u0018\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010!\u001a\u00020\u0001\u0012\u0006\u0010\"\u001a\u00020\u0018\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\u0001\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\b\u0012\u0006\u0010\'\u001a\u00020\u0001\u0012\u0006\u0010(\u001a\u00020\b\u0012\u0006\u0010)\u001a\u00020\u0001\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\u0001\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u0010-\u001a\u00020\u0001\u00a2\u0006\u0002\u0010.J\t\u0010\\\u001a\u00020\u0003H\u00c6\u0003J\t\u0010]\u001a\u00020\u0001H\u00c6\u0003J\t\u0010^\u001a\u00020\u0001H\u00c6\u0003J\t\u0010_\u001a\u00020\u0001H\u00c6\u0003J\t\u0010`\u001a\u00020\u0001H\u00c6\u0003J\t\u0010a\u001a\u00020\u0001H\u00c6\u0003J\t\u0010b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010f\u001a\u00020\u0018H\u00c6\u0003J\t\u0010g\u001a\u00020\u0001H\u00c6\u0003J\t\u0010h\u001a\u00020\u0001H\u00c6\u0003J\t\u0010i\u001a\u00020\bH\u00c6\u0003J\t\u0010j\u001a\u00020\u000bH\u00c6\u0003J\t\u0010k\u001a\u00020\u0018H\u00c6\u0003J\t\u0010l\u001a\u00020\u0001H\u00c6\u0003J\t\u0010m\u001a\u00020\u0001H\u00c6\u0003J\t\u0010n\u001a\u00020\u0018H\u00c6\u0003J\t\u0010o\u001a\u00020\u000bH\u00c6\u0003J\t\u0010p\u001a\u00020\u0001H\u00c6\u0003J\t\u0010q\u001a\u00020\u0018H\u00c6\u0003J\t\u0010r\u001a\u00020\u0001H\u00c6\u0003J\t\u0010s\u001a\u00020\bH\u00c6\u0003J\t\u0010t\u001a\u00020\u0001H\u00c6\u0003J\t\u0010u\u001a\u00020\bH\u00c6\u0003J\t\u0010v\u001a\u00020\bH\u00c6\u0003J\t\u0010w\u001a\u00020\u0001H\u00c6\u0003J\t\u0010x\u001a\u00020\bH\u00c6\u0003J\t\u0010y\u001a\u00020\u0001H\u00c6\u0003J\t\u0010z\u001a\u00020\bH\u00c6\u0003J\t\u0010{\u001a\u00020\u0001H\u00c6\u0003J\t\u0010|\u001a\u00020\bH\u00c6\u0003J\t\u0010}\u001a\u00020\u0001H\u00c6\u0003J\t\u0010~\u001a\u00020\u0001H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\bH\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000bH\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\u0001H\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\bH\u00c6\u0003J\u009a\u0003\u0010\u0084\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00012\b\b\u0002\u0010\u001a\u001a\u00020\b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u00182\b\b\u0002\u0010\u001d\u001a\u00020\u00012\b\b\u0002\u0010\u001e\u001a\u00020\u00012\b\b\u0002\u0010\u001f\u001a\u00020\u00182\b\b\u0002\u0010 \u001a\u00020\u000b2\b\b\u0002\u0010!\u001a\u00020\u00012\b\b\u0002\u0010\"\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\b2\b\b\u0002\u0010\'\u001a\u00020\u00012\b\b\u0002\u0010(\u001a\u00020\b2\b\b\u0002\u0010)\u001a\u00020\u00012\b\b\u0002\u0010*\u001a\u00020\b2\b\b\u0002\u0010+\u001a\u00020\u00012\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\u0001H\u00c6\u0001J\u0015\u0010\u0085\u0001\u001a\u00020\u00032\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0087\u0001\u001a\u00020\bH\u00d6\u0001J\n\u0010\u0088\u0001\u001a\u00020\u000bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0011\u0010\u0004\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0011\u0010\u0005\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00102R\u0011\u0010\u0006\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00102R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\t\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00106R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u00102R\u0011\u0010\r\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00106R\u0011\u0010\u000e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u00102R\u0011\u0010\u000f\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00102R\u0011\u0010\u0010\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00102R\u0011\u0010\u0011\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00102R\u0011\u0010\u0012\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0011\u0010\u0013\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u00100R\u0011\u0010\u0014\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u00100R\u0011\u0010\u0015\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bC\u00100R\u0011\u0010\u0016\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u00100R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u0011\u0010\u0019\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bG\u00102R\u0011\u0010\u001a\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00106R\u0011\u0010\u001b\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00109R\u0011\u0010\u001c\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010FR\u0011\u0010\u001d\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00102R\u0011\u0010\u001e\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0011\u0010\u001f\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010FR\u0011\u0010 \u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u00109R\u0011\u0010!\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u00102R\u0011\u0010\"\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\bP\u0010FR\u0011\u0010#\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u00106R\u0011\u0010$\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u00102R\u0011\u0010%\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bS\u00106R\u0011\u0010&\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u00106R\u0011\u0010\'\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u00102R\u0011\u0010(\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u00106R\u0011\u0010)\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u00102R\u0011\u0010*\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bX\u00106R\u0011\u0010+\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\bY\u00102R\u0011\u0010,\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\bZ\u00106R\u0011\u0010-\u001a\u00020\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u00102\u00a8\u0006\u0089\u0001"}, d2 = {"Lha/ecz/com/subscriberpanel/Models/PropertyAddRequest;", "", "Active", "", "Address", "Address_Component", "City", "CityID", "", "CreatedBy", "CreatedDate", "", "Currency", "CurrencyID", "Description", "DescriptionInText", "DistrictZone", "FrontImage", "ImageURL", "IsFeatured", "IsHot", "IsPopOut", "IsPromo", "LandArea", "", "LandAreaUnit", "LandAreaUnitID", "LastUpdated", "Latitude", "LocalAreaName", "LocationAlias", "Longitude", "Message", "PostalCode", "PriceBudget", "Privacy", "PropertyCategory", "PropertyCategoryID", "PropertyID", "Purpose", "PurposeID", "SubLocalityLevel", "SubscriberID", "Title", "UnitID", "streetName", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZZZZDLjava/lang/Object;ILjava/lang/String;DLjava/lang/Object;Ljava/lang/Object;DLjava/lang/String;Ljava/lang/Object;DILjava/lang/Object;IILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "getActive", "()Z", "getAddress", "()Ljava/lang/Object;", "getAddress_Component", "getCity", "getCityID", "()I", "getCreatedBy", "getCreatedDate", "()Ljava/lang/String;", "getCurrency", "getCurrencyID", "getDescription", "getDescriptionInText", "getDistrictZone", "getFrontImage", "getImageURL", "getIsFeatured", "getIsHot", "getIsPopOut", "getIsPromo", "getLandArea", "()D", "getLandAreaUnit", "getLandAreaUnitID", "getLastUpdated", "getLatitude", "getLocalAreaName", "getLocationAlias", "getLongitude", "getMessage", "getPostalCode", "getPriceBudget", "getPrivacy", "getPropertyCategory", "getPropertyCategoryID", "getPropertyID", "getPurpose", "getPurposeID", "getSubLocalityLevel", "getSubscriberID", "getTitle", "getUnitID", "getStreetName", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
public final class PropertyAddRequest {
    private final boolean Active = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Address = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Address_Component = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object City = null;
    private final int CityID = 0;
    private final int CreatedBy = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String CreatedDate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Currency = null;
    private final int CurrencyID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DescriptionInText = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object DistrictZone = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object FrontImage = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object ImageURL = null;
    private final boolean IsFeatured = false;
    private final boolean IsHot = false;
    private final boolean IsPopOut = false;
    private final boolean IsPromo = false;
    private final double LandArea = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object LandAreaUnit = null;
    private final int LandAreaUnitID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String LastUpdated = null;
    private final double Latitude = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object LocalAreaName = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object LocationAlias = null;
    private final double Longitude = 0.0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String Message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object PostalCode = null;
    private final double PriceBudget = 0.0;
    private final int Privacy = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object PropertyCategory = null;
    private final int PropertyCategoryID = 0;
    private final int PropertyID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Purpose = null;
    private final int PurposeID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object SubLocalityLevel = null;
    private final int SubscriberID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object Title = null;
    private final int UnitID = 0;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Object streetName = null;
    
    public final boolean getActive() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getAddress_Component() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCity() {
        return null;
    }
    
    public final int getCityID() {
        return 0;
    }
    
    public final int getCreatedBy() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCreatedDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getCurrency() {
        return null;
    }
    
    public final int getCurrencyID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDescriptionInText() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getDistrictZone() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getFrontImage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getImageURL() {
        return null;
    }
    
    public final boolean getIsFeatured() {
        return false;
    }
    
    public final boolean getIsHot() {
        return false;
    }
    
    public final boolean getIsPopOut() {
        return false;
    }
    
    public final boolean getIsPromo() {
        return false;
    }
    
    public final double getLandArea() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLandAreaUnit() {
        return null;
    }
    
    public final int getLandAreaUnitID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLastUpdated() {
        return null;
    }
    
    public final double getLatitude() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLocalAreaName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getLocationAlias() {
        return null;
    }
    
    public final double getLongitude() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPostalCode() {
        return null;
    }
    
    public final double getPriceBudget() {
        return 0.0;
    }
    
    public final int getPrivacy() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPropertyCategory() {
        return null;
    }
    
    public final int getPropertyCategoryID() {
        return 0;
    }
    
    public final int getPropertyID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getPurpose() {
        return null;
    }
    
    public final int getPurposeID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getSubLocalityLevel() {
        return null;
    }
    
    public final int getSubscriberID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getTitle() {
        return null;
    }
    
    public final int getUnitID() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object getStreetName() {
        return null;
    }
    
    public PropertyAddRequest(boolean Active, @org.jetbrains.annotations.NotNull()
    java.lang.Object Address, @org.jetbrains.annotations.NotNull()
    java.lang.Object Address_Component, @org.jetbrains.annotations.NotNull()
    java.lang.Object City, int CityID, int CreatedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, @org.jetbrains.annotations.NotNull()
    java.lang.Object Currency, int CurrencyID, @org.jetbrains.annotations.NotNull()
    java.lang.Object Description, @org.jetbrains.annotations.NotNull()
    java.lang.Object DescriptionInText, @org.jetbrains.annotations.NotNull()
    java.lang.Object DistrictZone, @org.jetbrains.annotations.NotNull()
    java.lang.Object FrontImage, @org.jetbrains.annotations.NotNull()
    java.lang.Object ImageURL, boolean IsFeatured, boolean IsHot, boolean IsPopOut, boolean IsPromo, double LandArea, @org.jetbrains.annotations.NotNull()
    java.lang.Object LandAreaUnit, int LandAreaUnitID, @org.jetbrains.annotations.NotNull()
    java.lang.String LastUpdated, double Latitude, @org.jetbrains.annotations.NotNull()
    java.lang.Object LocalAreaName, @org.jetbrains.annotations.NotNull()
    java.lang.Object LocationAlias, double Longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String Message, @org.jetbrains.annotations.NotNull()
    java.lang.Object PostalCode, double PriceBudget, int Privacy, @org.jetbrains.annotations.NotNull()
    java.lang.Object PropertyCategory, int PropertyCategoryID, int PropertyID, @org.jetbrains.annotations.NotNull()
    java.lang.Object Purpose, int PurposeID, @org.jetbrains.annotations.NotNull()
    java.lang.Object SubLocalityLevel, int SubscriberID, @org.jetbrains.annotations.NotNull()
    java.lang.Object Title, int UnitID, @org.jetbrains.annotations.NotNull()
    java.lang.Object streetName) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component8() {
        return null;
    }
    
    public final int component9() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component14() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean component16() {
        return false;
    }
    
    public final boolean component17() {
        return false;
    }
    
    public final boolean component18() {
        return false;
    }
    
    public final double component19() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component20() {
        return null;
    }
    
    public final int component21() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component22() {
        return null;
    }
    
    public final double component23() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component24() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component25() {
        return null;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component27() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component28() {
        return null;
    }
    
    public final double component29() {
        return 0.0;
    }
    
    public final int component30() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component31() {
        return null;
    }
    
    public final int component32() {
        return 0;
    }
    
    public final int component33() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component34() {
        return null;
    }
    
    public final int component35() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component36() {
        return null;
    }
    
    public final int component37() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component38() {
        return null;
    }
    
    public final int component39() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object component40() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final ha.ecz.com.subscriberpanel.Models.PropertyAddRequest copy(boolean Active, @org.jetbrains.annotations.NotNull()
    java.lang.Object Address, @org.jetbrains.annotations.NotNull()
    java.lang.Object Address_Component, @org.jetbrains.annotations.NotNull()
    java.lang.Object City, int CityID, int CreatedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String CreatedDate, @org.jetbrains.annotations.NotNull()
    java.lang.Object Currency, int CurrencyID, @org.jetbrains.annotations.NotNull()
    java.lang.Object Description, @org.jetbrains.annotations.NotNull()
    java.lang.Object DescriptionInText, @org.jetbrains.annotations.NotNull()
    java.lang.Object DistrictZone, @org.jetbrains.annotations.NotNull()
    java.lang.Object FrontImage, @org.jetbrains.annotations.NotNull()
    java.lang.Object ImageURL, boolean IsFeatured, boolean IsHot, boolean IsPopOut, boolean IsPromo, double LandArea, @org.jetbrains.annotations.NotNull()
    java.lang.Object LandAreaUnit, int LandAreaUnitID, @org.jetbrains.annotations.NotNull()
    java.lang.String LastUpdated, double Latitude, @org.jetbrains.annotations.NotNull()
    java.lang.Object LocalAreaName, @org.jetbrains.annotations.NotNull()
    java.lang.Object LocationAlias, double Longitude, @org.jetbrains.annotations.NotNull()
    java.lang.String Message, @org.jetbrains.annotations.NotNull()
    java.lang.Object PostalCode, double PriceBudget, int Privacy, @org.jetbrains.annotations.NotNull()
    java.lang.Object PropertyCategory, int PropertyCategoryID, int PropertyID, @org.jetbrains.annotations.NotNull()
    java.lang.Object Purpose, int PurposeID, @org.jetbrains.annotations.NotNull()
    java.lang.Object SubLocalityLevel, int SubscriberID, @org.jetbrains.annotations.NotNull()
    java.lang.Object Title, int UnitID, @org.jetbrains.annotations.NotNull()
    java.lang.Object streetName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}