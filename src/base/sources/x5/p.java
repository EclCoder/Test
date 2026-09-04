package x5;

import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f56704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f56705b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f56706a = new HashMap();

        /* JADX INFO: renamed from: x5.p$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        private static class C0869a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final List f56707a;

            public C0869a(List list) {
                this.f56707a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f56706a.clear();
        }

        public List b(Class cls) {
            C0869a c0869a = (C0869a) this.f56706a.get(cls);
            if (c0869a == null) {
                return null;
            }
            return c0869a.f56707a;
        }

        public void c(Class cls, List list) {
            if (((C0869a) this.f56706a.put(cls, new C0869a(list))) == null) {
                return;
            }
            throw new IllegalStateException("Already cached loaders for model: " + cls);
        }
    }

    public p(m0.d dVar) {
        this(new r(dVar));
    }

    private static Class b(Object obj) {
        return obj.getClass();
    }

    private synchronized List e(Class cls) {
        List listB;
        listB = this.f56705b.b(cls);
        if (listB == null) {
            listB = Collections.unmodifiableList(this.f56704a.c(cls));
            this.f56705b.c(cls, listB);
        }
        return listB;
    }

    public synchronized void a(Class cls, Class cls2, o oVar) {
        this.f56704a.b(cls, cls2, oVar);
        this.f56705b.a();
    }

    public synchronized List c(Class cls) {
        return this.f56704a.g(cls);
    }

    public List d(Object obj) {
        List listE = e(b(obj));
        if (listE.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj);
        }
        int size = listE.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) listE.get(i10);
            if (nVar.a(obj)) {
                if (z10) {
                    arrayList = new ArrayList(size - i10);
                    z10 = false;
                }
                arrayList.add(nVar);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Registry.NoModelLoaderAvailableException(obj, listE);
        }
        return arrayList;
    }

    private p(r rVar) {
        this.f56705b = new a();
        this.f56704a = rVar;
    }
}
