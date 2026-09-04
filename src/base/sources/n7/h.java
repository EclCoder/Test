package n7;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.view.Window;
import bm.r;
import com.facebook.h0;
import com.facebook.internal.e1;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f46885a = new h();

    private h() {
    }

    public static final String c() {
        Context contextM = h0.m();
        try {
            String str = contextM.getPackageManager().getPackageInfo(contextM.getPackageName(), 0).versionName;
            s.g(str, "{\n      val packageInfo …ageInfo.versionName\n    }");
            return str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static final View d(Activity activity) {
        if (x7.a.c(h.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            x7.a.b(th2, h.class);
            return null;
        }
    }

    public static final boolean e() {
        String FINGERPRINT = Build.FINGERPRINT;
        s.g(FINGERPRINT, "FINGERPRINT");
        if (r.N(FINGERPRINT, "generic", false, 2, null)) {
            return true;
        }
        s.g(FINGERPRINT, "FINGERPRINT");
        if (r.N(FINGERPRINT, "unknown", false, 2, null)) {
            return true;
        }
        String MODEL = Build.MODEL;
        s.g(MODEL, "MODEL");
        if (r.T(MODEL, "google_sdk", false, 2, null)) {
            return true;
        }
        s.g(MODEL, "MODEL");
        if (r.T(MODEL, "Emulator", false, 2, null)) {
            return true;
        }
        s.g(MODEL, "MODEL");
        if (r.T(MODEL, "Android SDK built for x86", false, 2, null)) {
            return true;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        s.g(MANUFACTURER, "MANUFACTURER");
        if (r.T(MANUFACTURER, "Genymotion", false, 2, null)) {
            return true;
        }
        String BRAND = Build.BRAND;
        s.g(BRAND, "BRAND");
        if (r.N(BRAND, "generic", false, 2, null)) {
            String DEVICE = Build.DEVICE;
            s.g(DEVICE, "DEVICE");
            if (r.N(DEVICE, "generic", false, 2, null)) {
                return true;
            }
        }
        return s.c("google_sdk", Build.PRODUCT);
    }

    public static final double f(String str) {
        try {
            Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(str);
            if (!matcher.find()) {
                return 0.0d;
            }
            return NumberFormat.getNumberInstance(e1.B()).parse(matcher.group(0)).doubleValue();
        } catch (ParseException unused) {
            return 0.0d;
        }
    }

    public static final void a() {
    }

    public static final void b() {
    }
}
