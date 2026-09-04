package al;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f387c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends Thread {
        a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public f(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str = this.f385a + '-' + incrementAndGet();
        Thread aVar = this.f387c ? new a(runnable, str) : new Thread(runnable, str);
        aVar.setPriority(this.f386b);
        aVar.setDaemon(true);
        return aVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public String toString() {
        return "RxThreadFactory[" + this.f385a + "]";
    }

    public f(String str, int i10) {
        this(str, i10, false);
    }

    public f(String str, int i10, boolean z10) {
        this.f385a = str;
        this.f386b = i10;
        this.f387c = z10;
    }
}
