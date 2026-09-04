package com.google.android.gms.internal.ads;

import em.o0;
import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgcc extends m implements o {
    int zza;
    final /* synthetic */ zzgce zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgcc(zzgce zzgceVar, kl.f fVar) {
        super(2, fVar);
        this.zzb = zzgceVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new zzgcc(this.zzb, fVar);
    }

    @Override // tl.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgcc) create((o0) obj, (kl.f) obj2)).invokeSuspend(g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.zza;
        s.b(obj);
        if (i10 == 0) {
            zzgce zzgceVar = this.zzb;
            this.zza = 1;
            if (zzgceVar.zzv(this) == objF) {
                return objF;
            }
        }
        return g0.f38750a;
    }
}
