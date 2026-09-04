package c9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    public static void a(a9.h hVar, a9.e eVar) {
        if (!(hVar instanceof s)) {
            g9.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", hVar);
        } else {
            u.c().e().l(((s) hVar).d().f(eVar), 1);
        }
    }
}
