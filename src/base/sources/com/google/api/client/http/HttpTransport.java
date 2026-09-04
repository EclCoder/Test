package com.google.api.client.http;

import java.util.Arrays;
import java.util.logging.Logger;
import vl.Rlkc.CIdIVqKnNZ;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class HttpTransport {
    static final Logger LOGGER = Logger.getLogger(HttpTransport.class.getName());
    private static final String[] SUPPORTED_METHODS;

    HttpRequest buildRequest() {
        return new HttpRequest(this, null);
    }

    protected abstract LowLevelHttpRequest buildRequest(String str, String str2);

    public final HttpRequestFactory createRequestFactory() {
        return createRequestFactory(null);
    }

    public boolean isMtls() {
        return false;
    }

    public void shutdown() {
    }

    public boolean supportsMethod(String str) {
        return Arrays.binarySearch(SUPPORTED_METHODS, str) >= 0;
    }

    static {
        String[] strArr = {HttpMethods.DELETE, CIdIVqKnNZ.azqEFWtEFheaI, HttpMethods.POST, HttpMethods.PUT};
        SUPPORTED_METHODS = strArr;
        Arrays.sort(strArr);
    }

    public final HttpRequestFactory createRequestFactory(HttpRequestInitializer httpRequestInitializer) {
        return new HttpRequestFactory(this, httpRequestInitializer);
    }
}
