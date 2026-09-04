package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.s3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3290s3 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3348u9 f27429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2822a0 f27430d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3290s3(String str, C3348u9 c3348u9, C2822a0 c2822a0, kl.f fVar) {
        super(1, fVar);
        this.f27428b = str;
        this.f27429c = c3348u9;
        this.f27430d = c2822a0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3290s3(this.f27428b, this.f27429c, this.f27430d, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3290s3) create((kl.f) obj)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27427a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                A3 a10 = A3.f24440a;
                if (A3.e()) {
                    int maxRetries = A3.c().getMaxRetries();
                    String str = this.f27428b;
                    V2 v10 = new V2(str, true, false, maxRetries + 1, 197);
                    C3348u9 c3348u9 = this.f27429c;
                    if (c3348u9 != null) {
                        kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                        c3348u9.a("A3", "Received click (" + str + ") for pinging over HTTP");
                    }
                    C2822a0 c2822a0 = this.f27430d;
                    C3348u9 c3348u10 = this.f27429c;
                    this.f27427a = 1;
                    if (a10.a(v10, c2822a0, c3348u10, this) == objF) {
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
            C3348u9 c3348u11 = this.f27429c;
            if (c3348u11 != null) {
                A3 a11 = A3.f24440a;
                kotlin.jvm.internal.s.g("A3", "access$getTAG$p(...)");
                c3348u11.b("A3", "SDK encountered unexpected error in pinging click; " + e10.getMessage());
            }
        }
        return fl.g0.f38750a;
    }
}
