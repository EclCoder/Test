package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f554f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f559e;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(float f10, float f11, float f12, int i10, long j10) {
        this.f555a = f10;
        this.f556b = f11;
        this.f557c = f12;
        this.f558d = i10;
        this.f559e = j10;
    }

    public final float a() {
        return this.f557c;
    }

    public final int b() {
        return this.f558d;
    }

    public final float c() {
        return this.f556b;
    }

    public String toString() {
        return "BackEventCompat(touchX=" + this.f555a + ", touchY=" + this.f556b + ", progress=" + this.f557c + ", swipeEdge=" + this.f558d + ", frameTimeMillis=" + this.f559e + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        kotlin.jvm.internal.s.h(backEvent, "backEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(e4.b navigationEvent) {
        this(navigationEvent.d(), navigationEvent.e(), navigationEvent.b(), navigationEvent.c(), navigationEvent.a());
        kotlin.jvm.internal.s.h(navigationEvent, "navigationEvent");
    }
}
