package ua;

import java.util.Map;
import va.i;
import va.j;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f {
    public static com.google.android.exoplayer2.upstream.a a(j jVar, String str, i iVar, int i10, Map map) {
        return new com.google.android.exoplayer2.upstream.a.b().i(iVar.b(str)).h(iVar.f55348a).g(iVar.f55349b).f(b(jVar, iVar)).b(i10).e(map).a();
    }

    public static String b(j jVar, i iVar) {
        String strJ = jVar.j();
        return strJ != null ? strJ : iVar.b(((va.b) jVar.f55354c.get(0)).f55299a).toString();
    }
}
