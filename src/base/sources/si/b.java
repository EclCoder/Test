package si;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f52438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52440d;

    public b(int i10, int i11, int i12, int i13) {
        this.f52437a = i10;
        this.f52438b = i11;
        this.f52439c = i12;
        this.f52440d = i13;
    }

    public final int a() {
        return this.f52440d;
    }

    public final int b() {
        return this.f52439c;
    }

    public final int c() {
        return this.f52437a;
    }

    public final int d() {
        return this.f52438b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f52437a == bVar.f52437a && this.f52438b == bVar.f52438b && this.f52439c == bVar.f52439c && this.f52440d == bVar.f52440d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f52437a) * 31) + Integer.hashCode(this.f52438b)) * 31) + Integer.hashCode(this.f52439c)) * 31) + Integer.hashCode(this.f52440d);
    }

    public String toString() {
        return "ViewPort(x=" + this.f52437a + ", y=" + this.f52438b + ", width=" + this.f52439c + ", height=" + this.f52440d + ")";
    }
}
