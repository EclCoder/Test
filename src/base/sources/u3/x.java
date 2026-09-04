package u3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class x implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private t1.o f54122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private w1.z f54123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private o0 f54124c;

    public x(String str) {
        this.f54122a = new t1.o.b().o0(str).K();
    }

    private void c() {
        w1.a.i(this.f54123b);
        w1.c0.h(this.f54124c);
    }

    @Override // u3.d0
    public void a(w1.z zVar, o2.r rVar, k0.d dVar) {
        this.f54123b = zVar;
        dVar.a();
        o0 o0VarTrack = rVar.track(dVar.c(), 5);
        this.f54124c = o0VarTrack;
        o0VarTrack.b(this.f54122a);
    }

    @Override // u3.d0
    public void b(w1.u uVar) {
        c();
        long jE = this.f54123b.e();
        long jF = this.f54123b.f();
        if (jE == C.TIME_UNSET || jF == C.TIME_UNSET) {
            return;
        }
        t1.o oVar = this.f54122a;
        if (jF != oVar.f52762s) {
            t1.o oVarK = oVar.a().s0(jF).K();
            this.f54122a = oVarK;
            this.f54124c.b(oVarK);
        }
        int iA = uVar.a();
        this.f54124c.c(uVar, iA);
        this.f54124c.e(jE, 1, iA, 0, null);
    }
}
