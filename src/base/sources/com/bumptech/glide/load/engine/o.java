package com.bumptech.glide.load.engine;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class o implements t5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t5.c f11440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f11441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final r5.e f11442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11444g;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void b(r5.e eVar, o oVar);
    }

    o(t5.c cVar, boolean z10, boolean z11, r5.e eVar, a aVar) {
        this.f11440c = (t5.c) m6.k.e(cVar);
        this.f11438a = z10;
        this.f11439b = z11;
        this.f11442e = eVar;
        this.f11441d = (a) m6.k.e(aVar);
    }

    @Override // t5.c
    public synchronized void a() {
        if (this.f11443f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f11444g) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f11444g = true;
        if (this.f11439b) {
            this.f11440c.a();
        }
    }

    @Override // t5.c
    public Class b() {
        return this.f11440c.b();
    }

    synchronized void c() {
        if (this.f11444g) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f11443f++;
    }

    t5.c d() {
        return this.f11440c;
    }

    boolean e() {
        return this.f11438a;
    }

    void f() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f11443f;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f11443f = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f11441d.b(this.f11442e, this);
        }
    }

    @Override // t5.c
    public Object get() {
        return this.f11440c.get();
    }

    @Override // t5.c
    public int getSize() {
        return this.f11440c.getSize();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f11438a + ", listener=" + this.f11441d + ", key=" + this.f11442e + ", acquired=" + this.f11443f + ", isRecycled=" + this.f11444g + ", resource=" + this.f11440c + '}';
    }
}
