package com.google.android.gms.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.IAccountAccessor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void zae(int i10) {
        Parcel parcelZaa = zaa();
        parcelZaa.writeInt(i10);
        zac(7, parcelZaa);
    }

    public final void zaf(IAccountAccessor iAccountAccessor, int i10, boolean z10) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, iAccountAccessor);
        parcelZaa.writeInt(i10);
        parcelZaa.writeInt(z10 ? 1 : 0);
        zac(9, parcelZaa);
    }

    public final void zag(zai zaiVar, zae zaeVar) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaiVar);
        com.google.android.gms.internal.base.zac.zad(parcelZaa, zaeVar);
        zac(12, parcelZaa);
    }
}
