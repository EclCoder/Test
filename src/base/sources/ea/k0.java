package ea;

import com.google.android.exoplayer2.v0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f37459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final u9.b0[] f37460b;

    public k0(List list) {
        this.f37459a = list;
        this.f37460b = new u9.b0[list.size()];
    }

    public void a(long j10, ob.d0 d0Var) {
        if (d0Var.a() < 9) {
            return;
        }
        int iQ = d0Var.q();
        int iQ2 = d0Var.q();
        int iH = d0Var.H();
        if (iQ == 434 && iQ2 == 1195456820 && iH == 3) {
            u9.b.b(j10, d0Var, this.f37460b);
        }
    }

    public void b(u9.m mVar, i0.d dVar) {
        for (int i10 = 0; i10 < this.f37460b.length; i10++) {
            dVar.a();
            u9.b0 b0VarTrack = mVar.track(dVar.c(), 3);
            v0 v0Var = (v0) this.f37459a.get(i10);
            String str = v0Var.f18868l;
            ob.a.b(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            b0VarTrack.e(new v0.b().U(dVar.b()).g0(str).i0(v0Var.f18860d).X(v0Var.f18859c).H(v0Var.D).V(v0Var.f18870n).G());
            this.f37460b[i10] = b0VarTrack;
        }
    }
}
