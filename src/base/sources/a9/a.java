package a9;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e f154c;

    a(Integer num, Object obj, e eVar, f fVar, d dVar) {
        this.f152a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f153b = obj;
        if (eVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f154c = eVar;
    }

    @Override // a9.c
    public Integer a() {
        return this.f152a;
    }

    @Override // a9.c
    public d b() {
        return null;
    }

    @Override // a9.c
    public Object c() {
        return this.f153b;
    }

    @Override // a9.c
    public e d() {
        return this.f154c;
    }

    @Override // a9.c
    public f e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            Integer num = this.f152a;
            if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
                if (this.f153b.equals(cVar.c()) && this.f154c.equals(cVar.d())) {
                    cVar.e();
                    cVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f152a;
        return ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f153b.hashCode()) * 1000003) ^ this.f154c.hashCode()) * (-721379959);
    }

    public String toString() {
        return "Event{code=" + this.f152a + ", payload=" + this.f153b + ", priority=" + this.f154c + ", productData=" + ((Object) null) + ", eventContext=" + ((Object) null) + "}";
    }
}
