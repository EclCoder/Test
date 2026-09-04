package kotlinx.serialization.json;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f43641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f43642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f43643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f43644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f43646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f43647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f43648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f43649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f43650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f43651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f43652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f43653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f43654n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f43655o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f43656p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private vm.b f43657q;

    public e(b json) {
        kotlin.jvm.internal.s.h(json, "json");
        this.f43641a = json.e().i();
        this.f43642b = json.e().j();
        this.f43643c = json.e().k();
        this.f43644d = json.e().q();
        this.f43645e = json.e().m();
        this.f43646f = json.e().n();
        this.f43647g = json.e().g();
        this.f43648h = json.e().e();
        this.f43649i = json.e().f();
        this.f43650j = json.e().o();
        json.e().l();
        this.f43651k = json.e().h();
        this.f43652l = json.e().d();
        this.f43653m = json.e().a();
        this.f43654n = json.e().b();
        this.f43655o = json.e().c();
        this.f43656p = json.e().p();
        this.f43657q = json.a();
    }

    public final g a() {
        if (this.f43656p) {
            if (!kotlin.jvm.internal.s.c(this.f43648h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f43649i != a.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f43645e) {
            if (!kotlin.jvm.internal.s.c(this.f43646f, "    ")) {
                String str = this.f43646f;
                for (int i10 = 0; i10 < str.length(); i10++) {
                    char cCharAt = str.charAt(i10);
                    if (cCharAt != ' ' && cCharAt != '\t' && cCharAt != '\r' && cCharAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f43646f).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.s.c(this.f43646f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new g(this.f43641a, this.f43643c, this.f43644d, this.f43655o, this.f43645e, this.f43642b, this.f43646f, this.f43647g, this.f43656p, this.f43648h, this.f43654n, this.f43650j, null, this.f43651k, this.f43652l, this.f43653m, this.f43649i);
    }

    public final vm.b b() {
        return this.f43657q;
    }

    public final void c(boolean z10) {
        this.f43655o = z10;
    }

    public final void d(boolean z10) {
        this.f43641a = z10;
    }

    public final void e(boolean z10) {
        this.f43642b = z10;
    }

    public final void f(boolean z10) {
        this.f43643c = z10;
    }

    public final void g(boolean z10) {
        this.f43645e = z10;
    }
}
