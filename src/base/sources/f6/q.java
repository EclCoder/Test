package f6;

import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f38272a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f38273b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f38274c;

    public boolean a(i6.c cVar) {
        boolean z10 = true;
        if (cVar == null) {
            return true;
        }
        boolean zRemove = this.f38272a.remove(cVar);
        if (!this.f38273b.remove(cVar) && !zRemove) {
            z10 = false;
        }
        if (z10) {
            cVar.clear();
        }
        return z10;
    }

    public void b() {
        Iterator it = m6.l.j(this.f38272a).iterator();
        while (it.hasNext()) {
            a((i6.c) it.next());
        }
        this.f38273b.clear();
    }

    public void c() {
        this.f38274c = true;
        for (i6.c cVar : m6.l.j(this.f38272a)) {
            if (cVar.isRunning() || cVar.d()) {
                cVar.clear();
                this.f38273b.add(cVar);
            }
        }
    }

    public void d() {
        this.f38274c = true;
        for (i6.c cVar : m6.l.j(this.f38272a)) {
            if (cVar.isRunning()) {
                cVar.pause();
                this.f38273b.add(cVar);
            }
        }
    }

    public void e() {
        for (i6.c cVar : m6.l.j(this.f38272a)) {
            if (!cVar.d() && !cVar.f()) {
                cVar.clear();
                if (this.f38274c) {
                    this.f38273b.add(cVar);
                } else {
                    cVar.j();
                }
            }
        }
    }

    public void f() {
        this.f38274c = false;
        for (i6.c cVar : m6.l.j(this.f38272a)) {
            if (!cVar.d() && !cVar.isRunning()) {
                cVar.j();
            }
        }
        this.f38273b.clear();
    }

    public void g(i6.c cVar) {
        this.f38272a.add(cVar);
        if (!this.f38274c) {
            cVar.j();
            return;
        }
        cVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f38273b.add(cVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f38272a.size() + ", isPaused=" + this.f38274c + "}";
    }
}
