package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzgwu<K, V> extends zzgvg<K, V> implements Serializable {
    final transient zzgwp<K, ? extends zzgwi<V>> map;
    final transient int size;

    zzgwu(zzgwp zzgwpVar, int i10) {
        this.map = zzgwpVar;
        this.size = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final int zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    @Deprecated
    public final boolean zze(Object obj, Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    @Deprecated
    public final void zzf() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final Set zzh() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final /* synthetic */ Collection zzj() {
        return new zzgwt(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    final Map zzl() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.android.gms.internal.ads.zzgvf
    public final boolean zzr(Object obj) {
        return obj != null && super.zzr(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    public final /* bridge */ /* synthetic */ Collection zzt() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgvf, com.google.android.gms.internal.ads.zzgxu
    public /* synthetic */ Map zzu() {
        return this.map;
    }
}
