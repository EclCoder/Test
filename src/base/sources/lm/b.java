package lm;

import em.k0;
import em.p1;
import java.util.concurrent.Executor;
import jm.e0;
import jm.g0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends p1 implements Executor {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f44680d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final k0 f44681e = k0.W0(k.f44698c, g0.e("kotlinx.coroutines.io.parallelism", yl.g.d(64, e0.a()), 0, 0, 12, null), null, 2, null);

    private b() {
    }

    @Override // em.k0
    public void T0(kl.j jVar, Runnable runnable) {
        f44681e.T0(jVar, runnable);
    }

    @Override // em.k0
    public k0 V0(int i10, String str) {
        return k.f44698c.V0(i10, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        T0(kl.k.f43531a, runnable);
    }

    @Override // em.k0
    public String toString() {
        return "Dispatchers.IO";
    }
}
