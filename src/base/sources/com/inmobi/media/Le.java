package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Le extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f25209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ hm.i0 f25210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f25211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Le(hm.i0 i0Var, kl.f fVar, Function1 function1) {
        super(2, fVar);
        this.f25210c = i0Var;
        this.f25211d = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        Le le2 = new Le(this.f25210c, fVar, this.f25211d);
        le2.f25209b = obj;
        return le2;
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return ((Le) create((em.o0) obj, (kl.f) obj2)).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25208a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.o0 o0Var = (em.o0) this.f25209b;
            hm.i0 i0Var = this.f25210c;
            Ke ke2 = new Ke(o0Var, this.f25211d);
            this.f25208a = 1;
            if (i0Var.collect(ke2, this) == objF) {
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
