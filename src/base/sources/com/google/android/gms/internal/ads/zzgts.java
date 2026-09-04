package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgts implements Iterable {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzgty zzb;

    zzgts(zzgty zzgtyVar, CharSequence charSequence) {
        this.zza = charSequence;
        Objects.requireNonNull(zzgtyVar);
        this.zzb = zzgtyVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zzb.zzf(this.zza);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        zzgtd.zzb(sb2, this, ", ");
        sb2.append(']');
        return sb2.toString();
    }
}
