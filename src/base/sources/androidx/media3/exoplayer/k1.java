package androidx.media3.exoplayer;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.q f5441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f5442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.q[] f5443c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5444d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5445e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l1 f5446f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean[] f5448h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g2[] f5449i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k2.v f5450j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final b2 f5451k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private k1 f5452l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private i2.v f5453m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private k2.w f5454n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f5455o;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        k1 a(l1 l1Var, long j10);
    }

    public k1(g2[] g2VarArr, long j10, k2.v vVar, l2.b bVar, b2 b2Var, l1 l1Var, k2.w wVar) {
        this.f5449i = g2VarArr;
        this.f5455o = j10;
        this.f5450j = vVar;
        this.f5451k = b2Var;
        androidx.media3.exoplayer.source.r.b bVar2 = l1Var.f5477a;
        this.f5442b = bVar2.f6055a;
        this.f5446f = l1Var;
        this.f5453m = i2.v.f40816d;
        this.f5454n = wVar;
        this.f5443c = new i2.q[g2VarArr.length];
        this.f5448h = new boolean[g2VarArr.length];
        this.f5441a = f(bVar2, b2Var, bVar, l1Var.f5478b, l1Var.f5480d);
    }

    private void c(i2.q[] qVarArr) {
        int i10 = 0;
        while (true) {
            g2[] g2VarArr = this.f5449i;
            if (i10 >= g2VarArr.length) {
                return;
            }
            if (g2VarArr[i10].getTrackType() == -2 && this.f5454n.c(i10)) {
                qVarArr[i10] = new i2.h();
            }
            i10++;
        }
    }

    private static androidx.media3.exoplayer.source.q f(androidx.media3.exoplayer.source.r.b bVar, b2 b2Var, l2.b bVar2, long j10, long j11) {
        androidx.media3.exoplayer.source.q qVarH = b2Var.h(bVar, bVar2, j10);
        return j11 != C.TIME_UNSET ? new androidx.media3.exoplayer.source.b(qVarH, true, 0L, j11) : qVarH;
    }

    private void g() {
        if (!t()) {
            return;
        }
        int i10 = 0;
        while (true) {
            k2.w wVar = this.f5454n;
            if (i10 >= wVar.f42966a) {
                return;
            }
            boolean zC = wVar.c(i10);
            k2.q qVar = this.f5454n.f42968c[i10];
            if (zC && qVar != null) {
                qVar.disable();
            }
            i10++;
        }
    }

    private void h(i2.q[] qVarArr) {
        int i10 = 0;
        while (true) {
            g2[] g2VarArr = this.f5449i;
            if (i10 >= g2VarArr.length) {
                return;
            }
            if (g2VarArr[i10].getTrackType() == -2) {
                qVarArr[i10] = null;
            }
            i10++;
        }
    }

    private void i() {
        if (!t()) {
            return;
        }
        int i10 = 0;
        while (true) {
            k2.w wVar = this.f5454n;
            if (i10 >= wVar.f42966a) {
                return;
            }
            boolean zC = wVar.c(i10);
            k2.q qVar = this.f5454n.f42968c[i10];
            if (zC && qVar != null) {
                qVar.enable();
            }
            i10++;
        }
    }

    private boolean t() {
        return this.f5452l == null;
    }

    private static void w(b2 b2Var, androidx.media3.exoplayer.source.q qVar) {
        try {
            if (qVar instanceof androidx.media3.exoplayer.source.b) {
                b2Var.y(((androidx.media3.exoplayer.source.b) qVar).f5813a);
            } else {
                b2Var.y(qVar);
            }
        } catch (RuntimeException e10) {
            w1.n.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public long A(long j10) {
        return j10 - m();
    }

    public long B(long j10) {
        return j10 + m();
    }

    public void C() {
        androidx.media3.exoplayer.source.q qVar = this.f5441a;
        if (qVar instanceof androidx.media3.exoplayer.source.b) {
            long j10 = this.f5446f.f5480d;
            if (j10 == C.TIME_UNSET) {
                j10 = Long.MIN_VALUE;
            }
            ((androidx.media3.exoplayer.source.b) qVar).l(0L, j10);
        }
    }

    public long a(k2.w wVar, long j10, boolean z10) {
        return b(wVar, j10, z10, new boolean[this.f5449i.length]);
    }

    public long b(k2.w wVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= wVar.f42966a) {
                break;
            }
            boolean[] zArr2 = this.f5448h;
            if (z10 || !wVar.b(this.f5454n, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f5443c);
        g();
        this.f5454n = wVar;
        i();
        long jF = this.f5441a.f(wVar.f42968c, this.f5448h, this.f5443c, zArr, j10);
        c(this.f5443c);
        this.f5445e = false;
        int i11 = 0;
        while (true) {
            i2.q[] qVarArr = this.f5443c;
            if (i11 >= qVarArr.length) {
                return jF;
            }
            if (qVarArr[i11] != null) {
                w1.a.g(wVar.c(i11));
                if (this.f5449i[i11].getTrackType() != -2) {
                    this.f5445e = true;
                }
            } else {
                w1.a.g(wVar.f42968c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(l1 l1Var) {
        if (!n1.d(this.f5446f.f5481e, l1Var.f5481e)) {
            return false;
        }
        l1 l1Var2 = this.f5446f;
        return l1Var2.f5478b == l1Var.f5478b && l1Var2.f5477a.equals(l1Var.f5477a);
    }

    public void e(long j10, float f10, long j11) {
        w1.a.g(t());
        this.f5441a.a(new i1.b().f(A(j10)).g(f10).e(j11).d());
    }

    public long j() {
        if (!this.f5444d) {
            return this.f5446f.f5478b;
        }
        long bufferedPositionUs = this.f5445e ? this.f5441a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f5446f.f5481e : bufferedPositionUs;
    }

    public k1 k() {
        return this.f5452l;
    }

    public long l() {
        if (this.f5444d) {
            return this.f5441a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long m() {
        return this.f5455o;
    }

    public long n() {
        return this.f5446f.f5478b + this.f5455o;
    }

    public i2.v o() {
        return this.f5453m;
    }

    public k2.w p() {
        return this.f5454n;
    }

    public void q(float f10, t1.a0 a0Var) {
        this.f5444d = true;
        this.f5453m = this.f5441a.getTrackGroups();
        k2.w wVarX = x(f10, a0Var);
        l1 l1Var = this.f5446f;
        long jMax = l1Var.f5478b;
        long j10 = l1Var.f5481e;
        if (j10 != C.TIME_UNSET && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(wVarX, jMax, false);
        long j11 = this.f5455o;
        l1 l1Var2 = this.f5446f;
        this.f5455o = j11 + (l1Var2.f5478b - jA);
        this.f5446f = l1Var2.b(jA);
    }

    public boolean r() {
        try {
            if (this.f5444d) {
                for (i2.q qVar : this.f5443c) {
                    if (qVar != null) {
                        qVar.maybeThrowError();
                    }
                }
            } else {
                this.f5441a.maybeThrowPrepareError();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f5444d) {
            return !this.f5445e || this.f5441a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public void u(long j10) {
        w1.a.g(t());
        if (this.f5444d) {
            this.f5441a.reevaluateBuffer(A(j10));
        }
    }

    public void v() {
        g();
        w(this.f5451k, this.f5441a);
    }

    public k2.w x(float f10, t1.a0 a0Var) {
        k2.w wVarJ = this.f5450j.j(this.f5449i, o(), this.f5446f.f5477a, a0Var);
        for (int i10 = 0; i10 < wVarJ.f42966a; i10++) {
            boolean z10 = true;
            if (wVarJ.c(i10)) {
                if (wVarJ.f42968c[i10] == null && this.f5449i[i10].getTrackType() != -2) {
                    z10 = false;
                }
                w1.a.g(z10);
            } else {
                w1.a.g(wVarJ.f42968c[i10] == null);
            }
        }
        for (k2.q qVar : wVarJ.f42968c) {
            if (qVar != null) {
                qVar.onPlaybackSpeed(f10);
            }
        }
        return wVarJ;
    }

    public void y(k1 k1Var) {
        if (k1Var == this.f5452l) {
            return;
        }
        g();
        this.f5452l = k1Var;
        i();
    }

    public void z(long j10) {
        this.f5455o = j10;
    }
}
