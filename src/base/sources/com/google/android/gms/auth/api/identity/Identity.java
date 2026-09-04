package com.google.android.gms.auth.api.identity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p001authapi.zbad;
import com.google.android.gms.internal.p001authapi.zbaj;
import com.google.android.gms.internal.p001authapi.zbat;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class Identity {
    private Identity() {
    }

    public static AuthorizationClient getAuthorizationClient(Activity activity) {
        return new zbad((Activity) Preconditions.checkNotNull(activity), new zba(null));
    }

    public static CredentialSavingClient getCredentialSavingClient(Activity activity) {
        return new zbaj((Activity) Preconditions.checkNotNull(activity), new zbi());
    }

    public static SignInClient getSignInClient(Activity activity) {
        return new zbat((Activity) Preconditions.checkNotNull(activity), new zbv());
    }

    public static AuthorizationClient getAuthorizationClient(Context context) {
        return new zbad((Context) Preconditions.checkNotNull(context), new zba(null));
    }

    public static CredentialSavingClient getCredentialSavingClient(Context context) {
        return new zbaj((Context) Preconditions.checkNotNull(context), new zbi());
    }

    public static SignInClient getSignInClient(Context context) {
        return new zbat((Context) Preconditions.checkNotNull(context), new zbv());
    }
}
