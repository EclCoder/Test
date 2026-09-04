package com.google.api.client.googleapis.compute;

import com.google.api.client.auth.oauth2.BearerToken;
import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.auth.oauth2.CredentialRefreshListener;
import com.google.api.client.auth.oauth2.TokenResponse;
import com.google.api.client.googleapis.auth.oauth2.OAuth2Utils;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Preconditions;
import com.mbridge.msdk.dycreator.subjectfactory.rcjU.KPtaxpyICj;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class ComputeCredential extends Credential {
    public static final String TOKEN_SERVER_ENCODED_URL = OAuth2Utils.getMetadataServerUrl() + "/computeMetadata/v1/instance/service-accounts/default/token";

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Builder extends Credential.Builder {
        public Builder(HttpTransport httpTransport, JsonFactory jsonFactory) {
            super(BearerToken.authorizationHeaderAccessMethod());
            setTransport(httpTransport);
            setJsonFactory(jsonFactory);
            setTokenServerEncodedUrl(ComputeCredential.TOKEN_SERVER_ENCODED_URL);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public /* bridge */ /* synthetic */ Credential.Builder setRefreshListeners(Collection collection) {
            return setRefreshListeners((Collection<CredentialRefreshListener>) collection);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder addRefreshListener(CredentialRefreshListener credentialRefreshListener) {
            return (Builder) super.addRefreshListener(credentialRefreshListener);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public ComputeCredential build() {
            return new ComputeCredential(this);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setClientAuthentication(HttpExecuteInterceptor httpExecuteInterceptor) {
            Preconditions.checkArgument(httpExecuteInterceptor == null);
            return this;
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setClock(Clock clock) {
            return (Builder) super.setClock(clock);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setJsonFactory(JsonFactory jsonFactory) {
            return (Builder) super.setJsonFactory((JsonFactory) Preconditions.checkNotNull(jsonFactory));
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setRefreshListeners(Collection<CredentialRefreshListener> collection) {
            return (Builder) super.setRefreshListeners(collection);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
            return (Builder) super.setRequestInitializer(httpRequestInitializer);
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setTokenServerEncodedUrl(String str) {
            return (Builder) super.setTokenServerEncodedUrl((String) Preconditions.checkNotNull(str));
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setTokenServerUrl(GenericUrl genericUrl) {
            return (Builder) super.setTokenServerUrl((GenericUrl) Preconditions.checkNotNull(genericUrl));
        }

        @Override // com.google.api.client.auth.oauth2.Credential.Builder
        public Builder setTransport(HttpTransport httpTransport) {
            return (Builder) super.setTransport((HttpTransport) Preconditions.checkNotNull(httpTransport));
        }
    }

    public ComputeCredential(HttpTransport httpTransport, JsonFactory jsonFactory) {
        this(new Builder(httpTransport, jsonFactory));
    }

    protected ComputeCredential(Builder builder) {
        super(builder);
    }

    @Override // com.google.api.client.auth.oauth2.Credential
    protected TokenResponse executeRefreshToken() {
        HttpRequest httpRequestBuildGetRequest = getTransport().createRequestFactory().buildGetRequest(new GenericUrl(getTokenServerEncodedUrl()));
        httpRequestBuildGetRequest.setParser(new JsonObjectParser(getJsonFactory()));
        httpRequestBuildGetRequest.getHeaders().set("Metadata-Flavor", (Object) KPtaxpyICj.LTVggMFmwA);
        return (TokenResponse) httpRequestBuildGetRequest.execute().parseAs(TokenResponse.class);
    }
}
