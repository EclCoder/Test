package y3;

import android.os.Bundle;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f57299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m1 f57300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f57301c;

    public u(int i10, m1 m1Var, Bundle bundle) {
        this.f57299a = i10;
        this.f57300b = m1Var;
        this.f57301c = bundle;
    }

    public final Bundle a() {
        return this.f57301c;
    }

    public final int b() {
        return this.f57299a;
    }

    public final m1 c() {
        return this.f57300b;
    }

    public final void d(Bundle bundle) {
        this.f57301c = bundle;
    }

    public final void e(m1 m1Var) {
        this.f57300b = m1Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f57299a != uVar.f57299a || !kotlin.jvm.internal.s.c(this.f57300b, uVar.f57300b)) {
            return false;
        }
        Bundle bundle = this.f57301c;
        Bundle bundle2 = uVar.f57301c;
        if (kotlin.jvm.internal.s.c(bundle, bundle2)) {
            return true;
        }
        return (bundle == null || bundle2 == null || !n4.c.c(n4.c.a(bundle), bundle2)) ? false : true;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f57299a) * 31;
        m1 m1Var = this.f57300b;
        int iHashCode2 = iHashCode + (m1Var != null ? m1Var.hashCode() : 0);
        Bundle bundle = this.f57301c;
        return bundle != null ? (iHashCode2 * 31) + n4.c.d(n4.c.a(bundle)) : iHashCode2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(u.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f57299a));
        sb2.append(")");
        if (this.f57300b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f57300b);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        return string;
    }

    public /* synthetic */ u(int i10, m1 m1Var, Bundle bundle, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : m1Var, (i11 & 4) != 0 ? null : bundle);
    }
}
