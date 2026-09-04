package va;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55302d;

    public b(String str, String str2, int i10, int i11) {
        this.f55299a = str;
        this.f55300b = str2;
        this.f55301c = i10;
        this.f55302d = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f55301c == bVar.f55301c && this.f55302d == bVar.f55302d && sc.l.a(this.f55299a, bVar.f55299a) && sc.l.a(this.f55300b, bVar.f55300b);
    }

    public int hashCode() {
        return sc.l.b(this.f55299a, this.f55300b, Integer.valueOf(this.f55301c), Integer.valueOf(this.f55302d));
    }
}
