package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.uj, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3358uj extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nm.a f27633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC3410wj f27634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC3332tj f27635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC3332tj f27636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f27637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC3410wj f27638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3332tj f27639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3332tj f27640h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3358uj(AbstractC3410wj abstractC3410wj, InterfaceC3332tj interfaceC3332tj, InterfaceC3332tj interfaceC3332tj2, kl.f fVar) {
        super(2, fVar);
        this.f27638f = abstractC3410wj;
        this.f27639g = interfaceC3332tj;
        this.f27640h = interfaceC3332tj2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3358uj(this.f27638f, this.f27639g, this.f27640h, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3358uj) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        nm.a aVar;
        InterfaceC3332tj interfaceC3332tj;
        AbstractC3410wj abstractC3410wj;
        InterfaceC3332tj interfaceC3332tj2;
        Object objF = ll.b.f();
        int i10 = this.f27637e;
        if (i10 == 0) {
            fl.s.b(obj);
            AbstractC3410wj abstractC3410wj2 = this.f27638f;
            aVar = abstractC3410wj2.f27803b;
            interfaceC3332tj = this.f27639g;
            InterfaceC3332tj interfaceC3332tj3 = this.f27640h;
            this.f27633a = aVar;
            this.f27634b = abstractC3410wj2;
            this.f27635c = interfaceC3332tj;
            this.f27636d = interfaceC3332tj3;
            this.f27637e = 1;
            if (aVar.e(null, this) == objF) {
                return objF;
            }
            abstractC3410wj = abstractC3410wj2;
            interfaceC3332tj2 = interfaceC3332tj3;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3332tj2 = this.f27636d;
            interfaceC3332tj = this.f27635c;
            abstractC3410wj = this.f27634b;
            aVar = this.f27633a;
            fl.s.b(obj);
        }
        try {
            abstractC3410wj.b(interfaceC3332tj, interfaceC3332tj2);
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }
}
