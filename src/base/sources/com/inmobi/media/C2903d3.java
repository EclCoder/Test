package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: renamed from: com.inmobi.media.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2903d3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z2 f26387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f26388c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2903d3(Z2 z10, AdConfig.ImaiConfig imaiConfig, kl.f fVar) {
        super(2, fVar);
        this.f26387b = z10;
        this.f26388c = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C2903d3(this.f26387b, this.f26388c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new C2903d3(this.f26387b, this.f26388c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f26386a;
        if (i10 == 0) {
            fl.s.b(obj);
            Z2 z10 = this.f26387b;
            int maxEventBatch = this.f26388c.getMaxEventBatch();
            int pingInterval = this.f26388c.getPingInterval();
            this.f26386a = 1;
            obj = z10.a(maxEventBatch, pingInterval, this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        kotlin.jvm.internal.s.f(obj, "null cannot be cast to non-null type kotlin.collections.MutableList<com.inmobi.ads.core.Click>");
        return kotlin.jvm.internal.p0.c(obj);
    }
}
