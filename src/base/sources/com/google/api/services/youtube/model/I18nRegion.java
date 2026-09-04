package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class I18nRegion extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21625id;

    @Key
    private String kind;

    @Key
    private I18nRegionSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21625id;
    }

    public String getKind() {
        return this.kind;
    }

    public I18nRegionSnippet getSnippet() {
        return this.snippet;
    }

    public I18nRegion setEtag(String str) {
        this.etag = str;
        return this;
    }

    public I18nRegion setId(String str) {
        this.f21625id = str;
        return this;
    }

    public I18nRegion setKind(String str) {
        this.kind = str;
        return this;
    }

    public I18nRegion setSnippet(I18nRegionSnippet i18nRegionSnippet) {
        this.snippet = i18nRegionSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public I18nRegion set(String str, Object obj) {
        return (I18nRegion) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public I18nRegion clone() {
        return (I18nRegion) super.clone();
    }
}
