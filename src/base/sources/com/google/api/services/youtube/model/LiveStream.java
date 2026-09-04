package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LiveStream extends GenericJson {

    @Key
    private CdnSettings cdn;

    @Key
    private LiveStreamContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21633id;

    @Key
    private String kind;

    @Key
    private LiveStreamSnippet snippet;

    @Key
    private LiveStreamStatus status;

    public CdnSettings getCdn() {
        return this.cdn;
    }

    public LiveStreamContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21633id;
    }

    public String getKind() {
        return this.kind;
    }

    public LiveStreamSnippet getSnippet() {
        return this.snippet;
    }

    public LiveStreamStatus getStatus() {
        return this.status;
    }

    public LiveStream setCdn(CdnSettings cdnSettings) {
        this.cdn = cdnSettings;
        return this;
    }

    public LiveStream setContentDetails(LiveStreamContentDetails liveStreamContentDetails) {
        this.contentDetails = liveStreamContentDetails;
        return this;
    }

    public LiveStream setEtag(String str) {
        this.etag = str;
        return this;
    }

    public LiveStream setId(String str) {
        this.f21633id = str;
        return this;
    }

    public LiveStream setKind(String str) {
        this.kind = str;
        return this;
    }

    public LiveStream setSnippet(LiveStreamSnippet liveStreamSnippet) {
        this.snippet = liveStreamSnippet;
        return this;
    }

    public LiveStream setStatus(LiveStreamStatus liveStreamStatus) {
        this.status = liveStreamStatus;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LiveStream set(String str, Object obj) {
        return (LiveStream) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LiveStream clone() {
        return (LiveStream) super.clone();
    }
}
