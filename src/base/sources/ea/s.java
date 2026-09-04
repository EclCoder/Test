package ea;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ob.d0 f37598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ob.c0 f37599c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u9.b0 f37600d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f37601e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f37602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f37603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f37604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f37605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f37606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f37607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f37608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f37609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f37610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f37611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f37612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f37613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f37614r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f37615s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37616t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f37617u;

    public s(String str) {
        this.f37597a = str;
        ob.d0 d0Var = new ob.d0(UserVerificationMethods.USER_VERIFY_ALL);
        this.f37598b = d0Var;
        this.f37599c = new ob.c0(d0Var.e());
        this.f37607k = C.TIME_UNSET;
    }

    private static long a(ob.c0 c0Var) {
        return c0Var.h((c0Var.h(2) + 1) * 8);
    }

    private void e(ob.c0 c0Var) throws ParserException {
        if (!c0Var.g()) {
            this.f37608l = true;
            j(c0Var);
        } else if (!this.f37608l) {
            return;
        }
        if (this.f37609m != 0) {
            throw ParserException.a(null, null);
        }
        if (this.f37610n != 0) {
            throw ParserException.a(null, null);
        }
        i(c0Var, h(c0Var));
        if (this.f37612p) {
            c0Var.r((int) this.f37613q);
        }
    }

    private int f(ob.c0 c0Var) throws ParserException {
        int iB = c0Var.b();
        q9.a.b bVarE = q9.a.e(c0Var, true);
        this.f37617u = bVarE.f50441c;
        this.f37614r = bVarE.f50439a;
        this.f37616t = bVarE.f50440b;
        return iB - c0Var.b();
    }

    private void g(ob.c0 c0Var) {
        int iH = c0Var.h(3);
        this.f37611o = iH;
        if (iH == 0) {
            c0Var.r(8);
            return;
        }
        if (iH == 1) {
            c0Var.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            c0Var.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            c0Var.r(1);
        }
    }

    private int h(ob.c0 c0Var) throws ParserException {
        int iH;
        if (this.f37611o != 0) {
            throw ParserException.a(null, null);
        }
        int i10 = 0;
        do {
            iH = c0Var.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void i(ob.c0 c0Var, int i10) {
        int iE = c0Var.e();
        if ((iE & 7) == 0) {
            this.f37598b.U(iE >> 3);
        } else {
            c0Var.i(this.f37598b.e(), 0, i10 * 8);
            this.f37598b.U(0);
        }
        this.f37600d.c(this.f37598b, i10);
        long j10 = this.f37607k;
        if (j10 != C.TIME_UNSET) {
            this.f37600d.f(j10, 1, i10, 0, null);
            this.f37607k += this.f37615s;
        }
    }

    private void j(ob.c0 c0Var) throws ParserException {
        boolean zG;
        int iH = c0Var.h(1);
        int iH2 = iH == 1 ? c0Var.h(1) : 0;
        this.f37609m = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            a(c0Var);
        }
        if (!c0Var.g()) {
            throw ParserException.a(null, null);
        }
        this.f37610n = c0Var.h(6);
        int iH3 = c0Var.h(4);
        int iH4 = c0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = c0Var.e();
            int iF = f(c0Var);
            c0Var.p(iE);
            byte[] bArr = new byte[(iF + 7) / 8];
            c0Var.i(bArr, 0, iF);
            v0 v0VarG = new v0.b().U(this.f37601e).g0(MimeTypes.AUDIO_AAC).K(this.f37617u).J(this.f37616t).h0(this.f37614r).V(Collections.singletonList(bArr)).X(this.f37597a).G();
            if (!v0VarG.equals(this.f37602f)) {
                this.f37602f = v0VarG;
                this.f37615s = 1024000000 / ((long) v0VarG.f18882z);
                this.f37600d.e(v0VarG);
            }
        } else {
            c0Var.r(((int) a(c0Var)) - f(c0Var));
        }
        g(c0Var);
        boolean zG2 = c0Var.g();
        this.f37612p = zG2;
        this.f37613q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f37613q = a(c0Var);
            } else {
                do {
                    zG = c0Var.g();
                    this.f37613q = (this.f37613q << 8) + ((long) c0Var.h(8));
                } while (zG);
            }
        }
        if (c0Var.g()) {
            c0Var.r(8);
        }
    }

    private void k(int i10) {
        this.f37598b.Q(i10);
        this.f37599c.n(this.f37598b.e());
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) throws ParserException {
        ob.a.i(this.f37600d);
        while (d0Var.a() > 0) {
            int i10 = this.f37603g;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = d0Var.H();
                    if ((iH & 224) == 224) {
                        this.f37606j = iH;
                        this.f37603g = 2;
                    } else if (iH != 86) {
                        this.f37603g = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f37606j & (-225)) << 8) | d0Var.H();
                    this.f37605i = iH2;
                    if (iH2 > this.f37598b.e().length) {
                        k(this.f37605i);
                    }
                    this.f37604h = 0;
                    this.f37603g = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d0Var.a(), this.f37605i - this.f37604h);
                    d0Var.l(this.f37599c.f48353a, this.f37604h, iMin);
                    int i11 = this.f37604h + iMin;
                    this.f37604h = i11;
                    if (i11 == this.f37605i) {
                        this.f37599c.p(0);
                        e(this.f37599c);
                        this.f37603g = 0;
                    }
                }
            } else if (d0Var.H() == 86) {
                this.f37603g = 1;
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if (j10 != C.TIME_UNSET) {
            this.f37607k = j10;
        }
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        dVar.a();
        this.f37600d = mVar.track(dVar.c(), 1);
        this.f37601e = dVar.b();
    }

    @Override // ea.m
    public void seek() {
        this.f37603g = 0;
        this.f37607k = C.TIME_UNSET;
        this.f37608l = false;
    }

    @Override // ea.m
    public void packetFinished() {
    }
}
