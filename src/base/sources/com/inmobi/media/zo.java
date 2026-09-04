package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class zo extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f28039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f28040c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ em.v0 f28041d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo(InterfaceC3322t9 interfaceC3322t9, String str, em.v0 v0Var, kl.f fVar) {
        super(2, fVar);
        this.f28039b = interfaceC3322t9;
        this.f28040c = str;
        this.f28041d = v0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new zo(this.f28039b, this.f28040c, this.f28041d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((zo) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f28038a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
            return obj;
        }
        fl.s.b(obj);
        InterfaceC3322t9 interfaceC3322t9 = this.f28039b;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).c("WebResourceHandler", "Waiting for response to finish download: " + this.f28040c);
        }
        em.v0 v0Var = this.f28041d;
        this.f28038a = 1;
        Object objN0 = v0Var.N0(this);
        return objN0 == objF ? objF : objN0;
    }
}
