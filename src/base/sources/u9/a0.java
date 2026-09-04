package u9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f54230c = new a0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f54231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54232b;

    public a0(long j10, long j11) {
        this.f54231a = j10;
        this.f54232b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (this.f54231a == a0Var.f54231a && this.f54232b == a0Var.f54232b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f54231a) * 31) + ((int) this.f54232b);
    }

    public String toString() {
        return "[timeUs=" + this.f54231a + ", position=" + this.f54232b + "]";
    }
}
