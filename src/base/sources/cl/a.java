package cl;

import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.exceptions.OnErrorNotImplementedException;
import io.reactivex.exceptions.UndeliverableException;
import java.util.concurrent.Callable;
import ok.g;
import ok.h;
import tk.c;
import tk.d;
import vk.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static volatile c f10113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static volatile d f10114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static volatile d f10115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static volatile d f10116d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static volatile d f10117e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static volatile d f10118f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static volatile d f10119g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static volatile d f10120h;

    static Object a(d dVar, Object obj) {
        try {
            return dVar.apply(obj);
        } catch (Throwable th2) {
            throw bl.a.a(th2);
        }
    }

    static h b(d dVar, Callable callable) {
        return (h) b.c(a(dVar, callable), "Scheduler Callable result can't be null");
    }

    static h c(Callable callable) {
        try {
            return (h) b.c(callable.call(), "Scheduler Callable result can't be null");
        } catch (Throwable th2) {
            throw bl.a.a(th2);
        }
    }

    public static h d(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f10115c;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static h e(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f10117e;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static h f(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f10118f;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    public static h g(Callable callable) {
        b.c(callable, "Scheduler Callable can't be null");
        d dVar = f10116d;
        return dVar == null ? c(callable) : b(dVar, callable);
    }

    static boolean h(Throwable th2) {
        return (th2 instanceof OnErrorNotImplementedException) || (th2 instanceof MissingBackpressureException) || (th2 instanceof IllegalStateException) || (th2 instanceof NullPointerException) || (th2 instanceof IllegalArgumentException) || (th2 instanceof CompositeException);
    }

    public static ok.c i(ok.c cVar) {
        d dVar = f10120h;
        return dVar != null ? (ok.c) a(dVar, cVar) : cVar;
    }

    public static h j(h hVar) {
        d dVar = f10119g;
        return dVar == null ? hVar : (h) a(dVar, hVar);
    }

    public static void k(Throwable th2) {
        c cVar = f10113a;
        if (th2 == null) {
            th2 = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        } else if (!h(th2)) {
            th2 = new UndeliverableException(th2);
        }
        if (cVar != null) {
            try {
                cVar.accept(th2);
                return;
            } catch (Throwable th3) {
                th3.printStackTrace();
                n(th3);
            }
        }
        th2.printStackTrace();
        n(th2);
    }

    public static Runnable l(Runnable runnable) {
        b.c(runnable, "run is null");
        d dVar = f10114b;
        return dVar == null ? runnable : (Runnable) a(dVar, runnable);
    }

    static void n(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }

    public static g m(ok.c cVar, g gVar) {
        return gVar;
    }
}
