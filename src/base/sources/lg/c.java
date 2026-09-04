package lg;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import com.googlecode.mp4parser.boxes.microsoft.lIu.trPLwhKZgZ;
import com.hecorat.screenrecorder.free.AzRecorderApp;
import com.hecorat.screenrecorder.free.activities.permission.AskPermissionActivity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static a f44503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f44504b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes6.dex */
    public interface a {
        void a(boolean z10);
    }

    private static boolean a(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName())).intValue() == 0;
        } catch (Exception e10) {
            wp.a.e(e10);
            com.google.firebase.crashlytics.a.b().d(e10);
            return false;
        }
    }

    public static boolean b(Context context) {
        return Build.VERSION.SDK_INT >= 30 || androidx.core.content.a.checkSelfPermission(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean c() {
        return f("android.settings.action.MANAGE_OVERLAY_PERMISSION");
    }

    public static boolean d() {
        return f("android.permission.CAMERA");
    }

    public static boolean e() {
        return f("android.permission.RECORD_AUDIO");
    }

    public static boolean f(String str) {
        wp.a.g(str, new Object[0]);
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        if (!str.equals("android.settings.action.MANAGE_OVERLAY_PERMISSION")) {
            return androidx.core.content.a.checkSelfPermission(applicationContext, str) == 0;
        }
        if (Build.VERSION.SDK_INT < 25) {
            return true;
        }
        try {
            return Settings.canDrawOverlays(applicationContext);
        } catch (NoSuchMethodError unused) {
            return a(applicationContext);
        }
    }

    public static void g(int i10) {
        if (i10 == f44504b) {
            f44503a = null;
        }
    }

    public static int h() {
        return f44504b;
    }

    private static void i(String str, a aVar) {
        f44504b++;
        f44503a = aVar;
        if (f(str) && f44503a != null) {
            aVar.a(true);
            return;
        }
        Context applicationContext = AzRecorderApp.e().getApplicationContext();
        Intent intent = new Intent(applicationContext, (Class<?>) AskPermissionActivity.class);
        intent.setAction(str);
        if (AzRecorderApp.e().h()) {
            intent.setFlags(268435456);
        } else {
            intent.setFlags(268468224);
        }
        applicationContext.startActivity(intent);
    }

    public static void j(a aVar) {
        i("android.permission.CAMERA", aVar);
    }

    public static void l(a aVar) {
        i("android.permission.RECORD_AUDIO", aVar);
    }

    public static void m(a aVar) {
        i("android.permission.WRITE_EXTERNAL_STORAGE", aVar);
    }

    public static void k(a aVar) {
        i(trPLwhKZgZ.wAdtm, aVar);
    }
}
