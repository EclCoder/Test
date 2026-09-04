package com.google.api.client.auth.oauth2;

import com.google.api.client.util.Key;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class AuthorizationCodeRequestUrl extends AuthorizationRequestUrl {

    @Key("code_challenge")
    String codeChallenge;

    @Key("code_challenge_method")
    String codeChallengeMethod;

    public AuthorizationCodeRequestUrl(String str, String str2) {
        super(str, str2, Collections.singleton("code"));
    }

    public String getCodeChallenge() {
        return this.codeChallenge;
    }

    public String getCodeChallengeMethod() {
        return this.codeChallengeMethod;
    }

    public void setCodeChallenge(String str) {
        this.codeChallenge = str;
    }

    public void setCodeChallengeMethod(String str) {
        this.codeChallengeMethod = str;
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
    public AuthorizationCodeRequestUrl setClientId(String str) {
        return (AuthorizationCodeRequestUrl) super.setClientId(str);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public AuthorizationCodeRequestUrl setRedirectUri(String str) {
        return (AuthorizationCodeRequestUrl) super.setRedirectUri(str);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public AuthorizationCodeRequestUrl setResponseTypes(Collection<String> collection) {
        return (AuthorizationCodeRequestUrl) super.setResponseTypes(collection);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public AuthorizationCodeRequestUrl setScopes(Collection<String> collection) {
        return (AuthorizationCodeRequestUrl) super.setScopes(collection);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl
    public AuthorizationCodeRequestUrl setState(String str) {
        return (AuthorizationCodeRequestUrl) super.setState(str);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl, com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData
    public AuthorizationCodeRequestUrl set(String str, Object obj) {
        return (AuthorizationCodeRequestUrl) super.set(str, obj);
    }

    @Override // com.google.api.client.auth.oauth2.AuthorizationRequestUrl, com.google.api.client.http.GenericUrl, com.google.api.client.util.GenericData, java.util.AbstractMap
    public AuthorizationCodeRequestUrl clone() {
        return (AuthorizationCodeRequestUrl) super.clone();
    }
}
