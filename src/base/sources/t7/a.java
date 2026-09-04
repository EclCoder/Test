package t7;

import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f53159b;

    public a(String name, boolean z10) {
        s.h(name, "name");
        this.f53158a = name;
        this.f53159b = z10;
    }

    public final String a() {
        return this.f53158a;
    }

    public final boolean b() {
        return this.f53159b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return s.c(this.f53158a, aVar.f53158a) && this.f53159b == aVar.f53159b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f53158a.hashCode() * 31;
        boolean z10 = this.f53159b;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        return iHashCode + r10;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f53158a + ", value=" + this.f53159b + ')';
    }
}
