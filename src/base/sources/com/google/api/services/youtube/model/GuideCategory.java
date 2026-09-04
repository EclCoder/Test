package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GuideCategory extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21622id;

    @Key
    private String kind;

    @Key
    private GuideCategorySnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21622id;
    }

    public String getKind() {
        return this.kind;
    }

    public GuideCategorySnippet getSnippet() {
        return this.snippet;
    }

    public GuideCategory setEtag(String str) {
        this.etag = str;
        return this;
    }

    public GuideCategory setId(String str) {
        this.f21622id = str;
        return this;
    }

    public GuideCategory setKind(String str) {
        this.kind = str;
        return this;
    }

    public GuideCategory setSnippet(GuideCategorySnippet guideCategorySnippet) {
        this.snippet = guideCategorySnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GuideCategory set(String str, Object obj) {
        return (GuideCategory) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GuideCategory clone() {
        return (GuideCategory) super.clone();
    }
}
