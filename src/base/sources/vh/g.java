package vh;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class g {
    static Intent a(Context context) {
        Intent intent;
        if (c.n()) {
            intent = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else if (c.j()) {
            intent = new Intent();
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        } else {
            intent = null;
        }
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    static boolean b(Context context) {
        if (c.m()) {
            return ((NotificationManager) context.getSystemService(NotificationManager.class)).areNotificationsEnabled();
        }
        if (c.i()) {
            return e0.d(context, "OP_POST_NOTIFICATION", 11);
        }
        return true;
    }
}
