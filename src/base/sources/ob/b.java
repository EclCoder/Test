package ob;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Method f48344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Method f48345b;

    public static IBinder a(Bundle bundle, String str) {
        return r0.f48425a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        Method method = f48344a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f48344a = method2;
                method2.setAccessible(true);
                method = f48344a;
            } catch (NoSuchMethodException e10) {
                u.g("BundleUtil", "Failed to retrieve getIBinder method", e10);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            u.g("BundleUtil", "Failed to invoke getIBinder via reflection", e11);
            return null;
        }
    }

    public static void c(Bundle bundle, String str, IBinder iBinder) {
        if (r0.f48425a >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            d(bundle, str, iBinder);
        }
    }

    private static void d(Bundle bundle, String str, IBinder iBinder) {
        Method method = f48345b;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f48345b = method2;
                method2.setAccessible(true);
                method = f48345b;
            } catch (NoSuchMethodException e10) {
                u.g("BundleUtil", "Failed to retrieve putIBinder method", e10);
                return;
            }
        }
        try {
            method.invoke(bundle, str, iBinder);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e11) {
            u.g("BundleUtil", "Failed to invoke putIBinder via reflection", e11);
        }
    }
}
