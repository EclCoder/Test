package ob;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class o0 {
    public static void a(String str) {
        if (r0.f48425a >= 18) {
            b(str);
        }
    }

    private static void b(String str) {
        Trace.beginSection(str);
    }

    public static void c() {
        if (r0.f48425a >= 18) {
            d();
        }
    }

    private static void d() {
        Trace.endSection();
    }
}
