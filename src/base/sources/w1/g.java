package w1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f55793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f55794b;

    public g() {
        this(d.f55786a);
    }

    public synchronized void a() {
        while (!this.f55794b) {
            wait();
        }
    }

    public synchronized void b() {
        boolean z10 = false;
        while (!this.f55794b) {
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
        z10 = this.f55794b;
        this.f55794b = false;
        return z10;
    }

    public synchronized boolean d() {
        return this.f55794b;
    }

    public synchronized boolean e() {
        if (this.f55794b) {
            return false;
        }
        this.f55794b = true;
        notifyAll();
        return true;
    }

    public g(d dVar) {
        this.f55793a = dVar;
    }
}
