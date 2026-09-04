package m6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class f45285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Class f45286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Class f45287c;

    public j() {
    }

    public void a(Class cls, Class cls2, Class cls3) {
        this.f45285a = cls;
        this.f45286b = cls2;
        this.f45287c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f45285a.equals(jVar.f45285a) && this.f45286b.equals(jVar.f45286b) && l.d(this.f45287c, jVar.f45287c);
    }

    public int hashCode() {
        int iHashCode = ((this.f45285a.hashCode() * 31) + this.f45286b.hashCode()) * 31;
        Class cls = this.f45287c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f45285a + ", second=" + this.f45286b + '}';
    }

    public j(Class cls, Class cls2, Class cls3) {
        a(cls, cls2, cls3);
    }
}
