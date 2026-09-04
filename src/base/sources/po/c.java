package po;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f50271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile int f50272b;

    public c(int i10) {
        this.f50271a = new ConcurrentHashMap();
        a(i10);
    }

    public void a(int i10) {
        ip.a.i(i10, "Default max per route");
        this.f50272b = i10;
    }

    public String toString() {
        return this.f50271a.toString();
    }

    public c() {
        this(2);
    }
}
