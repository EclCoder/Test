package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzdvu implements zzimu {
    private final zzind zza;

    private zzdvu(zzind zzindVar) {
        this.zza = zzindVar;
    }

    public static zzdvu zza(zzind zzindVar) {
        return new zzdvu(zzindVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbhv.zza.EnumC0297zza enumC0297zza = ((zzdci) this.zza).zza().zzp.zza == 3 ? zzbhv.zza.EnumC0297zza.REWARDED_INTERSTITIAL : zzbhv.zza.EnumC0297zza.REWARD_BASED_VIDEO_AD;
        zzinc.zzb(enumC0297zza);
        return enumC0297zza;
    }
}
