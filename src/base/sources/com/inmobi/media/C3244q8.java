package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.q8, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3244q8 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3295s8 f27326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Zj f27327b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3244q8(C3295s8 c3295s8, Zj zj2, kl.f fVar) {
        super(2, fVar);
        this.f27326a = c3295s8;
        this.f27327b = zj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3244q8(this.f27326a, this.f27327b, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3244q8(this.f27326a, this.f27327b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3295s8 c3295s8 = this.f27326a;
        c3295s8.f27448f = this.f27327b;
        c3295s8.f27446d.a(c3295s8.f27450h);
        return fl.g0.f38750a;
    }
}
