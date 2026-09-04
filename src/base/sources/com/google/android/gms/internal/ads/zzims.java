package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzims implements zzimu {
    private zzind zza;

    public static void zza(zzind zzindVar, zzind zzindVar2) {
        zzims zzimsVar = (zzims) zzindVar;
        if (zzimsVar.zza != null) {
            throw new IllegalStateException();
        }
        zzimsVar.zza = zzindVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final Object zzb() {
        zzind zzindVar = this.zza;
        if (zzindVar != null) {
            return zzindVar.zzb();
        }
        throw new IllegalStateException();
    }
}
