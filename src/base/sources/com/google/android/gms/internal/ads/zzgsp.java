package com.google.android.gms.internal.ads;

import em.o0;
import em.q0;
import em.v0;
import fl.g0;
import fl.r;
import kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class zzgsp {
    public static final v0 zza(o0 o0Var, zzgsm coroutineSequence, o block) {
        s.h(o0Var, "<this>");
        s.h(coroutineSequence, "coroutineSequence");
        s.h(block, "block");
        return em.k.b(o0Var, null, q0.UNDISPATCHED, new zzgso(coroutineSequence, block, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zzd(nm.a aVar, kl.f fVar) {
        Object objE = aVar.e(null, fVar);
        return objE == ll.b.f() ? objE : g0.f38750a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object zze(nm.a aVar, kl.f fVar) {
        if (ll.b.e(zzgsn.zza, aVar, fVar) != ll.b.f()) {
            ll.b.c(fVar).resumeWith(r.b(g0.f38750a));
        }
        Object objF = ll.b.f();
        if (objF == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objF == ll.b.f() ? objF : g0.f38750a;
    }
}
