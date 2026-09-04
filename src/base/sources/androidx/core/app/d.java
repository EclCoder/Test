package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final Class f3270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final Field f3271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected static final Field f3272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final Method f3273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Method f3274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Method f3275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Handler f3276g = new Handler(Looper.getMainLooper());

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C0028d f3277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3278b;

        a(C0028d c0028d, Object obj) {
            this.f3277a = c0028d;
            this.f3278b = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3277a.f3283a = this.f3278b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Application f3279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0028d f3280b;

        b(Application application, C0028d c0028d) {
            this.f3279a = application;
            this.f3280b = c0028d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3279a.unregisterActivityLifecycleCallbacks(this.f3280b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f3281a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f3282b;

        c(Object obj, Object obj2) {
            this.f3281a = obj;
            this.f3282b = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f3273d;
                if (method != null) {
                    method.invoke(this.f3281a, this.f3282b, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f3274e.invoke(this.f3281a, this.f3282b, Boolean.FALSE);
                }
            } catch (RuntimeException e10) {
                if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                    throw e10;
                }
            } catch (Throwable th2) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
            }
        }
    }

    static {
        Class clsA = a();
        f3270a = clsA;
        f3271b = b();
        f3272c = f();
        f3273d = d(clsA);
        f3274e = c(clsA);
        f3275f = e(clsA);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 == 26 || i10 == 27;
    }

    protected static boolean h(Object obj, int i10, Activity activity) {
        try {
            Object obj2 = f3272c.get(activity);
            if (obj2 == obj && activity.hashCode() == i10) {
                f3276g.postAtFrontOfQueue(new c(f3271b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th2);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f3275f == null) {
            return false;
        }
        if (f3274e == null && f3273d == null) {
            return false;
        }
        try {
            Object obj2 = f3272c.get(activity);
            if (obj2 == null || (obj = f3271b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0028d c0028d = new C0028d(activity);
            application.registerActivityLifecycleCallbacks(c0028d);
            f3276g.post(new a(c0028d, obj2));
            try {
                if (g()) {
                    Method method = f3275f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                return true;
            } finally {
                f3276g.post(new b(application, c0028d));
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class C0028d implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f3283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Activity f3284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f3286d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f3287e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f3288f = false;

        C0028d(Activity activity) {
            this.f3284b = activity;
            this.f3285c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f3284b == activity) {
                this.f3284b = null;
                this.f3287e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f3287e || this.f3288f || this.f3286d || !d.h(this.f3283a, this.f3285c, activity)) {
                return;
            }
            this.f3288f = true;
            this.f3283a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f3284b == activity) {
                this.f3286d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
