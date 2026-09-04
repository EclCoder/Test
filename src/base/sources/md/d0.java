package md;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class d0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0.a f45982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i0.c f45983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i0.b f45984c;

    d0(i0.a aVar, i0.c cVar, i0.b bVar) {
        if (aVar == null) {
            throw new NullPointerException("Null appData");
        }
        this.f45982a = aVar;
        if (cVar == null) {
            throw new NullPointerException("Null osData");
        }
        this.f45983b = cVar;
        if (bVar == null) {
            throw new NullPointerException("Null deviceData");
        }
        this.f45984c = bVar;
    }

    @Override // md.i0
    public i0.a a() {
        return this.f45982a;
    }

    @Override // md.i0
    public i0.b c() {
        return this.f45984c;
    }

    @Override // md.i0
    public i0.c d() {
        return this.f45983b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (this.f45982a.equals(i0Var.a()) && this.f45983b.equals(i0Var.d()) && this.f45984c.equals(i0Var.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f45982a.hashCode() ^ 1000003) * 1000003) ^ this.f45983b.hashCode()) * 1000003) ^ this.f45984c.hashCode();
    }

    public String toString() {
        return "StaticSessionData{appData=" + this.f45982a + ", osData=" + this.f45983b + ", deviceData=" + this.f45984c + "}";
    }
}
