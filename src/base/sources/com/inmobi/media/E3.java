package com.inmobi.media;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class E3 extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f24691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ em.v0 f24692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function1 f24693c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E3(em.v0 v0Var, Function1 function1, kl.f fVar) {
        super(2, fVar);
        this.f24692b = v0Var;
        this.f24693c = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new E3(this.f24692b, this.f24693c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new E3(this.f24692b, this.f24693c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f24691a;
        if (i10 == 0) {
            fl.s.b(obj);
            em.v0 v0Var = this.f24692b;
            this.f24691a = 1;
            obj = v0Var.N0(this);
            if (obj == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fl.s.b(obj);
        }
        if (obj != null) {
            this.f24693c.invoke(obj);
        }
        return fl.g0.f38750a;
    }
}
