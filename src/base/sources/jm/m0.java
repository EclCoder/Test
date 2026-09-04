package jm;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f42668b = AtomicIntegerFieldUpdater.newUpdater(m0.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n0[] f42669a;

    private final n0[] g() {
        n0[] n0VarArr = this.f42669a;
        if (n0VarArr == null) {
            n0[] n0VarArr2 = new n0[4];
            this.f42669a = n0VarArr2;
            return n0VarArr2;
        }
        if (c() < n0VarArr.length) {
            return n0VarArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(n0VarArr, c() * 2);
        kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
        n0[] n0VarArr3 = (n0[]) objArrCopyOf;
        this.f42669a = n0VarArr3;
        return n0VarArr3;
    }

    private final void k(int i10) {
        f42668b.set(this, i10);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    private final void l(int i10) {
        while (true) {
            int i11 = i10 * 2;
            int i12 = i11 + 1;
            if (i12 >= c()) {
                return;
            }
            n0[] n0VarArr = this.f42669a;
            kotlin.jvm.internal.s.e(n0VarArr);
            int i13 = i11 + 2;
            if (i13 < c()) {
                n0 n0Var = n0VarArr[i13];
                kotlin.jvm.internal.s.e(n0Var);
                n0 n0Var2 = n0VarArr[i12];
                kotlin.jvm.internal.s.e(n0Var2);
                if (((Comparable) n0Var).compareTo(n0Var2) >= 0) {
                    i13 = i12;
                }
            } else {
                i13 = i12;
            }
            n0 n0Var3 = n0VarArr[i10];
            kotlin.jvm.internal.s.e(n0Var3);
            n0 n0Var4 = n0VarArr[i13];
            kotlin.jvm.internal.s.e(n0Var4);
            if (((Comparable) n0Var3).compareTo(n0Var4) <= 0) {
                return;
            }
            n(i10, i13);
            i10 = i13;
        }
    }

    private final void m(int i10) {
        while (i10 > 0) {
            n0[] n0VarArr = this.f42669a;
            kotlin.jvm.internal.s.e(n0VarArr);
            int i11 = (i10 - 1) / 2;
            n0 n0Var = n0VarArr[i11];
            kotlin.jvm.internal.s.e(n0Var);
            n0 n0Var2 = n0VarArr[i10];
            kotlin.jvm.internal.s.e(n0Var2);
            if (((Comparable) n0Var).compareTo(n0Var2) <= 0) {
                return;
            }
            n(i10, i11);
            i10 = i11;
        }
    }

    private final void n(int i10, int i11) {
        n0[] n0VarArr = this.f42669a;
        kotlin.jvm.internal.s.e(n0VarArr);
        n0 n0Var = n0VarArr[i11];
        kotlin.jvm.internal.s.e(n0Var);
        n0 n0Var2 = n0VarArr[i10];
        kotlin.jvm.internal.s.e(n0Var2);
        n0VarArr[i10] = n0Var;
        n0VarArr[i11] = n0Var2;
        n0Var.setIndex(i10);
        n0Var2.setIndex(i11);
    }

    public final void a(n0 n0Var) {
        n0Var.c(this);
        n0[] n0VarArrG = g();
        int iC = c();
        k(iC + 1);
        n0VarArrG[iC] = n0Var;
        n0Var.setIndex(iC);
        m(iC);
    }

    public final n0 b() {
        n0[] n0VarArr = this.f42669a;
        if (n0VarArr != null) {
            return n0VarArr[0];
        }
        return null;
    }

    public final int c() {
        return f42668b.get(this);
    }

    public final boolean e() {
        return c() == 0;
    }

    public final n0 f() {
        n0 n0VarB;
        synchronized (this) {
            n0VarB = b();
        }
        return n0VarB;
    }

    public final boolean h(n0 n0Var) {
        boolean z10;
        synchronized (this) {
            if (n0Var.b() == null) {
                z10 = false;
            } else {
                i(n0Var.getIndex());
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003a  */
    public final n0 i(int i10) {
        n0[] n0VarArr = this.f42669a;
        kotlin.jvm.internal.s.e(n0VarArr);
        k(c() - 1);
        if (i10 < c()) {
            n(i10, c());
            int i11 = (i10 - 1) / 2;
            if (i10 > 0) {
                n0 n0Var = n0VarArr[i10];
                kotlin.jvm.internal.s.e(n0Var);
                n0 n0Var2 = n0VarArr[i11];
                kotlin.jvm.internal.s.e(n0Var2);
                if (((Comparable) n0Var).compareTo(n0Var2) < 0) {
                    n(i10, i11);
                    m(i11);
                } else {
                    l(i10);
                }
            } else {
                l(i10);
            }
        }
        n0 n0Var3 = n0VarArr[c()];
        kotlin.jvm.internal.s.e(n0Var3);
        n0Var3.c(null);
        n0Var3.setIndex(-1);
        n0VarArr[c()] = null;
        return n0Var3;
    }

    public final n0 j() {
        n0 n0VarI;
        synchronized (this) {
            n0VarI = c() > 0 ? i(0) : null;
        }
        return n0VarI;
    }
}
