package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.nj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3177nj extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27063a;

    public C3177nj(kl.f fVar) {
        super(1, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3177nj(fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3177nj((kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27063a;
        if (i10 == 0) {
            fl.s.b(obj);
            kotlin.jvm.internal.s.g(AbstractC3229pj.f27270b, "access$getTAG$p(...)");
            C2944ej c2944ej = C2944ej.f26502a;
            boolean sessionEnabled = AbstractC3229pj.a().getSessionEnabled();
            c2944ej.getClass();
            C2944ej.f26506e = sessionEnabled;
            if (!sessionEnabled) {
                C2944ej.f26505d = null;
            }
            C2944ej.c();
            if (Xi.b() == null || AbstractC3229pj.a().getLocationEnabled()) {
                C3350ub c3350ub = C3350ub.f27616a;
                this.f27063a = 1;
                if (c3350ub.a(this) == objF) {
                    return objF;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
