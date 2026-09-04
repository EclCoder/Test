package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class zbf extends zba {
    final /* synthetic */ Context zba;
    final /* synthetic */ GoogleSignInOptions zbb;
    final /* synthetic */ zbg zbc;

    zbf(zbg zbgVar, Context context, GoogleSignInOptions googleSignInOptions) {
        this.zba = context;
        this.zbb = googleSignInOptions;
        Objects.requireNonNull(zbgVar);
        this.zbc = zbgVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(GoogleSignInAccount googleSignInAccount, Status status) {
        if (googleSignInAccount != null) {
            Context context = this.zba;
            zbn.zba(context).zbc(this.zbb, googleSignInAccount);
        }
        this.zbc.setResult(new GoogleSignInResult(googleSignInAccount, status));
    }
}
