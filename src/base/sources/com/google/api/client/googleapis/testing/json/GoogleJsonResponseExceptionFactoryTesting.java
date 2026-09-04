package com.google.api.client.googleapis.testing.json;

import com.google.api.client.googleapis.json.GoogleJsonResponseException;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.json.Json;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.testing.http.HttpTesting;
import com.google.api.client.testing.http.MockHttpTransport;
import com.google.api.client.testing.http.MockLowLevelHttpResponse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class GoogleJsonResponseExceptionFactoryTesting {
    public static GoogleJsonResponseException newMock(JsonFactory jsonFactory, int i10, String str) {
        HttpRequest httpRequestBuildGetRequest = new MockHttpTransport.Builder().setLowLevelHttpResponse(new MockLowLevelHttpResponse().setStatusCode(i10).setReasonPhrase(str).setContentType(Json.MEDIA_TYPE).setContent("{ \"error\": { \"errors\": [ { \"reason\": \"" + str + "\" } ], \"code\": " + i10 + " } }")).build().createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
        httpRequestBuildGetRequest.setThrowExceptionOnExecuteError(false);
        return GoogleJsonResponseException.from(jsonFactory, httpRequestBuildGetRequest.execute());
    }
}
