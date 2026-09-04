package com.inmobi.media;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Z6 implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final em.o0 f26125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewGroup f26126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hm.w f26128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3322t9 f26129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public em.z1 f26130f;

    public Z6(long j10, ViewGroup view, InterfaceC3322t9 interfaceC3322t9, em.o0 coroutineScope, hm.w visibilityStateFlow) {
        kotlin.jvm.internal.s.h(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.s.h(view, "view");
        kotlin.jvm.internal.s.h(visibilityStateFlow, "visibilityStateFlow");
        this.f26125a = coroutineScope;
        this.f26126b = view;
        this.f26127c = j10;
        this.f26128d = visibilityStateFlow;
        this.f26129e = interfaceC3322t9;
    }

    public final fl.g0 a(boolean z10) {
        InterfaceC3322t9 interfaceC3322t9 = this.f26129e;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z10);
        }
        if (z10) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26129e;
            if (interfaceC3322t10 != null) {
                ((C3348u9) interfaceC3322t10).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            L6.a(this.f26130f);
            this.f26130f = null;
        } else {
            InterfaceC3322t9 interfaceC3322t11 = this.f26129e;
            if (interfaceC3322t11 != null) {
                ((C3348u9) interfaceC3322t11).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            this.f26130f = em.k.d(this.f26125a, null, null, new Y6(this, null), 3, null);
        }
        boolean z11 = this.f26126b.getWindowVisibility() == 0;
        InterfaceC3322t9 interfaceC3322t12 = this.f26129e;
        if (interfaceC3322t12 != null) {
            ((C3348u9) interfaceC3322t12).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z11);
        }
        this.f26128d.setValue(kotlin.coroutines.jvm.internal.b.a(z11));
        return fl.g0.f38750a;
    }

    @Override // hm.f
    public final /* bridge */ /* synthetic */ Object emit(Object obj, kl.f fVar) {
        return a(((Boolean) obj).booleanValue());
    }
}
