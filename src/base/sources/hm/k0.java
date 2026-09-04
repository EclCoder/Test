package hm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jm.d0 f40562a = new jm.d0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final jm.d0 f40563b = new jm.d0("PENDING");

    public static final w a(Object obj) {
        if (obj == null) {
            obj = im.n.f41534a;
        }
        return new j0(obj);
    }

    public static final e d(i0 i0Var, kl.j jVar, int i10, gm.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != gm.a.DROP_OLDEST) ? b0.e(i0Var, jVar, i10, aVar) : i0Var;
    }
}
