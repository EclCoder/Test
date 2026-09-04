package ln;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class r implements t.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n f44844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f44845b;

    public r(n connection) {
        kotlin.jvm.internal.s.h(connection, "connection");
        this.f44844a = connection;
        this.f44845b = true;
    }

    @Override // ln.t.b
    public n a() {
        return this.f44844a;
    }

    @Override // ln.t.b
    public /* bridge */ /* synthetic */ t.a b() {
        return (t.a) g();
    }

    @Override // ln.t.b
    public /* bridge */ /* synthetic */ t.b c() {
        return (t.b) i();
    }

    @Override // ln.t.b
    public /* bridge */ /* synthetic */ t.a d() {
        return (t.a) f();
    }

    @Override // ln.t.b, mn.d.a
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    public Void f() {
        throw new IllegalStateException("already connected");
    }

    public Void g() {
        throw new IllegalStateException("already connected");
    }

    public final n h() {
        return this.f44844a;
    }

    public Void i() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // ln.t.b
    public boolean isReady() {
        return this.f44845b;
    }
}
