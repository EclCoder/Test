package o2;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k0 f48081c = new k0(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f48082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f48083b;

    public k0(long j10, long j11) {
        this.f48082a = j10;
        this.f48083b = j11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f48082a == k0Var.f48082a && this.f48083b == k0Var.f48083b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((int) this.f48082a) * 31) + ((int) this.f48083b);
    }

    public String toString() {
        return "[timeUs=" + this.f48082a + ", position=" + this.f48083b + "]";
    }
}
