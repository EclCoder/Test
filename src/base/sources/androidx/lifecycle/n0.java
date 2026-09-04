package androidx.lifecycle;

import com.google.firebase.installations.ktx.gUsI.dmHT;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class n0 extends p0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private o.a f4446l;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    /* JADX INFO: loaded from: classes.dex */
    private static class a implements q0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final k0 f4447a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final q0 f4448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f4449c = -1;

        a(k0 k0Var, q0 q0Var) {
            this.f4447a = k0Var;
            this.f4448b = q0Var;
        }

        void a() {
            this.f4447a.k(this);
        }

        void b() {
            this.f4447a.o(this);
        }

        @Override // androidx.lifecycle.q0
        public void d(Object obj) {
            if (this.f4449c != this.f4447a.g()) {
                this.f4449c = this.f4447a.g();
                this.f4448b.d(obj);
            }
        }
    }

    public n0() {
        this.f4446l = new o.a();
    }

    @Override // androidx.lifecycle.k0
    protected void l() {
        Iterator it = this.f4446l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).a();
        }
    }

    @Override // androidx.lifecycle.k0
    protected void m() {
        Iterator it = this.f4446l.iterator();
        while (it.hasNext()) {
            ((a) ((Map.Entry) it.next()).getValue()).b();
        }
    }

    public void s(k0 k0Var) {
        a aVar = (a) this.f4446l.f(k0Var);
        if (aVar != null) {
            aVar.b();
        }
    }

    public void r(k0 k0Var, q0 q0Var) {
        if (k0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        a aVar = new a(k0Var, q0Var);
        a aVar2 = (a) this.f4446l.e(k0Var, aVar);
        if (aVar2 != null && aVar2.f4448b != q0Var) {
            throw new IllegalArgumentException(dmHT.XeFILGNbYKBtk);
        }
        if (aVar2 == null && h()) {
            aVar.a();
        }
    }

    public n0(Object obj) {
        super(obj);
        this.f4446l = new o.a();
    }
}
