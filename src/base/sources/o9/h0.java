package o9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h0 f48289b = new h0(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48290a;

    public h0(boolean z10) {
        this.f48290a = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && h0.class == obj.getClass() && this.f48290a == ((h0) obj).f48290a;
    }

    public int hashCode() {
        return !this.f48290a ? 1 : 0;
    }
}
