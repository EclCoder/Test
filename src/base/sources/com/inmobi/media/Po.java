package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Po {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.z1 f25517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hm.w f25518b;

    public Po(long j10, em.o0 scope, ViewGroup observableView, InterfaceC3322t9 interfaceC3322t9) {
        kotlin.jvm.internal.s.h(scope, "coroutineScope");
        kotlin.jvm.internal.s.h(observableView, "observableView");
        hm.w wVarA = hm.k0.a(Boolean.FALSE);
        this.f25518b = wVarA;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("WindowLifecycleHandler", "WindowLifecycleHandler init - observableView: " + observableView + ", isAttachedToWindow: " + observableView.isAttachedToWindow());
        }
        hm.i0 i0VarA = hm.g.A(hm.g.u(hm.g.d(new Ro(observableView, null)), em.c1.c()), scope, hm.f0.f40523a.a(), Boolean.valueOf(observableView.isAttachedToWindow()));
        M1 collector = new M1(j10, observableView, interfaceC3322t9, scope, wVarA);
        kotlin.jvm.internal.s.h(i0VarA, "<this>");
        kotlin.jvm.internal.s.h(scope, "scope");
        kotlin.jvm.internal.s.h(collector, "collector");
        this.f25517a = em.k.d(scope, null, null, new R4(i0VarA, collector, null), 3, null);
    }
}
