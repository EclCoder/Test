package com.google.api.client.googleapis;

import com.google.api.client.http.EmptyContent;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.UrlEncodedContent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class MethodOverride implements HttpExecuteInterceptor, HttpRequestInitializer {
    public static final String HEADER = "X-HTTP-Method-Override";
    static final int MAX_URL_LENGTH = 2048;
    private final boolean overrideAllMethods;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class Builder {
        private boolean overrideAllMethods;

        public MethodOverride build() {
            return new MethodOverride(this.overrideAllMethods);
        }

        public boolean getOverrideAllMethods() {
            return this.overrideAllMethods;
        }

        public Builder setOverrideAllMethods(boolean z10) {
            this.overrideAllMethods = z10;
            return this;
        }
    }

    public MethodOverride() {
        this(false);
    }

    private boolean overrideThisMethod(HttpRequest httpRequest) {
        String requestMethod = httpRequest.getRequestMethod();
        if (requestMethod.equals(HttpMethods.POST)) {
            return false;
        }
        if (!requestMethod.equals(HttpMethods.GET) ? this.overrideAllMethods : httpRequest.getUrl().build().length() > MAX_URL_LENGTH) {
            return !httpRequest.getTransport().supportsMethod(requestMethod);
        }
        return true;
    }

    @Override // com.google.api.client.http.HttpRequestInitializer
    public void initialize(HttpRequest httpRequest) {
        httpRequest.setInterceptor(this);
    }

    @Override // com.google.api.client.http.HttpExecuteInterceptor
    public void intercept(HttpRequest httpRequest) {
        if (overrideThisMethod(httpRequest)) {
            String requestMethod = httpRequest.getRequestMethod();
            httpRequest.setRequestMethod(HttpMethods.POST);
            httpRequest.getHeaders().set(HEADER, (Object) requestMethod);
            if (requestMethod.equals(HttpMethods.GET)) {
                httpRequest.setContent(new UrlEncodedContent(httpRequest.getUrl().clone()));
                httpRequest.getUrl().clear();
            } else if (httpRequest.getContent() == null) {
                httpRequest.setContent(new EmptyContent());
            }
        }
    }

    MethodOverride(boolean z10) {
        this.overrideAllMethods = z10;
    }
}
