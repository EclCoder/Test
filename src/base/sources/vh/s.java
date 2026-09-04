package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class s extends r {
    s() {
    }

    private static Intent n(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
        intent.setData(e0.k(context));
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static Intent o(Context context) {
        Intent intent = new Intent("android.settings.PICTURE_IN_PICTURE_SETTINGS");
        intent.setData(e0.k(context));
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static boolean p(Context context) {
        return context.getPackageManager().canRequestPackageInstalls();
    }

    private static boolean q(Context context) {
        return e0.c(context, "android:picture_in_picture");
    }

    @Override // vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        if (e0.g(str, "android.permission.REQUEST_INSTALL_PACKAGES")) {
            return p(context);
        }
        if (e0.g(str, "android.permission.PICTURE_IN_PICTURE")) {
            return q(context);
        }
        return (e0.g(str, "android.permission.READ_PHONE_NUMBERS") || e0.g(str, "android.permission.ANSWER_PHONE_CALLS")) ? e0.e(context, str) : super.a(context, str);
    }

    @Override // vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.REQUEST_INSTALL_PACKAGES") || e0.g(str, "android.permission.PICTURE_IN_PICTURE")) {
            return false;
        }
        if (e0.g(str, "android.permission.READ_PHONE_NUMBERS") || e0.g(str, "android.permission.ANSWER_PHONE_CALLS")) {
            return (e0.e(activity, str) || e0.u(activity, str)) ? false : true;
        }
        return super.b(activity, str);
    }

    @Override // vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public Intent c(Context context, String str) {
        if (e0.g(str, "android.permission.REQUEST_INSTALL_PACKAGES")) {
            return n(context);
        }
        return e0.g(str, "android.permission.PICTURE_IN_PICTURE") ? o(context) : super.c(context, str);
    }
}
