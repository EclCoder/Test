package r1;

import androidx.activity.a0;
import fl.g0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f51000a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f51001b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f51002c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f51003d;

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                a0.a(autoCloseable);
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final void d(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        s.h(key, "key");
        s.h(closeable, "closeable");
        if (this.f51003d) {
            f(closeable);
            return;
        }
        synchronized (this.f51000a) {
            autoCloseable = (AutoCloseable) this.f51001b.put(key, closeable);
        }
        f(autoCloseable);
    }

    public final void e() {
        if (this.f51003d) {
            return;
        }
        this.f51003d = true;
        synchronized (this.f51000a) {
            try {
                Iterator it = this.f51001b.values().iterator();
                while (it.hasNext()) {
                    f((AutoCloseable) it.next());
                }
                Iterator it2 = this.f51002c.iterator();
                while (it2.hasNext()) {
                    f((AutoCloseable) it2.next());
                }
                this.f51002c.clear();
                g0 g0Var = g0.f38750a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final AutoCloseable g(String key) {
        AutoCloseable autoCloseable;
        s.h(key, "key");
        synchronized (this.f51000a) {
            autoCloseable = (AutoCloseable) this.f51001b.get(key);
        }
        return autoCloseable;
    }
}
