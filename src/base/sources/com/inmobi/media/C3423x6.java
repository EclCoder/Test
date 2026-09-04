package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3423x6 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3448y6 f27831b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3423x6(C3448y6 c3448y6, kl.f fVar) {
        super(1, fVar);
        this.f27831b = c3448y6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3423x6(this.f27831b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3423x6(this.f27831b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27830a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                C3448y6 c3448y6 = this.f27831b;
                this.f27830a = 1;
                if (C3448y6.a(c3448y6, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (Exception e10) {
            e10.toString();
        }
        return fl.g0.f38750a;
    }
}
