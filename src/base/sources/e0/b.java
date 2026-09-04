package e0;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f36999e = new b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37003d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class a {
        static Insets a(int i10, int i11, int i12, int i13) {
            return Insets.of(i10, i11, i12, i13);
        }
    }

    private b(int i10, int i11, int i12, int i13) {
        this.f37000a = i10;
        this.f37001b = i11;
        this.f37002c = i12;
        this.f37003d = i13;
    }

    public static b a(b bVar, b bVar2) {
        return c(Math.max(bVar.f37000a, bVar2.f37000a), Math.max(bVar.f37001b, bVar2.f37001b), Math.max(bVar.f37002c, bVar2.f37002c), Math.max(bVar.f37003d, bVar2.f37003d));
    }

    public static b b(b bVar, b bVar2) {
        return c(Math.min(bVar.f37000a, bVar2.f37000a), Math.min(bVar.f37001b, bVar2.f37001b), Math.min(bVar.f37002c, bVar2.f37002c), Math.min(bVar.f37003d, bVar2.f37003d));
    }

    public static b c(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f36999e : new b(i10, i11, i12, i13);
    }

    public static b d(Rect rect) {
        return c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static b e(Insets insets) {
        return c(insets.left, insets.top, insets.right, insets.bottom);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37003d == bVar.f37003d && this.f37000a == bVar.f37000a && this.f37002c == bVar.f37002c && this.f37001b == bVar.f37001b;
    }

    public Insets f() {
        return a.a(this.f37000a, this.f37001b, this.f37002c, this.f37003d);
    }

    public int hashCode() {
        return (((((this.f37000a * 31) + this.f37001b) * 31) + this.f37002c) * 31) + this.f37003d;
    }

    public String toString() {
        return "Insets{left=" + this.f37000a + ", top=" + this.f37001b + ", right=" + this.f37002c + ", bottom=" + this.f37003d + '}';
    }
}
