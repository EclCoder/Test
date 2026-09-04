package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y0 f3775c = new y0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static boolean f3776d = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f3778b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d1 f3777a = new f0();

    private y0() {
    }

    public static y0 a() {
        return f3775c;
    }

    public c1 b(Class cls, c1 c1Var) {
        x.b(cls, "messageType");
        x.b(c1Var, "schema");
        return (c1) this.f3778b.putIfAbsent(cls, c1Var);
    }

    public c1 c(Class cls) {
        c1 c1VarB;
        x.b(cls, "messageType");
        c1 c1VarCreateSchema = (c1) this.f3778b.get(cls);
        return (c1VarCreateSchema != null || (c1VarB = b(cls, (c1VarCreateSchema = this.f3777a.createSchema(cls)))) == null) ? c1VarCreateSchema : c1VarB;
    }

    public c1 d(Object obj) {
        return c(obj.getClass());
    }
}
