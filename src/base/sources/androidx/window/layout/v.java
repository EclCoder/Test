package androidx.window.layout;

import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z4.b f7765a;

    public v(z4.b _bounds) {
        kotlin.jvm.internal.s.h(_bounds, "_bounds");
        this.f7765a = _bounds;
    }

    public final Rect a() {
        return this.f7765a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.s.c(v.class, obj.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f7765a, ((v) obj).f7765a);
    }

    public int hashCode() {
        return this.f7765a.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + a() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v(Rect bounds) {
        this(new z4.b(bounds));
        kotlin.jvm.internal.s.h(bounds, "bounds");
    }
}
