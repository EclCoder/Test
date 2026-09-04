package n0;

import android.graphics.Point;
import android.view.RoundedCorner;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f46629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f46630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Point f46631c;

    public g0(int i10, int i11, int i12, int i13) {
        this.f46629a = i10;
        this.f46630b = i11;
        this.f46631c = new Point(i12, i13);
    }

    private static int c(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                if (i10 == 3) {
                    return 3;
                }
                throw new IllegalArgumentException("Invalid position: " + i10);
            }
        }
        return i11;
    }

    static g0 d(RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            return new g0(c(roundedCorner.getPosition()), roundedCorner.getRadius(), roundedCorner.getCenter());
        }
        return null;
    }

    public int b() {
        return this.f46630b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f46629a == g0Var.f46629a && this.f46630b == g0Var.f46630b && this.f46631c.equals(g0Var.f46631c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f46629a * 31) + this.f46630b) * 31) + this.f46631c.hashCode();
    }

    public String toString() {
        return "RoundedCornerCompat{position=" + a(this.f46629a) + ", radius=" + this.f46630b + ", center=" + this.f46631c + '}';
    }

    private String a(int i10) {
        if (i10 == 0) {
            return "TopLeft";
        }
        if (i10 == 1) {
            return "TopRight";
        }
        if (i10 != 2) {
            return i10 != 3 ? YSHErhbVu.ndzvSXDF : "BottomLeft";
        }
        return "BottomRight";
    }

    private g0(int i10, int i11, Point point) {
        this(i10, i11, point.x, point.y);
    }
}
