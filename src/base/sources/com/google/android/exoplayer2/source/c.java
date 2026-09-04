package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.h2;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c extends com.google.android.exoplayer2.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f17422h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f17423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private nb.a0 f17424j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements q, com.google.android.exoplayer2.drm.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f17425a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private q.a f17426b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private com.google.android.exoplayer2.drm.i.a f17427c;

        public a(Object obj) {
            this.f17426b = c.this.v(null);
            this.f17427c = c.this.t(null);
            this.f17425a = obj;
        }

        private boolean n(int i10, p.b bVar) {
            p.b bVarG;
            if (bVar != null) {
                bVarG = c.this.G(this.f17425a, bVar);
                if (bVarG == null) {
                    return false;
                }
            } else {
                bVarG = null;
            }
            int I = c.this.I(this.f17425a, i10);
            q.a aVar = this.f17426b;
            if (aVar.f17875a != I || !r0.c(aVar.f17876b, bVarG)) {
                this.f17426b = c.this.u(I, bVarG);
            }
            com.google.android.exoplayer2.drm.i.a aVar2 = this.f17427c;
            if (aVar2.f16863a == I && r0.c(aVar2.f16864b, bVarG)) {
                return true;
            }
            this.f17427c = c.this.s(I, bVarG);
            return true;
        }

        private ra.j p(ra.j jVar) {
            long jH = c.this.H(this.f17425a, jVar.f51197f);
            long jH2 = c.this.H(this.f17425a, jVar.f51198g);
            return (jH == jVar.f51197f && jH2 == jVar.f51198g) ? jVar : new ra.j(jVar.f51192a, jVar.f51193b, jVar.f51194c, jVar.f51195d, jVar.f51196e, jH, jH2);
        }

        @Override // com.google.android.exoplayer2.source.q
        public void E(int i10, p.b bVar, ra.i iVar, ra.j jVar) {
            if (n(i10, bVar)) {
                this.f17426b.u(iVar, p(jVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void F(int i10, p.b bVar, ra.j jVar) {
            if (n(i10, bVar)) {
                this.f17426b.i(p(jVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void G(int i10, p.b bVar, ra.i iVar, ra.j jVar, IOException iOException, boolean z10) {
            if (n(i10, bVar)) {
                this.f17426b.r(iVar, p(jVar), iOException, z10);
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void J(int i10, p.b bVar, Exception exc) {
            if (n(i10, bVar)) {
                this.f17427c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void K(int i10, p.b bVar, ra.j jVar) {
            if (n(i10, bVar)) {
                this.f17426b.x(p(jVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void N(int i10, p.b bVar, ra.i iVar, ra.j jVar) {
            if (n(i10, bVar)) {
                this.f17426b.l(iVar, p(jVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void Q(int i10, p.b bVar) {
            if (n(i10, bVar)) {
                this.f17427c.h();
            }
        }

        @Override // com.google.android.exoplayer2.source.q
        public void R(int i10, p.b bVar, ra.i iVar, ra.j jVar) {
            if (n(i10, bVar)) {
                this.f17426b.o(iVar, p(jVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void S(int i10, p.b bVar, int i11) {
            if (n(i10, bVar)) {
                this.f17427c.k(i11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void T(int i10, p.b bVar) {
            if (n(i10, bVar)) {
                this.f17427c.m();
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void U(int i10, p.b bVar) {
            if (n(i10, bVar)) {
                this.f17427c.j();
            }
        }

        @Override // com.google.android.exoplayer2.drm.i
        public void q(int i10, p.b bVar) {
            if (n(i10, bVar)) {
                this.f17427c.i();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f17429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.c f17430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f17431c;

        public b(p pVar, p.c cVar, a aVar) {
            this.f17429a = pVar;
            this.f17430b = cVar;
            this.f17431c = aVar;
        }
    }

    protected c() {
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void A(nb.a0 a0Var) {
        this.f17424j = a0Var;
        this.f17423i = r0.w();
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void C() {
        for (b bVar : this.f17422h.values()) {
            bVar.f17429a.f(bVar.f17430b);
            bVar.f17429a.k(bVar.f17431c);
            bVar.f17429a.r(bVar.f17431c);
        }
        this.f17422h.clear();
    }

    protected final void E(Object obj) {
        b bVar = (b) ob.a.e((b) this.f17422h.get(obj));
        bVar.f17429a.p(bVar.f17430b);
    }

    protected final void F(Object obj) {
        b bVar = (b) ob.a.e((b) this.f17422h.get(obj));
        bVar.f17429a.m(bVar.f17430b);
    }

    protected abstract p.b G(Object obj, p.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void J(Object obj, p pVar, h2 h2Var);

    protected final void K(final Object obj, p pVar) {
        ob.a.a(!this.f17422h.containsKey(obj));
        p.c cVar = new p.c() { // from class: ra.b
            @Override // com.google.android.exoplayer2.source.p.c
            public final void a(com.google.android.exoplayer2.source.p pVar2, h2 h2Var) {
                this.f51179a.J(obj, pVar2, h2Var);
            }
        };
        a aVar = new a(obj);
        this.f17422h.put(obj, new b(pVar, cVar, aVar));
        pVar.j((Handler) ob.a.e(this.f17423i), aVar);
        pVar.q((Handler) ob.a.e(this.f17423i), aVar);
        pVar.h(cVar, this.f17424j, y());
        if (z()) {
            return;
        }
        pVar.p(cVar);
    }

    protected final void L(Object obj) {
        b bVar = (b) ob.a.e((b) this.f17422h.remove(obj));
        bVar.f17429a.f(bVar.f17430b);
        bVar.f17429a.k(bVar.f17431c);
        bVar.f17429a.r(bVar.f17431c);
    }

    @Override // com.google.android.exoplayer2.source.p
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.f17422h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f17429a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void w() {
        for (b bVar : this.f17422h.values()) {
            bVar.f17429a.p(bVar.f17430b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    protected void x() {
        for (b bVar : this.f17422h.values()) {
            bVar.f17429a.m(bVar.f17430b);
        }
    }

    protected long H(Object obj, long j10) {
        return j10;
    }

    protected int I(Object obj, int i10) {
        return i10;
    }
}
