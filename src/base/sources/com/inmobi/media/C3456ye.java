package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ye, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3456ye extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f27951a;

    public C3456ye(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3456ye c3456ye = new C3456ye(fVar);
        c3456ye.f27951a = ((Boolean) obj).booleanValue();
        return c3456ye;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        C3456ye c3456ye = new C3456ye((kl.f) obj2);
        c3456ye.f27951a = bool.booleanValue();
        return c3456ye.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        return kotlin.coroutines.jvm.internal.b.a(this.f27951a);
    }
}
