package ob;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Surface f48395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f48397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f48398d;

    public j0(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f48396b == j0Var.f48396b && this.f48397c == j0Var.f48397c && this.f48398d == j0Var.f48398d && this.f48395a.equals(j0Var.f48395a);
    }

    public int hashCode() {
        return (((((this.f48395a.hashCode() * 31) + this.f48396b) * 31) + this.f48397c) * 31) + this.f48398d;
    }

    public j0(Surface surface, int i10, int i11, int i12) {
        a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f48395a = surface;
        this.f48396b = i10;
        this.f48397c = i11;
        this.f48398d = i12;
    }
}
