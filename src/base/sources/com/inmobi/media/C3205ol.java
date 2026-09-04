package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.ol, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3205ol extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27146a;

    public C3205ol(kl.f fVar) {
        super(2, fVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3205ol(fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C3205ol((kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27146a;
        if (i10 == 0) {
            fl.s.b(obj);
            String strB = Xi.b();
            if (strB == null) {
                return fl.g0.f38750a;
            }
            if (!kotlin.jvm.internal.s.c(strB, Xi.f26023c)) {
                C3136m4 c3136m4 = AbstractC2878c4.f26300a;
                this.f27146a = 1;
                Object objA = C3167n9.a(((C2929e4) AbstractC2878c4.f26300a.f26973b.f27031b.getValue()).f26445a, "config_db", null, this, 6);
                if (objA != ll.b.f()) {
                    objA = fl.g0.f38750a;
                }
                if (objA != ll.b.f()) {
                    objA = fl.g0.f38750a;
                }
                if (objA != ll.b.f()) {
                    objA = fl.g0.f38750a;
                }
                if (objA == objF) {
                    return objF;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
