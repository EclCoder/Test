package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class p extends o {
    p() {
    }

    @Override // vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        if (e0.g(str, "android.permission.SYSTEM_ALERT_WINDOW")) {
            return h0.b(context);
        }
        if (e0.g(str, "com.android.permission.GET_INSTALLED_APPS")) {
            return d.b(context);
        }
        if (e0.g(str, "android.permission.NOTIFICATION_SERVICE")) {
            return g.b(context);
        }
        return (c.f() || !e0.g(str, "android.permission.POST_NOTIFICATIONS")) ? super.a(context, str) : g.b(context);
    }

    @Override // vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.SYSTEM_ALERT_WINDOW")) {
            return false;
        }
        if (e0.g(str, "com.android.permission.GET_INSTALLED_APPS")) {
            return d.d(activity);
        }
        if (e0.g(str, "android.permission.NOTIFICATION_SERVICE")) {
            return false;
        }
        if (c.f() || !e0.g(str, "android.permission.POST_NOTIFICATIONS")) {
            return super.b(activity, str);
        }
        return false;
    }

    @Override // vh.o, vh.n, vh.m
    public Intent c(Context context, String str) {
        if (e0.g(str, "android.permission.SYSTEM_ALERT_WINDOW")) {
            return h0.a(context);
        }
        if (e0.g(str, "com.android.permission.GET_INSTALLED_APPS")) {
            return d.a(context);
        }
        if (e0.g(str, "android.permission.NOTIFICATION_SERVICE")) {
            return g.a(context);
        }
        return (c.f() || !e0.g(str, "android.permission.POST_NOTIFICATIONS")) ? super.c(context, str) : g.a(context);
    }
}
