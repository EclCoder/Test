package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbee;
import com.google.android.gms.internal.ads.zzbeg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzeb extends zzbee implements zzed {
    zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() {
        zzda(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg() {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzh() {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzi(boolean z10) {
        Parcel parcelZza = zza();
        int i10 = zzbeg.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzda(5, parcelZza);
    }
}
