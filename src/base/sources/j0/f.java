package j0;

import android.os.CancellationSignal;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private a f41882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f41883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f41884d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface a {
        void onCancel();
    }

    private void c() {
        while (this.f41884d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f41881a) {
                    return;
                }
                this.f41881a = true;
                this.f41884d = true;
                a aVar = this.f41882b;
                Object obj = this.f41883c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th2) {
                        synchronized (this) {
                            this.f41884d = false;
                            notifyAll();
                            throw th2;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f41884d = false;
                    notifyAll();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f41882b == aVar) {
                    return;
                }
                this.f41882b = aVar;
                if (this.f41881a && aVar != null) {
                    aVar.onCancel();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
