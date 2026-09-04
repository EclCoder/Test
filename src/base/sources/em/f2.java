package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jm.d0 f37997a = new jm.d0("COMPLETING_ALREADY");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jm.d0 f37998b = new jm.d0("COMPLETING_WAITING_CHILDREN");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final jm.d0 f37999c = new jm.d0("COMPLETING_RETRY");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final jm.d0 f38000d = new jm.d0("TOO_LATE_TO_CANCEL");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final jm.d0 f38001e = new jm.d0("SEALED");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final h1 f38002f = new h1(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final h1 f38003g = new h1(true);

    public static final Object g(Object obj) {
        return obj instanceof u1 ? new v1((u1) obj) : obj;
    }

    public static final Object h(Object obj) {
        u1 u1Var;
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return (v1Var == null || (u1Var = v1Var.f38063a) == null) ? obj : u1Var;
    }
}
