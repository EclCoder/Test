package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements zzx {
    @Override // com.google.android.gms.common.internal.zzx
    public final IObjectWrapper zzd() {
        Parcel parcelZzB = zzB(1, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZzB.readStrongBinder());
        parcelZzB.recycle();
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() {
        Parcel parcelZzB = zzB(2, zza());
        int i10 = parcelZzB.readInt();
        parcelZzB.recycle();
        return i10;
    }

    zzv(IBinder iBinder) {
        super(iBinder, giNWGaNAgVQoO.oyPgrpr);
    }
}
