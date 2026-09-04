package h6;

import com.bumptech.glide.load.engine.i;
import com.bumptech.glide.load.engine.q;
import e6.g;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final q f40245c = new q(Object.class, Object.class, Object.class, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.EMPTY_LIST, new g(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.collection.a f40246a = new androidx.collection.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f40247b = new AtomicReference();

    private j b(Class cls, Class cls2, Class cls3) {
        j jVar = (j) this.f40247b.getAndSet(null);
        if (jVar == null) {
            jVar = new j();
        }
        jVar.a(cls, cls2, cls3);
        return jVar;
    }

    public q a(Class cls, Class cls2, Class cls3) {
        q qVar;
        j jVarB = b(cls, cls2, cls3);
        synchronized (this.f40246a) {
            qVar = (q) this.f40246a.get(jVarB);
        }
        this.f40247b.set(jVarB);
        return qVar;
    }

    public boolean c(q qVar) {
        return f40245c.equals(qVar);
    }

    public void d(Class cls, Class cls2, Class cls3, q qVar) {
        synchronized (this.f40246a) {
            androidx.collection.a aVar = this.f40246a;
            j jVar = new j(cls, cls2, cls3);
            if (qVar == null) {
                qVar = f40245c;
            }
            aVar.put(jVar, qVar);
        }
    }
}
