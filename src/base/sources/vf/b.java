package vf;

import android.app.NotificationManager;
import android.content.Context;
import android.media.projection.MediaProjectionManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.squareup.moshi.r;
import em.k0;
import em.o0;
import em.p0;
import em.u2;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {
    public final o0 a(k0 defaultDispatcher) {
        s.h(defaultDispatcher, "defaultDispatcher");
        return p0.a(u2.b(null, 1, null).plus(defaultDispatcher));
    }

    public final FirebaseAnalytics b(Context context) {
        s.h(context, "context");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        s.g(firebaseAnalytics, "getInstance(...)");
        return firebaseAnalytics;
    }

    public final LayoutInflater c(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        s.f(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return (LayoutInflater) systemService;
    }

    public final MediaProjectionManager d(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("media_projection");
        s.f(systemService, "null cannot be cast to non-null type android.media.projection.MediaProjectionManager");
        return (MediaProjectionManager) systemService;
    }

    public final r e() {
        r rVarA = new r.a().a();
        s.g(rVarA, "build(...)");
        return rVarA;
    }

    public final NotificationManager f(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("notification");
        s.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        return (NotificationManager) systemService;
    }

    public final sf.e g(Context context) {
        s.h(context, "context");
        return new sf.i(context);
    }

    public final WindowManager h(Context context) {
        s.h(context, "context");
        Object systemService = context.getSystemService("window");
        s.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }
}
