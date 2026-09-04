package u3;

import androidx.media3.common.ParserException;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f54054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w1.u f54056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.t f54057d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o0 f54058e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f54059f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private t1.o f54060g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f54061h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f54062i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f54063j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f54064k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f54065l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f54066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f54067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f54068o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f54069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f54070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f54071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f54072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f54073t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f54074u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private String f54075v;

    public s(String str, int i10) {
        this.f54054a = str;
        this.f54055b = i10;
        w1.u uVar = new w1.u(UserVerificationMethods.USER_VERIFY_ALL);
        this.f54056c = uVar;
        this.f54057d = new w1.t(uVar.e());
        this.f54065l = C.TIME_UNSET;
    }

    private static long a(w1.t tVar) {
        return tVar.h((tVar.h(2) + 1) * 8);
    }

    private void f(w1.t tVar) throws ParserException {
        if (!tVar.g()) {
            this.f54066m = true;
            k(tVar);
        } else if (!this.f54066m) {
            return;
        }
        if (this.f54067n != 0) {
            throw ParserException.a(null, null);
        }
        if (this.f54068o != 0) {
            throw ParserException.a(null, null);
        }
        j(tVar, i(tVar));
        if (this.f54070q) {
            tVar.r((int) this.f54071r);
        }
    }

    private int g(w1.t tVar) throws ParserException {
        int iB = tVar.b();
        o2.a.b bVarD = o2.a.d(tVar, true);
        this.f54075v = bVarD.f47966c;
        this.f54072s = bVarD.f47964a;
        this.f54074u = bVarD.f47965b;
        return iB - tVar.b();
    }

    private void h(w1.t tVar) {
        int iH = tVar.h(3);
        this.f54069p = iH;
        if (iH == 0) {
            tVar.r(8);
            return;
        }
        if (iH == 1) {
            tVar.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            tVar.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            tVar.r(1);
        }
    }

    private int i(w1.t tVar) throws ParserException {
        int iH;
        if (this.f54069p != 0) {
            throw ParserException.a(null, null);
        }
        int i10 = 0;
        do {
            iH = tVar.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void j(w1.t tVar, int i10) {
        int iE = tVar.e();
        if ((iE & 7) == 0) {
            this.f54056c.T(iE >> 3);
        } else {
            tVar.i(this.f54056c.e(), 0, i10 * 8);
            this.f54056c.T(0);
        }
        this.f54058e.c(this.f54056c, i10);
        w1.a.g(this.f54065l != C.TIME_UNSET);
        this.f54058e.e(this.f54065l, 1, i10, 0, null);
        this.f54065l += this.f54073t;
    }

    private void k(w1.t tVar) throws ParserException {
        boolean zG;
        int iH = tVar.h(1);
        int iH2 = iH == 1 ? tVar.h(1) : 0;
        this.f54067n = iH2;
        if (iH2 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 1) {
            a(tVar);
        }
        if (!tVar.g()) {
            throw ParserException.a(null, null);
        }
        this.f54068o = tVar.h(6);
        int iH3 = tVar.h(4);
        int iH4 = tVar.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw ParserException.a(null, null);
        }
        if (iH == 0) {
            int iE = tVar.e();
            int iG = g(tVar);
            tVar.p(iE);
            byte[] bArr = new byte[(iG + 7) / 8];
            tVar.i(bArr, 0, iG);
            t1.o oVarK = new t1.o.b().a0(this.f54059f).o0(MimeTypes.AUDIO_AAC).O(this.f54075v).N(this.f54074u).p0(this.f54072s).b0(Collections.singletonList(bArr)).e0(this.f54054a).m0(this.f54055b).K();
            if (!oVarK.equals(this.f54060g)) {
                this.f54060g = oVarK;
                this.f54073t = 1024000000 / ((long) oVarK.C);
                this.f54058e.b(oVarK);
            }
        } else {
            tVar.r(((int) a(tVar)) - g(tVar));
        }
        h(tVar);
        boolean zG2 = tVar.g();
        this.f54070q = zG2;
        this.f54071r = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f54071r = a(tVar);
            } else {
                do {
                    zG = tVar.g();
                    this.f54071r = (this.f54071r << 8) + ((long) tVar.h(8));
                } while (zG);
            }
        }
        if (tVar.g()) {
            tVar.r(8);
        }
    }

    private void l(int i10) {
        this.f54056c.P(i10);
        this.f54057d.n(this.f54056c.e());
    }

    @Override // u3.m
    public void b(w1.u uVar) throws ParserException {
        w1.a.i(this.f54058e);
        while (uVar.a() > 0) {
            int i10 = this.f54061h;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iG = uVar.G();
                    if ((iG & 224) == 224) {
                        this.f54064k = iG;
                        this.f54061h = 2;
                    } else if (iG != 86) {
                        this.f54061h = 0;
                    }
                } else if (i10 == 2) {
                    int iG2 = ((this.f54064k & (-225)) << 8) | uVar.G();
                    this.f54063j = iG2;
                    if (iG2 > this.f54056c.e().length) {
                        l(this.f54063j);
                    }
                    this.f54062i = 0;
                    this.f54061h = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(uVar.a(), this.f54063j - this.f54062i);
                    uVar.l(this.f54057d.f55837a, this.f54062i, iMin);
                    int i11 = this.f54062i + iMin;
                    this.f54062i = i11;
                    if (i11 == this.f54063j) {
                        this.f54057d.p(0);
                        f(this.f54057d);
                        this.f54061h = 0;
                    }
                }
            } else if (uVar.G() == 86) {
                this.f54061h = 1;
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f54065l = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f54058e = rVar.track(dVar.c(), 1);
        this.f54059f = dVar.b();
    }

    @Override // u3.m
    public void seek() {
        this.f54061h = 0;
        this.f54065l = C.TIME_UNSET;
        this.f54066m = false;
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
