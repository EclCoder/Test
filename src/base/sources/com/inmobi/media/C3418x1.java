package com.inmobi.media;

import android.app.ApplicationExitInfo;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.x1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3418x1 extends kotlin.coroutines.jvm.internal.m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3443y1 f27826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3418x1(C3443y1 c3443y1, kl.f fVar) {
        super(1, fVar);
        this.f27826a = c3443y1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kl.f create(kl.f fVar) {
        return new C3418x1(this.f27826a, fVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3418x1(this.f27826a, (kl.f) obj).invokeSuspend(fl.g0.f38750a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C3468z1 c3468z1;
        xn.q0 q0VarI;
        ll.b.f();
        fl.s.b(obj);
        C3443y1 c3443y1 = this.f27826a;
        List<ApplicationExitInfo> historicalProcessExitReasons = c3443y1.f27902f.getHistoricalProcessExitReasons(c3443y1.f27898b.getPackageName(), 0, 10);
        kotlin.jvm.internal.s.g(historicalProcessExitReasons, "getHistoricalProcessExitReasons(...)");
        La la2 = this.f27826a.f27903g;
        la2.getClass();
        kotlin.jvm.internal.s.h("exitReasonTimestamp", "key");
        long j10 = la2.f25198a.getLong("exitReasonTimestamp", 0L);
        C3443y1 c3443y2 = this.f27826a;
        Iterator<T> it = historicalProcessExitReasons.iterator();
        long timestamp = j10;
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = j5.c.a(it.next());
            if (applicationExitInfoA.getTimestamp() > j10) {
                try {
                    int reason = applicationExitInfoA.getReason();
                    String description = applicationExitInfoA.getDescription();
                    InputStream traceInputStream = applicationExitInfoA.getTraceInputStream();
                    c3468z1 = new C3468z1(description, reason, J3.a((traceInputStream == null || (q0VarI = xn.c0.i(traceInputStream)) == null) ? null : xn.c0.c(q0VarI), c3443y2.f27900d));
                } catch (Exception e10) {
                    kotlin.jvm.internal.s.g(c3443y2.f27901e, "access$getTAG$p(...)");
                    e10.getMessage();
                    c3468z1 = new C3468z1(applicationExitInfoA.getDescription(), applicationExitInfoA.getReason(), fl.e.b(e10));
                }
                long j11 = c3443y2.f27899c;
                C3392w1 runnable = new C3392w1(c3443y2, c3468z1, null);
                em.o0 o0Var = AbstractC3488zl.f28033a;
                kotlin.jvm.internal.s.h(runnable, "runnable");
                em.k.d(AbstractC3488zl.f28033a, null, null, new C3412wl(j11, null, runnable), 3, null);
                if (applicationExitInfoA.getTimestamp() > timestamp) {
                    timestamp = applicationExitInfoA.getTimestamp();
                }
            }
        }
        this.f27826a.f27903g.a("exitReasonTimestamp", timestamp, false);
        return fl.g0.f38750a;
    }
}
