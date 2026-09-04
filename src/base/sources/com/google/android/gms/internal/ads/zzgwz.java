package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class zzgwz<K, V> extends zzgwu<K, V> implements zzgxu<K, V> {
    private final transient zzgww<V> emptySet;
    private transient zzgww zza;

    zzgwz(zzgwp zzgwpVar, int i10, Comparator comparator) {
        super(zzgwpVar, i10);
        this.emptySet = zzgyn.zza;
    }

    public final zzgww zza() {
        zzgww zzgwwVar = this.zza;
        if (zzgwwVar != null) {
            return zzgwwVar;
        }
        zzgwy zzgwyVar = new zzgwy(this);
        this.zza = zzgwyVar;
        return zzgwyVar;
    }
}
