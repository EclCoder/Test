package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzcw extends zzbl implements zzcy {
    zzcw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final void zze(String str, String str2, Bundle bundle, long j10) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcy
    public final int zzf() {
        Parcel parcelZzP = zzP(2, zza());
        int i10 = parcelZzP.readInt();
        parcelZzP.recycle();
        return i10;
    }
}
