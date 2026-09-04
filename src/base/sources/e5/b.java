package e5;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f37149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f37150b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37151c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f37152d;

    public b(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f37149a = z10;
        this.f37150b = z11;
        this.f37151c = z12;
        this.f37152d = z13;
    }

    public boolean a() {
        return this.f37149a;
    }

    public boolean b() {
        return this.f37151c;
    }

    public boolean c() {
        return this.f37152d;
    }

    public boolean d() {
        return this.f37150b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f37149a == bVar.f37149a && this.f37150b == bVar.f37150b && this.f37151c == bVar.f37151c && this.f37152d == bVar.f37152d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public int hashCode() {
        ?? r10 = this.f37149a;
        int i10 = r10;
        if (this.f37150b) {
            i10 = r10 + 16;
        }
        int i11 = i10;
        if (this.f37151c) {
            i11 = i10 + 256;
        }
        return this.f37152d ? i11 + 4096 : i11;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", Boolean.valueOf(this.f37149a), Boolean.valueOf(this.f37150b), Boolean.valueOf(this.f37151c), Boolean.valueOf(this.f37152d));
    }
}
