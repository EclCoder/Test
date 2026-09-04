package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.rc, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3273rc extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3325tc f27389a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3273rc(C3325tc c3325tc, kl.f fVar) {
        super(2, fVar);
        this.f27389a = c3325tc;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3273rc(this.f27389a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3273rc(this.f27389a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C3348u9 c3348u9 = this.f27389a.f27541a;
        if (c3348u9 != null) {
            c3348u9.a("MediaViewManager", "destroy called");
        }
        AbstractC3082k2 abstractC3082k2 = this.f27389a.f27542b;
        if (abstractC3082k2 != null) {
            abstractC3082k2.a();
        }
        this.f27389a.f27542b = null;
        return fl.g0.f38750a;
    }
}
