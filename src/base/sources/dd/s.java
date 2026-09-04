package dd;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
class s implements ae.d, ae.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f36674a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Queue f36675b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f36676c;

    s(Executor executor) {
        this.f36676c = executor;
    }

    private synchronized Set d(ae.a aVar) {
        throw null;
    }

    @Override // ae.d
    public synchronized void a(Class cls, Executor executor, ae.b bVar) {
        try {
            z.b(cls);
            z.b(bVar);
            z.b(executor);
            if (!this.f36674a.containsKey(cls)) {
                this.f36674a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f36674a.get(cls)).put(bVar, executor);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    void c() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f36675b;
                if (queue != null) {
                    this.f36675b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                e(null);
            }
        }
    }

    public void e(final ae.a aVar) {
        z.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f36675b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : d(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable(entry, aVar) { // from class: dd.r

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ Map.Entry f36673a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ae.b) this.f36673a.getKey()).a(null);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
