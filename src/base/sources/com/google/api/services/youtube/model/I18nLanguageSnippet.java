package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class I18nLanguageSnippet extends GenericJson {

    /* JADX INFO: renamed from: hl, reason: collision with root package name */
    @Key
    private String f21624hl;

    @Key
    private String name;

    public String getHl() {
        return this.f21624hl;
    }

    public String getName() {
        return this.name;
    }

    public I18nLanguageSnippet setHl(String str) {
        this.f21624hl = str;
        return this;
    }

    public I18nLanguageSnippet setName(String str) {
        this.name = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public I18nLanguageSnippet set(String str, Object obj) {
        return (I18nLanguageSnippet) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public I18nLanguageSnippet clone() {
        return (I18nLanguageSnippet) super.clone();
    }
}
