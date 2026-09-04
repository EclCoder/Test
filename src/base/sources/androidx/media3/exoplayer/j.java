package androidx.media3.exoplayer;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1.o f5402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1.o f5403c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5404d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5405e;

    public j(String str, t1.o oVar, t1.o oVar2, int i10, int i11) {
        w1.a.a(i10 == 0 || i11 == 0);
        this.f5401a = w1.a.d(str);
        this.f5402b = (t1.o) w1.a.e(oVar);
        this.f5403c = (t1.o) w1.a.e(oVar2);
        this.f5404d = i10;
        this.f5405e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (this.f5404d == jVar.f5404d && this.f5405e == jVar.f5405e && this.f5401a.equals(jVar.f5401a) && this.f5402b.equals(jVar.f5402b) && this.f5403c.equals(jVar.f5403c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f5404d) * 31) + this.f5405e) * 31) + this.f5401a.hashCode()) * 31) + this.f5402b.hashCode()) * 31) + this.f5403c.hashCode();
    }
}
