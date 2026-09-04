package f7;

import android.util.Log;
import java.lang.reflect.Method;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f38329a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f38330b = e.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f38331c;

    private e() {
    }

    public static final void a() {
        d("UnityFacebookSDKPlugin", "CaptureViewHierarchy", "");
    }

    private final Class b() throws ClassNotFoundException {
        Class<?> cls = Class.forName("com.unity3d.player.UnityPlayer");
        s.g(cls, "forName(UNITY_PLAYER_CLASS)");
        return cls;
    }

    public static final void c(String str) {
        d("UnityFacebookSDKPlugin", "OnReceiveMapping", str);
    }

    public static final void d(String str, String str2, String str3) {
        try {
            if (f38331c == null) {
                f38331c = f38329a.b();
            }
            Class cls = f38331c;
            Class cls2 = null;
            if (cls == null) {
                s.w("unityPlayer");
                cls = null;
            }
            Method method = cls.getMethod("UnitySendMessage", String.class, String.class, String.class);
            Class cls3 = f38331c;
            if (cls3 == null) {
                s.w("unityPlayer");
            } else {
                cls2 = cls3;
            }
            method.invoke(cls2, str, str2, str3);
        } catch (Exception e10) {
            Log.e(f38330b, "Failed to send message to Unity", e10);
        }
    }
}
