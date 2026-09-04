package n7;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.h0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f46891b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile j f46892c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fl.k f46893a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            j jVarA = j.a();
            if (jVarA != null) {
                return jVarA;
            }
            synchronized (this) {
                DefaultConstructorMarker defaultConstructorMarker = null;
                if (!h0.K()) {
                    return null;
                }
                j jVarA2 = j.a();
                if (jVarA2 == null) {
                    jVarA2 = new j(defaultConstructorMarker);
                    j.b(jVarA2);
                }
                return jVarA2;
            }
        }

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class b extends t implements tl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f46894a = new b();

        b() {
            super(0);
        }

        @Override // tl.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            return h0.m().getSharedPreferences("com.facebook.sdk.APPLINK_INFO", 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            s.h(activity, "activity");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            s.h(activity, "activity");
            j jVarA = j.f46891b.a();
            if (jVarA != null) {
                jVarA.g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            s.h(activity, "activity");
            s.h(bundle, "bundle");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            s.h(activity, "activity");
            j jVarA = j.f46891b.a();
            if (jVarA != null) {
                jVarA.g(activity);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            s.h(activity, "activity");
        }
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final /* synthetic */ j a() {
        if (x7.a.c(j.class)) {
            return null;
        }
        try {
            return f46892c;
        } catch (Throwable th2) {
            x7.a.b(th2, j.class);
            return null;
        }
    }

    public static final /* synthetic */ void b(j jVar) {
        if (x7.a.c(j.class)) {
            return;
        }
        try {
            f46892c = jVar;
        } catch (Throwable th2) {
            x7.a.b(th2, j.class);
        }
    }

    private final SharedPreferences f() {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            Object value = this.f46893a.getValue();
            s.g(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final String c(Intent intent) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra("al_applink_data");
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString("campaign_ids");
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final String d(Uri uri) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(uri, "uri");
            String queryParameter = uri.getQueryParameter("al_applink_data");
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString("campaign_ids");
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final String e(String key) {
        if (x7.a.c(this)) {
            return null;
        }
        try {
            s.h(key, "key");
            return f().getString(key, null);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
            return null;
        }
    }

    public final void g(Activity activity) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            s.g(intent, "activity.intent");
            h(data, intent);
            i(data);
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void h(Uri uri, Intent intent) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(uri, "uri");
            s.h(intent, "intent");
            String strD = d(uri);
            if (strD == null) {
                strD = c(intent);
            }
            if (strD != null) {
                f().edit().putString("campaign_ids", strD).apply();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void i(Uri uri) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(uri, "uri");
            String queryParameter = uri.getQueryParameter("fbclid");
            if (queryParameter != null && queryParameter.length() != 0) {
                f().edit().putString("click_id", queryParameter).apply();
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    public final void j(Application application) {
        if (x7.a.c(this)) {
            return;
        }
        try {
            s.h(application, "application");
            application.registerActivityLifecycleCallbacks(new c());
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private j() {
        this.f46893a = fl.l.b(b.f46894a);
    }
}
