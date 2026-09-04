package i6;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f41114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f41115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile c f41116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile c f41117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private d.a f41118e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d.a f41119f;

    public b(Object obj, d dVar) {
        d.a aVar = d.a.CLEARED;
        this.f41118e = aVar;
        this.f41119f = aVar;
        this.f41114a = obj;
        this.f41115b = dVar;
    }

    private boolean k(c cVar) {
        d.a aVar = this.f41118e;
        d.a aVar2 = d.a.FAILED;
        if (aVar != aVar2) {
            return cVar.equals(this.f41116c);
        }
        if (!cVar.equals(this.f41117d)) {
            return false;
        }
        d.a aVar3 = this.f41119f;
        return aVar3 == d.a.SUCCESS || aVar3 == aVar2;
    }

    private boolean l() {
        d dVar = this.f41115b;
        return dVar == null || dVar.b(this);
    }

    private boolean m() {
        d dVar = this.f41115b;
        return dVar == null || dVar.g(this);
    }

    private boolean n() {
        d dVar = this.f41115b;
        return dVar == null || dVar.i(this);
    }

    @Override // i6.d, i6.c
    public boolean a() {
        boolean z10;
        synchronized (this.f41114a) {
            try {
                z10 = this.f41116c.a() || this.f41117d.a();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public boolean b(c cVar) {
        boolean z10;
        synchronized (this.f41114a) {
            try {
                z10 = l() && cVar.equals(this.f41116c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public void c(c cVar) {
        synchronized (this.f41114a) {
            try {
                if (cVar.equals(this.f41116c)) {
                    this.f41118e = d.a.SUCCESS;
                } else if (cVar.equals(this.f41117d)) {
                    this.f41119f = d.a.SUCCESS;
                }
                d dVar = this.f41115b;
                if (dVar != null) {
                    dVar.c(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public void clear() {
        synchronized (this.f41114a) {
            try {
                d.a aVar = d.a.CLEARED;
                this.f41118e = aVar;
                this.f41116c.clear();
                if (this.f41119f != aVar) {
                    this.f41119f = aVar;
                    this.f41117d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public boolean d() {
        boolean z10;
        synchronized (this.f41114a) {
            try {
                d.a aVar = this.f41118e;
                d.a aVar2 = d.a.SUCCESS;
                z10 = aVar == aVar2 || this.f41119f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public void e(c cVar) {
        synchronized (this.f41114a) {
            try {
                if (cVar.equals(this.f41117d)) {
                    this.f41119f = d.a.FAILED;
                    d dVar = this.f41115b;
                    if (dVar != null) {
                        dVar.e(this);
                    }
                    return;
                }
                this.f41118e = d.a.FAILED;
                d.a aVar = this.f41119f;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f41119f = aVar2;
                    this.f41117d.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // i6.c
    public boolean f() {
        boolean z10;
        synchronized (this.f41114a) {
            try {
                d.a aVar = this.f41118e;
                d.a aVar2 = d.a.CLEARED;
                z10 = aVar == aVar2 && this.f41119f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public boolean g(c cVar) {
        boolean z10;
        synchronized (this.f41114a) {
            try {
                z10 = m() && k(cVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.d
    public d getRoot() {
        d root;
        synchronized (this.f41114a) {
            try {
                d dVar = this.f41115b;
                root = dVar != null ? dVar.getRoot() : this;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return root;
    }

    @Override // i6.c
    public boolean h(c cVar) {
        if (cVar instanceof b) {
            b bVar = (b) cVar;
            if (this.f41116c.h(bVar.f41116c) && this.f41117d.h(bVar.f41117d)) {
                return true;
            }
        }
        return false;
    }

    @Override // i6.d
    public boolean i(c cVar) {
        boolean zN;
        synchronized (this.f41114a) {
            zN = n();
        }
        return zN;
    }

    @Override // i6.c
    public boolean isRunning() {
        boolean z10;
        synchronized (this.f41114a) {
            try {
                d.a aVar = this.f41118e;
                d.a aVar2 = d.a.RUNNING;
                z10 = aVar == aVar2 || this.f41119f == aVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    @Override // i6.c
    public void j() {
        synchronized (this.f41114a) {
            try {
                d.a aVar = this.f41118e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar != aVar2) {
                    this.f41118e = aVar2;
                    this.f41116c.j();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void o(c cVar, c cVar2) {
        this.f41116c = cVar;
        this.f41117d = cVar2;
    }

    @Override // i6.c
    public void pause() {
        synchronized (this.f41114a) {
            try {
                d.a aVar = this.f41118e;
                d.a aVar2 = d.a.RUNNING;
                if (aVar == aVar2) {
                    this.f41118e = d.a.PAUSED;
                    this.f41116c.pause();
                }
                if (this.f41119f == aVar2) {
                    this.f41119f = d.a.PAUSED;
                    this.f41117d.pause();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
