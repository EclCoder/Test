package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Activity extends GenericJson {

    @Key
    private ActivityContentDetails contentDetails;

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21616id;

    @Key
    private String kind;

    @Key
    private ActivitySnippet snippet;

    public ActivityContentDetails getContentDetails() {
        return this.contentDetails;
    }

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21616id;
    }

    public String getKind() {
        return this.kind;
    }

    public ActivitySnippet getSnippet() {
        return this.snippet;
    }

    public Activity setContentDetails(ActivityContentDetails activityContentDetails) {
        this.contentDetails = activityContentDetails;
        return this;
    }

    public Activity setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Activity setId(String str) {
        this.f21616id = str;
        return this;
    }

    public Activity setKind(String str) {
        this.kind = str;
        return this;
    }

    public Activity setSnippet(ActivitySnippet activitySnippet) {
        this.snippet = activitySnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Activity set(String str, Object obj) {
        return (Activity) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Activity clone() {
        return (Activity) super.clone();
    }
}
