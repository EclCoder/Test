package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f38061a = jm.e0.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x0 f38062b = b();

    public static final x0 a() {
        return f38062b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final x0 b() {
        if (!f38061a) {
            return t0.f38057i;
        }
        i2 i2VarC = c1.c();
        return (jm.t.c(i2VarC) || !(i2VarC instanceof x0)) ? t0.f38057i : (x0) i2VarC;
    }
}
