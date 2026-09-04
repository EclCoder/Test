package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgbv extends kotlin.coroutines.jvm.internal.d {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgce zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbv(zzgce zzgceVar, kl.f fVar) {
        super(fVar);
        this.zzd = zzgceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzy(this);
    }
}
