package com.google.android.gms.internal.ads;

import fl.g0;
import fl.s;
import kotlin.coroutines.jvm.internal.m;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class zzgbn extends m implements o {
    zzgbn(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new zzgbn(fVar);
    }

    @Override // tl.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzgbn) create((zzgax) obj, (kl.f) obj2)).invokeSuspend(g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        s.b(obj);
        zzgax zzgaxVarZzd = zzgax.zzd();
        kotlin.jvm.internal.s.g(zzgaxVarZzd, "getDefaultInstance(...)");
        return zzgaxVarZzd;
    }
}
