package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzeeg implements zzimu {
    private final zzind zza;
    private final zzind zzb;

    private zzeeg(zzind zzindVar, zzind zzindVar2) {
        this.zza = zzindVar;
        this.zzb = zzindVar2;
    }

    public static zzeeg zza(zzind zzindVar, zzind zzindVar2) {
        return new zzeeg(zzindVar, zzindVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeef(((zzcns) this.zza).zza(), (zzdzl) this.zzb.zzb());
    }
}
