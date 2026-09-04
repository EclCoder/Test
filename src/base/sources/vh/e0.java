package vh;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Handler f55583a = new Handler(Looper.getMainLooper());

    static boolean a(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        return !(c.f() ? packageManager.queryIntentActivities(intent, PackageManager.ResolveInfoFlags.of(65536L)).isEmpty() : packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE).isEmpty());
    }

    static ArrayList b(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr != null ? objArr.length : 0);
        if (objArr != null && objArr.length != 0) {
            for (Object obj : objArr) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    static boolean c(Context context, String str) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        return (c.c() ? appOpsManager.unsafeCheckOpNoThrow(str, context.getApplicationInfo().uid, context.getPackageName()) : appOpsManager.checkOpNoThrow(str, context.getApplicationInfo().uid, context.getPackageName())) == 0;
    }

    static boolean d(Context context, String str, int i10) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        String packageName = context.getApplicationContext().getPackageName();
        int i11 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            try {
                i10 = ((Integer) cls.getDeclaredField(str).get(Integer.class)).intValue();
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            Class cls2 = Integer.TYPE;
            return ((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(i10), Integer.valueOf(i11), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    static boolean e(Context context, String str) {
        return context.checkSelfPermission(str) == 0;
    }

    static boolean f(Collection collection, String str) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (g((String) it.next(), str)) {
                return true;
            }
        }
        return false;
    }

    static boolean g(String str, String str2) {
        int length = str.length();
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = length - 1; i10 >= 0; i10--) {
            if (str.charAt(i10) != str2.charAt(i10)) {
                return false;
            }
        }
        return true;
    }

    static Activity h(Context context) {
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper) || (context = ((ContextWrapper) context).getBaseContext()) == null) {
                return null;
            }
        }
        return (Activity) context;
    }

    static int i(Context context, String str) {
        AssetManager assets = context.getAssets();
        try {
            if (c.b(context) >= 28 && c.a() >= 28 && c.a() < 30) {
                Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
                declaredMethod.setAccessible(true);
                Method method = (Method) declaredMethod.invoke(AssetManager.class, "findCookieForPath", new Class[]{String.class});
                if (method != null) {
                    method.setAccessible(true);
                    Integer num = (Integer) method.invoke(context.getAssets(), str);
                    if (num != null) {
                        return num.intValue();
                    }
                }
            }
            Integer num2 = (Integer) assets.getClass().getDeclaredMethod("addAssetPath", String.class).invoke(assets, str);
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (IllegalAccessException e10) {
            e10.printStackTrace();
            return 0;
        } catch (NoSuchMethodException e11) {
            e11.printStackTrace();
            return 0;
        } catch (InvocationTargetException e12) {
            e12.printStackTrace();
            return 0;
        }
    }

    static a j(Context context) {
        int i10 = i(context, context.getApplicationInfo().sourceDir);
        a aVar = null;
        if (i10 == 0) {
            return null;
        }
        try {
            a aVarB = b.b(context, i10);
            try {
                if (TextUtils.equals(context.getPackageName(), aVarB.f55559a)) {
                    return aVarB;
                }
                return null;
            } catch (IOException e10) {
                e = e10;
                aVar = aVarB;
                e.printStackTrace();
                return aVar;
            } catch (XmlPullParserException e11) {
                e = e11;
                aVar = aVarB;
                e.printStackTrace();
                return aVar;
            }
        } catch (IOException e12) {
            e = e12;
        } catch (XmlPullParserException e13) {
            e = e13;
        }
    }

    static Uri k(Context context) {
        return Uri.parse("package:" + context.getPackageName());
    }

    static Intent l(Context context, List list) {
        if (list == null || list.isEmpty()) {
            return c0.b(context);
        }
        if (!k.a(list)) {
            return list.size() == 1 ? k.e(context, (String) list.get(0)) : c0.b(context);
        }
        int size = list.size();
        if (size == 1) {
            return k.e(context, (String) list.get(0));
        }
        if (size != 2) {
            if (size == 3 && c.d() && f(list, "android.permission.MANAGE_EXTERNAL_STORAGE") && f(list, "android.permission.READ_EXTERNAL_STORAGE") && f(list, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                return k.e(context, "android.permission.MANAGE_EXTERNAL_STORAGE");
            }
        } else if (!c.f() && f(list, "android.permission.NOTIFICATION_SERVICE") && f(list, "android.permission.POST_NOTIFICATIONS")) {
            return k.e(context, "android.permission.NOTIFICATION_SERVICE");
        }
        return c0.b(context);
    }

    static boolean m(Activity activity) {
        int rotation = c.d() ? activity.getDisplay().getRotation() : activity.getWindowManager().getDefaultDisplay().getRotation();
        return rotation == 2 || rotation == 3;
    }

    static boolean n(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    static boolean o(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null || !bundle.containsKey("ScopedStorage")) {
                return false;
            }
            return Boolean.parseBoolean(String.valueOf(bundle.get("ScopedStorage")));
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return false;
        }
    }

    static boolean p(String str) {
        return g(str, "android.permission.MANAGE_EXTERNAL_STORAGE") || g(str, "android.permission.REQUEST_INSTALL_PACKAGES") || g(str, "android.permission.SYSTEM_ALERT_WINDOW") || g(str, "android.permission.WRITE_SETTINGS") || g(str, "android.permission.NOTIFICATION_SERVICE") || g(str, "android.permission.PACKAGE_USAGE_STATS") || g(str, "android.permission.SCHEDULE_EXACT_ALARM") || g(str, "android.permission.BIND_NOTIFICATION_LISTENER_SERVICE") || g(str, "android.permission.ACCESS_NOTIFICATION_POLICY") || g(str, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS") || g(str, "android.permission.BIND_VPN_SERVICE") || g(str, "android.permission.PICTURE_IN_PICTURE");
    }

    static void q(Activity activity) {
        try {
            int i10 = activity.getResources().getConfiguration().orientation;
            if (i10 == 1) {
                activity.setRequestedOrientation(m(activity) ? 9 : 1);
            } else {
                if (i10 != 2) {
                    return;
                }
                activity.setRequestedOrientation(m(activity) ? 8 : 0);
            }
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
        }
    }

    static void r(Activity activity, String[] strArr, int[] iArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            boolean zJ = k.j(str);
            if (c.f() && c.b(activity) >= 33 && g(str, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                zJ = true;
            }
            if (!c.f() && (g(str, "android.permission.POST_NOTIFICATIONS") || g(str, "android.permission.NEARBY_WIFI_DEVICES") || g(str, "android.permission.BODY_SENSORS_BACKGROUND") || g(str, "android.permission.READ_MEDIA_IMAGES") || g(str, "android.permission.READ_MEDIA_VIDEO") || g(str, "android.permission.READ_MEDIA_AUDIO"))) {
                zJ = true;
            }
            if (!c.e() && (g(str, "android.permission.BLUETOOTH_SCAN") || g(str, "android.permission.BLUETOOTH_CONNECT") || g(str, "android.permission.BLUETOOTH_ADVERTISE"))) {
                zJ = true;
            }
            if (!c.c() && (g(str, "android.permission.ACCESS_BACKGROUND_LOCATION") || g(str, "android.permission.ACTIVITY_RECOGNITION") || g(str, "android.permission.ACCESS_MEDIA_LOCATION"))) {
                zJ = true;
            }
            if (!c.o() && g(str, "android.permission.ACCEPT_HANDOVER")) {
                zJ = true;
            }
            if (!c.n() && (g(str, "android.permission.ANSWER_PHONE_CALLS") || g(str, "android.permission.READ_PHONE_NUMBERS"))) {
                zJ = true;
            }
            if (g(str, "com.android.permission.GET_INSTALLED_APPS") ? true : zJ) {
                iArr[i10] = k.f(activity, str) ? 0 : -1;
            }
        }
    }

    static void s(List list, Runnable runnable) {
        long j10 = 300;
        long j11 = c.d() ? 200L : 300L;
        if (!f0.j() && !f0.k()) {
            j10 = (f0.m() && c.d() && f(list, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS")) ? 1000L : j11;
        } else if (!c.n()) {
            j10 = 500;
        }
        t(runnable, j10);
    }

    static void t(Runnable runnable, long j10) {
        f55583a.postDelayed(runnable, j10);
    }

    static boolean u(Activity activity, String str) {
        if (c.a() == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke(activity.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e10) {
                e10.printStackTrace();
            }
        }
        return activity.shouldShowRequestPermissionRationale(str);
    }
}
