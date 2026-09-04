package ob;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f48374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f48375b;

    public g() {
        this(d.f48357a);
    }

    public synchronized void a() {
        while (!this.f48375b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f48375b) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z10 = true;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean c() {
        boolean z10;
        z10 = this.f48375b;
        this.f48375b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f48375b;
    }

    public synchronized boolean e() {
        if (this.f48375b) {
            return false;
        }
        this.f48375b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f48374a = dVar;
    }
}
