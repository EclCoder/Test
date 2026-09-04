package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoRecordingDetails extends GenericJson {

    @Key
    private GeoPoint location;

    @Key
    private String locationDescription;

    @Key
    private String recordingDate;

    public GeoPoint getLocation() {
        return this.location;
    }

    public String getLocationDescription() {
        return this.locationDescription;
    }

    public String getRecordingDate() {
        return this.recordingDate;
    }

    public VideoRecordingDetails setLocation(GeoPoint geoPoint) {
        this.location = geoPoint;
        return this;
    }

    public VideoRecordingDetails setLocationDescription(String str) {
        this.locationDescription = str;
        return this;
    }

    public VideoRecordingDetails setRecordingDate(String str) {
        this.recordingDate = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoRecordingDetails set(String str, Object obj) {
        return (VideoRecordingDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoRecordingDetails clone() {
        return (VideoRecordingDetails) super.clone();
    }
}
