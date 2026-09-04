package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.i1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3030i1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3107l1 f26711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G2 f26713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f26714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f26715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3030i1(AbstractC3107l1 abstractC3107l1, String str, G2 g10, String str2, String str3, kl.f fVar) {
        super(2, fVar);
        this.f26711a = abstractC3107l1;
        this.f26712b = str;
        this.f26713c = g10;
        this.f26714d = str2;
        this.f26715e = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3030i1(this.f26711a, this.f26712b, this.f26713c, this.f26714d, this.f26715e, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3030i1) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        try {
            com.inmobi.media.ads.network.common.model.Ad adB = this.f26711a.b(0);
            if (adB == null || !kotlin.jvm.internal.s.c(adB.getImpressionId(), this.f26712b)) {
                C3348u9 c3348u9 = this.f26711a.f26897i;
                if (c3348u9 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u9.c("l1", "Returning blob as empty string");
                }
                ((GestureDetectorOnGestureListenerC3228pi) this.f26713c).c(this.f26714d, this.f26715e, "");
            } else {
                String webVast = adB.getWebVast();
                ((GestureDetectorOnGestureListenerC3228pi) this.f26713c).c(this.f26714d, this.f26715e, webVast);
                C3348u9 c3348u10 = this.f26711a.f26897i;
                if (c3348u10 != null) {
                    kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                    c3348u10.c("l1", "Returning blob " + webVast);
                }
            }
        } catch (Exception e10) {
            C3348u9 c3348u11 = this.f26711a.f26897i;
            if (c3348u11 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u11.a("l1", "Exception while getBlob", e10);
            }
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
        return fl.g0.f38750a;
    }
}
