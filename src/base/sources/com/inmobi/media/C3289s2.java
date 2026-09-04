package com.inmobi.media;

import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: com.inmobi.media.s2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3289s2 extends kotlin.coroutines.jvm.internal.m implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC3315t2 f27426b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3289s2(AbstractC3315t2 abstractC3315t2, kl.f fVar) {
        super(3, fVar);
        this.f27426b = abstractC3315t2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C3289s2(this.f27426b, (kl.f) obj3).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27425a;
        if (i10 == 0) {
            fl.s.b(obj);
            AbstractC3315t2 abstractC3315t2 = this.f27426b;
            this.f27425a = 1;
            if (AbstractC3315t2.a(abstractC3315t2, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        return fl.g0.f38750a;
    }
}
