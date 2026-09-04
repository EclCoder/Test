package com.google.android.exoplayer2;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements b2, c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f16930b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o9.h0 f16932d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f16933e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p9.s1 f16934f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ra.s f16936h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private v0[] f16937i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f16938j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f16939k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f16941m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f16942n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private c2.a f16943o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f16929a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final o9.p f16931c = new o9.p();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f16940l = Long.MIN_VALUE;

    public f(int i10) {
        this.f16930b = i10;
    }

    private void J(long j10, boolean z10) {
        this.f16941m = false;
        this.f16939k = j10;
        this.f16940l = j10;
        B(j10, z10);
    }

    protected abstract void B(long j10, boolean z10);

    protected final void D() {
        c2.a aVar;
        synchronized (this.f16929a) {
            aVar = this.f16943o;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    protected abstract void H(v0[] v0VarArr, long j10, long j11);

    protected final int I(o9.p pVar, DecoderInputBuffer decoderInputBuffer, int i10) {
        int iA = ((ra.s) ob.a.e(this.f16936h)).a(pVar, decoderInputBuffer, i10);
        if (iA != -4) {
            if (iA == -5) {
                v0 v0Var = (v0) ob.a.e(pVar.f48303b);
                if (v0Var.f18872p != Long.MAX_VALUE) {
                    pVar.f48303b = v0Var.b().k0(v0Var.f18872p + this.f16938j).G();
                }
            }
            return iA;
        }
        if (decoderInputBuffer.g()) {
            this.f16940l = Long.MIN_VALUE;
            return this.f16941m ? -4 : -3;
        }
        long j10 = decoderInputBuffer.f16756e + this.f16938j;
        decoderInputBuffer.f16756e = j10;
        this.f16940l = Math.max(this.f16940l, j10);
        return iA;
    }

    protected int K(long j10) {
        return ((ra.s) ob.a.e(this.f16936h)).skipData(j10 - this.f16938j);
    }

    @Override // com.google.android.exoplayer2.c2
    public final void c() {
        synchronized (this.f16929a) {
            this.f16943o = null;
        }
    }

    @Override // com.google.android.exoplayer2.b2
    public final void disable() {
        ob.a.g(this.f16935g == 1);
        this.f16931c.a();
        this.f16935g = 0;
        this.f16936h = null;
        this.f16937i = null;
        this.f16941m = false;
        z();
    }

    @Override // com.google.android.exoplayer2.b2
    public ob.w getMediaClock() {
        return null;
    }

    @Override // com.google.android.exoplayer2.b2
    public final int getState() {
        return this.f16935g;
    }

    @Override // com.google.android.exoplayer2.b2
    public final ra.s getStream() {
        return this.f16936h;
    }

    @Override // com.google.android.exoplayer2.b2, com.google.android.exoplayer2.c2
    public final int getTrackType() {
        return this.f16930b;
    }

    @Override // com.google.android.exoplayer2.b2
    public final boolean hasReadStreamToEnd() {
        return this.f16940l == Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.b2
    public final void i(int i10, p9.s1 s1Var) {
        this.f16933e = i10;
        this.f16934f = s1Var;
    }

    @Override // com.google.android.exoplayer2.b2
    public final boolean isCurrentStreamFinal() {
        return this.f16941m;
    }

    @Override // com.google.android.exoplayer2.b2
    public final long l() {
        return this.f16940l;
    }

    @Override // com.google.android.exoplayer2.b2
    public final void maybeThrowStreamError() {
        ((ra.s) ob.a.e(this.f16936h)).maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.b2
    public final void n(v0[] v0VarArr, ra.s sVar, long j10, long j11) {
        ob.a.g(!this.f16941m);
        this.f16936h = sVar;
        if (this.f16940l == Long.MIN_VALUE) {
            this.f16940l = j10;
        }
        this.f16937i = v0VarArr;
        this.f16938j = j11;
        H(v0VarArr, j10, j11);
    }

    @Override // com.google.android.exoplayer2.b2
    public final void o(o9.h0 h0Var, v0[] v0VarArr, ra.s sVar, long j10, boolean z10, boolean z11, long j11, long j12) {
        ob.a.g(this.f16935g == 0);
        this.f16932d = h0Var;
        this.f16935g = 1;
        A(z10, z11);
        n(v0VarArr, sVar, j11, j12);
        J(j10, z10);
    }

    @Override // com.google.android.exoplayer2.c2
    public final void q(c2.a aVar) {
        synchronized (this.f16929a) {
            this.f16943o = aVar;
        }
    }

    protected final ExoPlaybackException r(Throwable th2, v0 v0Var, int i10) {
        return s(th2, v0Var, false, i10);
    }

    @Override // com.google.android.exoplayer2.b2
    public final void release() {
        ob.a.g(this.f16935g == 0);
        C();
    }

    @Override // com.google.android.exoplayer2.b2
    public final void reset() {
        ob.a.g(this.f16935g == 0);
        this.f16931c.a();
        E();
    }

    @Override // com.google.android.exoplayer2.b2
    public final void resetPosition(long j10) {
        J(j10, false);
    }

    protected final ExoPlaybackException s(Throwable th2, v0 v0Var, boolean z10, int i10) {
        int iM;
        if (v0Var == null || this.f16942n) {
            iM = 4;
        } else {
            this.f16942n = true;
            try {
                iM = c2.m(a(v0Var));
                this.f16942n = false;
            } catch (ExoPlaybackException unused) {
                this.f16942n = false;
                iM = 4;
            } catch (Throwable th3) {
                this.f16942n = false;
                throw th3;
            }
        }
        return ExoPlaybackException.g(th2, getName(), v(), v0Var, iM, z10, i10);
    }

    @Override // com.google.android.exoplayer2.b2
    public final void setCurrentStreamFinal() {
        this.f16941m = true;
    }

    @Override // com.google.android.exoplayer2.b2
    public final void start() {
        ob.a.g(this.f16935g == 1);
        this.f16935g = 2;
        F();
    }

    @Override // com.google.android.exoplayer2.b2
    public final void stop() {
        ob.a.g(this.f16935g == 2);
        this.f16935g = 1;
        G();
    }

    @Override // com.google.android.exoplayer2.c2
    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    protected final o9.h0 t() {
        return (o9.h0) ob.a.e(this.f16932d);
    }

    protected final o9.p u() {
        this.f16931c.a();
        return this.f16931c;
    }

    protected final int v() {
        return this.f16933e;
    }

    protected final p9.s1 w() {
        return (p9.s1) ob.a.e(this.f16934f);
    }

    protected final v0[] x() {
        return (v0[]) ob.a.e(this.f16937i);
    }

    protected final boolean y() {
        return hasReadStreamToEnd() ? this.f16941m : ((ra.s) ob.a.e(this.f16936h)).isReady();
    }

    protected abstract void z();

    protected void C() {
    }

    protected void E() {
    }

    protected void F() {
    }

    protected void G() {
    }

    @Override // com.google.android.exoplayer2.b2
    public final c2 getCapabilities() {
        return this;
    }

    protected void A(boolean z10, boolean z11) {
    }

    @Override // com.google.android.exoplayer2.y1.b
    public void handleMessage(int i10, Object obj) {
    }
}
