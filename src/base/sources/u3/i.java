package u3;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.Collections;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class i implements m {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final byte[] f53832w = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f53833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w1.t f53834b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f53835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f53836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f53837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f53838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f53839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private o0 f53840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f53842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f53843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f53844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f53845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53846n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53847o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f53848p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f53849q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f53850r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f53851s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f53852t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private o0 f53853u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f53854v;

    public i(boolean z10) {
        this(z10, null, 0);
    }

    private void a() {
        w1.a.e(this.f53839g);
        w1.c0.h(this.f53853u);
        w1.c0.h(this.f53840h);
    }

    private void f(w1.u uVar) {
        if (uVar.a() == 0) {
            return;
        }
        this.f53834b.f55837a[0] = uVar.e()[uVar.f()];
        this.f53834b.p(2);
        int iH = this.f53834b.h(4);
        int i10 = this.f53847o;
        if (i10 != -1 && iH != i10) {
            p();
            return;
        }
        if (!this.f53845m) {
            this.f53845m = true;
            this.f53846n = this.f53848p;
            this.f53847o = iH;
        }
        s();
    }

    private boolean g(w1.u uVar, int i10) {
        uVar.T(i10 + 1);
        if (!v(uVar, this.f53834b.f55837a, 1)) {
            return false;
        }
        this.f53834b.p(4);
        int iH = this.f53834b.h(1);
        int i11 = this.f53846n;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f53847o != -1) {
            if (!v(uVar, this.f53834b.f55837a, 1)) {
                return true;
            }
            this.f53834b.p(2);
            if (this.f53834b.h(4) != this.f53847o) {
                return false;
            }
            uVar.T(i10 + 2);
        }
        if (!v(uVar, this.f53834b.f55837a, 4)) {
            return true;
        }
        this.f53834b.p(14);
        int iH2 = this.f53834b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrE = uVar.e();
        int iG = uVar.g();
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
            return k((byte) -1, bArrE[i13]) && ((bArrE[i13] & 8) >> 3) == iH;
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

    private boolean h(w1.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f53842j);
        uVar.l(bArr, this.f53842j, iMin);
        int i11 = this.f53842j + iMin;
        this.f53842j = i11;
        return i11 == i10;
    }

    private void i(w1.u uVar) {
        byte[] bArrE = uVar.e();
        int iF = uVar.f();
        int iG = uVar.g();
        while (iF < iG) {
            int i10 = iF + 1;
            byte b10 = bArrE[iF];
            int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (this.f53843k == 512 && k((byte) -1, (byte) i11) && (this.f53845m || g(uVar, iF - 1))) {
                this.f53848p = (b10 & 8) >> 3;
                this.f53844l = (b10 & 1) == 0;
                if (this.f53845m) {
                    s();
                } else {
                    q();
                }
                uVar.T(i10);
                return;
            }
            int i12 = this.f53843k;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f53843k = 768;
            } else if (i13 == 511) {
                this.f53843k = 512;
            } else if (i13 == 836) {
                this.f53843k = UserVerificationMethods.USER_VERIFY_ALL;
            } else if (i13 == 1075) {
                t();
                uVar.T(i10);
                return;
            } else if (i12 != 256) {
                this.f53843k = 256;
            }
            iF = i10;
        }
        uVar.T(iF);
    }

    private boolean k(byte b10, byte b11) {
        return l(((b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (b11 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static boolean l(int i10) {
        return (i10 & 65526) == 65520;
    }

    private void m() {
        this.f53834b.p(0);
        if (this.f53849q) {
            this.f53834b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f53834b.h(2) + 1;
            if (iH != 2) {
                w1.n.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f53834b.r(5);
            byte[] bArrA = o2.a.a(i10, this.f53847o, this.f53834b.h(3));
            o2.a.b bVarE = o2.a.e(bArrA);
            t1.o oVarK = new t1.o.b().a0(this.f53838f).o0(MimeTypes.AUDIO_AAC).O(bVarE.f47966c).N(bVarE.f47965b).p0(bVarE.f47964a).b0(Collections.singletonList(bArrA)).e0(this.f53836d).m0(this.f53837e).K();
            this.f53850r = 1024000000 / ((long) oVarK.C);
            this.f53839g.b(oVarK);
            this.f53849q = true;
        }
        this.f53834b.r(4);
        int iH2 = this.f53834b.h(13);
        int i11 = iH2 - 7;
        if (this.f53844l) {
            i11 = iH2 - 9;
        }
        u(this.f53839g, this.f53850r, 0, i11);
    }

    private void n() {
        this.f53840h.c(this.f53835c, 10);
        this.f53835c.T(6);
        u(this.f53840h, 0L, 10, this.f53835c.F() + 10);
    }

    private void o(w1.u uVar) {
        int iMin = Math.min(uVar.a(), this.f53851s - this.f53842j);
        this.f53853u.c(uVar, iMin);
        int i10 = this.f53842j + iMin;
        this.f53842j = i10;
        if (i10 == this.f53851s) {
            w1.a.g(this.f53852t != C.TIME_UNSET);
            this.f53853u.e(this.f53852t, 1, this.f53851s, 0, null);
            this.f53852t += this.f53854v;
            r();
        }
    }

    private void p() {
        this.f53845m = false;
        r();
    }

    private void q() {
        this.f53841i = 1;
        this.f53842j = 0;
    }

    private void r() {
        this.f53841i = 0;
        this.f53842j = 0;
        this.f53843k = 256;
    }

    private void s() {
        this.f53841i = 3;
        this.f53842j = 0;
    }

    private void t() {
        this.f53841i = 2;
        this.f53842j = f53832w.length;
        this.f53851s = 0;
        this.f53835c.T(0);
    }

    private void u(o0 o0Var, long j10, int i10, int i11) {
        this.f53841i = 4;
        this.f53842j = i10;
        this.f53853u = o0Var;
        this.f53854v = j10;
        this.f53851s = i11;
    }

    private boolean v(w1.u uVar, byte[] bArr, int i10) {
        if (uVar.a() < i10) {
            return false;
        }
        uVar.l(bArr, 0, i10);
        return true;
    }

    @Override // u3.m
    public void b(w1.u uVar) {
        a();
        while (uVar.a() > 0) {
            int i10 = this.f53841i;
            if (i10 == 0) {
                i(uVar);
            } else if (i10 == 1) {
                f(uVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (h(uVar, this.f53834b.f55837a, this.f53844l ? 7 : 5)) {
                        m();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    o(uVar);
                }
            } else if (h(uVar, this.f53835c.e(), 10)) {
                n();
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53852t = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53838f = dVar.b();
        o0 o0VarTrack = rVar.track(dVar.c(), 1);
        this.f53839g = o0VarTrack;
        this.f53853u = o0VarTrack;
        if (!this.f53833a) {
            this.f53840h = new o2.m();
            return;
        }
        dVar.a();
        o0 o0VarTrack2 = rVar.track(dVar.c(), 5);
        this.f53840h = o0VarTrack2;
        o0VarTrack2.b(new t1.o.b().a0(dVar.b()).o0(MimeTypes.APPLICATION_ID3).K());
    }

    public long j() {
        return this.f53850r;
    }

    @Override // u3.m
    public void seek() {
        this.f53852t = C.TIME_UNSET;
        p();
    }

    public i(boolean z10, String str, int i10) {
        this.f53834b = new w1.t(new byte[7]);
        this.f53835c = new w1.u(Arrays.copyOf(f53832w, 10));
        r();
        this.f53846n = -1;
        this.f53847o = -1;
        this.f53850r = C.TIME_UNSET;
        this.f53852t = C.TIME_UNSET;
        this.f53833a = z10;
        this.f53836d = str;
        this.f53837e = i10;
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
