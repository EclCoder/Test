package ln;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t.a f44761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44762b;

    public j(Throwable e10) {
        kotlin.jvm.internal.s.h(e10, "e");
        this.f44761a = new t.a(this, null, e10, 2, null);
    }

    @Override // ln.t.b
    public /* bridge */ /* synthetic */ n a() {
        return (n) g();
    }

    @Override // ln.t.b
    public t.a b() {
        return this.f44761a;
    }

    @Override // ln.t.b
    public /* bridge */ /* synthetic */ t.b c() {
        return (t.b) h();
    }

    @Override // ln.t.b
    public t.a d() {
        return this.f44761a;
    }

    @Override // ln.t.b, mn.d.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public final t.a f() {
        return this.f44761a;
    }

    public Void g() {
        throw new IllegalStateException("unexpected call");
    }

    public Void h() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ln.t.b
    public boolean isReady() {
        return this.f44762b;
    }
}
