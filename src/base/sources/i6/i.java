package i6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class i implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f41160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f41161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f41162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f41163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f41164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f41165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f41166g;

    public i(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f41164e = aVar;
        this.f41165f = aVar;
        this.f41161b = obj;
        this.f41160a = dVar;
    }

    private boolean k() {
        d dVar = this.f41160a;
        return dVar == null || dVar.b(this);
    }

    private boolean l() {
        d dVar = this.f41160a;
        return dVar == null || dVar.g(this);
    }

    private boolean m() {
        d dVar = this.f41160a;
        return dVar == null || dVar.i(this);
    }

    @Override // i6.d, i6.c
    public boolean a() {
        boolean z10;
        synchronized (this.f41161b) {
            try {
                z10 = this.f41163d.a() || this.f41162c.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public boolean b(c cVar) {
        boolean z10;
        synchronized (this.f41161b) {
            try {
                z10 = k() && cVar.equals(this.f41162c) && this.f41164e != d.a.PAUSED;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public void c(c cVar) {
        synchronized (this.f41161b) {
            try {
                if (cVar.equals(this.f41163d)) {
                    this.f41165f = d.a.SUCCESS;
                    return;
                }
                this.f41164e = d.a.SUCCESS;
                d dVar = this.f41160a;
                if (dVar != null) {
                    dVar.c(this);
                }
                if (!this.f41165f.g()) {
                    this.f41163d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public void clear() {
        synchronized (this.f41161b) {
            this.f41166g = false;
            d.a aVar = d.a.CLEARED;
            this.f41164e = aVar;
            this.f41165f = aVar;
            this.f41163d.clear();
            this.f41162c.clear();
        }
    }

    @Override // i6.c
    public boolean d() {
        boolean z10;
        synchronized (this.f41161b) {
            z10 = this.f41164e == d.a.SUCCESS;
        }
        return z10;
    }

    @Override // i6.d
    public void e(c cVar) {
        synchronized (this.f41161b) {
            try {
                if (!cVar.equals(this.f41162c)) {
                    this.f41165f = d.a.FAILED;
                    return;
                }
                this.f41164e = d.a.FAILED;
                d dVar = this.f41160a;
                if (dVar != null) {
                    dVar.e(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public boolean f() {
        boolean z10;
        synchronized (this.f41161b) {
            z10 = this.f41164e == d.a.CLEARED;
        }
        return z10;
    }

    @Override // i6.d
    public boolean g(c cVar) {
        boolean z10;
        synchronized (this.f41161b) {
            try {
                z10 = l() && cVar.equals(this.f41162c) && !a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public d getRoot() {
        d root;
        synchronized (this.f41161b) {
            try {
                d dVar = this.f41160a;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // i6.c
    public boolean h(c cVar) {
        if (cVar instanceof i) {
            i iVar = (i) cVar;
            if (this.f41162c != null ? this.f41162c.h(iVar.f41162c) : iVar.f41162c == null) {
                if (this.f41163d == null) {
                    if (iVar.f41163d == null) {
                        return true;
                    }
                } else if (this.f41163d.h(iVar.f41163d)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // i6.d
    public boolean i(c cVar) {
        boolean z10;
        synchronized (this.f41161b) {
            try {
                z10 = m() && (cVar.equals(this.f41162c) || this.f41164e != d.a.SUCCESS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f41161b) {
            z10 = this.f41164e == d.a.RUNNING;
        }
        return z10;
    }

    @Override // i6.c
    public void j() {
        synchronized (this.f41161b) {
            try {
                this.f41166g = true;
                try {
                    if (this.f41164e != d.a.SUCCESS) {
                        d.a aVar = this.f41165f;
                        d.a aVar2 = d.a.RUNNING;
                        if (aVar != aVar2) {
                            this.f41165f = aVar2;
                            this.f41163d.j();
                        }
                    }
                    if (this.f41166g) {
                        d.a aVar3 = this.f41164e;
                        d.a aVar4 = d.a.RUNNING;
                        if (aVar3 != aVar4) {
                            this.f41164e = aVar4;
                            this.f41162c.j();
                        }
                    }
                    this.f41166g = false;
                } catch (Throwable th2) {
                    this.f41166g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public void n(c cVar, c cVar2) {
        this.f41162c = cVar;
        this.f41163d = cVar2;
    }

    @Override // i6.c
    public void pause() {
        synchronized (this.f41161b) {
            try {
                if (!this.f41165f.g()) {
                    this.f41165f = d.a.PAUSED;
                    this.f41163d.pause();
                }
                if (!this.f41164e.g()) {
                    this.f41164e = d.a.PAUSED;
                    this.f41162c.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
