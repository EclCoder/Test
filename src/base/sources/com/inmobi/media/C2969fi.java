package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.fi, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2969fi extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GestureDetectorOnGestureListenerC3228pi f26563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26564c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f26565d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f26566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2969fi(GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi, String str, long j10, int i10, kl.f fVar) {
        super(2, fVar);
        this.f26563b = gestureDetectorOnGestureListenerC3228pi;
        this.f26564c = str;
        this.f26565d = j10;
        this.f26566e = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        C2969fi c2969fi = new C2969fi(this.f26563b, this.f26564c, this.f26565d, this.f26566e, fVar);
        c2969fi.f26562a = obj;
        return c2969fi;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C2969fi) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        em.o0 o0Var = (em.o0) this.f26562a;
        if (this.f26563b.N.get() || !em.p0.f(o0Var)) {
            InterfaceC3322t9 interfaceC3322t9 = this.f26563b.f27233i;
            if (interfaceC3322t9 != null) {
                String str = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                kotlin.jvm.internal.s.g(str, "access$getTAG$cp(...)");
                ((C3348u9) interfaceC3322t9).a(str, "Skipping loadHtmlUrl, RenderView destroyed");
            }
            return fl.g0.f38750a;
        }
        String str2 = this.f26564c;
        if (str2 == null || str2.length() == 0) {
            InterfaceC3322t9 interfaceC3322t10 = this.f26563b.f27233i;
            if (interfaceC3322t10 != null) {
                String str3 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                kotlin.jvm.internal.s.g(str3, "access$getTAG$cp(...)");
                ((C3348u9) interfaceC3322t10).a(str3, "Prefetch empty/failed, signaling ad load failure");
            }
            C3485zi renderViewTelemetry = this.f26563b.getRenderViewTelemetry();
            if (renderViewTelemetry != null) {
                renderViewTelemetry.a(this.f26565d, kotlin.coroutines.jvm.internal.b.f((short) this.f26566e));
            }
            GestureDetectorOnGestureListenerC3228pi gestureDetectorOnGestureListenerC3228pi = this.f26563b;
            int i10 = this.f26566e;
            gestureDetectorOnGestureListenerC3228pi.getClass();
            gestureDetectorOnGestureListenerC3228pi.d(GestureDetectorOnGestureListenerC3228pi.d(i10));
        } else {
            InterfaceC3322t9 interfaceC3322t11 = this.f26563b.f27233i;
            if (interfaceC3322t11 != null) {
                String str4 = GestureDetectorOnGestureListenerC3228pi.f27210i1;
                kotlin.jvm.internal.s.g(str4, "access$getTAG$cp(...)");
                ((C3348u9) interfaceC3322t11).a(str4, "Prefetch succeeded, loading HTML content in WebView");
            }
            C3485zi renderViewTelemetry2 = this.f26563b.getRenderViewTelemetry();
            if (renderViewTelemetry2 != null) {
                renderViewTelemetry2.a(this.f26565d, (Short) null);
            }
            this.f26563b.i(this.f26564c);
        }
        return fl.g0.f38750a;
    }
}
