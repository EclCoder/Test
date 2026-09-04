package em;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f37976b = AtomicIntegerFieldUpdater.newUpdater(e.class, "notCompletedCount$volatile");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v0[] f37977a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class a extends d2 {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f37978h = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final o f37979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e1 f37980f;

        public a(o oVar) {
            this.f37979e = oVar;
        }

        public final void B(b bVar) {
            f37978h.set(this, bVar);
        }

        public final void C(e1 e1Var) {
            this.f37980f = e1Var;
        }

        @Override // em.d2
        public boolean v() {
            return false;
        }

        @Override // em.d2
        public void w(Throwable th2) {
            if (th2 != null) {
                Object objM = this.f37979e.m(th2);
                if (objM != null) {
                    this.f37979e.z(objM);
                    b bVarY = y();
                    if (bVarY != null) {
                        bVarY.b();
                        return;
                    }
                    return;
                }
                return;
            }
            if (e.d().decrementAndGet(e.this) == 0) {
                o oVar = this.f37979e;
                v0[] v0VarArr = e.this.f37977a;
                ArrayList arrayList = new ArrayList(v0VarArr.length);
                for (v0 v0Var : v0VarArr) {
                    arrayList.add(v0Var.k());
                }
                oVar.resumeWith(fl.r.b(arrayList));
            }
        }

        public final b y() {
            return (b) f37978h.get(this);
        }

        public final e1 z() {
            e1 e1Var = this.f37980f;
            if (e1Var != null) {
                return e1Var;
            }
            kotlin.jvm.internal.s.w("handle");
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a[] f37982a;

        public b(a[] aVarArr) {
            this.f37982a = aVarArr;
        }

        @Override // em.n
        public void a(Throwable th2) {
            b();
        }

        public final void b() {
            for (a aVar : this.f37982a) {
                aVar.z().d();
            }
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.f37982a + ']';
        }
    }

    public e(v0[] v0VarArr) {
        this.f37977a = v0VarArr;
        this.notCompletedCount$volatile = v0VarArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater d() {
        return f37976b;
    }

    public final Object c(kl.f fVar) {
        q qVar = new q(ll.b.c(fVar), 1);
        qVar.H();
        int length = this.f37977a.length;
        a[] aVarArr = new a[length];
        for (int i10 = 0; i10 < length; i10++) {
            v0 v0Var = this.f37977a[i10];
            v0Var.start();
            a aVar = new a(qVar);
            aVar.C(c2.k(v0Var, false, aVar, 1, null));
            fl.g0 g0Var = fl.g0.f38750a;
            aVarArr[i10] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            aVarArr[i11].B(bVar);
        }
        if (qVar.h()) {
            bVar.b();
        } else {
            s.c(qVar, bVar);
        }
        Object objB = qVar.B();
        if (objB == ll.b.f()) {
            kotlin.coroutines.jvm.internal.h.c(fVar);
        }
        return objB;
    }
}
