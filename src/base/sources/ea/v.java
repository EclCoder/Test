package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ob.n0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v0 f37635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n0 f37636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private u9.b0 f37637c;

    public v(String str) {
        this.f37635a = new v0.b().g0(str).G();
    }

    private void c() {
        ob.a.i(this.f37636b);
        r0.j(this.f37637c);
    }

    @Override // ea.b0
    public void a(n0 n0Var, u9.m mVar, i0.d dVar) {
        this.f37636b = n0Var;
        dVar.a();
        u9.b0 b0VarTrack = mVar.track(dVar.c(), 5);
        this.f37637c = b0VarTrack;
        b0VarTrack.e(this.f37635a);
    }

    @Override // ea.b0
    public void b(ob.d0 d0Var) {
        c();
        long jD = this.f37636b.d();
        long jE = this.f37636b.e();
        if (jD == C.TIME_UNSET || jE == C.TIME_UNSET) {
            return;
        }
        v0 v0Var = this.f37635a;
        if (jE != v0Var.f18872p) {
            v0 v0VarG = v0Var.b().k0(jE).G();
            this.f37635a = v0VarG;
            this.f37637c.e(v0VarG);
        }
        int iA = d0Var.a();
        this.f37637c.c(d0Var, iA);
        this.f37637c.f(jD, 1, iA, 0, null);
    }
}
