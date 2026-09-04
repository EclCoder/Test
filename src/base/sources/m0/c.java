package m0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f45059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f45060b;

    public c(Object obj, Object obj2) {
        this.f45059a = obj;
        this.f45060b = obj2;
    }

    public static c a(Object obj, Object obj2) {
        return new c(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f45059a, this.f45059a) && b.a(cVar.f45060b, this.f45060b);
    }

    public int hashCode() {
        Object obj = this.f45059a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f45060b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f45059a + " " + this.f45060b + "}";
    }
}
