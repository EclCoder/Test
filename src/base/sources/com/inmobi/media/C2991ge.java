package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ge, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2991ge extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3043ie f26612a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2991ge(C3043ie c3043ie, kl.f fVar) {
        super(2, fVar);
        this.f26612a = c3043ie;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2991ge(this.f26612a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2991ge(this.f26612a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        this.f26612a.f26744g.setActivated(true);
        this.f26612a.f26744g.setFocusable(true);
        C3043ie c3043ie = this.f26612a;
        if (c3043ie.f26746i) {
            c3043ie.a();
        } else {
            T4.a(c3043ie.f26739b, new C3017he(c3043ie, null));
        }
        return fl.g0.f38750a;
    }
}
