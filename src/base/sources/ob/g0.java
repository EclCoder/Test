package ob;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g0 f48376c = new g0(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g0 f48377d = new g0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48379b;

    public g0(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f48378a = i10;
        this.f48379b = i11;
    }

    public int a() {
        return this.f48379b;
    }

    public int b() {
        return this.f48378a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f48378a == g0Var.f48378a && this.f48379b == g0Var.f48379b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f48379b;
        int i11 = this.f48378a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f48378a + "x" + this.f48379b;
    }
}
