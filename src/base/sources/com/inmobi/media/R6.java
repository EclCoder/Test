package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class R6 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2990gd f25587a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R6(C2990gd c2990gd, kl.f fVar) {
        super(2, fVar);
        this.f25587a = c2990gd;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new R6(this.f25587a, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new R6(this.f25587a, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ll.b.f();
        fl.s.b(obj);
        C2990gd c2990gd = this.f25587a;
        Pc pc2 = c2990gd.f25675d;
        G g10 = c2990gd.f27890a.f27823b;
        pc2.onAdFetchSuccessful(new AdMetaInfo(g10.f24815e, g10.f24822l));
        return fl.g0.f38750a;
    }
}
