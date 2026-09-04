package com.google.android.gms.auth.api.signin;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.OptionalPendingResult;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface GoogleSignInApi {
    public static final String EXTRA_SIGN_IN_ACCOUNT = "signInAccount";

    Intent getSignInIntent(GoogleApiClient googleApiClient);

    GoogleSignInResult getSignInResultFromIntent(Intent intent);

    PendingResult<Status> revokeAccess(GoogleApiClient googleApiClient);

    PendingResult<Status> signOut(GoogleApiClient googleApiClient);

    OptionalPendingResult<GoogleSignInResult> silentSignIn(GoogleApiClient googleApiClient);
}
