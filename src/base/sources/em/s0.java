package em;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class s0 {
    public static final String a(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final String c(kl.f fVar) {
        Object objB;
        if (fVar instanceof jm.h) {
            return ((jm.h) fVar).toString();
        }
        try {
            fl.r.a aVar = fl.r.f38769b;
            objB = fl.r.b(fVar + '@' + b(fVar));
        } catch (Throwable th2) {
            fl.r.a aVar2 = fl.r.f38769b;
            objB = fl.r.b(fl.s.a(th2));
        }
        if (fl.r.e(objB) != null) {
            objB = fVar.getClass().getName() + '@' + b(fVar);
        }
        return (String) objB;
    }
}
