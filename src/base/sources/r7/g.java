package r7;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f51127d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f51128e = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f51129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f51130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f51131c;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Activity activity) {
            s.h(activity, "activity");
            int iHashCode = activity.hashCode();
            Map mapB = g.b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object gVar = mapB.get(numValueOf);
            if (gVar == null) {
                gVar = new g(activity, null);
                mapB.put(numValueOf, gVar);
            }
            g.c((g) gVar);
        }

        public final void b(Activity activity) {
            s.h(activity, "activity");
            g gVar = (g) g.b().remove(Integer.valueOf(activity.hashCode()));
            if (gVar != null) {
                g.d(gVar);
            }
        }

        private a() {
        }
    }

    public /* synthetic */ g(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }

    public static final /* synthetic */ Map b() {
        if (x7.a.c(g.class)) {
            return null;
        }
        try {
            return f51128e;
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
            return null;
        }
    }

    public static final /* synthetic */ void c(g gVar) {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            gVar.g();
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    public static final /* synthetic */ void d(g gVar) {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            gVar.h();
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    private final void e() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            Runnable runnable = new Runnable() { // from class: r7.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.f(this.f51126a);
                }
            };
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.f51130b.post(runnable);
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(g this$0) {
        if (x7.a.c(g.class)) {
            return;
        }
        try {
            s.h(this$0, "this$0");
            try {
                View viewD = n7.h.d((Activity) this$0.f51129a.get());
                Activity activity = (Activity) this$0.f51129a.get();
                if (viewD != null && activity != null) {
                    for (View view : c.a(viewD)) {
                        if (!f7.d.g(view)) {
                            String strD = c.d(view);
                            if (strD.length() > 0 && strD.length() <= 300) {
                                j.a aVar = j.f51138e;
                                String localClassName = activity.getLocalClassName();
                                s.g(localClassName, "activity.localClassName");
                                aVar.d(view, viewD, localClassName);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            x7.a.b(th2, g.class);
        }
    }

    private final void g() {
        View viewD;
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (!this.f51131c.getAndSet(true) && (viewD = n7.h.d((Activity) this.f51129a.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewD.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalLayoutListener(this);
                    e();
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private final void h() {
        View viewD;
        if (x7.a.c(this)) {
            return;
        }
        try {
            if (this.f51131c.getAndSet(false) && (viewD = n7.h.d((Activity) this.f51129a.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewD.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
            }
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (x7.a.c(this)) {
            return;
        }
        try {
            e();
        } catch (Throwable th2) {
            x7.a.b(th2, this);
        }
    }

    private g(Activity activity) {
        this.f51129a = new WeakReference(activity);
        this.f51130b = new Handler(Looper.getMainLooper());
        this.f51131c = new AtomicBoolean(false);
    }
}
