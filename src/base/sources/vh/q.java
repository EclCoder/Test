package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class q extends p {
    q() {
    }

    private static Intent f(Context context) {
        Intent intent = new Intent("android.settings.USAGE_ACCESS_SETTINGS");
        if (c.c()) {
            intent.setData(e0.k(context));
        }
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static boolean g(Context context) {
        return e0.c(context, "android:get_usage_stats");
    }

    @Override // vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        return e0.g(str, "android.permission.PACKAGE_USAGE_STATS") ? g(context) : super.a(context, str);
    }

    @Override // vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.PACKAGE_USAGE_STATS")) {
            return false;
        }
        return super.b(activity, str);
    }

    @Override // vh.p, vh.o, vh.n, vh.m
    public Intent c(Context context, String str) {
        return e0.g(str, "android.permission.PACKAGE_USAGE_STATS") ? f(context) : super.c(context, str);
    }
}
