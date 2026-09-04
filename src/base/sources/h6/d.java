package h6;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f40248a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a f40249b = new androidx.collection.a();

    public List a(Class cls, Class cls2, Class cls3) {
        List list;
        j jVar = (j) this.f40248a.getAndSet(null);
        if (jVar == null) {
            jVar = new j(cls, cls2, cls3);
        } else {
            jVar.a(cls, cls2, cls3);
        }
        synchronized (this.f40249b) {
            list = (List) this.f40249b.get(jVar);
        }
        this.f40248a.set(jVar);
        return list;
    }

    public void b(Class cls, Class cls2, Class cls3, List list) {
        synchronized (this.f40249b) {
            this.f40249b.put(new j(cls, cls2, cls3), list);
        }
    }
}
