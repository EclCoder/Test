package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zbs extends com.google.android.gms.internal.p001authapi.zba implements IInterface {
    zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbc(parcelZba, zbrVar);
        com.google.android.gms.internal.p001authapi.zbc.zbb(parcelZba, googleSignInOptions);
        zbb(101, parcelZba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbc(parcelZba, zbrVar);
        com.google.android.gms.internal.p001authapi.zbc.zbb(parcelZba, googleSignInOptions);
        zbb(102, parcelZba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        com.google.android.gms.internal.p001authapi.zbc.zbc(parcelZba, zbrVar);
        com.google.android.gms.internal.p001authapi.zbc.zbb(parcelZba, googleSignInOptions);
        zbb(103, parcelZba);
    }
}
