package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3239q3 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27309d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3239q3(String str, boolean z10, InterfaceC3322t9 interfaceC3322t9, kl.f fVar) {
        super(1, fVar);
        this.f27307b = str;
        this.f27308c = z10;
        this.f27309d = interfaceC3322t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3239q3(this.f27307b, this.f27308c, this.f27309d, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3239q3) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27306a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                A3 a10 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                A3 a11 = A3.f24440a;
                if (A3.e()) {
                    int maxRetries = A3.c().getMaxRetries();
                    String str = this.f27307b;
                    V2 v10 = new V2(str, this.f27308c, false, maxRetries + 1, 197);
                    InterfaceC3322t9 interfaceC3322t9 = this.f27309d;
                    if (interfaceC3322t9 != null) {
                        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        ((C3348u9) interfaceC3322t9).a("A3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    InterfaceC3322t9 interfaceC3322t10 = this.f27309d;
                    this.f27306a = 1;
                    if (a11.a(v10, null, interfaceC3322t10, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (Exception e10) {
            InterfaceC3322t9 interfaceC3322t11 = this.f27309d;
            if (interfaceC3322t11 != null) {
                A3 a12 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b("A3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
        }
        return fl.g0.f38750a;
    }
}
