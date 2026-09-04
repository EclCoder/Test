package vh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class f {
    static Intent a(Context context) {
        a.d dVar;
        Intent intent = null;
        if (c.d()) {
            a aVarJ = e0.j(context);
            if (aVarJ == null) {
                dVar = null;
                break;
            }
            dVar = null;
            for (a.d dVar2 : aVarJ.f55564f) {
                if (TextUtils.equals(dVar2.f55573b, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE")) {
                    if (dVar != null) {
                        dVar = null;
                        break;
                    }
                    dVar = dVar2;
                }
            }
            if (dVar != null) {
                Intent intent2 = new Intent("android.settings.NOTIFICATION_LISTENER_DETAIL_SETTINGS");
                intent2.putExtra("android.provider.extra.NOTIFICATION_LISTENER_COMPONENT_NAME", new ComponentName(context, dVar.f55572a).flattenToString());
                if (e0.a(context, intent2)) {
                    intent = intent2;
                }
            }
        }
        if (intent == null) {
            intent = c.k() ? new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS") : new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        }
        return !e0.a(context, intent) ? c0.b(context) : intent;
    }

    static boolean b(Context context) {
        if (!c.h()) {
            return true;
        }
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        if (TextUtils.isEmpty(string)) {
            return false;
        }
        for (String str : string.split(":")) {
            ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
            if (TextUtils.equals(componentNameUnflattenFromString.getPackageName(), context.getPackageName())) {
                try {
                    Class.forName(componentNameUnflattenFromString.getClassName());
                    return true;
                } catch (ClassNotFoundException e10) {
                    e10.printStackTrace();
                }
            }
        }
        return false;
    }
}
