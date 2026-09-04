package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfcr implements zzfci {
    private final int zza;
    private final int zzb;

    zzfcr(int i10, int i11) {
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i10;
        int i11 = this.zza;
        Bundle bundle = (Bundle) obj;
        if (i11 == -1 || (i10 = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i11);
        bundle.putInt("crashes_without_flags", i10);
        int i12 = com.google.android.gms.ads.internal.client.zzay.zza;
        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
