package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgyc extends zzgul {
    final transient zzgub zza;

    zzgyc(Map map, zzgub zzgubVar) {
        super(map);
        this.zza = zzgubVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgul, com.google.android.gms.internal.ads.zzgvc
    protected final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, com.google.android.gms.internal.ads.zzgvf
    final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgvc, com.google.android.gms.internal.ads.zzgvf
    final Map zzl() {
        return zzm();
    }
}
