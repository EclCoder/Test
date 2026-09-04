package t1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f52577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f52578b;

    public c(int i10, float f10) {
        this.f52577a = i10;
        this.f52578b = f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (this.f52577a == cVar.f52577a && Float.compare(cVar.f52578b, this.f52578b) == 0) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f52577a) * 31) + Float.floatToIntBits(this.f52578b);
    }
}
