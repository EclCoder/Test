package lb;

import com.google.android.exoplayer2.i2;
import o9.h0;
import ob.r0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f44106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0[] f44107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r[] f44108c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2 f44109d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f44110e;

    public b0(h0[] h0VarArr, r[] rVarArr, i2 i2Var, Object obj) {
        this.f44107b = h0VarArr;
        this.f44108c = (r[]) rVarArr.clone();
        this.f44109d = i2Var;
        this.f44110e = obj;
        this.f44106a = h0VarArr.length;
    }

    public boolean a(b0 b0Var) {
        if (b0Var == null || b0Var.f44108c.length != this.f44108c.length) {
            return false;
        }
        for (int i10 = 0; i10 < this.f44108c.length; i10++) {
            if (!b(b0Var, i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean b(b0 b0Var, int i10) {
        return b0Var != null && r0.c(this.f44107b[i10], b0Var.f44107b[i10]) && r0.c(this.f44108c[i10], b0Var.f44108c[i10]);
    }

    public boolean c(int i10) {
        return this.f44107b[i10] != null;
    }
}
