package androidx.recyclerview.widget;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f6850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f6851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.f f6852c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Object f6853d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Executor f6854e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Executor f6855a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Executor f6856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final j.f f6857c;

        public a(j.f fVar) {
            this.f6857c = fVar;
        }

        public c a() {
            if (this.f6856b == null) {
                synchronized (f6853d) {
                    try {
                        if (f6854e == null) {
                            f6854e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f6856b = f6854e;
            }
            return new c(this.f6855a, this.f6856b, this.f6857c);
        }
    }

    c(Executor executor, Executor executor2, j.f fVar) {
        this.f6850a = executor;
        this.f6851b = executor2;
        this.f6852c = fVar;
    }

    public Executor a() {
        return this.f6851b;
    }

    public j.f b() {
        return this.f6852c;
    }

    public Executor c() {
        return this.f6850a;
    }
}
