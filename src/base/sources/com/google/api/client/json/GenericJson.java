package com.google.api.client.json;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Throwables;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GenericJson extends GenericData implements Cloneable {
    private JsonFactory jsonFactory;

    public final JsonFactory getFactory() {
        return this.jsonFactory;
    }

    public final void setFactory(JsonFactory jsonFactory) {
        this.jsonFactory = jsonFactory;
    }

    public String toPrettyString() {
        JsonFactory jsonFactory = this.jsonFactory;
        return jsonFactory != null ? jsonFactory.toPrettyString(this) : super.toString();
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public String toString() {
        JsonFactory jsonFactory = this.jsonFactory;
        if (jsonFactory == null) {
            return super.toString();
        }
        try {
            return jsonFactory.toString(this);
        } catch (IOException e10) {
            throw Throwables.propagate(e10);
        }
    }

    @Override // com.google.api.client.util.GenericData
    public GenericJson set(String str, Object obj) {
        return (GenericJson) super.set(str, obj);
    }

    @Override // com.google.api.client.util.GenericData, java.util.AbstractMap
    public GenericJson clone() {
        return (GenericJson) super.clone();
    }
}
