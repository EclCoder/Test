package um;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f54778a;

    static {
        Object objB;
        try {
            fl.r.a aVar = fl.r.f38769b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            kotlin.jvm.internal.s.g(property, "getProperty(...)");
            objB = fl.r.b(bm.r.q(property));
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        if (fl.r.h(objB)) {
            objB = null;
        }
        Integer num = (Integer) objB;
        f54778a = num != null ? num.intValue() : 2097152;
    }
}
