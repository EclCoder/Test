package com.google.api.client.auth.oauth;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.util.Key;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class OAuthCallbackUrl extends GenericUrl {

    @Key("oauth_token")
    public String token;

    @Key("oauth_verifier")
    public String verifier;

    public OAuthCallbackUrl(String str) {
        super(str);
    }
}
