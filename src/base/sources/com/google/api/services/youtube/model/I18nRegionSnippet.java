package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class I18nRegionSnippet extends GenericJson {

    /* JADX INFO: renamed from: gl, reason: collision with root package name */
    @Key
    private String f21626gl;

    @Key
    private String name;

    public String getGl() {
        return this.f21626gl;
    }

    public String getName() {
        return this.name;
    }

    public I18nRegionSnippet setGl(String str) {
        this.f21626gl = str;
        return this;
    }

    public I18nRegionSnippet setName(String str) {
        this.name = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public I18nRegionSnippet set(String str, Object obj) {
        return (I18nRegionSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public I18nRegionSnippet clone() {
        return (I18nRegionSnippet) super.clone();
    }
}
