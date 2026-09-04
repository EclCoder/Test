package x5;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final c f56717e = new c();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final n f56718f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f56720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f56721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0.d f56722d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a implements n {
        a() {
        }

        @Override // x5.n
        public boolean a(Object obj) {
            return false;
        }

        @Override // x5.n
        public n.a b(Object obj, int i10, int i11, r5.g gVar) {
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f56723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Class f56724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final o f56725c;

        public b(Class cls, Class cls2, o oVar) {
            this.f56723a = cls;
            this.f56724b = cls2;
            this.f56725c = oVar;
        }

        public boolean a(Class cls) {
            return this.f56723a.isAssignableFrom(cls);
        }

        public boolean b(Class cls, Class cls2) {
            return a(cls) && this.f56724b.isAssignableFrom(cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        c() {
        }

        public q a(List list, m0.d dVar) {
            return new q(list, dVar);
        }
    }

    public r(m0.d dVar) {
        this(dVar, f56717e);
    }

    private void a(Class cls, Class cls2, o oVar, boolean z10) {
        b bVar = new b(cls, cls2, oVar);
        List list = this.f56719a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private n e(b bVar) {
        return (n) m6.k.e(bVar.f56725c.d(this));
    }

    private static n f() {
        return f56718f;
    }

    synchronized void b(Class cls, Class cls2, o oVar) {
        a(cls, cls2, oVar, true);
    }

    synchronized List c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b bVar : this.f56719a) {
                if (!this.f56721c.contains(bVar) && bVar.a(cls)) {
                    this.f56721c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f56721c.remove(bVar);
                }
            }
        } catch (Throwable th2) {
            this.f56721c.clear();
            throw th2;
        }
        return arrayList;
    }

    public synchronized n d(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b bVar : this.f56719a) {
                if (this.f56721c.contains(bVar)) {
                    z10 = true;
                } else if (bVar.b(cls, cls2)) {
                    this.f56721c.add(bVar);
                    arrayList.add(e(bVar));
                    this.f56721c.remove(bVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f56720b.a(arrayList, this.f56722d);
            }
            if (arrayList.size() == 1) {
                return (n) arrayList.get(0);
            }
            if (!z10) {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
            return f();
        } catch (Throwable th2) {
            this.f56721c.clear();
            throw th2;
        }
    }

    synchronized List g(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b bVar : this.f56719a) {
            if (!arrayList.contains(bVar.f56724b) && bVar.a(cls)) {
                arrayList.add(bVar.f56724b);
            }
        }
        return arrayList;
    }

    r(m0.d dVar, c cVar) {
        this.f56719a = new ArrayList();
        this.f56721c = new HashSet();
        this.f56722d = dVar;
        this.f56720b = cVar;
    }
}
