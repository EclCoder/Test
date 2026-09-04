package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveStreamStatus extends GenericJson {

    @Key
    private LiveStreamHealthStatus healthStatus;

    @Key
    private String streamStatus;

    public LiveStreamHealthStatus getHealthStatus() {
        return this.healthStatus;
    }

    public String getStreamStatus() {
        return this.streamStatus;
    }

    public LiveStreamStatus setHealthStatus(LiveStreamHealthStatus liveStreamHealthStatus) {
        this.healthStatus = liveStreamHealthStatus;
        return this;
    }

    public LiveStreamStatus setStreamStatus(String str) {
        this.streamStatus = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveStreamStatus set(String str, Object obj) {
        return (LiveStreamStatus) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveStreamStatus clone() {
        return (LiveStreamStatus) super.clone();
    }
}
