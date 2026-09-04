package com.google.api.client.googleapis.testing.services;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import com.google.api.client.http.HttpContent;
import com.google.api.client.http.HttpHeaders;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockGoogleClientRequest<T> extends AbstractGoogleClientRequest<T> {
    public MockGoogleClientRequest(AbstractGoogleClient abstractGoogleClient, String str, String str2, HttpContent httpContent, Class<T> cls) {
        super(abstractGoogleClient, str, str2, httpContent, cls);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public MockGoogleClientRequest<T> setDisableGZipContent(boolean z10) {
        return (MockGoogleClientRequest) super.setDisableGZipContent(z10);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest
    public MockGoogleClientRequest<T> setRequestHeaders(HttpHeaders httpHeaders) {
        return (MockGoogleClientRequest) super.setRequestHeaders(httpHeaders);
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClientRequest, com.google.api.client.util.GenericData
    public MockGoogleClientRequest<T> set(String str, Object obj) {
        return (MockGoogleClientRequest) super.set(str, obj);
    }
}
