package com.google.api.client.auth.oauth;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethods;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedParser;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractOAuthGetToken extends GenericUrl {
    public String consumerKey;
    public OAuthSigner signer;
    public HttpTransport transport;
    protected boolean usePost;

    protected AbstractOAuthGetToken(String str) {
        super(str);
    }

    public OAuthParameters createParameters() {
        OAuthParameters oAuthParameters = new OAuthParameters();
        oAuthParameters.consumerKey = this.consumerKey;
        oAuthParameters.signer = this.signer;
        return oAuthParameters;
    }

    public final OAuthCredentialsResponse execute() throws IOException {
        HttpRequest httpRequestBuildRequest = this.transport.createRequestFactory().buildRequest(this.usePost ? HttpMethods.POST : HttpMethods.GET, this, null);
        createParameters().intercept(httpRequestBuildRequest);
        HttpResponse httpResponseExecute = httpRequestBuildRequest.execute();
        httpResponseExecute.setContentLoggingLimit(0);
        OAuthCredentialsResponse oAuthCredentialsResponse = new OAuthCredentialsResponse();
        UrlEncodedParser.parse(httpResponseExecute.parseAsString(), oAuthCredentialsResponse);
        return oAuthCredentialsResponse;
    }
}
