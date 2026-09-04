package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public interface SignInClient extends HasApiKey<zbv> {
    @Deprecated
    Task<BeginSignInResult> beginSignIn(BeginSignInRequest beginSignInRequest);

    String getPhoneNumberFromIntent(Intent intent);

    Task<PendingIntent> getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest);

    @Deprecated
    SignInCredential getSignInCredentialFromIntent(Intent intent);

    @Deprecated
    Task<PendingIntent> getSignInIntent(GetSignInIntentRequest getSignInIntentRequest);

    @Deprecated
    Task<Void> signOut();
}
