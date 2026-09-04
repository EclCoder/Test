package sc;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final n f52308a = c();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class b implements n {
        private b() {
        }
    }

    static String a(String str) {
        if (e(str)) {
            return null;
        }
        return str;
    }

    static String b(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    private static n c() {
        return new b();
    }

    static String d(String str) {
        return str == null ? "" : str;
    }

    static boolean e(String str) {
        return str == null || str.isEmpty();
    }
}
