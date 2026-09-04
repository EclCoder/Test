package com.google.api.client.googleapis.batch.json;

import com.google.api.client.googleapis.batch.BatchCallback;
import com.google.api.client.googleapis.json.GoogleJsonError;
import com.google.api.client.googleapis.json.GoogleJsonErrorContainer;
import com.google.api.client.http.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class JsonBatchCallback<T> implements BatchCallback<T, GoogleJsonErrorContainer> {
    public abstract void onFailure(GoogleJsonError googleJsonError, HttpHeaders httpHeaders);

    @Override // com.google.api.client.googleapis.batch.BatchCallback
    public final void onFailure(GoogleJsonErrorContainer googleJsonErrorContainer, HttpHeaders httpHeaders) {
        onFailure(googleJsonErrorContainer.getError(), httpHeaders);
    }
}
