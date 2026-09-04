package com.google.android.exoplayer2;

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
/* JADX INFO: loaded from: classes4.dex */
final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p9.s1 f17340a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f17344e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final p9.a f17347h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ob.q f17348i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f17350k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private nb.a0 f17351l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.exoplayer2.source.e0 f17349j = new com.google.android.exoplayer2.source.e0.a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final IdentityHashMap f17342c = new IdentityHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f17343d = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f17341b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f17345f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f17346g = new HashSet();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    final class a implements com.google.android.exoplayer2.source.q, com.google.android.exoplayer2.drm.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f17352a;

        public a(c cVar) {
            this.f17352a = cVar;
        }

        private Pair I(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            com.google.android.exoplayer2.source.p.b bVar2 = null;
            if (bVar != null) {
                com.google.android.exoplayer2.source.p.b bVarN = s1.n(this.f17352a, bVar);
                if (bVarN == null) {
                    return null;
                }
                bVar2 = bVarN;
            }
            return Pair.create(Integer.valueOf(s1.s(this.f17352a, i10)), bVar2);
        }

        @Override // com.google.android.exoplayer2.source.q
        public void E(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.m1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17173a;
                        Pair pair = pairI;
                        s1.this.f17347h.E(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void F(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.j jVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17125a;
                        Pair pair = pairI;
                        s1.this.f17347h.F(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, jVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void G(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar, final IOException iOException, final boolean z10) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17324a;
                        Pair pair = pairI;
                        s1.this.f17347h.G(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, iVar, jVar, iOException, z10);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void J(int i10, com.google.android.exoplayer2.source.p.b bVar, final Exception exc) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17168a;
                        Pair pair = pairI;
                        s1.this.f17347h.J(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, exc);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void K(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.j jVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17331a;
                        Pair pair = pairI;
                        s1.this.f17347h.K(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) ob.a.e((com.google.android.exoplayer2.source.p.b) pair.second), jVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void N(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.o1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17318a;
                        Pair pair = pairI;
                        s1.this.f17347h.N(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void Q(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.i1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17042a;
                        Pair pair = pairI;
                        s1.this.f17347h.Q(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void R(int i10, com.google.android.exoplayer2.source.p.b bVar, final ra.i iVar, final ra.j jVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f16949a;
                        Pair pair = pairI;
                        s1.this.f17347h.R(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, iVar, jVar);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void S(int i10, com.google.android.exoplayer2.source.p.b bVar, final int i11) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.n1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17312a;
                        Pair pair = pairI;
                        s1.this.f17347h.S(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second, i11);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void T(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17159a;
                        Pair pair = pairI;
                        s1.this.f17347h.T(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void U(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.r1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f17336a;
                        Pair pair = pairI;
                        s1.this.f17347h.U(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second);
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void q(int i10, com.google.android.exoplayer2.source.p.b bVar) {
            final Pair pairI = I(i10, bVar);
            if (pairI != null) {
                s1.this.f17348i.post(new Runnable() { // from class: com.google.android.exoplayer2.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        s1.a aVar = this.f16985a;
                        Pair pair = pairI;
                        s1.this.f17347h.q(((Integer) pair.first).intValue(), (com.google.android.exoplayer2.source.p.b) pair.second);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.p f17354a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.p.c f17355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f17356c;

        public b(com.google.android.exoplayer2.source.p pVar, com.google.android.exoplayer2.source.p.c cVar, a aVar) {
            this.f17354a = pVar;
            this.f17355b = cVar;
            this.f17356c = aVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class c implements e1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.n f17357a;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17360d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17361e;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f17359c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f17358b = new Object();

        public c(com.google.android.exoplayer2.source.p pVar, boolean z10) {
            this.f17357a = new com.google.android.exoplayer2.source.n(pVar, z10);
        }

        @Override // com.google.android.exoplayer2.e1
        public Object a() {
            return this.f17358b;
        }

        @Override // com.google.android.exoplayer2.e1
        public h2 b() {
            return this.f17357a.Z();
        }

        public void c(int i10) {
            this.f17360d = i10;
            this.f17361e = false;
            this.f17359c.clear();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void b();
    }

    public s1(d dVar, p9.a aVar, ob.q qVar, p9.s1 s1Var) {
        this.f17340a = s1Var;
        this.f17344e = dVar;
        this.f17347h = aVar;
        this.f17348i = qVar;
    }

    private void A(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f17341b.remove(i12);
            this.f17343d.remove(cVar.f17358b);
            g(i12, -cVar.f17357a.Z().t());
            cVar.f17361e = true;
            if (this.f17350k) {
                u(cVar);
            }
        }
    }

    private void g(int i10, int i11) {
        while (i10 < this.f17341b.size()) {
            ((c) this.f17341b.get(i10)).f17360d += i11;
            i10++;
        }
    }

    private void j(c cVar) {
        b bVar = (b) this.f17345f.get(cVar);
        if (bVar != null) {
            bVar.f17354a.p(bVar.f17355b);
        }
    }

    private void k() {
        Iterator it = this.f17346g.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f17359c.isEmpty()) {
                j(cVar);
                it.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f17346g.add(cVar);
        b bVar = (b) this.f17345f.get(cVar);
        if (bVar != null) {
            bVar.f17354a.m(bVar.f17355b);
        }
    }

    private static Object m(Object obj) {
        return com.google.android.exoplayer2.a.z(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.android.exoplayer2.source.p.b n(c cVar, com.google.android.exoplayer2.source.p.b bVar) {
        for (int i10 = 0; i10 < cVar.f17359c.size(); i10++) {
            if (((com.google.android.exoplayer2.source.p.b) cVar.f17359c.get(i10)).f51202d == bVar.f51202d) {
                return bVar.c(p(cVar, bVar.f51199a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return com.google.android.exoplayer2.a.A(obj);
    }

    private static Object p(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.C(cVar.f17358b, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s(c cVar, int i10) {
        return i10 + cVar.f17360d;
    }

    private void u(c cVar) {
        if (cVar.f17361e && cVar.f17359c.isEmpty()) {
            b bVar = (b) ob.a.e((b) this.f17345f.remove(cVar));
            bVar.f17354a.f(bVar.f17355b);
            bVar.f17354a.k(bVar.f17356c);
            bVar.f17354a.r(bVar.f17356c);
            this.f17346g.remove(cVar);
        }
    }

    private void w(c cVar) {
        com.google.android.exoplayer2.source.n nVar = cVar.f17357a;
        com.google.android.exoplayer2.source.p.c cVar2 = new com.google.android.exoplayer2.source.p.c() { // from class: com.google.android.exoplayer2.f1
            @Override // com.google.android.exoplayer2.source.p.c
            public final void a(com.google.android.exoplayer2.source.p pVar, h2 h2Var) {
                this.f16946a.f17344e.b();
            }
        };
        a aVar = new a(cVar);
        this.f17345f.put(cVar, new b(nVar, cVar2, aVar));
        nVar.j(ob.r0.y(), aVar);
        nVar.q(ob.r0.y(), aVar);
        nVar.h(cVar2, this.f17351l, this.f17340a);
    }

    public h2 B(List list, com.google.android.exoplayer2.source.e0 e0Var) {
        A(0, this.f17341b.size());
        return f(this.f17341b.size(), list, e0Var);
    }

    public h2 C(com.google.android.exoplayer2.source.e0 e0Var) {
        int iR = r();
        if (e0Var.getLength() != iR) {
            e0Var = e0Var.cloneAndClear().cloneAndInsert(0, iR);
        }
        this.f17349j = e0Var;
        return i();
    }

    public h2 f(int i10, List list, com.google.android.exoplayer2.source.e0 e0Var) {
        if (!list.isEmpty()) {
            this.f17349j = e0Var;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f17341b.get(i11 - 1);
                    cVar.c(cVar2.f17360d + cVar2.f17357a.Z().t());
                } else {
                    cVar.c(0);
                }
                g(i11, cVar.f17357a.Z().t());
                this.f17341b.add(i11, cVar);
                this.f17343d.put(cVar.f17358b, cVar);
                if (this.f17350k) {
                    w(cVar);
                    if (this.f17342c.isEmpty()) {
                        this.f17346g.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public com.google.android.exoplayer2.source.o h(com.google.android.exoplayer2.source.p.b bVar, nb.b bVar2, long j10) {
        Object objO = o(bVar.f51199a);
        com.google.android.exoplayer2.source.p.b bVarC = bVar.c(m(bVar.f51199a));
        c cVar = (c) ob.a.e((c) this.f17343d.get(objO));
        l(cVar);
        cVar.f17359c.add(bVarC);
        com.google.android.exoplayer2.source.m mVarO = cVar.f17357a.o(bVarC, bVar2, j10);
        this.f17342c.put(mVarO, cVar);
        k();
        return mVarO;
    }

    public h2 i() {
        if (this.f17341b.isEmpty()) {
            return h2.f16987a;
        }
        int iT = 0;
        for (int i10 = 0; i10 < this.f17341b.size(); i10++) {
            c cVar = (c) this.f17341b.get(i10);
            cVar.f17360d = iT;
            iT += cVar.f17357a.Z().t();
        }
        return new z1(this.f17341b, this.f17349j);
    }

    public com.google.android.exoplayer2.source.e0 q() {
        return this.f17349j;
    }

    public int r() {
        return this.f17341b.size();
    }

    public boolean t() {
        return this.f17350k;
    }

    public void v(nb.a0 a0Var) {
        ob.a.g(!this.f17350k);
        this.f17351l = a0Var;
        for (int i10 = 0; i10 < this.f17341b.size(); i10++) {
            c cVar = (c) this.f17341b.get(i10);
            w(cVar);
            this.f17346g.add(cVar);
        }
        this.f17350k = true;
    }

    public void x() {
        for (b bVar : this.f17345f.values()) {
            try {
                bVar.f17354a.f(bVar.f17355b);
            } catch (RuntimeException e10) {
                ob.u.d("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f17354a.k(bVar.f17356c);
            bVar.f17354a.r(bVar.f17356c);
        }
        this.f17345f.clear();
        this.f17346g.clear();
        this.f17350k = false;
    }

    public void y(com.google.android.exoplayer2.source.o oVar) {
        c cVar = (c) ob.a.e((c) this.f17342c.remove(oVar));
        cVar.f17357a.l(oVar);
        cVar.f17359c.remove(((com.google.android.exoplayer2.source.m) oVar).f17853a);
        if (!this.f17342c.isEmpty()) {
            k();
        }
        u(cVar);
    }

    public h2 z(int i10, int i11, com.google.android.exoplayer2.source.e0 e0Var) {
        ob.a.a(i10 >= 0 && i10 <= i11 && i11 <= r());
        this.f17349j = e0Var;
        A(i10, i11);
        return i();
    }
}
