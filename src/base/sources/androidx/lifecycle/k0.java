package androidx.lifecycle;

import com.bytedance.sdk.openadsdk.gjv.wGW.dOIDCKnIR;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Object f4411k = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f4412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o.a f4413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f4414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f4415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Object f4416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    volatile Object f4417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f4420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Runnable f4421j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (k0.this.f4412a) {
                obj = k0.this.f4417f;
                k0.this.f4417f = k0.f4411k;
            }
            k0.this.q(obj);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private class b extends d {
        b(q0 q0Var) {
            super(q0Var);
        }

        @Override // androidx.lifecycle.k0.d
        boolean f() {
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    class c extends d implements y {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final b0 f4424e;

        c(b0 b0Var, q0 q0Var) {
            super(q0Var);
            this.f4424e = b0Var;
        }

        @Override // androidx.lifecycle.y
        public void c(b0 b0Var, s.a aVar) {
            s.b bVarB = this.f4424e.getLifecycle().b();
            if (bVarB == s.b.DESTROYED) {
                k0.this.o(this.f4426a);
                return;
            }
            s.b bVar = null;
            while (bVar != bVarB) {
                b(f());
                bVar = bVarB;
                bVarB = this.f4424e.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.k0.d
        void d() {
            this.f4424e.getLifecycle().d(this);
        }

        @Override // androidx.lifecycle.k0.d
        boolean e(b0 b0Var) {
            return this.f4424e == b0Var;
        }

        @Override // androidx.lifecycle.k0.d
        boolean f() {
            return this.f4424e.getLifecycle().b().e(s.b.STARTED);
        }
    }

    public k0(Object obj) {
        this.f4412a = new Object();
        this.f4413b = new o.a();
        this.f4414c = 0;
        this.f4417f = f4411k;
        this.f4421j = new a();
        this.f4416e = obj;
        this.f4418g = 0;
    }

    static void b(String str) {
        if (n.c.g().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    private void d(d dVar) {
        if (dVar.f4427b) {
            if (!dVar.f()) {
                dVar.b(false);
                return;
            }
            int i10 = dVar.f4428c;
            int i11 = this.f4418g;
            if (i10 >= i11) {
                return;
            }
            dVar.f4428c = i11;
            dVar.f4426a.d(this.f4416e);
        }
    }

    void c(int i10) {
        int i11 = this.f4414c;
        this.f4414c = i10 + i11;
        if (this.f4415d) {
            return;
        }
        this.f4415d = true;
        while (true) {
            try {
                int i12 = this.f4414c;
                if (i11 == i12) {
                    this.f4415d = false;
                    return;
                }
                boolean z10 = i11 == 0 && i12 > 0;
                boolean z11 = i11 > 0 && i12 == 0;
                if (z10) {
                    l();
                } else if (z11) {
                    m();
                }
                i11 = i12;
            } catch (Throwable th2) {
                this.f4415d = false;
                throw th2;
            }
        }
    }

    void e(d dVar) {
        if (this.f4419h) {
            this.f4420i = true;
            return;
        }
        this.f4419h = true;
        do {
            this.f4420i = false;
            if (dVar != null) {
                d(dVar);
                dVar = null;
            } else {
                o.a.c cVarB = this.f4413b.b();
                while (cVarB.hasNext()) {
                    d((d) ((Map.Entry) cVarB.next()).getValue());
                    if (this.f4420i) {
                        break;
                    }
                }
            }
        } while (this.f4420i);
        this.f4419h = false;
    }

    public Object f() {
        Object obj = this.f4416e;
        if (obj != f4411k) {
            return obj;
        }
        return null;
    }

    int g() {
        return this.f4418g;
    }

    public boolean h() {
        return this.f4414c > 0;
    }

    public boolean i() {
        return this.f4416e != f4411k;
    }

    public void k(q0 q0Var) {
        b("observeForever");
        b bVar = new b(q0Var);
        d dVar = (d) this.f4413b.e(q0Var, bVar);
        if (dVar instanceof c) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        bVar.b(true);
    }

    protected void l() {
    }

    protected void m() {
    }

    protected void n(Object obj) {
        boolean z10;
        synchronized (this.f4412a) {
            z10 = this.f4417f == f4411k;
            this.f4417f = obj;
        }
        if (z10) {
            n.c.g().c(this.f4421j);
        }
    }

    public void o(q0 q0Var) {
        b("removeObserver");
        d dVar = (d) this.f4413b.f(q0Var);
        if (dVar == null) {
            return;
        }
        dVar.d();
        dVar.b(false);
    }

    public void p(b0 b0Var) {
        b("removeObservers");
        for (Map.Entry entry : this.f4413b) {
            if (((d) entry.getValue()).e(b0Var)) {
                o((q0) entry.getKey());
            }
        }
    }

    protected void q(Object obj) {
        b("setValue");
        this.f4418g++;
        this.f4416e = obj;
        e(null);
    }

    public void j(b0 b0Var, q0 q0Var) {
        b(dOIDCKnIR.djXGCcEwvp);
        if (b0Var.getLifecycle().b() == s.b.DESTROYED) {
            return;
        }
        c cVar = new c(b0Var, q0Var);
        d dVar = (d) this.f4413b.e(q0Var, cVar);
        if (dVar != null && !dVar.e(b0Var)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (dVar != null) {
            return;
        }
        b0Var.getLifecycle().a(cVar);
    }

    public k0() {
        this.f4412a = new Object();
        this.f4413b = new o.a();
        this.f4414c = 0;
        Object obj = f4411k;
        this.f4417f = obj;
        this.f4421j = new a();
        this.f4416e = obj;
        this.f4418g = -1;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final q0 f4426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f4427b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4428c = -1;

        d(q0 q0Var) {
            this.f4426a = q0Var;
        }

        void b(boolean z10) {
            if (z10 == this.f4427b) {
                return;
            }
            this.f4427b = z10;
            k0.this.c(z10 ? 1 : -1);
            if (this.f4427b) {
                k0.this.e(this);
            }
        }

        boolean e(b0 b0Var) {
            return false;
        }

        abstract boolean f();

        void d() {
        }
    }
}
