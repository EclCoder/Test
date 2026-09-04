package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveBroadcastStatus extends GenericJson {

    @Key
    private String lifeCycleStatus;

    @Key
    private String liveBroadcastPriority;

    @Key
    private Boolean madeForKids;

    @Key
    private String privacyStatus;

    @Key
    private String recordingStatus;

    @Key
    private Boolean selfDeclaredMadeForKids;

    public String getLifeCycleStatus() {
        return this.lifeCycleStatus;
    }

    public String getLiveBroadcastPriority() {
        return this.liveBroadcastPriority;
    }

    public Boolean getMadeForKids() {
        return this.madeForKids;
    }

    public String getPrivacyStatus() {
        return this.privacyStatus;
    }

    public String getRecordingStatus() {
        return this.recordingStatus;
    }

    public Boolean getSelfDeclaredMadeForKids() {
        return this.selfDeclaredMadeForKids;
    }

    public LiveBroadcastStatus setLifeCycleStatus(String str) {
        this.lifeCycleStatus = str;
        return this;
    }

    public LiveBroadcastStatus setLiveBroadcastPriority(String str) {
        this.liveBroadcastPriority = str;
        return this;
    }

    public LiveBroadcastStatus setMadeForKids(Boolean bool) {
        this.madeForKids = bool;
        return this;
    }

    public LiveBroadcastStatus setPrivacyStatus(String str) {
        this.privacyStatus = str;
        return this;
    }

    public LiveBroadcastStatus setRecordingStatus(String str) {
        this.recordingStatus = str;
        return this;
    }

    public LiveBroadcastStatus setSelfDeclaredMadeForKids(Boolean bool) {
        this.selfDeclaredMadeForKids = bool;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveBroadcastStatus set(String str, Object obj) {
        return (LiveBroadcastStatus) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveBroadcastStatus clone() {
        return (LiveBroadcastStatus) super.clone();
    }
}
