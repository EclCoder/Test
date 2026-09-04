package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zam extends com.google.android.gms.internal.base.zaa implements IInterface {
    zam(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ISignInButtonCreator");
    }

    public final IObjectWrapper zae(IObjectWrapper iObjectWrapper, zax zaxVar) {
        Parcel parcelZaa = zaa();
        com.google.android.gms.internal.base.zac.zad(parcelZaa, iObjectWrapper);
        com.google.android.gms.internal.base.zac.zac(parcelZaa, zaxVar);
        Parcel parcelZab = zab(2, parcelZaa);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZab.readStrongBinder());
        parcelZab.recycle();
        return iObjectWrapperAsInterface;
    }
}
