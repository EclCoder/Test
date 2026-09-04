package yk;

import al.k;
import ok.f;
import ok.g;
import ok.h;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class c extends yk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final h f58058b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f58059c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f58060d;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class a extends xk.a implements g, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final g f58061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final h.b f58062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final boolean f58063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f58064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        wk.c f58065e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        rk.b f58066f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Throwable f58067g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        volatile boolean f58068h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        volatile boolean f58069i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f58070j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f58071k;

        a(g gVar, h.b bVar, boolean z10, int i10) {
            this.f58061a = gVar;
            this.f58062b = bVar;
            this.f58063c = z10;
            this.f58064d = i10;
        }

        @Override // wk.b
        public int a(int i10) {
            if ((i10 & 2) == 0) {
                return 0;
            }
            this.f58071k = true;
            return 2;
        }

        @Override // ok.g
        public void b(rk.b bVar) {
            if (uk.b.i(this.f58066f, bVar)) {
                this.f58066f = bVar;
                if (bVar instanceof wk.a) {
                    wk.a aVar = (wk.a) bVar;
                    int iA = aVar.a(7);
                    if (iA == 1) {
                        this.f58070j = iA;
                        this.f58065e = aVar;
                        this.f58068h = true;
                        this.f58061a.b(this);
                        i();
                        return;
                    }
                    if (iA == 2) {
                        this.f58070j = iA;
                        this.f58065e = aVar;
                        this.f58061a.b(this);
                        return;
                    }
                }
                this.f58065e = new zk.a(this.f58064d);
                this.f58061a.b(this);
            }
        }

        boolean c(boolean z10, boolean z11, g gVar) {
            if (this.f58069i) {
                this.f58065e.clear();
                return true;
            }
            if (!z10) {
                return false;
            }
            Throwable th2 = this.f58067g;
            if (this.f58063c) {
                if (!z11) {
                    return false;
                }
                this.f58069i = true;
                if (th2 != null) {
                    gVar.onError(th2);
                } else {
                    gVar.onComplete();
                }
                this.f58062b.d();
                return true;
            }
            if (th2 != null) {
                this.f58069i = true;
                this.f58065e.clear();
                gVar.onError(th2);
                this.f58062b.d();
                return true;
            }
            if (!z11) {
                return false;
            }
            this.f58069i = true;
            gVar.onComplete();
            this.f58062b.d();
            return true;
        }

        @Override // wk.c
        public void clear() {
            this.f58065e.clear();
        }

        @Override // rk.b
        public void d() {
            if (this.f58069i) {
                return;
            }
            this.f58069i = true;
            this.f58066f.d();
            this.f58062b.d();
            if (getAndIncrement() == 0) {
                this.f58065e.clear();
            }
        }

        void g() {
            int iAddAndGet = 1;
            while (!this.f58069i) {
                boolean z10 = this.f58068h;
                Throwable th2 = this.f58067g;
                if (!this.f58063c && z10 && th2 != null) {
                    this.f58069i = true;
                    this.f58061a.onError(this.f58067g);
                    this.f58062b.d();
                    return;
                }
                this.f58061a.onNext(null);
                if (z10) {
                    this.f58069i = true;
                    Throwable th3 = this.f58067g;
                    if (th3 != null) {
                        this.f58061a.onError(th3);
                    } else {
                        this.f58061a.onComplete();
                    }
                    this.f58062b.d();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void h() {
            wk.c cVar = this.f58065e;
            g gVar = this.f58061a;
            int iAddAndGet = 1;
            while (!c(this.f58068h, cVar.isEmpty(), gVar)) {
                while (true) {
                    boolean z10 = this.f58068h;
                    try {
                        Object objPoll = cVar.poll();
                        boolean z11 = objPoll == null;
                        if (c(z10, z11, gVar)) {
                            return;
                        }
                        if (z11) {
                            break;
                        } else {
                            gVar.onNext(objPoll);
                        }
                    } catch (Throwable th2) {
                        sk.a.b(th2);
                        this.f58069i = true;
                        this.f58066f.d();
                        cVar.clear();
                        gVar.onError(th2);
                        this.f58062b.d();
                        return;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        void i() {
            if (getAndIncrement() == 0) {
                this.f58062b.b(this);
            }
        }

        @Override // wk.c
        public boolean isEmpty() {
            return this.f58065e.isEmpty();
        }

        @Override // ok.g
        public void onComplete() {
            if (this.f58068h) {
                return;
            }
            this.f58068h = true;
            i();
        }

        @Override // ok.g
        public void onError(Throwable th2) {
            if (this.f58068h) {
                cl.a.k(th2);
                return;
            }
            this.f58067g = th2;
            this.f58068h = true;
            i();
        }

        @Override // ok.g
        public void onNext(Object obj) {
            if (this.f58068h) {
                return;
            }
            if (this.f58070j != 2) {
                this.f58065e.offer(obj);
            }
            i();
        }

        @Override // wk.c
        public Object poll() {
            return this.f58065e.poll();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f58071k) {
                g();
            } else {
                h();
            }
        }
    }

    public c(f fVar, h hVar, boolean z10, int i10) {
        super(fVar);
        this.f58058b = hVar;
        this.f58059c = z10;
        this.f58060d = i10;
    }

    @Override // ok.c
    protected void h(g gVar) {
        h hVar = this.f58058b;
        if (hVar instanceof k) {
            this.f58055a.a(gVar);
        } else {
            this.f58055a.a(new a(gVar, hVar.a(), this.f58059c, this.f58060d));
        }
    }
}
