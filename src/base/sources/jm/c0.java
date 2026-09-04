package jm;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f42640a = new a.a().a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f42641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f42642c;

    static {
        Object objB;
        Object objB2;
        try {
            fl.r.a aVar = fl.r.f38769b;
            objB = fl.r.b(kotlin.coroutines.jvm.internal.a.class.getCanonicalName());
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        if (fl.r.e(objB) != null) {
            objB = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f42641b = (String) objB;
        try {
            objB2 = fl.r.b(c0.class.getCanonicalName());
        } catch (Throwable th3) {
            fl.r.a aVar3 = fl.r.f38769b;
            objB2 = fl.r.b(fl.s.a(th3));
        }
        if (fl.r.e(objB2) != null) {
            objB2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f42642c = (String) objB2;
    }

    public static final Throwable a(Throwable th2) {
        return th2;
    }
}
