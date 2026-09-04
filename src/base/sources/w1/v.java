package w1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f55847c = new v(-1, -1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f55848d = new v(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f55849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f55850b;

    public v(int i10, int i11) {
        a.a((i10 == -1 || i10 >= 0) && (i11 == -1 || i11 >= 0));
        this.f55849a = i10;
        this.f55850b = i11;
    }

    public int a() {
        return this.f55850b;
    }

    public int b() {
        return this.f55849a;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f55849a == vVar.f55849a && this.f55850b == vVar.f55850b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.f55850b;
        int i11 = this.f55849a;
        return i10 ^ ((i11 >>> 16) | (i11 << 16));
    }

    public String toString() {
        return this.f55849a + "x" + this.f55850b;
    }
}
