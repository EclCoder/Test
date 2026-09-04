package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.o7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3191o7 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3243q7 f27126b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3191o7(C3243q7 c3243q7, kl.f fVar) {
        super(1, fVar);
        this.f27126b = c3243q7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3191o7(this.f27126b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3191o7(this.f27126b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f27125a;
        if (i10 == 0) {
            fl.s.b(obj);
            C3243q7 c3243q7 = this.f27126b;
            this.f27125a = 1;
            if (c3243q7.b(this) == objF) {
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
