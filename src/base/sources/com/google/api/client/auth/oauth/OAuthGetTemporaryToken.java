package com.google.api.client.auth.oauth;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class OAuthGetTemporaryToken extends AbstractOAuthGetToken {
    public String callback;

    public OAuthGetTemporaryToken(String str) {
        super(str);
    }

    @Override // com.google.api.client.auth.oauth.AbstractOAuthGetToken
    public OAuthParameters createParameters() {
        OAuthParameters oAuthParametersCreateParameters = super.createParameters();
        oAuthParametersCreateParameters.callback = this.callback;
        return oAuthParametersCreateParameters;
    }
}
