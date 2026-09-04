package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.za, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3477za extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f28003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3375va f28004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i0 f28005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.i0 f28006d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3477za(ViewTreeObserverOnGlobalLayoutListenerC3375va viewTreeObserverOnGlobalLayoutListenerC3375va, kotlin.jvm.internal.i0 i0Var, kotlin.jvm.internal.i0 i0Var2, kl.f fVar) {
        super(2, fVar);
        this.f28004b = viewTreeObserverOnGlobalLayoutListenerC3375va;
        this.f28005c = i0Var;
        this.f28006d = i0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3477za(this.f28004b, this.f28005c, this.f28006d, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3477za) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f28003a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.y yVar = this.f28004b.f27705e;
            this.f28003a = 1;
            if (yVar.N0(this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        kotlin.jvm.internal.i0 i0Var = this.f28005c;
        ViewTreeObserverOnGlobalLayoutListenerC3375va viewTreeObserverOnGlobalLayoutListenerC3375va = this.f28004b;
        i0Var.f43593a = viewTreeObserverOnGlobalLayoutListenerC3375va.f27703c;
        this.f28006d.f43593a = viewTreeObserverOnGlobalLayoutListenerC3375va.f27704d;
        return fl.g0.f38750a;
    }
}
