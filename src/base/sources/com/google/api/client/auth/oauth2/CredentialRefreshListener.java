package com.google.api.client.auth.oauth2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface CredentialRefreshListener {
    void onTokenErrorResponse(Credential credential, TokenErrorResponse tokenErrorResponse);

    void onTokenResponse(Credential credential, TokenResponse tokenResponse);
}
