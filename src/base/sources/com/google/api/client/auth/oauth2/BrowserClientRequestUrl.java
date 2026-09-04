package com.google.api.client.auth.oauth2;

import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class BrowserClientRequestUrl extends AuthorizationRequestUrl {
    public BrowserClientRequestUrl(String str, String str2) {
        super(str, str2, Collections.singleton(BidResponsed.KEY_TOKEN));
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public /* bridge */ /* synthetic */ AuthorizationRequestUrl setResponseTypes(Collection collection) {
        return setResponseTypes((Collection<String>) collection);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public /* bridge */ /* synthetic */ AuthorizationRequestUrl setScopes(Collection collection) {
        return setScopes((Collection<String>) collection);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public BrowserClientRequestUrl setClientId(String str) {
        return (BrowserClientRequestUrl) super.setClientId(str);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public BrowserClientRequestUrl setRedirectUri(String str) {
        return (BrowserClientRequestUrl) super.setRedirectUri(str);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public BrowserClientRequestUrl setResponseTypes(Collection<String> collection) {
        return (BrowserClientRequestUrl) super.setResponseTypes(collection);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public BrowserClientRequestUrl setScopes(Collection<String> collection) {
        return (BrowserClientRequestUrl) super.setScopes(collection);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public BrowserClientRequestUrl setState(String str) {
        return (BrowserClientRequestUrl) super.setState(str);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl, com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData
    public BrowserClientRequestUrl set(String str, Object obj) {
        return (BrowserClientRequestUrl) super.set(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl, com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData, java.util.AbstractMap
    public BrowserClientRequestUrl clone() {
        return (BrowserClientRequestUrl) super.clone();
    }
}
