package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zbq extends com.google.android.gms.internal.p001authapi.zbb implements zbr {
    public zbq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.p001authapi.zbb
    protected final boolean zba(int i10, Parcel parcel, Parcel parcel2, int i11) {
        switch (i10) {
            case 101:
                GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, GoogleSignInAccount.CREATOR);
                Status status = (Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p001authapi.zbc.zbd(parcel);
                zbb(googleSignInAccount, status);
                break;
            case 102:
                Status status2 = (Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p001authapi.zbc.zbd(parcel);
                zbc(status2);
                break;
            case 103:
                Status status3 = (Status) com.google.android.gms.internal.p001authapi.zbc.zba(parcel, Status.CREATOR);
                com.google.android.gms.internal.p001authapi.zbc.zbd(parcel);
                zbd(status3);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
