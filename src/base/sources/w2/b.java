package w2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import i3.m;
import o2.i0;
import o2.j0;
import o2.p;
import o2.q;
import o2.r;
import t1.o;
import w1.u;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class b implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f55865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f55867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f55868e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d3.a f55870g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q f55871h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f55872i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private m f55873j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f55864a = new u(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f55869f = -1;

    private void a(q qVar) {
        this.f55864a.P(2);
        qVar.peekFully(this.f55864a.e(), 0, 2);
        qVar.advancePeekPosition(this.f55864a.M() - 2);
    }

    private void g() {
        ((r) w1.a.e(this.f55865b)).endTracks();
        this.f55865b.d(new j0.b(C.TIME_UNSET));
        this.f55866c = 6;
    }

    private static d3.a h(String str, long j10) {
        c cVarA;
        if (j10 == -1 || (cVarA = f.a(str)) == null) {
            return null;
        }
        return cVarA.a(j10);
    }

    private void i(d3.a aVar) {
        ((r) w1.a.e(this.f55865b)).track(UserVerificationMethods.USER_VERIFY_ALL, 4).b(new o.b().Q("image/jpeg").h0(new t1.u(aVar)).K());
    }

    private int j(q qVar) {
        this.f55864a.P(2);
        qVar.peekFully(this.f55864a.e(), 0, 2);
        return this.f55864a.M();
    }

    private void k(q qVar) {
        this.f55864a.P(2);
        qVar.readFully(this.f55864a.e(), 0, 2);
        int iM = this.f55864a.M();
        this.f55867d = iM;
        if (iM == 65498) {
            if (this.f55869f != -1) {
                this.f55866c = 4;
                return;
            } else {
                g();
                return;
            }
        }
        if ((iM < 65488 || iM > 65497) && iM != 65281) {
            this.f55866c = 1;
        }
    }

    private void l(q qVar) {
        String strA;
        if (this.f55867d == 65505) {
            u uVar = new u(this.f55868e);
            qVar.readFully(uVar.e(), 0, this.f55868e);
            if (this.f55870g == null && "http://ns.adobe.com/xap/1.0/".equals(uVar.A()) && (strA = uVar.A()) != null) {
                d3.a aVarH = h(strA, qVar.getLength());
                this.f55870g = aVarH;
                if (aVarH != null) {
                    this.f55869f = aVarH.f36168d;
                }
            }
        } else {
            qVar.skipFully(this.f55868e);
        }
        this.f55866c = 0;
    }

    private void m(q qVar) {
        this.f55864a.P(2);
        qVar.readFully(this.f55864a.e(), 0, 2);
        this.f55868e = this.f55864a.M() - 2;
        this.f55866c = 2;
    }

    private void n(q qVar) {
        if (!qVar.peekFully(this.f55864a.e(), 0, 1, true)) {
            g();
            return;
        }
        qVar.resetPeekPosition();
        if (this.f55873j == null) {
            this.f55873j = new m(l3.r.a.f43873a, 8);
        }
        d dVar = new d(qVar, this.f55869f);
        this.f55872i = dVar;
        if (!this.f55873j.d(dVar)) {
            g();
        } else {
            this.f55873j.c(new e(this.f55869f, (r) w1.a.e(this.f55865b)));
            o();
        }
    }

    private void o() {
        i((d3.a) w1.a.e(this.f55870g));
        this.f55866c = 5;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) {
        int i10 = this.f55866c;
        if (i10 == 0) {
            k(qVar);
            return 0;
        }
        if (i10 == 1) {
            m(qVar);
            return 0;
        }
        if (i10 == 2) {
            l(qVar);
            return 0;
        }
        if (i10 == 4) {
            long position = qVar.getPosition();
            long j10 = this.f55869f;
            if (position != j10) {
                i0Var.f48076a = j10;
                return 1;
            }
            n(qVar);
            return 0;
        }
        if (i10 != 5) {
            if (i10 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f55872i == null || qVar != this.f55871h) {
            this.f55871h = qVar;
            this.f55872i = new d(qVar, this.f55869f);
        }
        int iB = ((m) w1.a.e(this.f55873j)).b(this.f55872i, i0Var);
        if (iB == 1) {
            i0Var.f48076a += this.f55869f;
        }
        return iB;
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f55865b = rVar;
    }

    @Override // o2.p
    public boolean d(q qVar) {
        if (j(qVar) != 65496) {
            return false;
        }
        int iJ = j(qVar);
        this.f55867d = iJ;
        if (iJ == 65504) {
            a(qVar);
            this.f55867d = j(qVar);
        }
        if (this.f55867d != 65505) {
            return false;
        }
        qVar.advancePeekPosition(2);
        this.f55864a.P(6);
        qVar.peekFully(this.f55864a.e(), 0, 6);
        return this.f55864a.I() == 1165519206 && this.f55864a.M() == 0;
    }

    @Override // o2.p
    public void release() {
        m mVar = this.f55873j;
        if (mVar != null) {
            mVar.release();
        }
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        if (j10 == 0) {
            this.f55866c = 0;
            this.f55873j = null;
        } else if (this.f55866c == 5) {
            ((m) w1.a.e(this.f55873j)).seek(j10, j11);
        }
    }
}
