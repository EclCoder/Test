package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.h2;
import java.util.ArrayList;
import java.util.HashSet;
import p9.s1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f17394a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet f17395b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q.a f17396c = new q.a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.i.a f17397d = new com.google.android.exoplayer2.drm.i.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Looper f17398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h2 f17399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s1 f17400g;

    protected abstract void A(nb.a0 a0Var);

    protected final void B(h2 h2Var) {
        this.f17399f = h2Var;
        ArrayList arrayList = this.f17394a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((p.c) obj).a(this, h2Var);
        }
    }

    protected abstract void C();

    @Override // com.google.android.exoplayer2.source.p
    public final void f(p.c cVar) {
        this.f17394a.remove(cVar);
        if (!this.f17394a.isEmpty()) {
            p(cVar);
            return;
        }
        this.f17398e = null;
        this.f17399f = null;
        this.f17400g = null;
        this.f17395b.clear();
        C();
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void h(p.c cVar, nb.a0 a0Var, s1 s1Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f17398e;
        ob.a.a(looper == null || looper == looperMyLooper);
        this.f17400g = s1Var;
        h2 h2Var = this.f17399f;
        this.f17394a.add(cVar);
        if (this.f17398e == null) {
            this.f17398e = looperMyLooper;
            this.f17395b.add(cVar);
            A(a0Var);
        } else if (h2Var != null) {
            m(cVar);
            cVar.a(this, h2Var);
        }
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void j(Handler handler, q qVar) {
        ob.a.e(handler);
        ob.a.e(qVar);
        this.f17396c.g(handler, qVar);
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void k(q qVar) {
        this.f17396c.v(qVar);
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void m(p.c cVar) {
        ob.a.e(this.f17398e);
        boolean zIsEmpty = this.f17395b.isEmpty();
        this.f17395b.add(cVar);
        if (zIsEmpty) {
            x();
        }
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void p(p.c cVar) {
        boolean zIsEmpty = this.f17395b.isEmpty();
        this.f17395b.remove(cVar);
        if (zIsEmpty || !this.f17395b.isEmpty()) {
            return;
        }
        w();
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void q(Handler handler, com.google.android.exoplayer2.drm.i iVar) {
        ob.a.e(handler);
        ob.a.e(iVar);
        this.f17397d.g(handler, iVar);
    }

    @Override // com.google.android.exoplayer2.source.p
    public final void r(com.google.android.exoplayer2.drm.i iVar) {
        this.f17397d.n(iVar);
    }

    protected final com.google.android.exoplayer2.drm.i.a s(int i10, p.b bVar) {
        return this.f17397d.o(i10, bVar);
    }

    protected final com.google.android.exoplayer2.drm.i.a t(p.b bVar) {
        return this.f17397d.o(0, bVar);
    }

    protected final q.a u(int i10, p.b bVar) {
        return this.f17396c.y(i10, bVar);
    }

    protected final q.a v(p.b bVar) {
        return this.f17396c.y(0, bVar);
    }

    protected final s1 y() {
        return (s1) ob.a.i(this.f17400g);
    }

    protected final boolean z() {
        return !this.f17395b.isEmpty();
    }

    protected void w() {
    }

    protected void x() {
    }
}
