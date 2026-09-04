package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3112l6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3035i6 f26925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f26926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3216p6 f26927c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3112l6(C3035i6 c3035i6, boolean z10, C3216p6 c3216p6, kl.f fVar) {
        super(2, fVar);
        this.f26925a = c3035i6;
        this.f26926b = z10;
        this.f26927c = c3216p6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3112l6(this.f26925a, this.f26926b, this.f26927c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3112l6) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        return fl.g0.f38750a;
    }
}
