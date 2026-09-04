package j0;

import android.os.Build;
import android.os.ext.SdkExtensions;
import java.util.Locale;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f41875a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f41876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f41877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f41878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f41879e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41880a = new a();

        private a() {
        }

        public final int a(int i10) {
            return SdkExtensions.getExtensionVersion(i10);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        f41876b = i10 >= 30 ? a.f41880a.a(30) : 0;
        f41877c = i10 >= 30 ? a.f41880a.a(31) : 0;
        f41878d = i10 >= 30 ? a.f41880a.a(33) : 0;
        f41879e = i10 >= 30 ? a.f41880a.a(1000000) : 0;
    }

    private c() {
    }

    public static final boolean a() {
        return Build.VERSION.SDK_INT >= 36 && b.a() >= 3600001;
    }

    public static final boolean b(String codename, String buildCodename) {
        s.h(codename, "codename");
        s.h(buildCodename, "buildCodename");
        if (s.c("REL", buildCodename)) {
            return false;
        }
        Integer numC = c(buildCodename);
        Integer numC2 = c(codename);
        if (numC != null && numC2 != null) {
            return numC.intValue() >= numC2.intValue();
        }
        if (numC != null || numC2 != null) {
            return numC != null;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        s.g(upperCase, "toUpperCase(...)");
        String upperCase2 = codename.toUpperCase(locale);
        s.g(upperCase2, "toUpperCase(...)");
        return upperCase.compareTo(upperCase2) >= 0;
    }

    private static final Integer c(String str) {
        String upperCase = str.toUpperCase(Locale.ROOT);
        s.g(upperCase, "toUpperCase(...)");
        return s.c(upperCase, "BAKLAVA") ? 0 : null;
    }

    public static final boolean d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        s.g(CODENAME, "CODENAME");
        return b("S", CODENAME);
    }

    public static final boolean e() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        s.g(CODENAME, "CODENAME");
        return b("UpsideDownCake", CODENAME);
    }

    public static final boolean f() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return true;
        }
        if (i10 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        s.g(CODENAME, "CODENAME");
        return b("VanillaIceCream", CODENAME);
    }
}
