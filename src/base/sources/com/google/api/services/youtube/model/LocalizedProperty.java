package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LocalizedProperty extends GenericJson {

    @Key
    private LanguageTag defaultLanguage;

    @Key("default")
    private String default__;

    @Key
    private List<LocalizedString> localized;

    public String getDefault() {
        return this.default__;
    }

    public LanguageTag getDefaultLanguage() {
        return this.defaultLanguage;
    }

    public List<LocalizedString> getLocalized() {
        return this.localized;
    }

    public LocalizedProperty setDefault(String str) {
        this.default__ = str;
        return this;
    }

    public LocalizedProperty setDefaultLanguage(LanguageTag languageTag) {
        this.defaultLanguage = languageTag;
        return this;
    }

    public LocalizedProperty setLocalized(List<LocalizedString> list) {
        this.localized = list;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LocalizedProperty set(String str, Object obj) {
        return (LocalizedProperty) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LocalizedProperty clone() {
        return (LocalizedProperty) super.clone();
    }
}
