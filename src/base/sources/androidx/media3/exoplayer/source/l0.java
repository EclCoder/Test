package androidx.media3.exoplayer.source;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Void f6025l = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final r f6026k;

    protected l0(r rVar) {
        this.f6026k = rVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final r.b B(Void r10, r.b bVar) {
        return G(bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final long C(Void r10, long j10, r.b bVar) {
        return I(j10, bVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final int D(Void r10, int i10) {
        return K(i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.c
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final void E(Void r10, r rVar, t1.a0 a0Var) {
        N(a0Var);
    }

    protected abstract void N(t1.a0 a0Var);

    protected final void O() {
        F(f6025l, this.f6026k);
    }

    protected void P() {
        O();
    }

    @Override // androidx.media3.exoplayer.source.r
    public t1.r a() {
        return this.f6026k.a();
    }

    @Override // androidx.media3.exoplayer.source.r
    public boolean c() {
        return this.f6026k.c();
    }

    @Override // androidx.media3.exoplayer.source.r
    public t1.a0 d() {
        return this.f6026k.d();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void k(t1.r rVar) {
        this.f6026k.k(rVar);
    }

    @Override // androidx.media3.exoplayer.source.c, androidx.media3.exoplayer.source.a
    protected final void x(z1.m mVar) {
        super.x(mVar);
        P();
    }

    protected r.b G(r.b bVar) {
        return bVar;
    }

    protected int K(int i10) {
        return i10;
    }

    protected long I(long j10, r.b bVar) {
        return j10;
    }
}
