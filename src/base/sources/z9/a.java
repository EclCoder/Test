package z9;

import com.google.android.exoplayer2.v0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.d0;
import u9.k;
import u9.l;
import u9.m;
import u9.y;
import u9.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f58665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f58666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f58667d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f58668e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private na.b f58670g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f58671h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private c f58672i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ca.k f58673j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0 f58664a = new d0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f58669f = -1;

    private void a(l lVar) {
        this.f58664a.Q(2);
        lVar.peekFully(this.f58664a.e(), 0, 2);
        lVar.advancePeekPosition(this.f58664a.N() - 2);
    }

    private void e() {
        g(new ha.a.b[0]);
        ((m) ob.a.e(this.f58665b)).endTracks();
        this.f58665b.c(new z.b(C.TIME_UNSET));
        this.f58666c = 6;
    }

    private static na.b f(String str, long j10) {
        b bVarA;
        if (j10 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j10);
    }

    private void g(ha.a.b... bVarArr) {
        ((m) ob.a.e(this.f58665b)).track(UserVerificationMethods.USER_VERIFY_ALL, 4).e(new v0.b().M("image/jpeg").Z(new ha.a(bVarArr)).G());
    }

    private int h(l lVar) {
        this.f58664a.Q(2);
        lVar.peekFully(this.f58664a.e(), 0, 2);
        return this.f58664a.N();
    }

    private void i(l lVar) {
        this.f58664a.Q(2);
        lVar.readFully(this.f58664a.e(), 0, 2);
        int iN = this.f58664a.N();
        this.f58667d = iN;
        if (iN == 65498) {
            if (this.f58669f != -1) {
                this.f58666c = 4;
                return;
            } else {
                e();
                return;
            }
        }
        if ((iN < 65488 || iN > 65497) && iN != 65281) {
            this.f58666c = 1;
        }
    }

    private void j(l lVar) {
        String strB;
        if (this.f58667d == 65505) {
            d0 d0Var = new d0(this.f58668e);
            lVar.readFully(d0Var.e(), 0, this.f58668e);
            if (this.f58670g == null && "http://ns.adobe.com/xap/1.0/".equals(d0Var.B()) && (strB = d0Var.B()) != null) {
                na.b bVarF = f(strB, lVar.getLength());
                this.f58670g = bVarF;
                if (bVarF != null) {
                    this.f58669f = bVarF.f46951d;
                }
            }
        } else {
            lVar.skipFully(this.f58668e);
        }
        this.f58666c = 0;
    }

    private void k(l lVar) {
        this.f58664a.Q(2);
        lVar.readFully(this.f58664a.e(), 0, 2);
        this.f58668e = this.f58664a.N() - 2;
        this.f58666c = 2;
    }

    private void l(l lVar) {
        if (!lVar.peekFully(this.f58664a.e(), 0, 1, true)) {
            e();
            return;
        }
        lVar.resetPeekPosition();
        if (this.f58673j == null) {
            this.f58673j = new ca.k();
        }
        c cVar = new c(lVar, this.f58669f);
        this.f58672i = cVar;
        if (!this.f58673j.d(cVar)) {
            e();
        } else {
            this.f58673j.b(new d(this.f58669f, (m) ob.a.e(this.f58665b)));
            m();
        }
    }

    private void m() {
        g((ha.a.b) ob.a.e(this.f58670g));
        this.f58666c = 5;
    }

    @Override // u9.k
    public void b(m mVar) {
        this.f58665b = mVar;
    }

    @Override // u9.k
    public int c(l lVar, y yVar) {
        int i10 = this.f58666c;
        if (i10 == 0) {
            i(lVar);
            return 0;
        }
        if (i10 == 1) {
            k(lVar);
            return 0;
        }
        if (i10 == 2) {
            j(lVar);
            return 0;
        }
        if (i10 == 4) {
            long position = lVar.getPosition();
            long j10 = this.f58669f;
            if (position != j10) {
                yVar.f54333a = j10;
                return 1;
            }
            l(lVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f58672i == null || lVar != this.f58671h) {
            this.f58671h = lVar;
            this.f58672i = new c(lVar, this.f58669f);
        }
        int iC = ((ca.k) ob.a.e(this.f58673j)).c(this.f58672i, yVar);
        if (iC == 1) {
            yVar.f54333a += this.f58669f;
        }
        return iC;
    }

    @Override // u9.k
    public boolean d(l lVar) {
        if (h(lVar) != 65496) {
            return false;
        }
        int iH = h(lVar);
        this.f58667d = iH;
        if (iH == 65504) {
            a(lVar);
            this.f58667d = h(lVar);
        }
        if (this.f58667d != 65505) {
            return false;
        }
        lVar.advancePeekPosition(2);
        this.f58664a.Q(6);
        lVar.peekFully(this.f58664a.e(), 0, 6);
        return this.f58664a.J() == 1165519206 && this.f58664a.N() == 0;
    }

    @Override // u9.k
    public void release() {
        ca.k kVar = this.f58673j;
        if (kVar != null) {
            kVar.release();
        }
    }

    @Override // u9.k
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f58666c = 0;
            this.f58673j = null;
        } else if (this.f58666c == 5) {
            ((ca.k) ob.a.e(this.f58673j)).seek(j10, j11);
        }
    }
}
