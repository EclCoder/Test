package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class zzgyg implements Comparator {
    protected zzgyg() {
    }

    public static zzgyg zzb() {
        return zzgye.zza;
    }

    public static zzgyg zzc(Comparator comparator) {
        return new zzgvv(comparator);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgyg zza() {
        return new zzgyp(this);
    }

    public final zzgyg zzd(zzgta zzgtaVar) {
        return new zzgvh(zzgtaVar, this);
    }
}
