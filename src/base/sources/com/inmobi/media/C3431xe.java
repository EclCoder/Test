package com.inmobi.media;

import java.util.Map;

/* JADX INFO: renamed from: com.inmobi.media.xe, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3431xe extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Be f27853b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3431xe(Be be2, kl.f fVar) {
        super(2, fVar);
        this.f27853b = be2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3431xe(this.f27853b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3431xe(this.f27853b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27852a;
        if (i10 == 0) {
            fl.s.b(obj);
            InterfaceC3322t9 interfaceC3322t9L = this.f27853b.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).a("NativeRenderedState", "MRC50 Tracking Started");
            }
            hm.e eVarB = ((Nd) this.f27853b.f24536b.f24606k.getValue()).f25345a.b();
            C3405we c3405we = new C3405we(null);
            this.f27852a = 1;
            if (hm.g.q(eVarB, c3405we, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        InterfaceC3322t9 interfaceC3322t9L2 = this.f27853b.l();
        if (interfaceC3322t9L2 != null) {
            ((C3348u9) interfaceC3322t9L2).a("NativeRenderedState", "MRC50 Event Occurred");
        }
        Ce ce2 = this.f27853b.f24536b;
        ce2.f24597b.f24795d = true;
        Map mapA = AbstractC3487zk.a(((Lc) ce2.f24602g.f25272f.getValue()).f25200a);
        C3178nk c3178nk = C3178nk.f27064a;
        C3178nk.b("MRCViewable50Rendered", mapA, EnumC3281rk.SDK);
        this.f27853b.f24536b.f24601f.f25893b.f25751g.a(C2863bf.f26261a);
        ((Nd) this.f27853b.f24536b.f24606k.getValue()).f25345a.a();
        return fl.g0.f38750a;
    }
}
