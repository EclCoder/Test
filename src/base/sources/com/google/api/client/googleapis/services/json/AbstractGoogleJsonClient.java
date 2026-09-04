package com.google.api.client.googleapis.services.json;

import com.google.api.client.googleapis.services.AbstractGoogleClient;
import com.google.api.client.googleapis.services.GoogleClientRequestInitializer;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractGoogleJsonClient extends AbstractGoogleClient {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class Builder extends AbstractGoogleClient.Builder {
        protected Builder(HttpTransport httpTransport, JsonFactory jsonFactory, String str, String str2, HttpRequestInitializer httpRequestInitializer, boolean z10) {
            super(httpTransport, str, str2, new JsonObjectParser.Builder(jsonFactory).setWrapperKeys(z10 ? Arrays.asList(DataSchemeDataSource.SCHEME_DATA, "error") : Collections.EMPTY_SET).build(), httpRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public abstract AbstractGoogleJsonClient build();

        public final JsonFactory getJsonFactory() {
            return getObjectParser().getJsonFactory();
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public final JsonObjectParser getObjectParser() {
            return (JsonObjectParser) super.getObjectParser();
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setApplicationName(String str) {
            return (Builder) super.setApplicationName(str);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setGoogleClientRequestInitializer(GoogleClientRequestInitializer googleClientRequestInitializer) {
            return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setRootUrl(String str) {
            return (Builder) super.setRootUrl(str);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setServicePath(String str) {
            return (Builder) super.setServicePath(str);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressAllChecks(boolean z10) {
            return (Builder) super.setSuppressAllChecks(z10);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressPatternChecks(boolean z10) {
            return (Builder) super.setSuppressPatternChecks(z10);
        }

        @Override // com.google.api.client.googleapis.services.AbstractGoogleClient.Builder
        public Builder setSuppressRequiredParameterChecks(boolean z10) {
            return (Builder) super.setSuppressRequiredParameterChecks(z10);
        }
    }

    protected AbstractGoogleJsonClient(Builder builder) {
        super(builder);
    }

    public final JsonFactory getJsonFactory() {
        return getObjectParser().getJsonFactory();
    }

    @Override // com.google.api.client.googleapis.services.AbstractGoogleClient
    public JsonObjectParser getObjectParser() {
        return (JsonObjectParser) super.getObjectParser();
    }
}
