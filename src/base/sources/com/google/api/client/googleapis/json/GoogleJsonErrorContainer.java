package com.google.api.client.googleapis.json;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class GoogleJsonErrorContainer extends GenericJson {

    @Key
    private GoogleJsonError error;

    public final GoogleJsonError getError() {
        return this.error;
    }

    public final void setError(GoogleJsonError googleJsonError) {
        this.error = googleJsonError;
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData
    public GoogleJsonErrorContainer set(String str, Object obj) {
        return (GoogleJsonErrorContainer) super.set(str, obj);
    }

    @Override // com.google.api.client.json.GenericJson, com.google.api.client.util.GenericData, java.util.AbstractMap
    public GoogleJsonErrorContainer clone() {
        return (GoogleJsonErrorContainer) super.clone();
    }
}
