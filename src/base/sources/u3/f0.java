package u3;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import o2.o0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f53804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final o0[] f53805b;

    public f0(List list) {
        this.f53804a = list;
        this.f53805b = new o0[list.size()];
    }

    public void a(long j10, w1.u uVar) {
        o2.f.a(j10, uVar, this.f53805b);
    }

    public void b(o2.r rVar, k0.d dVar) {
        for (int i10 = 0; i10 < this.f53805b.length; i10++) {
            dVar.a();
            o0 o0VarTrack = rVar.track(dVar.c(), 3);
            t1.o oVar = (t1.o) this.f53804a.get(i10);
            String str = oVar.f52757n;
            w1.a.b(MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = oVar.f52744a;
            if (strB == null) {
                strB = dVar.b();
            }
            o0VarTrack.b(new t1.o.b().a0(strB).o0(str).q0(oVar.f52748e).e0(oVar.f52747d).L(oVar.G).b0(oVar.f52760q).K());
            this.f53805b[i10] = o0VarTrack;
        }
    }
}
