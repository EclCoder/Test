package fl;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f38767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f38768b;

    public q(Object obj, Object obj2) {
        this.f38767a = obj;
        this.f38768b = obj2;
    }

    public final Object d() {
        return this.f38767a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return kotlin.jvm.internal.s.c(this.f38767a, qVar.f38767a) && kotlin.jvm.internal.s.c(this.f38768b, qVar.f38768b);
    }

    public final Object g() {
        return this.f38768b;
    }

    public final Object h() {
        return this.f38767a;
    }

    public int hashCode() {
        Object obj = this.f38767a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f38768b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final Object i() {
        return this.f38768b;
    }

    public String toString() {
        return '(' + this.f38767a + ", " + this.f38768b + ')';
    }
}
