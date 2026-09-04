package vh;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class d {
    static Intent a(Context context) {
        if (f0.m()) {
            return g0.a(f0.n() ? c0.f(context) : null, c0.b(context));
        }
        return c0.b(context);
    }

    static boolean b(Context context) {
        if (!c.i()) {
            return true;
        }
        if (c.l() && e(context)) {
            return e0.e(context, "com.android.permission.GET_INSTALLED_APPS");
        }
        if (f0.m() && c() && f0.n()) {
            return e0.d(context, "OP_GET_INSTALLED_APPS", 10022);
        }
        return true;
    }

    private static boolean c() {
        if (!c.i()) {
            return true;
        }
        try {
            Class.forName(AppOpsManager.class.getName()).getDeclaredField("OP_GET_INSTALLED_APPS");
            return true;
        } catch (ClassNotFoundException e10) {
            e10.printStackTrace();
            return true;
        } catch (NoSuchFieldException e11) {
            e11.printStackTrace();
            return true;
        }
    }

    static boolean d(Activity activity) {
        if (!c.i()) {
            return false;
        }
        if (c.l() && e(activity)) {
            return (e0.e(activity, "com.android.permission.GET_INSTALLED_APPS") || e0.u(activity, "com.android.permission.GET_INSTALLED_APPS")) ? false : true;
        }
        if (f0.m() && c() && f0.n()) {
            return !b(activity);
        }
        return false;
    }

    private static boolean e(Context context) {
        try {
            PermissionInfo permissionInfo = context.getPackageManager().getPermissionInfo("com.android.permission.GET_INSTALLED_APPS", 0);
            if (permissionInfo != null) {
                if (c.o()) {
                    return permissionInfo.getProtection() == 1;
                }
                return (permissionInfo.protectionLevel & 15) == 1;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "oem_installed_apps_runtime_permission_enable") == 1;
        } catch (Settings.SettingNotFoundException e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
