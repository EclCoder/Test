package fp;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f38816b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final LinkedList f38817c = new LinkedList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedList f38818d = new LinkedList();

    d(Object obj) {
        this.f38815a = obj;
    }

    public void a(c cVar, boolean z10) {
        ip.a.h(cVar, "Pool entry");
        ip.b.b(this.f38816b.remove(cVar), "Entry %s has not been leased from this pool", cVar);
        if (z10) {
            this.f38817c.addFirst(cVar);
        }
    }

    public Future b() {
        return (Future) this.f38818d.poll();
    }

    public String toString() {
        return "[route: " + this.f38815a + "][leased: " + this.f38816b.size() + "][available: " + this.f38817c.size() + "][pending: " + this.f38818d.size() + "]";
    }
}
