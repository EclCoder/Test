package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class v0 implements b0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f4510i = new b(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final v0 f4511j = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f4512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f4513b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f4516e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f4514c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4515d = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f0 f4517f = new f0(this);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f4518g = new Runnable() { // from class: androidx.lifecycle.u0
        @Override // java.lang.Runnable
        public final void run() {
            v0.i(this.f4506a);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y0.a f4519h = new d();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4520a = new a();

        private a() {
        }

        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks callback) {
            kotlin.jvm.internal.s.h(activity, "activity");
            kotlin.jvm.internal.s.h(callback, "callback");
            activity.registerActivityLifecycleCallbacks(callback);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b0 a() {
            return v0.f4511j;
        }

        public final void b(Context context) {
            kotlin.jvm.internal.s.h(context, "context");
            v0.f4511j.h(context);
        }

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class c extends n {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        public static final class a extends n {
            final /* synthetic */ v0 this$0;

            a(v0 v0Var) {
                this.this$0 = v0Var;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                kotlin.jvm.internal.s.h(activity, "activity");
                this.this$0.e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                kotlin.jvm.internal.s.h(activity, "activity");
                this.this$0.f();
            }
        }

        c() {
        }

        @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.s.h(activity, "activity");
            if (Build.VERSION.SDK_INT < 29) {
                y0.INSTANCE.b(activity).e(v0.this.f4519h);
            }
        }

        @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
            v0.this.d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            kotlin.jvm.internal.s.h(activity, "activity");
            a.a(activity, new a(v0.this));
        }

        @Override // androidx.lifecycle.n, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            kotlin.jvm.internal.s.h(activity, "activity");
            v0.this.g();
        }
    }

    private v0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(v0 v0Var) {
        v0Var.j();
        v0Var.k();
    }

    public final void d() {
        int i10 = this.f4513b - 1;
        this.f4513b = i10;
        if (i10 == 0) {
            Handler handler = this.f4516e;
            kotlin.jvm.internal.s.e(handler);
            handler.postDelayed(this.f4518g, 700L);
        }
    }

    public final void e() {
        int i10 = this.f4513b + 1;
        this.f4513b = i10;
        if (i10 == 1) {
            if (this.f4514c) {
                this.f4517f.m(s.a.ON_RESUME);
                this.f4514c = false;
            } else {
                Handler handler = this.f4516e;
                kotlin.jvm.internal.s.e(handler);
                handler.removeCallbacks(this.f4518g);
            }
        }
    }

    public final void f() {
        int i10 = this.f4512a + 1;
        this.f4512a = i10;
        if (i10 == 1 && this.f4515d) {
            this.f4517f.m(s.a.ON_START);
            this.f4515d = false;
        }
    }

    public final void g() {
        this.f4512a--;
        k();
    }

    @Override // androidx.lifecycle.b0
    public s getLifecycle() {
        return this.f4517f;
    }

    public final void h(Context context) {
        kotlin.jvm.internal.s.h(context, "context");
        this.f4516e = new Handler();
        this.f4517f.m(s.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    public final void j() {
        if (this.f4513b == 0) {
            this.f4514c = true;
            this.f4517f.m(s.a.ON_PAUSE);
        }
    }

    public final void k() {
        if (this.f4512a == 0 && this.f4514c) {
            this.f4517f.m(s.a.ON_STOP);
            this.f4515d = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class d implements y0.a {
        d() {
        }

        @Override // androidx.lifecycle.y0.a
        public void onResume() {
            v0.this.e();
        }

        @Override // androidx.lifecycle.y0.a
        public void onStart() {
            v0.this.f();
        }

        @Override // androidx.lifecycle.y0.a
        public void onCreate() {
        }
    }
}
