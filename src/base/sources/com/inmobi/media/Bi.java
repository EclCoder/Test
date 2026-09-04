package com.inmobi.media;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Bi extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Ei f24553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map f24554b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bi(Ei ei2, Map map, kl.f fVar) {
        super(2, fVar);
        this.f24553a = ei2;
        this.f24554b = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Bi(this.f24553a, this.f24554b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Bi(this.f24553a, this.f24554b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        Ei ei2 = this.f24553a;
        if (ei2.a(ei2.f24725c.f27823b)) {
            InterfaceC3322t9 interfaceC3322t9L = this.f24553a.l();
            if (interfaceC3322t9L != null) {
                ((C3348u9) interfaceC3322t9L).b("AUM-RenderedState", "onAdClicked callback blocked.");
            }
        } else {
            this.f24553a.f24726d.onAdClicked(this.f24554b);
        }
        return fl.g0.f38750a;
    }
}
