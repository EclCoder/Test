package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.t3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3316t3 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f27510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3322t9 f27511d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3316t3(String str, boolean z10, InterfaceC3322t9 interfaceC3322t9, kl.f fVar) {
        super(1, fVar);
        this.f27509b = str;
        this.f27510c = z10;
        this.f27511d = interfaceC3322t9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3316t3(this.f27509b, this.f27510c, this.f27511d, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3316t3) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27508a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                A3 a10 = A3.f24440a;
                if (A3.e()) {
                    int maxRetries = A3.c().getMaxRetries();
                    String str = this.f27509b;
                    V2 v10 = new V2(str, this.f27510c, true, maxRetries + 1, 197);
                    InterfaceC3322t9 interfaceC3322t9 = this.f27511d;
                    if (interfaceC3322t9 != null) {
                        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        ((C3348u9) interfaceC3322t9).c("A3", "Received click (" + str + ") for pinging in WebView");
                    }
                    InterfaceC3322t9 interfaceC3322t10 = this.f27511d;
                    this.f27508a = 1;
                    if (a10.a(v10, null, interfaceC3322t10, this) == objF) {
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
            InterfaceC3322t9 interfaceC3322t11 = this.f27511d;
            if (interfaceC3322t11 != null) {
                A3 a11 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                ((C3348u9) interfaceC3322t11).b("A3", "SDK encountered unexpected error in pinging click over WebView; " + e10.getMessage());
            }
        }
        return fl.g0.f38750a;
    }
}
