package u3;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f53921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0[] f53922b;

    public m0(List list) {
        this.f53921a = list;
        this.f53922b = new o0[list.size()];
    }

    public void a(long j10, w1.u uVar) {
        if (uVar.a() < 9) {
            return;
        }
        int iP = uVar.p();
        int iP2 = uVar.p();
        int iG = uVar.G();
        if (iP == 434 && iP2 == 1195456820 && iG == 3) {
            o2.f.b(j10, uVar, this.f53922b);
        }
    }

    public void b(o2.r rVar, k0.d dVar) {
        for (int i10 = 0; i10 < this.f53922b.length; i10++) {
            dVar.a();
            o0 o0VarTrack = rVar.track(dVar.c(), 3);
            t1.o oVar = (t1.o) this.f53921a.get(i10);
            String str = oVar.f52757n;
            w1.a.b(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            o0VarTrack.b(new t1.o.b().a0(dVar.b()).o0(str).q0(oVar.f52748e).e0(oVar.f52747d).L(oVar.G).b0(oVar.f52760q).K());
            this.f53922b[i10] = o0VarTrack;
        }
    }
}
