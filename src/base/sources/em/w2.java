package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w2 f38068a = new w2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f38069b = jm.l0.a(new jm.d0("ThreadLocalEventLoop"));

    private w2() {
    }

    public final i1 a() {
        return (i1) f38069b.get();
    }

    public final i1 b() {
        ThreadLocal threadLocal = f38069b;
        i1 i1Var = (i1) threadLocal.get();
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1VarA = l1.a();
        threadLocal.set(i1VarA);
        return i1VarA;
    }

    public final void c() {
        f38069b.set(null);
    }

    public final void d(i1 i1Var) {
        f38069b.set(i1Var);
    }
}
