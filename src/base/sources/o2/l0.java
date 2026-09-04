package o2;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f48110e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r f48111f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o0 f48112g;

    public l0(int i10, int i11, String str) {
        this.f48106a = i10;
        this.f48107b = i11;
        this.f48108c = str;
    }

    private void a(String str) {
        o0 o0VarTrack = this.f48111f.track(UserVerificationMethods.USER_VERIFY_ALL, 4);
        this.f48112g = o0VarTrack;
        o0VarTrack.b(new t1.o.b().o0(str).K());
        this.f48111f.endTracks();
        this.f48111f.d(new m0(C.TIME_UNSET));
        this.f48110e = 1;
    }

    private void g(q qVar) {
        int iA = ((o0) w1.a.e(this.f48112g)).a(qVar, UserVerificationMethods.USER_VERIFY_ALL, true);
        if (iA != -1) {
            this.f48109d += iA;
            return;
        }
        this.f48110e = 2;
        this.f48112g.e(0L, 1, this.f48109d, 0, null);
        this.f48109d = 0;
    }

    @Override // o2.p
    public int b(q qVar, i0 i0Var) {
        int i10 = this.f48110e;
        if (i10 == 1) {
            g(qVar);
            return 0;
        }
        if (i10 == 2) {
            return -1;
        }
        throw new IllegalStateException();
    }

    @Override // o2.p
    public void c(r rVar) {
        this.f48111f = rVar;
        a(this.f48108c);
    }

    @Override // o2.p
    public boolean d(q qVar) {
        w1.a.g((this.f48106a == -1 || this.f48107b == -1) ? false : true);
        w1.u uVar = new w1.u(this.f48107b);
        qVar.peekFully(uVar.e(), 0, this.f48107b);
        return uVar.M() == this.f48106a;
    }

    @Override // o2.p
    public void seek(long j10, long j11) {
        if (j10 == 0 || this.f48110e == 1) {
            this.f48110e = 1;
            this.f48109d = 0;
        }
    }

    @Override // o2.p
    public void release() {
    }
}
