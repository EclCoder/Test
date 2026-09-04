package vh;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.provider.Settings;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class r extends q {
    r() {
    }

    private static Intent h(Context context) {
        Intent intent = new Intent("android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS");
        intent.setData(e0.k(context));
        if (!e0.a(context, intent)) {
            intent = new Intent("android.settings.IGNORE_BATTERY_OPTIMIZATION_SETTINGS");
        }
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static Intent i(Context context) {
        Intent intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_DETAIL_SETTINGS");
        intent.setData(e0.k(context));
        if (f0.k() || f0.l()) {
            intent = new Intent("android.settings.NOTIFICATION_POLICY_ACCESS_SETTINGS");
        }
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static Intent j(Context context) {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        intent.setData(e0.k(context));
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static boolean k(Context context) {
        return ((PowerManager) context.getSystemService(PowerManager.class)).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    private static boolean l(Context context) {
        return ((NotificationManager) context.getSystemService(NotificationManager.class)).isNotificationPolicyAccessGranted();
    }

    private static boolean m(Context context) {
        if (c.l()) {
            return Settings.System.canWrite(context);
        }
        return true;
    }

    @Override // vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        if (!c.f()) {
            if (e0.g(str, "android.permission.POST_NOTIFICATIONS")) {
                return super.a(context, str);
            }
            if (e0.g(str, "android.permission.NEARBY_WIFI_DEVICES")) {
                return e0.e(context, "android.permission.ACCESS_FINE_LOCATION");
            }
            if (e0.g(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
                return e0.e(context, "android.permission.BODY_SENSORS");
            }
            if (e0.g(str, "android.permission.READ_MEDIA_IMAGES") || e0.g(str, "android.permission.READ_MEDIA_VIDEO") || e0.g(str, "android.permission.READ_MEDIA_AUDIO")) {
                return e0.e(context, "android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!c.e()) {
            if (e0.g(str, "android.permission.BLUETOOTH_SCAN")) {
                return e0.e(context, "android.permission.ACCESS_FINE_LOCATION");
            }
            if (e0.g(str, "android.permission.BLUETOOTH_CONNECT") || e0.g(str, "android.permission.BLUETOOTH_ADVERTISE")) {
                return true;
            }
        }
        if (!c.d() && e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return e0.e(context, "android.permission.READ_EXTERNAL_STORAGE") && e0.e(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (!c.c()) {
            if (e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                return e0.e(context, "android.permission.ACCESS_FINE_LOCATION");
            }
            if (e0.g(str, "android.permission.ACTIVITY_RECOGNITION")) {
                return true;
            }
            if (e0.g(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
                return e0.e(context, "android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!c.o() && e0.g(str, "android.permission.ACCEPT_HANDOVER")) {
            return true;
        }
        if (!c.n()) {
            if (e0.g(str, "android.permission.ANSWER_PHONE_CALLS")) {
                return true;
            }
            if (e0.g(str, "android.permission.READ_PHONE_NUMBERS")) {
                return e0.e(context, "android.permission.READ_PHONE_STATE");
            }
        }
        if (e0.g(str, "com.android.permission.GET_INSTALLED_APPS") || e0.g(str, "android.permission.POST_NOTIFICATIONS")) {
            return super.a(context, str);
        }
        if (!e0.p(str)) {
            return e0.e(context, str);
        }
        if (e0.g(str, "android.permission.WRITE_SETTINGS")) {
            return m(context);
        }
        if (e0.g(str, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
            return l(context);
        }
        return e0.g(str, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") ? k(context) : super.a(context, str);
    }

    @Override // vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (!c.f()) {
            if (e0.g(str, "android.permission.POST_NOTIFICATIONS")) {
                return super.b(activity, str);
            }
            if (e0.g(str, "android.permission.NEARBY_WIFI_DEVICES")) {
                return (e0.e(activity, "android.permission.ACCESS_FINE_LOCATION") || e0.u(activity, "android.permission.ACCESS_FINE_LOCATION")) ? false : true;
            }
            if (e0.g(str, "android.permission.BODY_SENSORS_BACKGROUND")) {
                return (e0.e(activity, "android.permission.BODY_SENSORS") || e0.u(activity, "android.permission.BODY_SENSORS")) ? false : true;
            }
            if (e0.g(str, "android.permission.READ_MEDIA_IMAGES") || e0.g(str, "android.permission.READ_MEDIA_VIDEO") || e0.g(str, "android.permission.READ_MEDIA_AUDIO")) {
                return (e0.e(activity, "android.permission.READ_EXTERNAL_STORAGE") || e0.u(activity, "android.permission.READ_EXTERNAL_STORAGE")) ? false : true;
            }
        }
        if (!c.e()) {
            if (e0.g(str, "android.permission.BLUETOOTH_SCAN")) {
                return (e0.e(activity, "android.permission.ACCESS_FINE_LOCATION") || e0.u(activity, "android.permission.ACCESS_FINE_LOCATION")) ? false : true;
            }
            if (e0.g(str, "android.permission.BLUETOOTH_CONNECT") || e0.g(str, "android.permission.BLUETOOTH_ADVERTISE")) {
                return false;
            }
        }
        if (!c.c()) {
            if (e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                return (e0.e(activity, "android.permission.ACCESS_FINE_LOCATION") || e0.u(activity, "android.permission.ACCESS_FINE_LOCATION")) ? false : true;
            }
            if (e0.g(str, "android.permission.ACTIVITY_RECOGNITION")) {
                return false;
            }
            if (e0.g(str, "android.permission.ACCESS_MEDIA_LOCATION")) {
                return (e0.e(activity, "android.permission.READ_EXTERNAL_STORAGE") || e0.u(activity, "android.permission.READ_EXTERNAL_STORAGE")) ? false : true;
            }
        }
        if (!c.o() && e0.g(str, "android.permission.ACCEPT_HANDOVER")) {
            return false;
        }
        if (!c.n()) {
            if (e0.g(str, "android.permission.ANSWER_PHONE_CALLS")) {
                return false;
            }
            if (e0.g(str, "android.permission.READ_PHONE_NUMBERS")) {
                return (e0.e(activity, "android.permission.READ_PHONE_STATE") || e0.u(activity, "android.permission.READ_PHONE_STATE")) ? false : true;
            }
        }
        if (e0.g(str, "com.android.permission.GET_INSTALLED_APPS") || e0.g(str, "android.permission.POST_NOTIFICATIONS")) {
            return super.b(activity, str);
        }
        return (e0.p(str) || e0.e(activity, str) || e0.u(activity, str)) ? false : true;
    }

    @Override // vh.q, vh.p, vh.o, vh.n, vh.m
    public Intent c(Context context, String str) {
        if (e0.g(str, "android.permission.WRITE_SETTINGS")) {
            return j(context);
        }
        if (e0.g(str, "android.permission.ACCESS_NOTIFICATION_POLICY")) {
            return i(context);
        }
        return e0.g(str, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") ? h(context) : super.c(context, str);
    }
}
