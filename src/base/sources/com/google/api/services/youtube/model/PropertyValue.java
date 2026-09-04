package com.google.api.services.youtube.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class PropertyValue extends GenericJson {

    @Key
    private String property;

    @Key
    private String value;

    public String getProperty() {
        return this.property;
    }

    public String getValue() {
        return this.value;
    }

    public PropertyValue setProperty(String str) {
        this.property = str;
        return this;
    }

    public PropertyValue setValue(String str) {
        this.value = str;
        return this;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public PropertyValue set(String str, Object obj) {
        return (PropertyValue) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public PropertyValue clone() {
        return (PropertyValue) super.clone();
    }
}
