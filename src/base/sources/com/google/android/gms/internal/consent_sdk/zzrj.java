package com.google.android.gms.internal.consent_sdk;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzrj {
    private final zzri zza;

    private zzrj(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        this.zza = new zzri(zzszVar, "", zzszVar2, obj2);
    }

    static int zzb(zzri zzriVar, Object obj, Object obj2) {
        return zzqf.zza(zzriVar.zza, 1, obj) + zzqf.zza(zzriVar.zzb, 2, obj2);
    }

    public static zzrj zzd(zzsz zzszVar, Object obj, zzsz zzszVar2, Object obj2) {
        return new zzrj(zzszVar, "", zzszVar2, obj2);
    }

    public final int zza(int i10, Object obj, Object obj2) {
        zzri zzriVar = this.zza;
        int iZzC = zzpv.zzC(i10 << 3);
        int iZzb = zzb(zzriVar, obj, obj2);
        return iZzC + zzpv.zzC(iZzb) + iZzb;
    }

    final zzri zzc() {
        return this.zza;
    }
}
