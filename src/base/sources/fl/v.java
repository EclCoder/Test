package fl;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f38781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f38782c;

    public v(Object obj, Object obj2, Object obj3) {
        this.f38780a = obj;
        this.f38781b = obj2;
        this.f38782c = obj3;
    }

    public final Object d() {
        return this.f38780a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.s.c(this.f38780a, vVar.f38780a) && kotlin.jvm.internal.s.c(this.f38781b, vVar.f38781b) && kotlin.jvm.internal.s.c(this.f38782c, vVar.f38782c);
    }

    public final Object g() {
        return this.f38781b;
    }

    public final Object h() {
        return this.f38782c;
    }

    public int hashCode() {
        Object obj = this.f38780a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f38781b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f38782c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final Object i() {
        return this.f38780a;
    }

    public final Object j() {
        return this.f38781b;
    }

    public final Object k() {
        return this.f38782c;
    }

    public String toString() {
        return '(' + this.f38780a + ", " + this.f38781b + ", " + this.f38782c + ')';
    }
}
