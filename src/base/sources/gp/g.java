package gp;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes7.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f39839a;

    public g(f fVar) {
        this.f39839a = fVar;
    }

    public static g b(f fVar) {
        ip.a.h(fVar, "HTTP context");
        return fVar instanceof g ? (g) fVar : new g(fVar);
    }

    @Override // gp.f
    public void a(String str, Object obj) {
        this.f39839a.a(str, obj);
    }

    public Object c(String str, Class cls) {
        ip.a.h(cls, "Attribute class");
        Object attribute = getAttribute(str);
        if (attribute == null) {
            return null;
        }
        return cls.cast(attribute);
    }

    public co.i d() {
        return (co.i) c("http.connection", co.i.class);
    }

    public co.o e() {
        return (co.o) c("http.request", co.o.class);
    }

    public co.l f() {
        return (co.l) c("http.target_host", co.l.class);
    }

    public boolean g() {
        Boolean bool = (Boolean) c("http.request_sent", Boolean.class);
        return bool != null && bool.booleanValue();
    }

    @Override // gp.f
    public Object getAttribute(String str) {
        return this.f39839a.getAttribute(str);
    }
}
