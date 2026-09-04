package pk;

import java.util.concurrent.Callable;
import ok.h;
import tk.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile d f50159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile d f50160b;

    static Object a(d dVar, Object obj) {
        try {
            return dVar.apply(obj);
        } catch (Throwable th2) {
            throw sk.a.a(th2);
        }
    }

    static h b(d dVar, Callable callable) {
        h hVar = (h) a(dVar, callable);
        if (hVar != null) {
            return hVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    static h c(Callable callable) {
        try {
            h hVar = (h) callable.call();
            if (hVar != null) {
                return hVar;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw sk.a.a(th2);
        }
    }

    public static h d(Callable callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        d dVar = f50159a;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static h e(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        d dVar = f50160b;
        return dVar == null ? hVar : (h) a(dVar, hVar);
    }
}
