package gp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f39835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f39836b;

    public d(f fVar, f fVar2) {
        this.f39835a = (f) ip.a.h(fVar, "HTTP context");
        this.f39836b = fVar2;
    }

    @Override // gp.f
    public void a(String str, Object obj) {
        this.f39835a.a(str, obj);
    }

    @Override // gp.f
    public Object getAttribute(String str) {
        Object attribute = this.f39835a.getAttribute(str);
        return attribute == null ? this.f39836b.getAttribute(str) : attribute;
    }

    public String toString() {
        return "[local: " + this.f39835a + "defaults: " + this.f39836b + "]";
    }
}
