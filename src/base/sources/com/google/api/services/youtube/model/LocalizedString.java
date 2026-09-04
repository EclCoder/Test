package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class LocalizedString extends GenericJson {

    @Key
    private String language;

    @Key
    private String value;

    public String getLanguage() {
        return this.language;
    }

    public String getValue() {
        return this.value;
    }

    public LocalizedString setLanguage(String str) {
        this.language = str;
        return this;
    }

    public LocalizedString setValue(String str) {
        this.value = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public LocalizedString set(String str, Object obj) {
        return (LocalizedString) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public LocalizedString clone() {
        return (LocalizedString) super.clone();
    }
}
