package androidx.media3.exoplayer.source;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import t1.a0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends androidx.media3.exoplayer.source.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f5872h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Handler f5873i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private z1.m f5874j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a implements s, androidx.media3.exoplayer.drm.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f5875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private s.a f5876b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private androidx.media3.exoplayer.drm.h.a f5877c;

        public a(Object obj) {
            this.f5876b = c.this.s(null);
            this.f5877c = c.this.q(null);
            this.f5875a = obj;
        }

        private boolean H(int i10, r.b bVar) {
            r.b bVarB;
            if (bVar != null) {
                bVarB = c.this.B(this.f5875a, bVar);
                if (bVarB == null) {
                    return false;
                }
            } else {
                bVarB = null;
            }
            int iD = c.this.D(this.f5875a, i10);
            s.a aVar = this.f5876b;
            if (aVar.f6060a != iD || !w1.c0.c(aVar.f6061b, bVarB)) {
                this.f5876b = c.this.r(iD, bVarB);
            }
            androidx.media3.exoplayer.drm.h.a aVar2 = this.f5877c;
            if (aVar2.f5254a == iD && w1.c0.c(aVar2.f5255b, bVarB)) {
                return true;
            }
            this.f5877c = c.this.p(iD, bVarB);
            return true;
        }

        private i2.j I(i2.j jVar, r.b bVar) {
            long jC = c.this.C(this.f5875a, jVar.f40773f, bVar);
            long jC2 = c.this.C(this.f5875a, jVar.f40774g, bVar);
            return (jC == jVar.f40773f && jC2 == jVar.f40774g) ? jVar : new i2.j(jVar.f40768a, jVar.f40769b, jVar.f40770c, jVar.f40771d, jVar.f40772e, jC, jC2);
        }

        @Override // androidx.media3.exoplayer.source.s
        public void A(int i10, r.b bVar, i2.i iVar, i2.j jVar) {
            if (H(i10, bVar)) {
                this.f5876b.p(iVar, I(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void B(int i10, r.b bVar) {
            if (H(i10, bVar)) {
                this.f5877c.j();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void D(int i10, r.b bVar, i2.i iVar, i2.j jVar) {
            if (H(i10, bVar)) {
                this.f5876b.j(iVar, I(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void F(int i10, r.b bVar, i2.j jVar) {
            if (H(i10, bVar)) {
                this.f5876b.h(I(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void G(int i10, r.b bVar) {
            if (H(i10, bVar)) {
                this.f5877c.m();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void q(int i10, r.b bVar, i2.i iVar, i2.j jVar, IOException iOException, boolean z10) {
            if (H(i10, bVar)) {
                this.f5876b.n(iVar, I(jVar, bVar), iOException, z10);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void t(int i10, r.b bVar) {
            if (H(i10, bVar)) {
                this.f5877c.h();
            }
        }

        @Override // androidx.media3.exoplayer.source.s
        public void u(int i10, r.b bVar, i2.i iVar, i2.j jVar) {
            if (H(i10, bVar)) {
                this.f5876b.l(iVar, I(jVar, bVar));
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void w(int i10, r.b bVar, int i11) {
            if (H(i10, bVar)) {
                this.f5877c.k(i11);
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void y(int i10, r.b bVar) {
            if (H(i10, bVar)) {
                this.f5877c.i();
            }
        }

        @Override // androidx.media3.exoplayer.drm.h
        public void z(int i10, r.b bVar, Exception exc) {
            if (H(i10, bVar)) {
                this.f5877c.l(exc);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f5879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r.c f5880b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f5881c;

        public b(r rVar, r.c cVar, a aVar) {
            this.f5879a = rVar;
            this.f5880b = cVar;
            this.f5881c = aVar;
        }
    }

    protected c() {
    }

    protected abstract r.b B(Object obj, r.b bVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void E(Object obj, r rVar, t1.a0 a0Var);

    protected final void F(final Object obj, r rVar) {
        w1.a.a(!this.f5872h.containsKey(obj));
        r.c cVar = new r.c() { // from class: i2.c
            @Override // androidx.media3.exoplayer.source.r.c
            public final void a(androidx.media3.exoplayer.source.r rVar2, a0 a0Var) {
                this.f40752a.E(obj, rVar2, a0Var);
            }
        };
        a aVar = new a(obj);
        this.f5872h.put(obj, new b(rVar, cVar, aVar));
        rVar.e((Handler) w1.a.e(this.f5873i), aVar);
        rVar.h((Handler) w1.a.e(this.f5873i), aVar);
        rVar.o(cVar, this.f5874j, v());
        if (w()) {
            return;
        }
        rVar.n(cVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void maybeThrowSourceInfoRefreshError() {
        Iterator it = this.f5872h.values().iterator();
        while (it.hasNext()) {
            ((b) it.next()).f5879a.maybeThrowSourceInfoRefreshError();
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void t() {
        for (b bVar : this.f5872h.values()) {
            bVar.f5879a.n(bVar.f5880b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void u() {
        for (b bVar : this.f5872h.values()) {
            bVar.f5879a.l(bVar.f5880b);
        }
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void x(z1.m mVar) {
        this.f5874j = mVar;
        this.f5873i = w1.c0.z();
    }

    @Override // androidx.media3.exoplayer.source.a
    protected void z() {
        for (b bVar : this.f5872h.values()) {
            bVar.f5879a.m(bVar.f5880b);
            bVar.f5879a.g(bVar.f5881c);
            bVar.f5879a.i(bVar.f5881c);
        }
        this.f5872h.clear();
    }

    protected int D(Object obj, int i10) {
        return i10;
    }

    protected long C(Object obj, long j10, r.b bVar) {
        return j10;
    }
}
