package com.inmobi.media;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class Q extends kotlin.jvm.internal.p implements tl.a {
    public Q(Object obj) {
        super(0, obj, U.class, "calculateMetrics", "calculateMetrics()V", 0);
    }

    @Override // tl.a
    public final Object invoke() {
        U u10 = (U) this.receiver;
        u10.getClass();
        u10.f25791n = Xi.f26024d.get();
        ExecutorC2937ec executorC2937ec = (ExecutorC2937ec) AbstractC3293s6.f27440e.getValue();
        O runnable = u10.f25790m;
        executorC2937ec.getClass();
        kotlin.jvm.internal.s.h(runnable, "runnable");
        executorC2937ec.f26488a.postAtFrontOfQueue(runnable);
        return fl.g0.f38750a;
    }
}
