package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u9.b0[] f37462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f37465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f37466f = C.TIME_UNSET;

    public l(List list) {
        this.f37461a = list;
        this.f37462b = new u9.b0[list.size()];
    }

    private boolean a(ob.d0 d0Var, int i10) {
        if (d0Var.a() == 0) {
            return false;
        }
        if (d0Var.H() != i10) {
            this.f37463c = false;
        }
        this.f37464d--;
        return this.f37463c;
    }

    @Override // ea.m
    public void b(ob.d0 d0Var) {
        if (this.f37463c) {
            if (this.f37464d != 2 || a(d0Var, 32)) {
                if (this.f37464d != 1 || a(d0Var, 0)) {
                    int iF = d0Var.f();
                    int iA = d0Var.a();
                    for (u9.b0 b0Var : this.f37462b) {
                        d0Var.U(iF);
                        b0Var.c(d0Var, iA);
                    }
                    this.f37465e += iA;
                }
            }
        }
    }

    @Override // ea.m
    public void c(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f37463c = true;
        if (j10 != C.TIME_UNSET) {
            this.f37466f = j10;
        }
        this.f37465e = 0;
        this.f37464d = 2;
    }

    @Override // ea.m
    public void d(u9.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f37462b.length; i10++) {
            i0.a aVar = (i0.a) this.f37461a.get(i10);
            dVar.a();
            u9.b0 b0VarTrack = mVar.track(dVar.c(), 3);
            b0VarTrack.e(new v0.b().U(dVar.b()).g0(MimeTypes.APPLICATION_DVBSUBS).V(Collections.singletonList(aVar.f37436c)).X(aVar.f37434a).G());
            this.f37462b[i10] = b0VarTrack;
        }
    }

    @Override // ea.m
    public void packetFinished() {
        if (this.f37463c) {
            if (this.f37466f != C.TIME_UNSET) {
                for (u9.b0 b0Var : this.f37462b) {
                    b0Var.f(this.f37466f, 1, this.f37465e, 0, null);
                }
            }
            this.f37463c = false;
        }
    }

    @Override // ea.m
    public void seek() {
        this.f37463c = false;
        this.f37466f = C.TIME_UNSET;
    }
}
