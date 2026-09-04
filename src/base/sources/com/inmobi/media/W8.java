package com.inmobi.media;

import com.inmobi.ads.rendering.InMobiAdActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class W8 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f25933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InMobiAdActivity f25934c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W8(long j10, InMobiAdActivity inMobiAdActivity, kl.f fVar) {
        super(2, fVar);
        this.f25933b = j10;
        this.f25934c = inMobiAdActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new W8(this.f25933b, this.f25934c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new W8(this.f25933b, this.f25934c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25932a;
        if (i10 == 0) {
            fl.s.b(obj);
            long j10 = this.f25933b;
            this.f25932a = 1;
            if (em.y0.a(j10, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        InterfaceC3322t9 interfaceC3322t9 = this.f25934c.f24413h;
        if (interfaceC3322t9 != null) {
            ((C3348u9) interfaceC3322t9).b("EmbeddedBrowser", "Landing page loading timed out after " + this.f25933b + " ms");
        }
        this.f25934c.a("LOADER_TIMEOUT");
        return fl.g0.f38750a;
    }
}
