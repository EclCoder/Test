package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3150mi extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public nm.a f27002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public GestureDetectorOnGestureListenerC3228pi f27003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f27004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f27005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f27006e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3150mi(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, kl.f fVar) {
        super(2, fVar);
        this.f27006e = gestureDetectorOnGestureListenerC3228pi;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C3150mi c3150mi = new C3150mi(this.f27006e, fVar);
        c3150mi.f27005d = obj;
        return c3150mi;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        C3150mi c3150mi = new C3150mi(this.f27006e, (kl.f) obj2);
        c3150mi.f27005d = (em.o0) obj;
        return c3150mi.invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        em.o0 o0Var;
        GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi;
        nm.a aVar;
        Object objF = ll.b.f();
        int i10 = this.f27004c;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var2 = (em.o0) this.f27005d;
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi2 = this.f27006e;
            nm.a aVar2 = gestureDetectorOnGestureListenerC3228pi2.f27265y;
            this.f27005d = o0Var2;
            this.f27002a = aVar2;
            this.f27003b = gestureDetectorOnGestureListenerC3228pi2;
            this.f27004c = 1;
            if (aVar2.e(null, this) == objF) {
                return objF;
            }
            o0Var = o0Var2;
            gestureDetectorOnGestureListenerC3228pi = gestureDetectorOnGestureListenerC3228pi2;
            aVar = aVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gestureDetectorOnGestureListenerC3228pi = this.f27003b;
            aVar = this.f27002a;
            o0Var = (em.o0) this.f27005d;
            fl.s.b(obj);
        }
        try {
            if (kotlin.jvm.internal.s.c("Loading", gestureDetectorOnGestureListenerC3228pi.A)) {
                InterfaceC3322t9 interfaceC3322t9 = gestureDetectorOnGestureListenerC3228pi.f27233i;
                if (interfaceC3322t9 != null) {
                    String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                    kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
                    ((C3348u9) interfaceC3322t9).a(str, "updateWebViewLoaded " + o0Var);
                }
                gestureDetectorOnGestureListenerC3228pi.getListener().g(gestureDetectorOnGestureListenerC3228pi);
                gestureDetectorOnGestureListenerC3228pi.setAndUpdateViewState("Default");
                InterfaceC3322t9 interfaceC3322t10 = gestureDetectorOnGestureListenerC3228pi.f27233i;
                if (interfaceC3322t10 != null) {
                    String str2 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                    kotlin.jvm.internal.s.g(str2, "access$getTAG$cp(...)");
                    ((C3348u9) interfaceC3322t10).a(str2, "updateWebViewLoaded state changed to " + gestureDetectorOnGestureListenerC3228pi.getViewState());
                }
            }
            return fl.g0.f38750a;
        } finally {
            aVar.f(null);
        }
    }
}
