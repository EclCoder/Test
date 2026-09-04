package vh;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
abstract class c0 {
    static Intent a() {
        return new Intent("android.settings.SETTINGS");
    }

    static Intent b(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(e0.k(context));
        if (e0.a(context, intent)) {
            return intent;
        }
        Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
        if (e0.a(context, intent2)) {
            return intent2;
        }
        Intent intent3 = new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
        return e0.a(context, intent3) ? intent3 : a();
    }

    static Intent c(Context context) {
        Intent intent = new Intent("com.oppo.safe.permission.PermissionTopActivity");
        Intent intentJ = j(context);
        if (!e0.a(context, intent)) {
            intent = null;
        }
        return e0.a(context, intentJ) ? g0.a(intent, intentJ) : intent;
    }

    static Intent d(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.huawei.systemmanager", "com.huawei.systemmanager.addviewmonitor.AddViewMonitorActivity");
        Intent intent2 = new Intent();
        intent2.setClassName("com.huawei.systemmanager", "com.huawei.notificationmanager.ui.NotificationManagmentActivity");
        Intent intentE = e(context);
        String strD = f0.d();
        if (strD == null) {
            strD = "";
        }
        if (strD.startsWith("3.0")) {
            if (!e0.a(context, intent2)) {
                intent2 = null;
            }
            if (e0.a(context, intent)) {
                intent2 = g0.a(intent2, intent);
            }
        } else {
            if (!e0.a(context, intent)) {
                intent = null;
            }
            intent2 = e0.a(context, intent2) ? g0.a(intent, intent2) : intent;
        }
        return e0.a(context, intentE) ? g0.a(intent2, intentE) : intent2;
    }

    static Intent e(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.huawei.systemmanager");
        if (e0.a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    static Intent f(Context context) {
        Intent intentPutExtra = new Intent().setAction("miui.intent.action.APP_PERM_EDITOR").putExtra("extra_pkgname", context.getPackageName());
        Intent intentM = m(context);
        if (!e0.a(context, intentPutExtra)) {
            intentPutExtra = null;
        }
        return e0.a(context, intentM) ? g0.a(intentPutExtra, intentM) : intentPutExtra;
    }

    static Intent g(Context context) {
        return f(context);
    }

    static Intent i(Context context) {
        return h(context);
    }

    static Intent j(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.oppo.safe");
        if (e0.a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        Intent launchIntentForPackage2 = context.getPackageManager().getLaunchIntentForPackage("com.color.safecenter");
        if (e0.a(context, launchIntentForPackage2)) {
            return launchIntentForPackage2;
        }
        Intent launchIntentForPackage3 = context.getPackageManager().getLaunchIntentForPackage("com.oplus.safecenter");
        if (e0.a(context, launchIntentForPackage3)) {
            return launchIntentForPackage3;
        }
        return null;
    }

    static Intent k(Context context) {
        Intent intentL = l(context);
        if (e0.a(context, intentL)) {
            return intentL;
        }
        return null;
    }

    static Intent l(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.iqoo.secure");
        if (e0.a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    static Intent m(Context context) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.miui.securitycenter");
        if (e0.a(context, launchIntentForPackage)) {
            return launchIntentForPackage;
        }
        return null;
    }

    static Intent h(Context context) {
        Intent intent = new Intent();
        intent.setClassName("com.android.settings", "com.android.settings.Settings$AppOpsDetailsActivity");
        Bundle bundle = new Bundle();
        bundle.putString(NhHRaDJCHtCTJR.uCfAHMYjdEU, context.getPackageName());
        intent.putExtra(":settings:show_fragment_args", bundle);
        intent.setData(e0.k(context));
        if (e0.a(context, intent)) {
            return intent;
        }
        return null;
    }
}
