package com.google.api.client.testing.http;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.util.Preconditions;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class MockHttpTransport extends HttpTransport {
    private MockLowLevelHttpRequest lowLevelHttpRequest;
    private MockLowLevelHttpResponse lowLevelHttpResponse;
    private Set<String> supportedMethods;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder {
        MockLowLevelHttpRequest lowLevelHttpRequest;
        MockLowLevelHttpResponse lowLevelHttpResponse;
        Set<String> supportedMethods;

        public MockHttpTransport build() {
            return new MockHttpTransport(this);
        }

        public final MockLowLevelHttpRequest getLowLevelHttpRequest() {
            return this.lowLevelHttpRequest;
        }

        MockLowLevelHttpResponse getLowLevelHttpResponse() {
            return this.lowLevelHttpResponse;
        }

        public final Set<String> getSupportedMethods() {
            return this.supportedMethods;
        }

        public final Builder setLowLevelHttpRequest(MockLowLevelHttpRequest mockLowLevelHttpRequest) {
            Preconditions.checkState(this.lowLevelHttpResponse == null, "Cannnot set a low level HTTP request when a low level HTTP response has been set.");
            this.lowLevelHttpRequest = mockLowLevelHttpRequest;
            return this;
        }

        public final Builder setLowLevelHttpResponse(MockLowLevelHttpResponse mockLowLevelHttpResponse) {
            Preconditions.checkState(this.lowLevelHttpRequest == null, "Cannot set a low level HTTP response when a low level HTTP request has been set.");
            this.lowLevelHttpResponse = mockLowLevelHttpResponse;
            return this;
        }

        public final Builder setSupportedMethods(Set<String> set) {
            this.supportedMethods = set;
            return this;
        }
    }

    public MockHttpTransport() {
    }

    @Override // com.google.api.client.http.HttpTransport
    public LowLevelHttpRequest buildRequest(String str, String str2) {
        Preconditions.checkArgument(supportsMethod(str), "HTTP method %s not supported", str);
        MockLowLevelHttpRequest mockLowLevelHttpRequest = this.lowLevelHttpRequest;
        if (mockLowLevelHttpRequest != null) {
            return mockLowLevelHttpRequest;
        }
        MockLowLevelHttpRequest mockLowLevelHttpRequest2 = new MockLowLevelHttpRequest(str2);
        this.lowLevelHttpRequest = mockLowLevelHttpRequest2;
        MockLowLevelHttpResponse mockLowLevelHttpResponse = this.lowLevelHttpResponse;
        if (mockLowLevelHttpResponse != null) {
            mockLowLevelHttpRequest2.setResponse(mockLowLevelHttpResponse);
        }
        return this.lowLevelHttpRequest;
    }

    public final MockLowLevelHttpRequest getLowLevelHttpRequest() {
        return this.lowLevelHttpRequest;
    }

    public final Set<String> getSupportedMethods() {
        Set<String> set = this.supportedMethods;
        if (set == null) {
            return null;
        }
        return Collections.unmodifiableSet(set);
    }

    @Override // com.google.api.client.http.HttpTransport
    public boolean supportsMethod(String str) {
        Set<String> set = this.supportedMethods;
        return set == null || set.contains(str);
    }

    protected MockHttpTransport(Builder builder) {
        this.supportedMethods = builder.supportedMethods;
        this.lowLevelHttpRequest = builder.lowLevelHttpRequest;
        this.lowLevelHttpResponse = builder.lowLevelHttpResponse;
    }
}
