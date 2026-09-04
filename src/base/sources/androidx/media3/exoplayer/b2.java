package androidx.media3.exoplayer;

import android.util.Pair;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c2.x1 f5100a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f5104e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c2.a f5107h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w1.j f5108i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f5110k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private z1.m f5111l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i2.r f5109j = new i2.r.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f5102c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f5103d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f5101b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f5105f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f5106g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a implements androidx.media3.exoplayer.source.s, androidx.media3.exoplayer.drm.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f5112a;

        public a(c cVar) {
            this.f5112a = cVar;
        }

        private Pair S(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            androidx.media3.exoplayer.source.r.b bVar2 = null;
            if (bVar != null) {
                androidx.media3.exoplayer.source.r.b bVarN = b2.n(this.f5112a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(b2.s(this.f5112a, i10)), bVar2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void A(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6082a;
                        Pair pair = pairS;
                        b2.this.f5107h.A(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void B(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.a2
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f4890a;
                        Pair pair = pairS;
                        b2.this.f5107h.B(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void D(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f5760a;
                        Pair pair = pairS;
                        b2.this.f5107h.D(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void F(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.j jVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.u1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6087a;
                        Pair pair = pairS;
                        b2.this.f5107h.F(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void G(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6118a;
                        Pair pair = pairS;
                        b2.this.f5107h.G(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void q(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar, final IOException iOException, final boolean z10) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6235a;
                        Pair pair = pairS;
                        b2.this.f5107h.q(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void t(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f5765a;
                        Pair pair = pairS;
                        b2.this.f5107h.t(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void u(int i10, androidx.media3.exoplayer.source.r.b bVar, final i2.i iVar, final i2.j jVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6223a;
                        Pair pair = pairS;
                        b2.this.f5107h.u(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void w(int i10, androidx.media3.exoplayer.source.r.b bVar, final int i11) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.x1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6230a;
                        Pair pair = pairS;
                        b2.this.f5107h.w(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void y(int i10, androidx.media3.exoplayer.source.r.b bVar) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.z1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f6243a;
                        Pair pair = pairS;
                        b2.this.f5107h.y(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second);
                    }
                });
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void z(int i10, androidx.media3.exoplayer.source.r.b bVar, final Exception exc) {
            final Pair pairS = S(i10, bVar);
            if (pairS != null) {
                b2.this.f5108i.post(new Runnable() { // from class: androidx.media3.exoplayer.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b2.a aVar = this.f5768a;
                        Pair pair = pairS;
                        b2.this.f5107h.z(((Integer) pair.first).intValue(), (androidx.media3.exoplayer.source.r.b) pair.second, exc);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r f5114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.r.c f5115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f5116c;

        public b(androidx.media3.exoplayer.source.r rVar, androidx.media3.exoplayer.source.r.c cVar, a aVar) {
            this.f5114a = rVar;
            this.f5115b = cVar;
            this.f5116c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements o1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.media3.exoplayer.source.p f5117a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5120d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f5121e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f5119c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f5118b = new Object();

        public c(androidx.media3.exoplayer.source.r rVar, boolean z10) {
            this.f5117a = new androidx.media3.exoplayer.source.p(rVar, z10);
        }

        @Override // androidx.media3.exoplayer.o1
        public Object a() {
            return this.f5118b;
        }

        @Override // androidx.media3.exoplayer.o1
        public t1.a0 b() {
            return this.f5117a.T();
        }

        public void c(int i10) {
            this.f5120d = i10;
            this.f5121e = false;
            this.f5119c.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void b();
    }

    public b2(d dVar, c2.a aVar, w1.j jVar, c2.x1 x1Var) {
        this.f5100a = x1Var;
        this.f5104e = dVar;
        this.f5107h = aVar;
        this.f5108i = jVar;
    }

    private void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f5101b.remove(i12);
            this.f5103d.remove(cVar.f5118b);
            g(i12, -cVar.f5117a.T().p());
            cVar.f5121e = true;
            if (this.f5110k) {
                u(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f5101b.size()) {
            ((c) this.f5101b.get(i10)).f5120d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f5105f.get(cVar);
        if (bVar != null) {
            bVar.f5114a.n(bVar.f5115b);
        }
    }

    private void k() {
        Iterator it = this.f5106g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f5119c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f5106g.add(cVar);
        b bVar = (b) this.f5105f.get(cVar);
        if (bVar != null) {
            bVar.f5114a.l(bVar.f5115b);
        }
    }

    private static Object m(Object obj) {
        return androidx.media3.exoplayer.a.v(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static androidx.media3.exoplayer.source.r.b n(c cVar, androidx.media3.exoplayer.source.r.b bVar) {
        for (int i10 = 0; i10 < cVar.f5119c.size(); i10++) {
            if (((androidx.media3.exoplayer.source.r.b) cVar.f5119c.get(i10)).f6058d == bVar.f6058d) {
                return bVar.a(p(cVar, bVar.f6055a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return androidx.media3.exoplayer.a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return androidx.media3.exoplayer.a.y(cVar.f5118b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f5120d;
    }

    private void u(c cVar) {
        if (cVar.f5121e && cVar.f5119c.isEmpty()) {
            b bVar = (b) w1.a.e((b) this.f5105f.remove(cVar));
            bVar.f5114a.m(bVar.f5115b);
            bVar.f5114a.g(bVar.f5116c);
            bVar.f5114a.i(bVar.f5116c);
            this.f5106g.remove(cVar);
        }
    }

    private void w(c cVar) {
        androidx.media3.exoplayer.source.p pVar = cVar.f5117a;
        androidx.media3.exoplayer.source.r.c cVar2 = new androidx.media3.exoplayer.source.r.c() { // from class: androidx.media3.exoplayer.p1
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar, t1.a0 a0Var) {
                this.f5700a.f5104e.b();
            }
        };
        a aVar = new a(cVar);
        this.f5105f.put(cVar, new b(pVar, cVar2, aVar));
        pVar.e(w1.c0.B(), aVar);
        pVar.h(w1.c0.B(), aVar);
        pVar.o(cVar2, this.f5111l, this.f5100a);
    }

    public t1.a0 B(List list, i2.r rVar) {
        A(0, this.f5101b.size());
        return f(this.f5101b.size(), list, rVar);
    }

    public t1.a0 C(i2.r rVar) {
        int iR = r();
        if (rVar.getLength() != iR) {
            rVar = rVar.cloneAndClear().cloneAndInsert(0, iR);
        }
        this.f5109j = rVar;
        return i();
    }

    public t1.a0 D(int i10, int i11, List list) {
        w1.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        w1.a.a(list.size() == i11 - i10);
        for (int i12 = i10; i12 < i11; i12++) {
            ((c) this.f5101b.get(i12)).f5117a.k((t1.r) list.get(i12 - i10));
        }
        return i();
    }

    public t1.a0 f(int i10, List list, i2.r rVar) {
        if (!list.isEmpty()) {
            this.f5109j = rVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f5101b.get(i11 - 1);
                    cVar.c(cVar2.f5120d + cVar2.f5117a.T().p());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f5117a.T().p());
                this.f5101b.add(i11, cVar);
                this.f5103d.put(cVar.f5118b, cVar);
                if (this.f5110k) {
                    w(cVar);
                    if (this.f5102c.isEmpty()) {
                        this.f5106g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public androidx.media3.exoplayer.source.q h(androidx.media3.exoplayer.source.r.b bVar, l2.b bVar2, long j10) {
        Object objO = o(bVar.f6055a);
        androidx.media3.exoplayer.source.r.b bVarA = bVar.a(m(bVar.f6055a));
        c cVar = (c) w1.a.e((c) this.f5103d.get(objO));
        l(cVar);
        cVar.f5119c.add(bVarA);
        androidx.media3.exoplayer.source.o oVarF = cVar.f5117a.f(bVarA, bVar2, j10);
        this.f5102c.put(oVarF, cVar);
        k();
        return oVarF;
    }

    public t1.a0 i() {
        if (this.f5101b.isEmpty()) {
            return t1.a0.f52510a;
        }
        int iP = 0;
        for (int i10 = 0; i10 < this.f5101b.size(); i10++) {
            c cVar = (c) this.f5101b.get(i10);
            cVar.f5120d = iP;
            iP += cVar.f5117a.T().p();
        }
        return new e2(this.f5101b, this.f5109j);
    }

    public i2.r q() {
        return this.f5109j;
    }

    public int r() {
        return this.f5101b.size();
    }

    public boolean t() {
        return this.f5110k;
    }

    public void v(z1.m mVar) {
        w1.a.g(!this.f5110k);
        this.f5111l = mVar;
        for (int i10 = 0; i10 < this.f5101b.size(); i10++) {
            c cVar = (c) this.f5101b.get(i10);
            w(cVar);
            this.f5106g.add(cVar);
        }
        this.f5110k = true;
    }

    public void x() {
        for (b bVar : this.f5105f.values()) {
            try {
                bVar.f5114a.m(bVar.f5115b);
            } catch (RuntimeException e10) {
                w1.n.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f5114a.g(bVar.f5116c);
            bVar.f5114a.i(bVar.f5116c);
        }
        this.f5105f.clear();
        this.f5106g.clear();
        this.f5110k = false;
    }

    public void y(androidx.media3.exoplayer.source.q qVar) {
        c cVar = (c) w1.a.e((c) this.f5102c.remove(qVar));
        cVar.f5117a.j(qVar);
        cVar.f5119c.remove(((androidx.media3.exoplayer.source.o) qVar).f6033a);
        if (!this.f5102c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public t1.a0 z(int i10, int i11, i2.r rVar) {
        w1.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f5109j = rVar;
        A(i10, i11);
        return i();
    }
}
