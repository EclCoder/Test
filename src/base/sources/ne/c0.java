package ne;

import com.mbridge.msdk.dycreator.baseview.qEqO.QGbBllacZSmHKn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f47145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f47146d;

    public c0(String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.s.h(processName, "processName");
        this.f47143a = processName;
        this.f47144b = i10;
        this.f47145c = i11;
        this.f47146d = z10;
    }

    public final int a() {
        return this.f47145c;
    }

    public final int b() {
        return this.f47144b;
    }

    public final String c() {
        return this.f47143a;
    }

    public final boolean d() {
        return this.f47146d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return kotlin.jvm.internal.s.c(this.f47143a, c0Var.f47143a) && this.f47144b == c0Var.f47144b && this.f47145c == c0Var.f47145c && this.f47146d == c0Var.f47146d;
    }

    public int hashCode() {
        return (((((this.f47143a.hashCode() * 31) + Integer.hashCode(this.f47144b)) * 31) + Integer.hashCode(this.f47145c)) * 31) + Boolean.hashCode(this.f47146d);
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f47143a + ", pid=" + this.f47144b + QGbBllacZSmHKn.MSk + this.f47145c + ", isDefaultProcess=" + this.f47146d + ')';
    }
}
