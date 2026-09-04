package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Caption extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21617id;

    @Key
    private String kind;

    @Key
    private CaptionSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21617id;
    }

    public String getKind() {
        return this.kind;
    }

    public CaptionSnippet getSnippet() {
        return this.snippet;
    }

    public Caption setEtag(String str) {
        this.etag = str;
        return this;
    }

    public Caption setId(String str) {
        this.f21617id = str;
        return this;
    }

    public Caption setKind(String str) {
        this.kind = str;
        return this;
    }

    public Caption setSnippet(CaptionSnippet captionSnippet) {
        this.snippet = captionSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public Caption set(String str, Object obj) {
        return (Caption) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public Caption clone() {
        return (Caption) super.clone();
    }
}
