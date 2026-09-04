package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfzd extends zzbee implements zzfzf {
    zzfzd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zze() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zzf(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zzg(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zzh(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zzi(int i10) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i10);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfzf
    public final void zzj(IObjectWrapper iObjectWrapper, String str, String str2) {
        Parcel parcelZza = zza();
        zzbeg.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzda(8, parcelZza);
    }
}
