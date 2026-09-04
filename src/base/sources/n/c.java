package n;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile c f46553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Executor f46554d = new Executor() { // from class: n.a
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().c(runnable);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Executor f46555e = new Executor() { // from class: n.b
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            c.g().a(runnable);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f46556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f46557b;

    private c() {
        d dVar = new d();
        this.f46557b = dVar;
        this.f46556a = dVar;
    }

    public static Executor f() {
        return f46555e;
    }

    public static c g() {
        if (f46553c != null) {
            return f46553c;
        }
        synchronized (c.class) {
            try {
                if (f46553c == null) {
                    f46553c = new c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f46553c;
    }

    @Override // n.e
    public void a(Runnable runnable) {
        this.f46556a.a(runnable);
    }

    @Override // n.e
    public boolean b() {
        return this.f46556a.b();
    }

    @Override // n.e
    public void c(Runnable runnable) {
        this.f46556a.c(runnable);
    }
}
