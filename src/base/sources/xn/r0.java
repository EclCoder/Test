package xn;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f56979d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f56980e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f56981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f56982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f56983c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public r0 a() {
        this.f56981a = false;
        return this;
    }

    public r0 b() {
        this.f56983c = 0L;
        return this;
    }

    public long c() {
        if (this.f56981a) {
            return this.f56982b;
        }
        throw new IllegalStateException("No deadline");
    }

    public r0 d(long j10) {
        this.f56981a = true;
        this.f56982b = j10;
        return this;
    }

    public boolean e() {
        return this.f56981a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f56981a && this.f56982b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public r0 g(long j10, TimeUnit unit) {
        kotlin.jvm.internal.s.h(unit, "unit");
        if (j10 >= 0) {
            this.f56983c = unit.toNanos(j10);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j10).toString());
    }

    public long h() {
        return this.f56983c;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a extends r0 {
        a() {
        }

        @Override // xn.r0
        public r0 g(long j10, TimeUnit unit) {
            kotlin.jvm.internal.s.h(unit, "unit");
            return this;
        }

        @Override // xn.r0
        public void f() {
        }

        @Override // xn.r0
        public r0 d(long j10) {
            return this;
        }
    }
}
