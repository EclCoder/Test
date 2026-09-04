package x5;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m0.d f56709b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a implements com.bumptech.glide.load.data.d, com.bumptech.glide.load.data.d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f56710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m0.d f56711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f56712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.h f56713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private com.bumptech.glide.load.data.d.a f56714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f56715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f56716g;

        a(List list, m0.d dVar) {
            this.f56711b = dVar;
            m6.k.d(list);
            this.f56710a = list;
            this.f56712c = 0;
        }

        private void g() {
            if (this.f56716g) {
                return;
            }
            if (this.f56712c < this.f56710a.size() - 1) {
                this.f56712c++;
                e(this.f56713d, this.f56714e);
            } else {
                m6.k.e(this.f56715f);
                this.f56714e.c(new GlideException("Fetch failed", new ArrayList(this.f56715f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f56710a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f56715f;
            if (list != null) {
                this.f56711b.a(list);
            }
            this.f56715f = null;
            Iterator it = this.f56710a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) m6.k.e(this.f56715f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f56716g = true;
            Iterator it = this.f56710a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public r5.a d() {
            return ((com.bumptech.glide.load.data.d) this.f56710a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, com.bumptech.glide.load.data.d.a aVar) {
            this.f56713d = hVar;
            this.f56714e = aVar;
            this.f56715f = (List) this.f56711b.b();
            ((com.bumptech.glide.load.data.d) this.f56710a.get(this.f56712c)).e(hVar, this);
            if (this.f56716g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f56714e.f(obj);
            } else {
                g();
            }
        }
    }

    q(List list, m0.d dVar) {
        this.f56708a = list;
        this.f56709b = dVar;
    }

    @Override // x5.n
    public boolean a(Object obj) {
        Iterator it = this.f56708a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // x5.n
    public n.a b(Object obj, int i10, int i11, r5.g gVar) {
        n.a aVarB;
        int size = this.f56708a.size();
        ArrayList arrayList = new ArrayList(size);
        r5.e eVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f56708a.get(i12);
            if (nVar.a(obj) && (aVarB = nVar.b(obj, i10, i11, gVar)) != null) {
                eVar = aVarB.f56701a;
                arrayList.add(aVarB.f56703c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new n.a(eVar, new a(arrayList, this.f56709b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f56708a.toArray()) + '}';
    }
}
