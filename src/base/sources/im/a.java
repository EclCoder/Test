package im;

import fl.g0;
import hm.i0;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c[] f41480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41482c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private v f41483d;

    public final i0 g() {
        v vVar;
        synchronized (this) {
            vVar = this.f41483d;
            if (vVar == null) {
                vVar = new v(this.f41481b);
                this.f41483d = vVar;
            }
        }
        return vVar;
    }

    protected final c h() {
        c cVarI;
        v vVar;
        synchronized (this) {
            try {
                c[] cVarArrK = this.f41480a;
                if (cVarArrK == null) {
                    cVarArrK = k(2);
                    this.f41480a = cVarArrK;
                } else if (this.f41481b >= cVarArrK.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrK, cVarArrK.length * 2);
                    kotlin.jvm.internal.s.g(objArrCopyOf, "copyOf(...)");
                    this.f41480a = (c[]) objArrCopyOf;
                    cVarArrK = (c[]) objArrCopyOf;
                }
                int i10 = this.f41482c;
                do {
                    cVarI = cVarArrK[i10];
                    if (cVarI == null) {
                        cVarI = i();
                        cVarArrK[i10] = cVarI;
                    }
                    i10++;
                    if (i10 >= cVarArrK.length) {
                        i10 = 0;
                    }
                    kotlin.jvm.internal.s.f(cVarI, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!cVarI.a(this));
                this.f41482c = i10;
                this.f41481b++;
                vVar = this.f41483d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (vVar != null) {
            vVar.a0(1);
        }
        return cVarI;
    }

    protected abstract c i();

    protected abstract c[] k(int i10);

    protected final void l(c cVar) {
        v vVar;
        int i10;
        kl.f[] fVarArrB;
        synchronized (this) {
            try {
                int i11 = this.f41481b - 1;
                this.f41481b = i11;
                vVar = this.f41483d;
                if (i11 == 0) {
                    this.f41482c = 0;
                }
                kotlin.jvm.internal.s.f(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                fVarArrB = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (kl.f fVar : fVarArrB) {
            if (fVar != null) {
                fl.r.a aVar = fl.r.f38769b;
                fVar.resumeWith(fl.r.b(g0.f38750a));
            }
        }
        if (vVar != null) {
            vVar.a0(-1);
        }
    }

    protected final int m() {
        return this.f41481b;
    }

    protected final c[] n() {
        return this.f41480a;
    }
}
