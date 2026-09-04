package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class I18nLanguage extends GenericJson {

    @Key
    private String etag;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    @Key
    private String f21623id;

    @Key
    private String kind;

    @Key
    private I18nLanguageSnippet snippet;

    public String getEtag() {
        return this.etag;
    }

    public String getId() {
        return this.f21623id;
    }

    public String getKind() {
        return this.kind;
    }

    public I18nLanguageSnippet getSnippet() {
        return this.snippet;
    }

    public I18nLanguage setEtag(String str) {
        this.etag = str;
        return this;
    }

    public I18nLanguage setId(String str) {
        this.f21623id = str;
        return this;
    }

    public I18nLanguage setKind(String str) {
        this.kind = str;
        return this;
    }

    public I18nLanguage setSnippet(I18nLanguageSnippet i18nLanguageSnippet) {
        this.snippet = i18nLanguageSnippet;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public I18nLanguage set(String str, Object obj) {
        return (I18nLanguage) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public I18nLanguage clone() {
        return (I18nLanguage) super.clone();
    }
}
