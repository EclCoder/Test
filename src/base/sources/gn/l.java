package gn;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ln.o f39715a;

    public l(ln.o delegate) {
        kotlin.jvm.internal.s.h(delegate, "delegate");
        this.f39715a = delegate;
    }

    public final ln.o a() {
        return this.f39715a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit, kn.d taskRunner, ln.g connectionListener) {
        this(new ln.o(taskRunner, i10, j10, timeUnit, connectionListener));
        kotlin.jvm.internal.s.h(timeUnit, "timeUnit");
        kotlin.jvm.internal.s.h(taskRunner, "taskRunner");
        kotlin.jvm.internal.s.h(connectionListener, "connectionListener");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(int i10, long j10, TimeUnit timeUnit) {
        this(i10, j10, timeUnit, kn.d.f43546m, ln.g.f44737a.a());
        kotlin.jvm.internal.s.h(timeUnit, "timeUnit");
    }

    public l() {
        this(5, 5L, TimeUnit.MINUTES);
    }
}
