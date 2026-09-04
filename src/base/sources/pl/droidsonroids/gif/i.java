package pl.droidsonroids.gif;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f50242a;

    private static Context a() {
        if (f50242a == null) {
            try {
                f50242a = (Context) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", null).invoke(null, null);
            } catch (Exception e10) {
                throw new IllegalStateException("LibraryLoader not initialized. Call LibraryLoader.initialize() before using library classes.", e10);
            }
        }
        return f50242a;
    }

    static void b() {
        try {
            System.loadLibrary("pl_droidsonroids_gif");
        } catch (UnsatisfiedLinkError unused) {
            j8.b.a(a(), "pl_droidsonroids_gif");
        }
    }
}
