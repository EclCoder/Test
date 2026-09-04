package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Oa extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sa f25408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M2 f25409c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oa(Sa sa2, M2 m10, kl.f fVar) {
        super(1, fVar);
        this.f25408b = sa2;
        this.f25409c = m10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Oa(this.f25408b, this.f25409c, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Oa(this.f25408b, this.f25409c, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25407a;
        if (i10 == 0) {
            fl.s.b(obj);
            Sa sa2 = this.f25408b;
            M2 m10 = this.f25409c;
            this.f25407a = 1;
            if (Sa.a(sa2, m10, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        this.f25408b.a();
        return fl.g0.f38750a;
    }
}
