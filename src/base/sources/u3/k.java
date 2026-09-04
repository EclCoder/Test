package u3;

import androidx.media3.common.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicInteger;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w1.u f53886a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f53888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f53889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f53890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private o0 f53891f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f53893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f53894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f53895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private t1.o f53896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f53897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f53898m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f53892g = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f53901p = C.TIME_UNSET;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicInteger f53887b = new AtomicInteger();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f53899n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f53900o = -1;

    public k(String str, int i10, int i11) {
        this.f53886a = new w1.u(new byte[i11]);
        this.f53888c = str;
        this.f53889d = i10;
    }

    private boolean a(w1.u uVar, byte[] bArr, int i10) {
        int iMin = Math.min(uVar.a(), i10 - this.f53893h);
        uVar.l(bArr, this.f53893h, iMin);
        int i11 = this.f53893h + iMin;
        this.f53893h = i11;
        return i11 == i10;
    }

    private void f() {
        byte[] bArrE = this.f53886a.e();
        if (this.f53896k == null) {
            t1.o oVarH = o2.o.h(bArrE, this.f53890e, this.f53888c, this.f53889d, null);
            this.f53896k = oVarH;
            this.f53891f.b(oVarH);
        }
        this.f53897l = o2.o.b(bArrE);
        this.f53895j = com.google.common.primitives.g.d(w1.c0.M0(o2.o.g(bArrE), this.f53896k.C));
    }

    private void g() throws ParserException {
        o2.o.b bVarI = o2.o.i(this.f53886a.e());
        j(bVarI);
        this.f53897l = bVarI.f48131d;
        long j10 = bVarI.f48132e;
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        this.f53895j = j10;
    }

    private void h() throws ParserException {
        o2.o.b bVarK = o2.o.k(this.f53886a.e(), this.f53887b);
        if (this.f53898m == 3) {
            j(bVarK);
        }
        this.f53897l = bVarK.f48131d;
        long j10 = bVarK.f48132e;
        if (j10 == C.TIME_UNSET) {
            j10 = 0;
        }
        this.f53895j = j10;
    }

    private boolean i(w1.u uVar) {
        while (uVar.a() > 0) {
            int i10 = this.f53894i << 8;
            this.f53894i = i10;
            int iG = i10 | uVar.G();
            this.f53894i = iG;
            int iC = o2.o.c(iG);
            this.f53898m = iC;
            if (iC != 0) {
                byte[] bArrE = this.f53886a.e();
                int i11 = this.f53894i;
                bArrE[0] = (byte) ((i11 >> 24) & 255);
                bArrE[1] = (byte) ((i11 >> 16) & 255);
                bArrE[2] = (byte) ((i11 >> 8) & 255);
                bArrE[3] = (byte) (i11 & 255);
                this.f53893h = 4;
                this.f53894i = 0;
                return true;
            }
        }
        return false;
    }

    private void j(o2.o.b bVar) {
        int i10;
        int i11 = bVar.f48129b;
        if (i11 == -2147483647 || (i10 = bVar.f48130c) == -1) {
            return;
        }
        t1.o oVar = this.f53896k;
        if (oVar != null && i10 == oVar.B && i11 == oVar.C && w1.c0.c(bVar.f48128a, oVar.f52757n)) {
            return;
        }
        t1.o oVar2 = this.f53896k;
        t1.o oVarK = (oVar2 == null ? new t1.o.b() : oVar2.a()).a0(this.f53890e).o0(bVar.f48128a).N(bVar.f48130c).p0(bVar.f48129b).e0(this.f53888c).m0(this.f53889d).K();
        this.f53896k = oVarK;
        this.f53891f.b(oVarK);
    }

    @Override // u3.m
    public void b(w1.u uVar) throws ParserException {
        w1.a.i(this.f53891f);
        while (uVar.a() > 0) {
            switch (this.f53892g) {
                case 0:
                    if (i(uVar)) {
                        int i10 = this.f53898m;
                        if (i10 == 3 || i10 == 4) {
                            this.f53892g = 4;
                        } else if (i10 != 1) {
                            this.f53892g = 2;
                        } else {
                            this.f53892g = 1;
                        }
                    }
                    break;
                case 1:
                    if (a(uVar, this.f53886a.e(), 18)) {
                        f();
                        this.f53886a.T(0);
                        this.f53891f.c(this.f53886a, 18);
                        this.f53892g = 6;
                    }
                    break;
                case 2:
                    if (a(uVar, this.f53886a.e(), 7)) {
                        this.f53899n = o2.o.j(this.f53886a.e());
                        this.f53892g = 3;
                    }
                    break;
                case 3:
                    if (a(uVar, this.f53886a.e(), this.f53899n)) {
                        g();
                        this.f53886a.T(0);
                        this.f53891f.c(this.f53886a, this.f53899n);
                        this.f53892g = 6;
                    }
                    break;
                case 4:
                    if (a(uVar, this.f53886a.e(), 6)) {
                        int iL = o2.o.l(this.f53886a.e());
                        this.f53900o = iL;
                        int i11 = this.f53893h;
                        if (i11 > iL) {
                            int i12 = i11 - iL;
                            this.f53893h = i11 - i12;
                            uVar.T(uVar.f() - i12);
                        }
                        this.f53892g = 5;
                    }
                    break;
                case 5:
                    if (a(uVar, this.f53886a.e(), this.f53900o)) {
                        h();
                        this.f53886a.T(0);
                        this.f53891f.c(this.f53886a, this.f53900o);
                        this.f53892g = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(uVar.a(), this.f53897l - this.f53893h);
                    this.f53891f.c(uVar, iMin);
                    int i13 = this.f53893h + iMin;
                    this.f53893h = i13;
                    if (i13 == this.f53897l) {
                        w1.a.g(this.f53901p != C.TIME_UNSET);
                        this.f53891f.e(this.f53901p, this.f53898m == 4 ? 0 : 1, this.f53897l, 0, null);
                        this.f53901p += this.f53895j;
                        this.f53892g = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // u3.m
    public void c(long j10, int i10) {
        this.f53901p = j10;
    }

    @Override // u3.m
    public void d(o2.r rVar, k0.d dVar) {
        dVar.a();
        this.f53890e = dVar.b();
        this.f53891f = rVar.track(dVar.c(), 1);
    }

    @Override // u3.m
    public void seek() {
        this.f53892g = 0;
        this.f53893h = 0;
        this.f53894i = 0;
        this.f53901p = C.TIME_UNSET;
        this.f53887b.set(0);
    }

    @Override // u3.m
    public void e(boolean z10) {
    }
}
