package pl.droidsonroids.gif;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f50184a;

    a() {
    }

    synchronized void a() {
        while (!this.f50184a) {
            wait();
        }
    }

    synchronized void b() {
        this.f50184a = false;
    }

    synchronized void c() {
        boolean z10 = this.f50184a;
        this.f50184a = true;
        if (!z10) {
            notify();
        }
    }

    synchronized void d(boolean z10) {
        try {
            if (z10) {
                c();
            } else {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
