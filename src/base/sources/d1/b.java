package d1;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f36091a;

    public b(boolean z10) {
        this.f36091a = new AtomicBoolean(z10);
    }

    public final boolean a() {
        return this.f36091a.get();
    }

    public final void b(boolean z10) {
        this.f36091a.set(z10);
    }
}
