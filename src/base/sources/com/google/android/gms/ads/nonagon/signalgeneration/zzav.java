package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.zzimu;
import com.google.android.gms.internal.ads.zzinc;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class zzav implements zzimu {
    private final zzat zza;

    private zzav(zzat zzatVar) {
        this.zza = zzatVar;
    }

    public static zzav zza(zzat zzatVar) {
        return new zzav(zzatVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ Object zzb() {
        String strZzb = this.zza.zzb();
        zzinc.zzb(strZzb);
        return strZzb;
    }
}
