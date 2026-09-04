package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ob.c0 f37322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u9.b0 f37326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f37327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f37329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f37330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private v0 f37331j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f37332k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f37333l;

    public c() {
        this(null);
    }

    private boolean a(ob.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f37328g);
        d0Var.l(bArr, this.f37328g, iMin);
        int i11 = this.f37328g + iMin;
        this.f37328g = i11;
        return i11 == i10;
    }

    private void e() {
        this.f37322a.p(0);
        q9.b.C0779b c0779bF = q9.b.f(this.f37322a);
        v0 v0Var = this.f37331j;
        if (v0Var == null || c0779bF.f50451d != v0Var.f18881y || c0779bF.f50450c != v0Var.f18882z || !r0.c(c0779bF.f50448a, v0Var.f18868l)) {
            v0.b bVarB0 = new v0.b().U(this.f37325d).g0(c0779bF.f50448a).J(c0779bF.f50451d).h0(c0779bF.f50450c).X(this.f37324c).b0(c0779bF.f50454g);
            if (MimeTypes.AUDIO_AC3.equals(c0779bF.f50448a)) {
                bVarB0.I(c0779bF.f50454g);
            }
            v0 v0VarG = bVarB0.G();
            this.f37331j = v0VarG;
            this.f37326e.e(v0VarG);
        }
        this.f37332k = c0779bF.f50452e;
        this.f37330i = (((long) c0779bF.f50453f) * 1000000) / ((long) this.f37331j.f18882z);
    }

    private boolean f(ob.d0 d0Var) {
        while (true) {
            if (d0Var.a() <= 0) {
                return false;
            }
            if (this.f37329h) {
                int iH = d0Var.H();
                if (iH == 119) {
                    this.f37329h = false;
                    return true;
                }
                this.f37329h = iH == 11;
            } else {
                this.f37329h = d0Var.H() == 11;
            }
        }
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        ob.a.i(this.f37326e);
        while (d0Var.a() > 0) {
            int i10 = this.f37327f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int iMin = Math.min(d0Var.a(), this.f37332k - this.f37328g);
                        this.f37326e.c(d0Var, iMin);
                        int i11 = this.f37328g + iMin;
                        this.f37328g = i11;
                        int i12 = this.f37332k;
                        if (i11 == i12) {
                            long j10 = this.f37333l;
                            if (j10 != C.TIME_UNSET) {
                                this.f37326e.f(j10, 1, i12, 0, null);
                                this.f37333l += this.f37330i;
                            }
                            this.f37327f = 0;
                        }
                    }
                } else if (a(d0Var, this.f37323b.e(), 128)) {
                    e();
                    this.f37323b.U(0);
                    this.f37326e.c(this.f37323b, 128);
                    this.f37327f = 2;
                }
            } else if (f(d0Var)) {
                this.f37327f = 1;
                this.f37323b.e()[0] = 11;
                this.f37323b.e()[1] = 119;
                this.f37328g = 2;
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37333l = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37325d = dVar.b();
        this.f37326e = mVar.track(dVar.c(), 1);
    }

    @Override // ea.m
    public void seek() {
        this.f37327f = 0;
        this.f37328g = 0;
        this.f37329h = false;
        this.f37333l = C.TIME_UNSET;
    }

    public c(String str) {
        ob.c0 c0Var = new ob.c0(new byte[128]);
        this.f37322a = c0Var;
        this.f37323b = new ob.d0(c0Var.f48353a);
        this.f37327f = 0;
        this.f37333l = C.TIME_UNSET;
        this.f37324c = str;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
