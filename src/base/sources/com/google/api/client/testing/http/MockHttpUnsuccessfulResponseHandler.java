package com.google.api.client.testing.http;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockHttpUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {
    private boolean isCalled;
    private boolean successfullyHandleResponse;

    public MockHttpUnsuccessfulResponseHandler(boolean z10) {
        this.successfullyHandleResponse = z10;
    }

    @Override // com.google.api.client.http.HttpUnsuccessfulResponseHandler
    public boolean handleResponse(HttpRequest httpRequest, HttpResponse httpResponse, boolean z10) {
        this.isCalled = true;
        return this.successfullyHandleResponse;
    }

    public boolean isCalled() {
        return this.isCalled;
    }
}
