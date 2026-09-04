package z4;

import android.graphics.Rect;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f58614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f58615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f58616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f58617d;

    public b(int i10, int i11, int i12, int i13) {
        this.f58614a = i10;
        this.f58615b = i11;
        this.f58616c = i12;
        this.f58617d = i13;
    }

    public final int a() {
        return this.f58617d - this.f58615b;
    }

    public final int b() {
        return this.f58614a;
    }

    public final int c() {
        return this.f58615b;
    }

    public final int d() {
        return this.f58616c - this.f58614a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!s.c(b.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.core.Bounds");
        }
        b bVar = (b) obj;
        return this.f58614a == bVar.f58614a && this.f58615b == bVar.f58615b && this.f58616c == bVar.f58616c && this.f58617d == bVar.f58617d;
    }

    public final Rect f() {
        return new Rect(this.f58614a, this.f58615b, this.f58616c, this.f58617d);
    }

    public int hashCode() {
        return (((((this.f58614a * 31) + this.f58615b) * 31) + this.f58616c) * 31) + this.f58617d;
    }

    public String toString() {
        return ((Object) b.class.getSimpleName()) + " { [" + this.f58614a + ',' + this.f58615b + ',' + this.f58616c + ',' + this.f58617d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        s.h(rect, "rect");
    }
}
