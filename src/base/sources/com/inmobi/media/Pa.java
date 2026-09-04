package com.inmobi.media;

import com.google.android.gms.measurement.AppMeasurement;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Pa extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f25471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Sa f25472b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pa(Sa sa2, kl.f fVar) {
        super(1, fVar);
        this.f25472b = sa2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new Pa(this.f25472b, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Pa(this.f25472b, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objF = ll.b.f();
        int i10 = this.f25471a;
        if (i10 == 0) {
            fl.s.b(obj);
            Sa sa2 = this.f25472b;
            sa2.getClass();
            sa2.f25682b = new C3216p6(AppMeasurement.CRASH_ORIGIN, (U9) W9.f25935a.getValue(), sa2, sa2.f25681a.getEventConfig(), null);
            Sa sa3 = this.f25472b;
            this.f25471a = 1;
            if (Sa.a(sa3, this) == objF) {
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
