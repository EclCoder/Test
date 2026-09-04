package he;

import ae.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f40337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f40338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f40339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f40340d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f40337a = contextA;
        this.f40338b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f40339c = cVar;
        this.f40340d = c();
    }

    private static Context a(Context context) {
        return androidx.core.content.a.createDeviceProtectedStorageContext(context);
    }

    private boolean c() {
        return this.f40338b.contains("firebase_data_collection_default_enabled") ? this.f40338b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f40337a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f40337a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized boolean b() {
        return this.f40340d;
    }
}
