package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveBroadcast extends GenericJson {

    @Key
    private LiveBroadcastContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21627id;

    @Key
    private String kind;

    @Key
    private LiveBroadcastSnippet snippet;

    @Key
    private LiveBroadcastStatistics statistics;

    @Key
    private LiveBroadcastStatus status;

    public LiveBroadcastContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21627id;
    }

    public String getKind() {
        return this.kind;
    }

    public LiveBroadcastSnippet getSnippet() {
        return this.snippet;
    }

    public LiveBroadcastStatistics getStatistics() {
        return this.statistics;
    }

    public LiveBroadcastStatus getStatus() {
        return this.status;
    }

    public LiveBroadcast setContentDetails(LiveBroadcastContentDetails liveBroadcastContentDetails) {
        this.contentDetails = liveBroadcastContentDetails;
        return this;
    }

    public LiveBroadcast setEtag(String str) {
        this.etag = str;
        return this;
    }

    public LiveBroadcast setId(String str) {
        this.f21627id = str;
        return this;
    }

    public LiveBroadcast setKind(String str) {
        this.kind = str;
        return this;
    }

    public LiveBroadcast setSnippet(LiveBroadcastSnippet liveBroadcastSnippet) {
        this.snippet = liveBroadcastSnippet;
        return this;
    }

    public LiveBroadcast setStatistics(LiveBroadcastStatistics liveBroadcastStatistics) {
        this.statistics = liveBroadcastStatistics;
        return this;
    }

    public LiveBroadcast setStatus(LiveBroadcastStatus liveBroadcastStatus) {
        this.status = liveBroadcastStatus;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveBroadcast set(String str, Object obj) {
        return (LiveBroadcast) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveBroadcast clone() {
        return (LiveBroadcast) super.clone();
    }
}
