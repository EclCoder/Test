package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.os.Looper;
import c2.x1;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f5804a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f5805b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s.a f5806c = new s.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.h.a f5807d = new androidx.media3.exoplayer.drm.h.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f5808e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private t1.a0 f5809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x1 f5810g;

    @Override // androidx.media3.exoplayer.source.r
    public final void e(Handler handler, s sVar) {
        w1.a.e(handler);
        w1.a.e(sVar);
        this.f5806c.f(handler, sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void g(s sVar) {
        this.f5806c.q(sVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void h(Handler handler, androidx.media3.exoplayer.drm.h hVar) {
        w1.a.e(handler);
        w1.a.e(hVar);
        this.f5807d.g(handler, hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void i(androidx.media3.exoplayer.drm.h hVar) {
        this.f5807d.n(hVar);
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void l(r.c cVar) {
        w1.a.e(this.f5808e);
        boolean zIsEmpty = this.f5805b.isEmpty();
        this.f5805b.add(cVar);
        if (zIsEmpty) {
            u();
        }
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void m(r.c cVar) {
        this.f5804a.remove(cVar);
        if (!this.f5804a.isEmpty()) {
            n(cVar);
            return;
        }
        this.f5808e = null;
        this.f5809f = null;
        this.f5810g = null;
        this.f5805b.clear();
        z();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void n(r.c cVar) {
        boolean zIsEmpty = this.f5805b.isEmpty();
        this.f5805b.remove(cVar);
        if (zIsEmpty || !this.f5805b.isEmpty()) {
            return;
        }
        t();
    }

    @Override // androidx.media3.exoplayer.source.r
    public final void o(r.c cVar, z1.m mVar, x1 x1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f5808e;
        w1.a.a(looper == null || looper == looperMyLooper);
        this.f5810g = x1Var;
        t1.a0 a0Var = this.f5809f;
        this.f5804a.add(cVar);
        if (this.f5808e == null) {
            this.f5808e = looperMyLooper;
            this.f5805b.add(cVar);
            x(mVar);
        } else if (a0Var != null) {
            l(cVar);
            cVar.a(this, a0Var);
        }
    }

    protected final androidx.media3.exoplayer.drm.h.a p(int i10, r.b bVar) {
        return this.f5807d.o(i10, bVar);
    }

    protected final androidx.media3.exoplayer.drm.h.a q(r.b bVar) {
        return this.f5807d.o(0, bVar);
    }

    protected final s.a r(int i10, r.b bVar) {
        return this.f5806c.r(i10, bVar);
    }

    protected final s.a s(r.b bVar) {
        return this.f5806c.r(0, bVar);
    }

    protected final x1 v() {
        return (x1) w1.a.i(this.f5810g);
    }

    protected final boolean w() {
        return !this.f5805b.isEmpty();
    }

    protected abstract void x(z1.m mVar);

    protected final void y(t1.a0 a0Var) {
        this.f5809f = a0Var;
        ArrayList arrayList = this.f5804a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((r.c) obj).a(this, a0Var);
        }
    }

    protected abstract void z();

    protected void t() {
    }

    protected void u() {
    }
}
