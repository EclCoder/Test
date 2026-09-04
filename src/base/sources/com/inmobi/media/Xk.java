package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Xk extends kotlin.coroutines.jvm.internal.m implements Function1 {
    public Xk(kl.f fVar) {
        super(1, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Xk(fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Xk((kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        em.v0 v0Var;
        ll.b.f();
        fl.s.b(obj);
        if (C2843al.f26227b.f28021b.get() != null && (v0Var = C2843al.f26229d) != null) {
            em.z1.c0(v0Var, null, 1, null);
        }
        return fl.g0.f38750a;
    }
}
