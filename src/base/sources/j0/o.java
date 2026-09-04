package j0;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import com.bytedance.sdk.component.adexpress.hnj.qor.FCv.giNWGaNAgVQoO;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f41890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f41891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f41892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f41893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f41894e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    static class a {
        static boolean a() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f41890a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f41891b = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f41892c = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f41893d = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f41894e = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e10);
            }
        }
    }

    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }

    public static boolean c() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.a();
        }
        try {
            return ((Boolean) f41891b.invoke(null, Long.valueOf(f41890a))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", giNWGaNAgVQoO.GPwyBaTGhNR);
            return false;
        }
    }
}
