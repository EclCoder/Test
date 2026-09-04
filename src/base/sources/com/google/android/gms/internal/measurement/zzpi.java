package com.google.android.gms.internal.measurement;

import sc.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzpi implements zzph {
    private volatile zzon zza;
    private zzpg zzb;

    /* synthetic */ zzpi(zzon zzonVar, byte[] bArr) {
        this.zza = zzonVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzph
    public final zzpg zza(zzlk zzlkVar, String str) {
        p.d(true);
        zzon zzonVar = this.zza;
        zzon zzonVar2 = zzpg.zza;
        if (zzonVar != zzonVar2) {
            this.zzb = zzpg.zzd().zzc(zzlkVar, zzonVar, "").zza(zzlkVar, "");
            this.zza = zzonVar2;
        }
        return this.zzb;
    }
}
