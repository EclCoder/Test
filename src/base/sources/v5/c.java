package v5;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import m6.k;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f55160a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f55161b = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Lock f55162a = new ReentrantLock();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f55163b;

        a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f55164a = new ArrayDeque();

        b() {
        }

        a a() {
            a aVar;
            synchronized (this.f55164a) {
                aVar = (a) this.f55164a.poll();
            }
            return aVar == null ? new a() : aVar;
        }

        void b(a aVar) {
            synchronized (this.f55164a) {
                try {
                    if (this.f55164a.size() < 10) {
                        this.f55164a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    void a(String str) {
        a aVarA;
        synchronized (this) {
            try {
                aVarA = (a) this.f55160a.get(str);
                if (aVarA == null) {
                    aVarA = this.f55161b.a();
                    this.f55160a.put(str, aVarA);
                }
                aVarA.f55163b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVarA.f55162a.lock();
    }

    void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.e((a) this.f55160a.get(str));
                int i10 = aVar.f55163b;
                if (i10 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f55163b);
                }
                int i11 = i10 - 1;
                aVar.f55163b = i11;
                if (i11 == 0) {
                    a aVar2 = (a) this.f55160a.remove(str);
                    if (!aVar2.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                    }
                    this.f55161b.b(aVar2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f55162a.unlock();
    }
}
