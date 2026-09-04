package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7694a = new b();

    private b() {
    }

    public final Rect a(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        kotlin.jvm.internal.s.g(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }
}
