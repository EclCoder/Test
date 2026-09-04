package com.google.api.client.http;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class HttpRequestFactory {
    private final HttpRequestInitializer initializer;
    private final HttpTransport transport;

    HttpRequestFactory(HttpTransport httpTransport, HttpRequestInitializer httpRequestInitializer) {
        this.transport = httpTransport;
        this.initializer = httpRequestInitializer;
    }

    public HttpRequest buildDeleteRequest(GenericUrl genericUrl) {
        return buildRequest(HttpMethods.DELETE, genericUrl, null);
    }

    public HttpRequest buildGetRequest(GenericUrl genericUrl) {
        return buildRequest(HttpMethods.GET, genericUrl, null);
    }

    public HttpRequest buildHeadRequest(GenericUrl genericUrl) {
        return buildRequest(HttpMethods.HEAD, genericUrl, null);
    }

    public HttpRequest buildPatchRequest(GenericUrl genericUrl, HttpContent httpContent) {
        return buildRequest(HttpMethods.PATCH, genericUrl, httpContent);
    }

    public HttpRequest buildPostRequest(GenericUrl genericUrl, HttpContent httpContent) {
        return buildRequest(HttpMethods.POST, genericUrl, httpContent);
    }

    public HttpRequest buildPutRequest(GenericUrl genericUrl, HttpContent httpContent) {
        return buildRequest(HttpMethods.PUT, genericUrl, httpContent);
    }

    public HttpRequest buildRequest(String str, GenericUrl genericUrl, HttpContent httpContent) {
        HttpRequest httpRequestBuildRequest = this.transport.buildRequest();
        HttpRequestInitializer httpRequestInitializer = this.initializer;
        if (httpRequestInitializer != null) {
            httpRequestInitializer.initialize(httpRequestBuildRequest);
        }
        httpRequestBuildRequest.setRequestMethod(str);
        if (genericUrl != null) {
            httpRequestBuildRequest.setUrl(genericUrl);
        }
        if (httpContent != null) {
            httpRequestBuildRequest.setContent(httpContent);
        }
        return httpRequestBuildRequest;
    }

    public HttpRequestInitializer getInitializer() {
        return this.initializer;
    }

    public HttpTransport getTransport() {
        return this.transport;
    }
}
