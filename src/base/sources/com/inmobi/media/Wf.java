package com.inmobi.media;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Wf extends kotlin.coroutines.jvm.internal.m implements tl.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Xf f25947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Activity f25948c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wf(Xf xf2, Activity activity, kl.f fVar) {
        super(2, fVar);
        this.f25947b = xf2;
        this.f25948c = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(Object obj, kl.f fVar) {
        return new Wf(this.f25947b, this.f25948c, fVar);
    }

    @Override // tl.o
    public final Object invoke(Object obj, Object obj2) {
        return new Wf(this.f25947b, this.f25948c, (kl.f) obj2).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25946a;
        if (i10 == 0) {
            fl.s.b(obj);
            Xf xf2 = this.f25947b;
            Activity activity = this.f25948c;
            this.f25946a = 1;
            if (xf2.a(activity, this) == objF) {
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
