package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.y0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i0 extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f17827l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final p f17828k;

    protected i0(p pVar) {
        this.f17828k = pVar;
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    protected final void A(nb.a0 a0Var) {
        super.A(a0Var);
        V();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final p.b G(Void r10, p.b bVar) {
        return M(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final long H(Void r10, long j10) {
        return O(j10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final int I(Void r10, int i10) {
        return Q(i10);
    }

    protected abstract void S(h2 h2Var);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final void J(Void r10, p pVar, h2 h2Var) {
        S(h2Var);
    }

    protected final void U() {
        K(f17827l, this.f17828k);
    }

    protected void V() {
        U();
    }

    @Override // com.google.android.exoplayer2.source.p
    public y0 a() {
        return this.f17828k.a();
    }

    @Override // com.google.android.exoplayer2.source.p
    public boolean c() {
        return this.f17828k.c();
    }

    @Override // com.google.android.exoplayer2.source.p
    public h2 d() {
        return this.f17828k.d();
    }

    protected p.b M(p.b bVar) {
        return bVar;
    }

    protected long O(long j10) {
        return j10;
    }

    protected int Q(int i10) {
        return i10;
    }
}
