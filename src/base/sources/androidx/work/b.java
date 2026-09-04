package androidx.work;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Executor f7788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Executor f7789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final x f7790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final k f7791d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final s f7792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f7793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f7794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f7795h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final int f7796i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f7797j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f7798k;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f7799a = new AtomicInteger(0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f7800b;

        a(boolean z10) {
            this.f7800b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, (this.f7800b ? "WM.task-" : "androidx.work-") + this.f7799a.incrementAndGet());
        }
    }

    /* JADX INFO: renamed from: androidx.work.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class C0101b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Executor f7802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        x f7803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        k f7804c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Executor f7805d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        s f7806e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        String f7807f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7808g = 4;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f7809h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f7810i = Integer.MAX_VALUE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f7811j = 20;

        public b a() {
            return new b(this);
        }
    }

    b(C0101b c0101b) {
        Executor executor = c0101b.f7802a;
        if (executor == null) {
            this.f7788a = a(false);
        } else {
            this.f7788a = executor;
        }
        Executor executor2 = c0101b.f7805d;
        if (executor2 == null) {
            this.f7798k = true;
            this.f7789b = a(true);
        } else {
            this.f7798k = false;
            this.f7789b = executor2;
        }
        x xVar = c0101b.f7803b;
        if (xVar == null) {
            this.f7790c = x.c();
        } else {
            this.f7790c = xVar;
        }
        k kVar = c0101b.f7804c;
        if (kVar == null) {
            this.f7791d = k.c();
        } else {
            this.f7791d = kVar;
        }
        s sVar = c0101b.f7806e;
        if (sVar == null) {
            this.f7792e = new b5.a();
        } else {
            this.f7792e = sVar;
        }
        this.f7794g = c0101b.f7808g;
        this.f7795h = c0101b.f7809h;
        this.f7796i = c0101b.f7810i;
        this.f7797j = c0101b.f7811j;
        this.f7793f = c0101b.f7807f;
    }

    private Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    private ThreadFactory b(boolean z10) {
        return new a(z10);
    }

    public String c() {
        return this.f7793f;
    }

    public i d() {
        return null;
    }

    public Executor e() {
        return this.f7788a;
    }

    public k f() {
        return this.f7791d;
    }

    public int g() {
        return this.f7796i;
    }

    public int h() {
        return this.f7797j;
    }

    public int i() {
        return this.f7795h;
    }

    public int j() {
        return this.f7794g;
    }

    public s k() {
        return this.f7792e;
    }

    public Executor l() {
        return this.f7789b;
    }

    public x m() {
        return this.f7790c;
    }
}
