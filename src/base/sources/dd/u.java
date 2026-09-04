package dd;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class u implements ce.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f36681b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f36680a = Collections.newSetFromMap(new ConcurrentHashMap());

    u(Collection collection) {
        this.f36680a.addAll(collection);
    }

    static u b(Collection collection) {
        return new u((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f36680a.iterator();
            while (it.hasNext()) {
                this.f36681b.add(((ce.b) it.next()).get());
            }
            this.f36680a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    synchronized void a(ce.b bVar) {
        try {
            if (this.f36681b == null) {
                this.f36680a.add(bVar);
            } else {
                this.f36681b.add(bVar.get());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // ce.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f36681b == null) {
            synchronized (this) {
                try {
                    if (this.f36681b == null) {
                        this.f36681b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f36681b);
    }
}
