package vh;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
abstract class c {
    static int a() {
        return Build.VERSION.SDK_INT;
    }

    static int b(Context context) {
        return context.getApplicationInfo().targetSdkVersion;
    }

    static boolean c() {
        return Build.VERSION.SDK_INT >= 29;
    }

    static boolean d() {
        return Build.VERSION.SDK_INT >= 30;
    }

    static boolean e() {
        return Build.VERSION.SDK_INT >= 31;
    }

    static boolean f() {
        return Build.VERSION.SDK_INT >= 33;
    }

    static boolean g() {
        return true;
    }

    static boolean h() {
        return true;
    }

    static boolean i() {
        return true;
    }

    static boolean j() {
        return true;
    }

    static boolean k() {
        return true;
    }

    static boolean l() {
        return true;
    }

    static boolean m() {
        return true;
    }

    static boolean n() {
        return Build.VERSION.SDK_INT >= 26;
    }

    static boolean o() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
