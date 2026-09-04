package vh;

import android.app.Activity;
import android.content.Context;
import android.os.Environment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class u extends t {
    u() {
    }

    private boolean r(Context context) {
        if (c.f() && c.b(context) >= 33) {
            return e0.e(context, "android.permission.READ_MEDIA_IMAGES") || a(context, "android.permission.MANAGE_EXTERNAL_STORAGE");
        }
        if (!c.d() || c.b(context) < 30) {
            return e0.e(context, "android.permission.READ_EXTERNAL_STORAGE");
        }
        return e0.e(context, "android.permission.READ_EXTERNAL_STORAGE") || a(context, "android.permission.MANAGE_EXTERNAL_STORAGE");
    }

    private static boolean s() {
        return Environment.isExternalStorageLegacy();
    }

    @Override // vh.t, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        if (e0.g(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
            return r(context) && e0.e(context, "android.permission.ACCESS_MEDIA_LOCATION");
        }
        if (e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION") || e0.g(str, "android.permission.ACTIVITY_RECOGNITION")) {
            return e0.e(context, str);
        }
        if (c.d() || !e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || s()) {
            return super.a(context, str);
        }
        return false;
    }

    @Override // vh.t, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            if (e0.e(activity, "android.permission.ACCESS_FINE_LOCATION")) {
                return (e0.e(activity, str) || e0.u(activity, str)) ? false : true;
            }
            return !e0.u(activity, "android.permission.ACCESS_FINE_LOCATION");
        }
        if (e0.g(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
            return (!r(activity) || e0.e(activity, str) || e0.u(activity, str)) ? false : true;
        }
        if (e0.g(str, "android.permission.ACTIVITY_RECOGNITION")) {
            return (e0.e(activity, str) || e0.u(activity, str)) ? false : true;
        }
        if (c.d() || !e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || s()) {
            return super.b(activity, str);
        }
        return true;
    }
}
