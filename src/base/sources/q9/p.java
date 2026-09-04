package q9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f50486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f50487b;

    public p(int i10, float f10) {
        this.f50486a = i10;
        this.f50487b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p.class == obj.getClass()) {
            p pVar = (p) obj;
            if (this.f50486a == pVar.f50486a && Float.compare(pVar.f50487b, this.f50487b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f50486a) * 31) + Float.floatToIntBits(this.f50487b);
    }
}
