package com.bumptech.glide.load.engine;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class k implements h.b, n6.a.f {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final c f11396z = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final e f11397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n6.c f11398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o.a f11399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final m0.d f11400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c f11401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final l f11402f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w5.a f11403g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final w5.a f11404h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final w5.a f11405i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final w5.a f11406j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicInteger f11407k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private r5.e f11408l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f11411o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f11412p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private t5.c f11413q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    r5.a f11414r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f11415s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    GlideException f11416t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f11417u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    o f11418v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private h f11419w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile boolean f11420x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f11421y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i6.g f11422a;

        a(i6.g gVar) {
            this.f11422a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f11422a.g()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f11397a.b(this.f11422a)) {
                            k.this.f(this.f11422a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final i6.g f11424a;

        b(i6.g gVar) {
            this.f11424a = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f11424a.g()) {
                synchronized (k.this) {
                    try {
                        if (k.this.f11397a.b(this.f11424a)) {
                            k.this.f11418v.c();
                            k.this.g(this.f11424a);
                            k.this.r(this.f11424a);
                        }
                        k.this.i();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        c() {
        }

        public o a(t5.c cVar, boolean z10, r5.e eVar, o.a aVar) {
            return new o(cVar, z10, true, eVar, aVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final i6.g f11426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f11427b;

        d(i6.g gVar, Executor executor) {
            this.f11426a = gVar;
            this.f11427b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f11426a.equals(((d) obj).f11426a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11426a.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class e implements Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f11428a;

        e() {
            this(new ArrayList(2));
        }

        private static d e(i6.g gVar) {
            return new d(gVar, m6.e.a());
        }

        void a(i6.g gVar, Executor executor) {
            this.f11428a.add(new d(gVar, executor));
        }

        boolean b(i6.g gVar) {
            return this.f11428a.contains(e(gVar));
        }

        void clear() {
            this.f11428a.clear();
        }

        e d() {
            return new e(new ArrayList(this.f11428a));
        }

        void f(i6.g gVar) {
            this.f11428a.remove(e(gVar));
        }

        boolean isEmpty() {
            return this.f11428a.isEmpty();
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f11428a.iterator();
        }

        int size() {
            return this.f11428a.size();
        }

        e(List list) {
            this.f11428a = list;
        }
    }

    k(w5.a aVar, w5.a aVar2, w5.a aVar3, w5.a aVar4, l lVar, o.a aVar5, m0.d dVar) {
        this(aVar, aVar2, aVar3, aVar4, lVar, aVar5, dVar, f11396z);
    }

    private w5.a j() {
        if (this.f11410n) {
            return this.f11405i;
        }
        return this.f11411o ? this.f11406j : this.f11404h;
    }

    private boolean m() {
        return this.f11417u || this.f11415s || this.f11420x;
    }

    private synchronized void q() {
        if (this.f11408l == null) {
            throw new IllegalArgumentException();
        }
        this.f11397a.clear();
        this.f11408l = null;
        this.f11418v = null;
        this.f11413q = null;
        this.f11417u = false;
        this.f11420x = false;
        this.f11415s = false;
        this.f11421y = false;
        this.f11419w.w(false);
        this.f11419w = null;
        this.f11416t = null;
        this.f11414r = null;
        this.f11400d.a(this);
    }

    synchronized void a(i6.g gVar, Executor executor) {
        try {
            this.f11398b.c();
            this.f11397a.a(gVar, executor);
            if (this.f11415s) {
                k(1);
                executor.execute(new b(gVar));
            } else if (this.f11417u) {
                k(1);
                executor.execute(new a(gVar));
            } else {
                m6.k.b(!this.f11420x, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void b(t5.c cVar, r5.a aVar, boolean z10) {
        synchronized (this) {
            this.f11413q = cVar;
            this.f11414r = aVar;
            this.f11421y = z10;
        }
        o();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(GlideException glideException) {
        synchronized (this) {
            this.f11416t = glideException;
        }
        n();
    }

    @Override // n6.a.f
    public n6.c d() {
        return this.f11398b;
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void e(h hVar) {
        j().execute(hVar);
    }

    void f(i6.g gVar) {
        try {
            gVar.c(this.f11416t);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void g(i6.g gVar) {
        try {
            gVar.b(this.f11418v, this.f11414r, this.f11421y);
        } catch (Throwable th2) {
            throw new com.bumptech.glide.load.engine.b(th2);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.f11420x = true;
        this.f11419w.b();
        this.f11402f.c(this, this.f11408l);
    }

    void i() {
        o oVar;
        synchronized (this) {
            try {
                this.f11398b.c();
                m6.k.b(m(), "Not yet complete!");
                int iDecrementAndGet = this.f11407k.decrementAndGet();
                m6.k.b(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    oVar = this.f11418v;
                    q();
                } else {
                    oVar = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (oVar != null) {
            oVar.f();
        }
    }

    synchronized void k(int i10) {
        o oVar;
        m6.k.b(m(), "Not yet complete!");
        if (this.f11407k.getAndAdd(i10) == 0 && (oVar = this.f11418v) != null) {
            oVar.c();
        }
    }

    synchronized k l(r5.e eVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f11408l = eVar;
        this.f11409m = z10;
        this.f11410n = z11;
        this.f11411o = z12;
        this.f11412p = z13;
        return this;
    }

    void n() {
        synchronized (this) {
            try {
                this.f11398b.c();
                if (this.f11420x) {
                    q();
                    return;
                }
                if (this.f11397a.isEmpty()) {
                    throw new IllegalStateException("Received an exception without any callbacks to notify");
                }
                if (this.f11417u) {
                    throw new IllegalStateException("Already failed once");
                }
                this.f11417u = true;
                r5.e eVar = this.f11408l;
                e<d> eVarD = this.f11397a.d();
                k(eVarD.size() + 1);
                this.f11402f.a(this, eVar, null);
                for (d dVar : eVarD) {
                    dVar.f11427b.execute(new a(dVar.f11426a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void o() {
        synchronized (this) {
            try {
                this.f11398b.c();
                if (this.f11420x) {
                    this.f11413q.a();
                    q();
                    return;
                }
                if (this.f11397a.isEmpty()) {
                    throw new IllegalStateException("Received a resource without any callbacks to notify");
                }
                if (this.f11415s) {
                    throw new IllegalStateException("Already have resource");
                }
                this.f11418v = this.f11401e.a(this.f11413q, this.f11409m, this.f11408l, this.f11399c);
                this.f11415s = true;
                e<d> eVarD = this.f11397a.d();
                k(eVarD.size() + 1);
                this.f11402f.a(this, this.f11408l, this.f11418v);
                for (d dVar : eVarD) {
                    dVar.f11427b.execute(new b(dVar.f11426a));
                }
                i();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    boolean p() {
        return this.f11412p;
    }

    synchronized void r(i6.g gVar) {
        try {
            this.f11398b.c();
            this.f11397a.f(gVar);
            if (this.f11397a.isEmpty()) {
                h();
                if (this.f11415s || this.f11417u) {
                    if (this.f11407k.get() == 0) {
                        q();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void s(h hVar) {
        try {
            this.f11419w = hVar;
            (hVar.E() ? this.f11403g : j()).execute(hVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    k(w5.a aVar, w5.a aVar2, w5.a aVar3, w5.a aVar4, l lVar, o.a aVar5, m0.d dVar, c cVar) {
        this.f11397a = new e();
        this.f11398b = n6.c.a();
        this.f11407k = new AtomicInteger();
        this.f11403g = aVar;
        this.f11404h = aVar2;
        this.f11405i = aVar3;
        this.f11406j = aVar4;
        this.f11402f = lVar;
        this.f11399c = aVar5;
        this.f11400d = dVar;
        this.f11401e = cVar;
    }
}
