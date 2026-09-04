package s4;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import c1.pGX.geAgcEazw;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f51474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f51475b;

    public static void a(String str) {
        b.a(f(str));
    }

    public static void b() {
        b.b();
    }

    private static void c(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 29 ? c.a() : e();
    }

    private static String f(String str) {
        return str.length() <= 127 ? str : str.substring(0, Sdk$SDKError.b.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE);
    }

    private static boolean e() {
        String str = geAgcEazw.fnIrz;
        try {
            if (f51475b == null) {
                f51474a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f51475b = Trace.class.getMethod(str, Long.TYPE);
            }
            return ((Boolean) f51475b.invoke(null, Long.valueOf(f51474a))).booleanValue();
        } catch (Exception e10) {
            c(str, e10);
            return false;
        }
    }
}
