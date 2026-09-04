package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveStreamContentDetails extends GenericJson {

    @Key
    private String closedCaptionsIngestionUrl;

    @Key
    private Boolean isReusable;

    public String getClosedCaptionsIngestionUrl() {
        return this.closedCaptionsIngestionUrl;
    }

    public Boolean getIsReusable() {
        return this.isReusable;
    }

    public LiveStreamContentDetails setClosedCaptionsIngestionUrl(String str) {
        this.closedCaptionsIngestionUrl = str;
        return this;
    }

    public LiveStreamContentDetails setIsReusable(Boolean bool) {
        this.isReusable = bool;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveStreamContentDetails set(String str, Object obj) {
        return (LiveStreamContentDetails) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveStreamContentDetails clone() {
        return (LiveStreamContentDetails) super.clone();
    }
}
