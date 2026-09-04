package i5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f41018b;

    public g(String str, int i10) {
        this.f41017a = str;
        this.f41018b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f41018b != gVar.f41018b) {
            return false;
        }
        return this.f41017a.equals(gVar.f41017a);
    }

    public int hashCode() {
        return (this.f41017a.hashCode() * 31) + this.f41018b;
    }
}
