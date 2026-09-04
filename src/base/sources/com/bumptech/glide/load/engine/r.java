package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
final class r implements t5.c, n6.a.f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final m0.d f11451e = n6.a.d(20, new a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n6.c f11452a = n6.c.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private t5.c f11453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f11454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f11455d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements n6.a.d {
        a() {
        }

        @Override // n6.a.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public r a() {
            return new r();
        }
    }

    r() {
    }

    private void c(t5.c cVar) {
        this.f11455d = false;
        this.f11454c = true;
        this.f11453b = cVar;
    }

    static r e(t5.c cVar) {
        r rVar = (r) m6.k.e((r) f11451e.b());
        rVar.c(cVar);
        return rVar;
    }

    private void f() {
        this.f11453b = null;
        f11451e.a(this);
    }

    @Override // t5.c
    public synchronized void a() {
        this.f11452a.c();
        this.f11455d = true;
        if (!this.f11454c) {
            this.f11453b.a();
            f();
        }
    }

    @Override // t5.c
    public Class b() {
        return this.f11453b.b();
    }

    @Override // n6.a.f
    public n6.c d() {
        return this.f11452a;
    }

    synchronized void g() {
        this.f11452a.c();
        if (!this.f11454c) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f11454c = false;
        if (this.f11455d) {
            a();
        }
    }

    @Override // t5.c
    public Object get() {
        return this.f11453b.get();
    }

    @Override // t5.c
    public int getSize() {
        return this.f11453b.getSize();
    }
}
