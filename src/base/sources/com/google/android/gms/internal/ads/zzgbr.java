package com.google.android.gms.internal.ads;

import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgbr extends m implements o {
    /* synthetic */ Object zza;
    final /* synthetic */ zzgat zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgbr(zzgat zzgatVar, kl.f fVar) {
        super(2, fVar);
        this.zzb = zzgatVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        zzgbr zzgbrVar = new zzgbr(this.zzb, fVar);
        zzgbrVar.zza = obj;
        return zzgbrVar;
    }

    @Override // tl.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbr) create((zzgax) obj, (kl.f) obj2)).invokeSuspend(g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        s.b(obj);
        zzgaz zzgazVarZza = zzgay.zza((zzgav) ((zzgax) this.zza).zzcc());
        zzihj zzihjVarZzb = zzgazVarZza.zzb();
        zzgat zzgatVar = this.zzb;
        String strZza = zzgatVar.zza();
        kotlin.jvm.internal.s.g(strZza, "getGwsQueryId(...)");
        zzgazVarZza.zzc(zzihjVarZzb, strZza, zzgatVar);
        return zzgazVarZza.zza();
    }
}
