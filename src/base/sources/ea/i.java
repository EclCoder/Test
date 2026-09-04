package ea;

import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements m {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final byte[] f37412v = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f37413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.c0 f37414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.d0 f37415c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f37416d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37417e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private u9.b0 f37418f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u9.b0 f37419g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37420h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37421i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37422j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f37423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37424l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37425m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37426n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37427o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37428p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f37429q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f37430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f37431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private u9.b0 f37432t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f37433u;

    public i(boolean z10) {
        this(z10, null);
    }

    private void a() {
        ob.a.e(this.f37418f);
        r0.j(this.f37432t);
        r0.j(this.f37419g);
    }

    private void e(ob.d0 d0Var) {
        if (d0Var.a() == 0) {
            return;
        }
        this.f37414b.f48353a[0] = d0Var.e()[d0Var.f()];
        this.f37414b.p(2);
        int iH = this.f37414b.h(4);
        int i10 = this.f37426n;
        if (i10 != -1 && iH != i10) {
            o();
            return;
        }
        if (!this.f37424l) {
            this.f37424l = true;
            this.f37425m = this.f37427o;
            this.f37426n = iH;
        }
        r();
    }

    private boolean f(ob.d0 d0Var, int i10) {
        d0Var.U(i10 + 1);
        if (!u(d0Var, this.f37414b.f48353a, 1)) {
            return false;
        }
        this.f37414b.p(4);
        int iH = this.f37414b.h(1);
        int i11 = this.f37425m;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f37426n != -1) {
            if (!u(d0Var, this.f37414b.f48353a, 1)) {
                return true;
            }
            this.f37414b.p(2);
            if (this.f37414b.h(4) != this.f37426n) {
                return false;
            }
            d0Var.U(i10 + 2);
        }
        if (!u(d0Var, this.f37414b.f48353a, 4)) {
            return true;
        }
        this.f37414b.p(14);
        int iH2 = this.f37414b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = d0Var.e();
        int iG = d0Var.g();
        int i12 = i10 + iH2;
        if (i12 >= iG) {
            return true;
        }
        byte b10 = bArrE[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iG) {
                return true;
            }
            return j((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iG) {
            return true;
        }
        if (bArrE[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iG || bArrE[i15] == 51;
    }

    private boolean g(ob.d0 d0Var, byte[] bArr, int i10) {
        int iMin = Math.min(d0Var.a(), i10 - this.f37421i);
        d0Var.l(bArr, this.f37421i, iMin);
        int i11 = this.f37421i + iMin;
        this.f37421i = i11;
        return i11 == i10;
    }

    private void h(ob.d0 d0Var) {
        byte[] bArrE = d0Var.e();
        int iF = d0Var.f();
        int iG = d0Var.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b10 = bArrE[iF];
            int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.f37422j == 512 && j((byte) -1, (byte) i11) && (this.f37424l || f(d0Var, iF - 1))) {
                this.f37427o = (b10 & 8) >> 3;
                this.f37423k = (b10 & 1) == 0;
                if (this.f37424l) {
                    r();
                } else {
                    p();
                }
                d0Var.U(i10);
                return;
            }
            int i12 = this.f37422j;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f37422j = 768;
            } else if (i13 == 511) {
                this.f37422j = 512;
            } else if (i13 == 836) {
                this.f37422j = UserVerificationMethods.USER_VERIFY_ALL;
            } else if (i13 == 1075) {
                s();
                d0Var.U(i10);
                return;
            } else if (i12 != 256) {
                this.f37422j = 256;
            }
            iF = i10;
        }
        d0Var.U(iF);
    }

    private boolean j(byte b10, byte b11) {
        return k(((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static boolean k(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void l() {
        this.f37414b.p(0);
        if (this.f37428p) {
            this.f37414b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f37414b.h(2) + 1;
            if (iH != 2) {
                ob.u.i("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f37414b.r(5);
            byte[] bArrB = q9.a.b(i10, this.f37426n, this.f37414b.h(3));
            q9.a.b bVarF = q9.a.f(bArrB);
            v0 v0VarG = new v0.b().U(this.f37417e).g0(MimeTypes.AUDIO_AAC).K(bVarF.f50441c).J(bVarF.f50440b).h0(bVarF.f50439a).V(Collections.singletonList(bArrB)).X(this.f37416d).G();
            this.f37429q = 1024000000 / ((long) v0VarG.f18882z);
            this.f37418f.e(v0VarG);
            this.f37428p = true;
        }
        this.f37414b.r(4);
        int iH2 = this.f37414b.h(13);
        int i11 = iH2 - 7;
        if (this.f37423k) {
            i11 = iH2 - 9;
        }
        t(this.f37418f, this.f37429q, 0, i11);
    }

    private void m() {
        this.f37419g.c(this.f37415c, 10);
        this.f37415c.U(6);
        t(this.f37419g, 0L, 10, this.f37415c.G() + 10);
    }

    private void n(ob.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f37430r - this.f37421i);
        this.f37432t.c(d0Var, iMin);
        int i10 = this.f37421i + iMin;
        this.f37421i = i10;
        int i11 = this.f37430r;
        if (i10 == i11) {
            long j10 = this.f37431s;
            if (j10 != C.TIME_UNSET) {
                this.f37432t.f(j10, 1, i11, 0, null);
                this.f37431s += this.f37433u;
            }
            q();
        }
    }

    private void o() {
        this.f37424l = false;
        q();
    }

    private void p() {
        this.f37420h = 1;
        this.f37421i = 0;
    }

    private void q() {
        this.f37420h = 0;
        this.f37421i = 0;
        this.f37422j = 256;
    }

    private void r() {
        this.f37420h = 3;
        this.f37421i = 0;
    }

    private void s() {
        this.f37420h = 2;
        this.f37421i = f37412v.length;
        this.f37430r = 0;
        this.f37415c.U(0);
    }

    private void t(u9.b0 b0Var, long j10, int i10, int i11) {
        this.f37420h = 4;
        this.f37421i = i10;
        this.f37432t = b0Var;
        this.f37433u = j10;
        this.f37430r = i11;
    }

    private boolean u(ob.d0 d0Var, byte[] bArr, int i10) {
        if (d0Var.a() < i10) {
            return false;
        }
        d0Var.l(bArr, 0, i10);
        return true;
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        a();
        while (d0Var.a() > 0) {
            int i10 = this.f37420h;
            if (i10 == 0) {
                h(d0Var);
            } else if (i10 == 1) {
                e(d0Var);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (g(d0Var, this.f37414b.f48353a, this.f37423k ? 7 : 5)) {
                        l();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    n(d0Var);
                }
            } else if (g(d0Var, this.f37415c.e(), 10)) {
                m();
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37431s = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37417e = dVar.b();
        u9.b0 b0VarTrack = mVar.track(dVar.c(), 1);
        this.f37418f = b0VarTrack;
        this.f37432t = b0VarTrack;
        if (!this.f37413a) {
            this.f37419g = new u9.j();
            return;
        }
        dVar.a();
        u9.b0 b0VarTrack2 = mVar.track(dVar.c(), 5);
        this.f37419g = b0VarTrack2;
        b0VarTrack2.e(new v0.b().U(dVar.b()).g0(MimeTypes.APPLICATION_ID3).G());
    }

    public long i() {
        return this.f37429q;
    }

    @Override // ea.m
    public void seek() {
        this.f37431s = C.TIME_UNSET;
        o();
    }

    public i(boolean z10, String str) {
        this.f37414b = new ob.c0(new byte[7]);
        this.f37415c = new ob.d0(Arrays.copyOf(f37412v, 10));
        q();
        this.f37425m = -1;
        this.f37426n = -1;
        this.f37429q = C.TIME_UNSET;
        this.f37431s = C.TIME_UNSET;
        this.f37413a = z10;
        this.f37416d = str;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
