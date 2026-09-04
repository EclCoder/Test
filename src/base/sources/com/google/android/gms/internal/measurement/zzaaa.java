package com.google.android.gms.internal.measurement;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzaaa {
    private static final zzaaa zza = new zzzu();

    /* synthetic */ zzaaa(byte[] bArr) {
    }

    public static zzaaa zzh(zzzj zzzjVar, zzzj zzzjVar2) {
        int iZza = zzzjVar2.zza();
        if (iZza == 0) {
            return zza;
        }
        byte[] bArr = null;
        return iZza <= 28 ? new zzzy(zzzjVar, zzzjVar2, bArr) : new zzzz(zzzjVar, zzzjVar2, bArr);
    }

    public abstract void zza(zzzq zzzqVar, Object obj);

    public abstract int zzb();

    public abstract Set zzc();
}
