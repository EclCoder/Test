package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoCategory extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21645id;

    @Key
    private String kind;

    @Key
    private VideoCategorySnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21645id;
    }

    public String getKind() {
        return this.kind;
    }

    public VideoCategorySnippet getSnippet() {
        return this.snippet;
    }

    public VideoCategory setEtag(String str) {
        this.etag = str;
        return this;
    }

    public VideoCategory setId(String str) {
        this.f21645id = str;
        return this;
    }

    public VideoCategory setKind(String str) {
        this.kind = str;
        return this;
    }

    public VideoCategory setSnippet(VideoCategorySnippet videoCategorySnippet) {
        this.snippet = videoCategorySnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public VideoCategory set(String str, Object obj) {
        return (VideoCategory) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public VideoCategory clone() {
        return (VideoCategory) super.clone();
    }
}
