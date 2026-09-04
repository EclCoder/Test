package com.google.android.gms.auth.api.signin.internal;

import android.content.Intent;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zbd implements GoogleSignInApi {
    private static final GoogleSignInOptions zba(GoogleApiClient googleApiClient) {
        return ((zbe) googleApiClient.getClient(Auth.zbb)).zba();
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final Intent getSignInIntent(GoogleApiClient googleApiClient) {
        return zbm.zba(googleApiClient.getContext(), zba(googleApiClient));
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final GoogleSignInResult getSignInResultFromIntent(Intent intent) {
        return zbm.zbg(intent);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient) {
        return zbm.zbf(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final PendingResult<Status> signOut(GoogleApiClient googleApiClient) {
        return zbm.zbe(googleApiClient, googleApiClient.getContext(), false);
    }

    @Override // com.google.android.gms.auth.api.signin.GoogleSignInApi
    public final OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient googleApiClient) {
        return zbm.zbd(googleApiClient, googleApiClient.getContext(), zba(googleApiClient), false);
    }
}
