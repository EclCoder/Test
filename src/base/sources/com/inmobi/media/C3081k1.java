package com.inmobi.media;

import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;

/* JADX INFO: renamed from: com.inmobi.media.k1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class C3081k1 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3107l1 f26831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f26832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f26833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3081k1(AbstractC3107l1 abstractC3107l1, String str, String str2, kl.f fVar) {
        super(2, fVar);
        this.f26831a = abstractC3107l1;
        this.f26832b = str;
        this.f26833c = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new C3081k1(this.f26831a, this.f26832b, this.f26833c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((C3081k1) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        com.inmobi.media.ads.network.common.model.Ad adB = this.f26831a.b(0);
        if (adB != null && kotlin.jvm.internal.s.c(adB.getImpressionId(), this.f26832b)) {
            this.f26831a.a(adB, this.f26833c);
            C3348u9 c3348u9 = this.f26831a.f26897i;
            if (c3348u9 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u9.c("l1", "Updated blob " + this.f26833c);
            }
        } else {
            C3348u9 c3348u10 = this.f26831a.f26897i;
            if (c3348u10 != null) {
                kotlin.jvm.internal.s.g("l1", "<get-TAG>(...)");
                c3348u10.b("l1", NhHRaDJCHtCTJR.XvCJHAjyLc);
            }
        }
        return fl.g0.f38750a;
    }
}
