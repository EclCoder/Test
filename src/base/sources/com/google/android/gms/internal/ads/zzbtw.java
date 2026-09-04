package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzbtw implements zzbsn, zzbtv {
    private final zzbtv zza;
    private final HashSet zzb = new HashSet();

    public zzbtw(zzbtv zzbtvVar) {
        this.zza = zzbtvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbsn, com.google.android.gms.internal.ads.zzbsy
    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final void zzf() {
        HashSet<AbstractMap.SimpleEntry> hashSet = this.zzb;
        for (AbstractMap.SimpleEntry simpleEntry : hashSet) {
            com.google.android.gms.ads.internal.util.zze.zza("Unregistering eventhandler: ".concat(String.valueOf(((zzbpq) simpleEntry.getValue()).toString())));
            this.zza.zzn((String) simpleEntry.getKey(), (zzbpq) simpleEntry.getValue());
        }
        hashSet.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzm(String str, zzbpq zzbpqVar) {
        this.zza.zzm(str, zzbpqVar);
        this.zzb.add(new AbstractMap.SimpleEntry(str, zzbpqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbtv
    public final void zzn(String str, zzbpq zzbpqVar) {
        this.zza.zzn(str, zzbpqVar);
        this.zzb.remove(new AbstractMap.SimpleEntry(str, zzbpqVar));
    }
}
