package vh;

import android.app.Activity;
import android.app.AlarmManager;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class w extends v {
    w() {
    }

    private static Intent v(Context context) {
        Intent intent = new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM");
        intent.setData(e0.k(context));
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static boolean w(Context context) {
        return ((AlarmManager) context.getSystemService(AlarmManager.class)).canScheduleExactAlarms();
    }

    @Override // vh.v, vh.u, vh.t, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        if (e0.g(str, "android.permission.SCHEDULE_EXACT_ALARM")) {
            return w(context);
        }
        return (e0.g(str, "android.permission.BLUETOOTH_SCAN") || e0.g(str, "android.permission.BLUETOOTH_CONNECT") || e0.g(str, "android.permission.BLUETOOTH_ADVERTISE")) ? e0.e(context, str) : super.a(context, str);
    }

    @Override // vh.v, vh.u, vh.t, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.SCHEDULE_EXACT_ALARM")) {
            return false;
        }
        if (e0.g(str, "android.permission.BLUETOOTH_SCAN") || e0.g(str, "android.permission.BLUETOOTH_CONNECT") || e0.g(str, "android.permission.BLUETOOTH_ADVERTISE")) {
            return (e0.e(activity, str) || e0.u(activity, str)) ? false : true;
        }
        if (activity.getApplicationInfo().targetSdkVersion < 31 || !e0.g(str, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
            return super.b(activity, str);
        }
        if (e0.e(activity, "android.permission.ACCESS_FINE_LOCATION") || e0.e(activity, "android.permission.ACCESS_COARSE_LOCATION")) {
            return (e0.e(activity, str) || e0.u(activity, str)) ? false : true;
        }
        return (e0.u(activity, "android.permission.ACCESS_FINE_LOCATION") || e0.u(activity, "android.permission.ACCESS_COARSE_LOCATION")) ? false : true;
    }

    @Override // vh.v, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public Intent c(Context context, String str) {
        return e0.g(str, "android.permission.SCHEDULE_EXACT_ALARM") ? v(context) : super.c(context, str);
    }
}
