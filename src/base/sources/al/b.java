package al;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends ok.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final C0006b f348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final f f349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int f350f = d(Runtime.getRuntime().availableProcessors(), Integer.getInteger("rx2.computation-threads", 0).intValue());

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final c f351g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadFactory f352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final AtomicReference f353c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends ok.h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uk.d f354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final rk.a f355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final uk.d f356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final c f357d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f358e;

        a(c cVar) {
            this.f357d = cVar;
            uk.d dVar = new uk.d();
            this.f354a = dVar;
            rk.a aVar = new rk.a();
            this.f355b = aVar;
            uk.d dVar2 = new uk.d();
            this.f356c = dVar2;
            dVar2.b(dVar);
            dVar2.b(aVar);
        }

        @Override // ok.h.b
        public rk.b b(Runnable runnable) {
            return this.f358e ? uk.c.INSTANCE : this.f357d.e(runnable, 0L, TimeUnit.MILLISECONDS, this.f354a);
        }

        @Override // ok.h.b
        public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
            return this.f358e ? uk.c.INSTANCE : this.f357d.e(runnable, j10, timeUnit, this.f355b);
        }

        @Override // rk.b
        public void d() {
            if (this.f358e) {
                return;
            }
            this.f358e = true;
            this.f356c.d();
        }
    }

    /* JADX INFO: renamed from: al.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class C0006b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c[] f360b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f361c;

        C0006b(int i10, ThreadFactory threadFactory) {
            this.f359a = i10;
            this.f360b = new c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                this.f360b[i11] = new c(threadFactory);
            }
        }

        public c a() {
            int i10 = this.f359a;
            if (i10 == 0) {
                return b.f351g;
            }
            c[] cVarArr = this.f360b;
            long j10 = this.f361c;
            this.f361c = 1 + j10;
            return cVarArr[(int) (j10 % ((long) i10))];
        }

        public void b() {
            for (c cVar : this.f360b) {
                cVar.d();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c extends e {
        c(ThreadFactory threadFactory) {
            super(threadFactory);
        }
    }

    static {
        c cVar = new c(new f("RxComputationShutdown"));
        f351g = cVar;
        cVar.d();
        f fVar = new f("RxComputationThreadPool", Math.max(1, Math.min(10, Integer.getInteger("rx2.computation-priority", 5).intValue())), true);
        f349e = fVar;
        C0006b c0006b = new C0006b(0, fVar);
        f348d = c0006b;
        c0006b.b();
    }

    public b() {
        this(f349e);
    }

    static int d(int i10, int i11) {
        return (i11 <= 0 || i11 > i10) ? i10 : i11;
    }

    @Override // ok.h
    public ok.h.b a() {
        return new a(((C0006b) this.f353c.get()).a());
    }

    @Override // ok.h
    public rk.b c(Runnable runnable, long j10, TimeUnit timeUnit) {
        return ((C0006b) this.f353c.get()).a().f(runnable, j10, timeUnit);
    }

    public void e() {
        C0006b c0006b = new C0006b(f350f, this.f352b);
        if (androidx.lifecycle.b.a(this.f353c, f348d, c0006b)) {
            return;
        }
        c0006b.b();
    }

    public b(ThreadFactory threadFactory) {
        this.f352b = threadFactory;
        this.f353c = new AtomicReference(f348d);
        e();
    }
}
