package jd;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f42345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f42346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f42347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    TaskCompletionSource f42348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f42349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f42350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f42351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TaskCompletionSource f42352h;

    public m0(com.google.firebase.f fVar) {
        Object obj = new Object();
        this.f42347c = obj;
        this.f42348d = new TaskCompletionSource();
        this.f42349e = false;
        this.f42350f = false;
        this.f42352h = new TaskCompletionSource();
        Context contextK = fVar.k();
        this.f42346b = fVar;
        this.f42345a = i.q(contextK);
        Boolean boolB = b();
        this.f42351g = boolB == null ? a(contextK) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f42348d.trySetResult(null);
                    this.f42349e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f42350f = false;
            return null;
        }
        this.f42350f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    private Boolean b() {
        if (!this.f42345a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f42350f = false;
        return Boolean.valueOf(this.f42345a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    private boolean e() {
        try {
            return this.f42346b.t();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private void f(boolean z10) {
        String str;
        String str2 = z10 ? "ENABLED" : "DISABLED";
        if (this.f42351g == null) {
            str = "global Firebase setting";
        } else {
            str = this.f42350f ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        gd.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", str2, str));
    }

    private static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e10) {
            gd.g.f().e("Could not read data collection permission from manifest", e10);
            return null;
        }
    }

    public void c(boolean z10) {
        if (!z10) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f42352h.trySetResult(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f42351g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th2) {
            throw th2;
        }
        return zBooleanValue;
    }

    public Task h() {
        Task task;
        synchronized (this.f42347c) {
            task = this.f42348d.getTask();
        }
        return task;
    }

    public Task i() {
        return kd.b.b(this.f42352h.getTask(), h());
    }
}
