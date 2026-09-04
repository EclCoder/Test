package androidx.media3.exoplayer;

import androidx.media3.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements f2, g2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5353b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h2 f5355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f5356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c2.x1 f5357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private w1.d f5358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f5359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i2.q f5360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private t1.o[] f5361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f5362k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f5363l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f5365n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f5366o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private g2.a f5368q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5352a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f1 f5354c = new f1();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f5364m = Long.MIN_VALUE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t1.a0 f5367p = t1.a0.f52510a;

    public h(int i10) {
        this.f5353b = i10;
    }

    private void X(long j10, boolean z10) {
        this.f5365n = false;
        this.f5363l = j10;
        this.f5364m = j10;
        O(j10, z10);
    }

    @Override // androidx.media3.exoplayer.f2
    public final void A(h2 h2Var, t1.o[] oVarArr, i2.q qVar, long j10, boolean z10, boolean z11, long j11, long j12, androidx.media3.exoplayer.source.r.b bVar) {
        w1.a.g(this.f5359h == 0);
        this.f5355d = h2Var;
        this.f5359h = 1;
        M(z10, z11);
        x(oVarArr, qVar, j11, j12, bVar);
        X(j11, z10);
    }

    protected final ExoPlaybackException B(Throwable th2, t1.o oVar, int i10) {
        return C(th2, oVar, false, i10);
    }

    protected final ExoPlaybackException C(Throwable th2, t1.o oVar, boolean z10, int i10) {
        int iM;
        if (oVar == null || this.f5366o) {
            iM = 4;
        } else {
            this.f5366o = true;
            try {
                iM = g2.m(a(oVar));
                this.f5366o = false;
            } catch (ExoPlaybackException unused) {
                this.f5366o = false;
                iM = 4;
            } catch (Throwable th3) {
                this.f5366o = false;
                throw th3;
            }
        }
        return ExoPlaybackException.h(th2, getName(), G(), oVar, iM, z10, i10);
    }

    protected final w1.d D() {
        return (w1.d) w1.a.e(this.f5358g);
    }

    protected final h2 E() {
        return (h2) w1.a.e(this.f5355d);
    }

    protected final f1 F() {
        this.f5354c.a();
        return this.f5354c;
    }

    protected final int G() {
        return this.f5356e;
    }

    protected final long H() {
        return this.f5363l;
    }

    protected final c2.x1 I() {
        return (c2.x1) w1.a.e(this.f5357f);
    }

    protected final t1.o[] J() {
        return (t1.o[]) w1.a.e(this.f5361j);
    }

    protected final boolean K() {
        return hasReadStreamToEnd() ? this.f5365n : ((i2.q) w1.a.e(this.f5360i)).isReady();
    }

    protected abstract void L();

    protected abstract void O(long j10, boolean z10);

    protected final void Q() {
        g2.a aVar;
        synchronized (this.f5352a) {
            aVar = this.f5368q;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    protected final int W(f1 f1Var, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iA = ((i2.q) w1.a.e(this.f5360i)).a(f1Var, decoderInputBuffer, i10);
        if (iA != -4) {
            if (iA == -5) {
                t1.o oVar = (t1.o) w1.a.e(f1Var.f5339b);
                if (oVar.f52762s != Long.MAX_VALUE) {
                    f1Var.f5339b = oVar.a().s0(oVar.f52762s + this.f5362k).K();
                }
            }
            return iA;
        }
        if (decoderInputBuffer.e()) {
            this.f5364m = Long.MIN_VALUE;
            return this.f5365n ? -4 : -3;
        }
        long j10 = decoderInputBuffer.f4866f + this.f5362k;
        decoderInputBuffer.f4866f = j10;
        this.f5364m = Math.max(this.f5364m, j10);
        return iA;
    }

    protected int Y(long j10) {
        return ((i2.q) w1.a.e(this.f5360i)).skipData(j10 - this.f5362k);
    }

    @Override // androidx.media3.exoplayer.g2
    public final void c() {
        synchronized (this.f5352a) {
            this.f5368q = null;
        }
    }

    @Override // androidx.media3.exoplayer.f2
    public final void disable() {
        w1.a.g(this.f5359h == 1);
        this.f5354c.a();
        this.f5359h = 0;
        this.f5360i = null;
        this.f5361j = null;
        this.f5365n = false;
        L();
    }

    @Override // androidx.media3.exoplayer.f2
    public j1 getMediaClock() {
        return null;
    }

    @Override // androidx.media3.exoplayer.f2
    public final int getState() {
        return this.f5359h;
    }

    @Override // androidx.media3.exoplayer.f2
    public final i2.q getStream() {
        return this.f5360i;
    }

    @Override // androidx.media3.exoplayer.f2, androidx.media3.exoplayer.g2
    public final int getTrackType() {
        return this.f5353b;
    }

    @Override // androidx.media3.exoplayer.f2
    public final boolean hasReadStreamToEnd() {
        return this.f5364m == Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.f2
    public final boolean isCurrentStreamFinal() {
        return this.f5365n;
    }

    @Override // androidx.media3.exoplayer.f2
    public final long l() {
        return this.f5364m;
    }

    @Override // androidx.media3.exoplayer.f2
    public final void maybeThrowStreamError() {
        ((i2.q) w1.a.e(this.f5360i)).maybeThrowError();
    }

    @Override // androidx.media3.exoplayer.f2
    public final void p(t1.a0 a0Var) {
        if (w1.c0.c(this.f5367p, a0Var)) {
            return;
        }
        this.f5367p = a0Var;
        V(a0Var);
    }

    @Override // androidx.media3.exoplayer.f2
    public final void release() {
        w1.a.g(this.f5359h == 0);
        P();
    }

    @Override // androidx.media3.exoplayer.f2
    public final void reset() {
        w1.a.g(this.f5359h == 0);
        this.f5354c.a();
        R();
    }

    @Override // androidx.media3.exoplayer.f2
    public final void resetPosition(long j10) {
        X(j10, false);
    }

    @Override // androidx.media3.exoplayer.f2
    public final void setCurrentStreamFinal() {
        this.f5365n = true;
    }

    @Override // androidx.media3.exoplayer.f2
    public final void start() {
        w1.a.g(this.f5359h == 1);
        this.f5359h = 2;
        S();
    }

    @Override // androidx.media3.exoplayer.f2
    public final void stop() {
        w1.a.g(this.f5359h == 2);
        this.f5359h = 1;
        T();
    }

    @Override // androidx.media3.exoplayer.g2
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    @Override // androidx.media3.exoplayer.f2
    public final void t(int i10, c2.x1 x1Var, w1.d dVar) {
        this.f5356e = i10;
        this.f5357f = x1Var;
        this.f5358g = dVar;
        N();
    }

    @Override // androidx.media3.exoplayer.f2
    public final void x(t1.o[] oVarArr, i2.q qVar, long j10, long j11, androidx.media3.exoplayer.source.r.b bVar) {
        w1.a.g(!this.f5365n);
        this.f5360i = qVar;
        if (this.f5364m == Long.MIN_VALUE) {
            this.f5364m = j10;
        }
        this.f5361j = oVarArr;
        this.f5362k = j11;
        U(oVarArr, j10, j11, bVar);
    }

    @Override // androidx.media3.exoplayer.g2
    public final void y(g2.a aVar) {
        synchronized (this.f5352a) {
            this.f5368q = aVar;
        }
    }

    protected void N() {
    }

    protected void P() {
    }

    protected void R() {
    }

    protected void S() {
    }

    protected void T() {
    }

    @Override // androidx.media3.exoplayer.f2
    public final g2 getCapabilities() {
        return this;
    }

    protected void V(t1.a0 a0Var) {
    }

    protected void M(boolean z10, boolean z11) {
    }

    @Override // androidx.media3.exoplayer.d2.b
    public void handleMessage(int i10, Object obj) {
    }

    protected void U(t1.o[] oVarArr, long j10, long j11, androidx.media3.exoplayer.source.r.b bVar) {
    }
}
