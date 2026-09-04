package com.inmobi.media;

import ta.QXA.YSHErhbVu;

/* JADX INFO: renamed from: com.inmobi.media.me, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3146me implements hm.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Be f26994a;

    public C3146me(em.o0 o0Var, Be be2) {
        this.f26994a = be2;
    }

    @Override // hm.f
    public final Object emit(Object obj, kl.f fVar) {
        AbstractC3066jc event = (AbstractC3066jc) obj;
        Vc vc2 = this.f26994a.f24536b.f24601f;
        vc2.getClass();
        String str = YSHErhbVu.IXxyvnawD;
        kotlin.jvm.internal.s.h(event, str);
        if (event instanceof Vm) {
            vc2.f25892a.f25832d = AbstractC3463yl.a(((Vm) event).f25912a);
        } else if (event instanceof C3207on) {
            vc2.f25892a.f25833e = ((C3207on) event).f27148a;
        }
        if (!(event instanceof C3207on)) {
            InterfaceC3322t9 interfaceC3322t9L = this.f26994a.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "listenMediaEvents - processing media event: " + event);
            }
            ((C2835ad) this.f26994a.f24536b.f24608m.getValue()).a(event);
            Ai ai2 = (Ai) this.f26994a.f24536b.f24609n.getValue();
            ai2.getClass();
            kotlin.jvm.internal.s.h(event, "event");
            if (event instanceof AbstractC3050im) {
                ai2.f24477b.a((AbstractC3050im) event);
            }
            Ai ai3 = (Ai) this.f26994a.f24536b.f24609n.getValue();
            ai3.getClass();
            kotlin.jvm.internal.s.h(event, "event");
            Ic ic2 = ai3.f24478c.f25269c;
            if (event instanceof Bn) {
                ic2.f();
            } else if (event instanceof C3465yn) {
                ic2.i();
            } else if (event instanceof C2974fn) {
                ic2.b();
            } else if (event instanceof C2999gm) {
                ic2.h();
            } else if (event instanceof S1) {
                ic2.a(((S1) event).f25666a);
            }
            Ai ai4 = (Ai) this.f26994a.f24536b.f24609n.getValue();
            ai4.getClass();
            kotlin.jvm.internal.s.h(event, str);
            if (event instanceof C2999gm) {
                ai4.f24476a.g();
            }
        }
        return fl.g0.f38750a;
    }
}
