package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.batch.BatchRequest;
import com.google.api.client.googleapis.batch.json.JsonBatchCallback;
import com.google.api.client.googleapis.json.GoogleJsonErrorContainer;
import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.json.JsonHttpContent;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractGoogleJsonClientRequest<T> extends AbstractGoogleClientRequest<T> {
    private final Object jsonContent;

    /* JADX WARN: Illegal instructions before constructor call */
    protected AbstractGoogleJsonClientRequest(AbstractGoogleJsonClient abstractGoogleJsonClient, String str, String str2, Object obj, Class<T> cls) {
        JsonHttpContent wrapperKey = null;
        if (obj != null) {
            wrapperKey = new JsonHttpContent(abstractGoogleJsonClient.getJsonFactory(), obj).setWrapperKey(abstractGoogleJsonClient.getObjectParser().getWrapperKeys().isEmpty() ? null : DataSchemeDataSource.SCHEME_DATA);
        }
        super(abstractGoogleJsonClient, str, str2, wrapperKey, cls);
        this.jsonContent = obj;
    }

    public Object getJsonContent() {
        return this.jsonContent;
    }

    public final void queue(BatchRequest batchRequest, JsonBatchCallback<T> jsonBatchCallback) {
        super.queue(batchRequest, GoogleJsonErrorContainer.class, jsonBatchCallback);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public AbstractGoogleJsonClient getAbstractGoogleClient() {
        return (AbstractGoogleJsonClient) super.getAbstractGoogleClient();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public GoogleJsonResponseException newExceptionOnError(HttpResponse httpResponse) {
        return GoogleJsonResponseException.from(getAbstractGoogleClient().getJsonFactory(), httpResponse);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public AbstractGoogleJsonClientRequest<T> setDisableGZipContent(boolean z10) {
        return (AbstractGoogleJsonClientRequest) super.setDisableGZipContent(z10);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public AbstractGoogleJsonClientRequest<T> setRequestHeaders(HttpHeaders httpHeaders) {
        return (AbstractGoogleJsonClientRequest) super.setRequestHeaders(httpHeaders);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
    public AbstractGoogleJsonClientRequest<T> set(String str, Object obj) {
        return (AbstractGoogleJsonClientRequest) super.set(str, obj);
    }
}
