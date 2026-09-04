package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoAbuseReportReason extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21643id;

    @Key
    private String kind;

    @Key
    private VideoAbuseReportReasonSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21643id;
    }

    public String getKind() {
        return this.kind;
    }

    public VideoAbuseReportReasonSnippet getSnippet() {
        return this.snippet;
    }

    public VideoAbuseReportReason setEtag(String str) {
        this.etag = str;
        return this;
    }

    public VideoAbuseReportReason setId(String str) {
        this.f21643id = str;
        return this;
    }

    public VideoAbuseReportReason setKind(String str) {
        this.kind = str;
        return this;
    }

    public VideoAbuseReportReason setSnippet(VideoAbuseReportReasonSnippet videoAbuseReportReasonSnippet) {
        this.snippet = videoAbuseReportReasonSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoAbuseReportReason set(String str, Object obj) {
        return (VideoAbuseReportReason) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoAbuseReportReason clone() {
        return (VideoAbuseReportReason) super.clone();
    }
}
