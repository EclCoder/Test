package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7695a = new c();

    private c() {
    }

    public final void a(Display display, Point point) {
        kotlin.jvm.internal.s.h(display, "display");
        kotlin.jvm.internal.s.h(point, "point");
        display.getRealSize(point);
    }
}
