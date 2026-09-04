package androidx.window.layout;

import android.view.DisplayCutout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f7696a = new d();

    private d() {
    }

    public final int a(DisplayCutout displayCutout) {
        kotlin.jvm.internal.s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        kotlin.jvm.internal.s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        kotlin.jvm.internal.s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        kotlin.jvm.internal.s.h(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
