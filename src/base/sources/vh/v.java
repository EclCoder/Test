package vh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Environment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
class v extends u {
    v() {
    }

    private static Intent t(Context context) {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(e0.k(context));
        if (!e0.a(context, intent)) {
            intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
        }
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    private static boolean u() {
        return Environment.isExternalStorageManager();
    }

    @Override // vh.u, vh.t, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean a(Context context, String str) {
        return e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE") ? u() : super.a(context, str);
    }

    @Override // vh.u, vh.t, vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public boolean b(Activity activity, String str) {
        if (e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE")) {
            return false;
        }
        return super.b(activity, str);
    }

    @Override // vh.s, vh.r, vh.q, vh.p, vh.o, vh.n, vh.m
    public Intent c(Context context, String str) {
        return e0.g(str, "android.permission.MANAGE_EXTERNAL_STORAGE") ? t(context) : super.c(context, str);
    }
}
