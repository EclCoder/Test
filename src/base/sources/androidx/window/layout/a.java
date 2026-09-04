package androidx.window.layout;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f7693a = new a();

    private a() {
    }

    public final boolean a(Activity activity) {
        kotlin.jvm.internal.s.h(activity, "activity");
        return activity.isInMultiWindowMode();
    }
}
