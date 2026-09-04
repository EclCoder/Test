package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GeoPoint extends GenericJson {

    @Key
    private Double altitude;

    @Key
    private Double latitude;

    @Key
    private Double longitude;

    public Double getAltitude() {
        return this.altitude;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public GeoPoint setAltitude(Double d10) {
        this.altitude = d10;
        return this;
    }

    public GeoPoint setLatitude(Double d10) {
        this.latitude = d10;
        return this;
    }

    public GeoPoint setLongitude(Double d10) {
        this.longitude = d10;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GeoPoint set(String str, Object obj) {
        return (GeoPoint) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GeoPoint clone() {
        return (GeoPoint) super.clone();
    }
}
