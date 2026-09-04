package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgvz {
    private static final zzgvz zza = new zzgvx();
    private static final zzgvz zzb = new zzgvy(-1);
    private static final zzgvz zzc = new zzgvy(1);

    /* synthetic */ zzgvz(byte[] bArr) {
    }

    public static zzgvz zzg() {
        return zza;
    }

    public abstract zzgvz zza(Object obj, Object obj2, Comparator comparator);

    public abstract zzgvz zzb(int i10, int i11);

    public abstract zzgvz zzc(boolean z10, boolean z11);

    public abstract zzgvz zzd(boolean z10, boolean z11);

    public abstract int zze();
}
