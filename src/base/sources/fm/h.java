package fm;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import fl.r;
import fl.s;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f38800a;
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            r.a aVar = r.f38769b;
            objB = r.b(new f(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th2) {
            r.a aVar2 = r.f38769b;
            objB = r.b(s.a(th2));
        }
        f38800a = (g) (r.h(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z10) throws IllegalAccessException, InvocationTargetException {
        if (!z10) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            kotlin.jvm.internal.s.f(objInvoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) objInvoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
