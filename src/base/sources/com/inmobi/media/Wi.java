package com.inmobi.media;

import android.content.Context;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wi extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.m f25956b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Wi(Function1 function1, kl.f fVar) {
        super(2, fVar);
        this.f25956b = (kotlin.coroutines.jvm.internal.m) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.m, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Wi(this.f25956b, fVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.m, kotlin.jvm.functions.Function1] */
    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Wi(this.f25956b, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.m, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25955a;
        try {
            if (i10 == 0) {
                fl.s.b(obj);
                ?? r10 = this.f25956b;
                this.f25955a = 1;
                if (r10.invoke(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fl.s.b(obj);
            }
        } catch (Exception e10) {
            Context context = Xi.f26021a;
            e10.getMessage();
            fl.k kVar = W9.f25935a;
            AbstractC3219p9.a(e10);
        }
        return fl.g0.f38750a;
    }
}
