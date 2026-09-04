package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.c0 f37350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37352c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37353d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u9.b0 f37354e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37355f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37357h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f37358i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f37359j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private v0 f37360k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37361l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f37362m;

    public f() {
        this(null);
    }

    private boolean a(ob.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f37356g);
        d0Var.l(bArr, this.f37356g, iMin);
        int i11 = this.f37356g + iMin;
        this.f37356g = i11;
        return i11 == i10;
    }

    private void e() {
        this.f37350a.p(0);
        q9.c.b bVarD = q9.c.d(this.f37350a);
        v0 v0Var = this.f37360k;
        if (v0Var == null || bVarD.f50458c != v0Var.f18881y || bVarD.f50457b != v0Var.f18882z || !"audio/ac4".equals(v0Var.f18868l)) {
            v0 v0VarG = new v0.b().U(this.f37353d).g0("audio/ac4").J(bVarD.f50458c).h0(bVarD.f50457b).X(this.f37352c).G();
            this.f37360k = v0VarG;
            this.f37354e.e(v0VarG);
        }
        this.f37361l = bVarD.f50459d;
        this.f37359j = (((long) bVarD.f50460e) * 1000000) / ((long) this.f37360k.f18882z);
    }

    private boolean f(ob.d0 d0Var) {
        while (true) {
            if (d0Var.a() <= 0) {
                return false;
            }
            if (this.f37357h) {
                int iH = d0Var.H();
                this.f37357h = iH == 172;
                if (iH == 64 || iH == 65) {
                    this.f37358i = iH == 65;
                    return true;
                }
            } else {
                this.f37357h = d0Var.H() == 172;
            }
        }
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        ob.a.i(this.f37354e);
        while (d0Var.a() > 0) {
            int i10 = this.f37355f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d0Var.a(), this.f37361l - this.f37356g);
                        this.f37354e.c(d0Var, iMin);
                        int i11 = this.f37356g + iMin;
                        this.f37356g = i11;
                        int i12 = this.f37361l;
                        if (i11 == i12) {
                            long j10 = this.f37362m;
                            if (j10 != C.TIME_UNSET) {
                                this.f37354e.f(j10, 1, i12, 0, null);
                                this.f37362m += this.f37359j;
                            }
                            this.f37355f = 0;
                        }
                    }
                } else if (a(d0Var, this.f37351b.e(), 16)) {
                    e();
                    this.f37351b.U(0);
                    this.f37354e.c(this.f37351b, 16);
                    this.f37355f = 2;
                }
            } else if (f(d0Var)) {
                this.f37355f = 1;
                this.f37351b.e()[0] = -84;
                this.f37351b.e()[1] = (byte) (this.f37358i ? 65 : 64);
                this.f37356g = 2;
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37362m = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37353d = dVar.b();
        this.f37354e = mVar.track(dVar.c(), 1);
    }

    @Override // ea.m
    public void seek() {
        this.f37355f = 0;
        this.f37356g = 0;
        this.f37357h = false;
        this.f37358i = false;
        this.f37362m = C.TIME_UNSET;
    }

    public f(String str) {
        ob.c0 c0Var = new ob.c0(new byte[16]);
        this.f37350a = c0Var;
        this.f37351b = new ob.d0(c0Var.f48353a);
        this.f37355f = 0;
        this.f37356g = 0;
        this.f37357h = false;
        this.f37358i = false;
        this.f37362m = C.TIME_UNSET;
        this.f37352c = str;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
