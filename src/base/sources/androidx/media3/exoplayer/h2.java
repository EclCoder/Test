package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h2 f5379c = new h2(0, false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5381b;

    public h2(int i10, boolean z10) {
        this.f5380a = i10;
        this.f5381b = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h2.class == obj.getClass()) {
            h2 h2Var = (h2) obj;
            if (this.f5380a == h2Var.f5380a && this.f5381b == h2Var.f5381b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f5380a << 1) + (this.f5381b ? 1 : 0);
    }
}
