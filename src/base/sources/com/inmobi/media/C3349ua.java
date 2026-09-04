package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ua, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3349ua extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3375va f27615a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3349ua(ViewTreeObserverOnGlobalLayoutListenerC3375va viewTreeObserverOnGlobalLayoutListenerC3375va, kl.f fVar) {
        super(2, fVar);
        this.f27615a = viewTreeObserverOnGlobalLayoutListenerC3375va;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3349ua(this.f27615a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3349ua(this.f27615a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        em.y yVar = this.f27615a.f27705e;
        fl.g0 g0Var = fl.g0.f38750a;
        yVar.s(g0Var);
        return g0Var;
    }
}
