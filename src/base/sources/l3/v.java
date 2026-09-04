package l3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import o2.o0;
import w1.c0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class v implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o0 f43886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r.a f43887b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private r f43893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private t1.o f43894i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f43888c = new d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f43890e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f43891f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte[] f43892g = c0.f55774f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w1.u f43889d = new w1.u();

    public v(o0 o0Var, r.a aVar) {
        this.f43886a = o0Var;
        this.f43887b = aVar;
    }

    private void h(int i10) {
        int length = this.f43892g.length;
        int i11 = this.f43891f;
        if (length - i11 >= i10) {
            return;
        }
        int i12 = i11 - this.f43890e;
        int iMax = Math.max(i12 * 2, i10 + i12);
        byte[] bArr = this.f43892g;
        byte[] bArr2 = iMax <= bArr.length ? bArr : new byte[iMax];
        System.arraycopy(bArr, this.f43890e, bArr2, 0, i12);
        this.f43890e = 0;
        this.f43891f = i12;
        this.f43892g = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(e eVar, long j10, int i10) {
        w1.a.i(this.f43894i);
        byte[] bArrA = this.f43888c.a(eVar.f43846a, eVar.f43848c);
        this.f43889d.Q(bArrA);
        this.f43886a.c(this.f43889d, bArrA.length);
        long j11 = eVar.f43847b;
        if (j11 == C.TIME_UNSET) {
            w1.a.g(this.f43894i.f52762s == Long.MAX_VALUE);
        } else {
            long j12 = this.f43894i.f52762s;
            j10 = j12 == Long.MAX_VALUE ? j10 + j11 : j11 + j12;
        }
        this.f43886a.e(j10, i10, bArrA.length, 0, null);
    }

    @Override // o2.o0
    public void b(t1.o oVar) {
        w1.a.e(oVar.f52757n);
        w1.a.a(t1.v.f(oVar.f52757n) == 3);
        if (!oVar.equals(this.f43894i)) {
            this.f43894i = oVar;
            this.f43893h = this.f43887b.a(oVar) ? this.f43887b.b(oVar) : null;
        }
        if (this.f43893h == null) {
            this.f43886a.b(oVar);
        } else {
            this.f43886a.b(oVar.a().o0("application/x-media3-cues").O(oVar.f52757n).s0(Long.MAX_VALUE).S(this.f43887b.c(oVar)).K());
        }
    }

    @Override // o2.o0
    public int d(t1.g gVar, int i10, boolean z10, int i11) throws EOFException {
        if (this.f43893h == null) {
            return this.f43886a.d(gVar, i10, z10, i11);
        }
        h(i10);
        int i12 = gVar.read(this.f43892g, this.f43891f, i10);
        if (i12 != -1) {
            this.f43891f += i12;
            return i12;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // o2.o0
    public void e(final long j10, final int i10, int i11, int i12, o0.a aVar) {
        if (this.f43893h == null) {
            this.f43886a.e(j10, i10, i11, i12, aVar);
            return;
        }
        w1.a.b(aVar == null, "DRM on subtitles is not supported");
        int i13 = (this.f43891f - i12) - i11;
        this.f43893h.a(this.f43892g, i13, i11, r.b.b(), new w1.h() { // from class: l3.u
            @Override // w1.h
            public final void accept(Object obj) {
                this.f43883a.i((e) obj, j10, i10);
            }
        });
        int i14 = i13 + i11;
        this.f43890e = i14;
        if (i14 == this.f43891f) {
            this.f43890e = 0;
            this.f43891f = 0;
        }
    }

    @Override // o2.o0
    public void f(w1.u uVar, int i10, int i11) {
        if (this.f43893h == null) {
            this.f43886a.f(uVar, i10, i11);
            return;
        }
        h(i10);
        uVar.l(this.f43892g, this.f43891f, i10);
        this.f43891f += i10;
    }

    public void j() {
        r rVar = this.f43893h;
        if (rVar != null) {
            rVar.reset();
        }
    }
}
