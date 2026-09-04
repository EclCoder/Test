package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.UidVerifier;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zbt extends zbo {
    private final Context zba;

    public zbt(Context context) {
        this.zba = context;
    }

    private final void zbd() {
        if (UidVerifier.isGooglePlayServicesUid(this.zba, Binder.getCallingUid())) {
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb2 = new StringBuilder(String.valueOf(callingUid).length() + 41);
        sb2.append("Calling UID ");
        sb2.append(callingUid);
        sb2.append(" is not Google Play services.");
        throw new SecurityException(sb2.toString());
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbb() {
        zbd();
        Context context = this.zba;
        Storage storage = Storage.getInstance(context);
        GoogleSignInAccount savedDefaultGoogleSignInAccount = storage.getSavedDefaultGoogleSignInAccount();
        GoogleSignInOptions savedDefaultGoogleSignInOptions = GoogleSignInOptions.DEFAULT_SIGN_IN;
        if (savedDefaultGoogleSignInAccount != null) {
            savedDefaultGoogleSignInOptions = storage.getSavedDefaultGoogleSignInOptions();
        }
        GoogleSignInClient client = GoogleSignIn.getClient(context, savedDefaultGoogleSignInOptions);
        if (savedDefaultGoogleSignInAccount != null) {
            client.revokeAccess();
        } else {
            client.signOut();
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zbp
    public final void zbc() {
        zbd();
        zbn.zba(this.zba).zbb();
    }
}
