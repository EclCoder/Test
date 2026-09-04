package k4;

import androidx.room.h;
import java.util.concurrent.atomic.AtomicBoolean;
import p4.f;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f42981a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f42982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile f f42983c;

    public d(h hVar) {
        this.f42982b = hVar;
    }

    private f c() {
        return this.f42982b.d(d());
    }

    private f e(boolean z10) {
        if (!z10) {
            return c();
        }
        if (this.f42983c == null) {
            this.f42983c = c();
        }
        return this.f42983c;
    }

    public f a() {
        b();
        return e(this.f42981a.compareAndSet(false, true));
    }

    protected void b() {
        this.f42982b.a();
    }

    protected abstract String d();

    public void f(f fVar) {
        if (fVar == this.f42983c) {
            this.f42981a.set(false);
        }
    }
}
