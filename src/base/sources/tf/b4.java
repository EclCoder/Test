package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b4 extends a4 {
    private static final androidx.databinding.p.i M;
    private static final SparseIntArray N;
    private final RelativeLayout K;
    private long L;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(10);
        M = iVar;
        iVar.a(3, new String[]{"ad_gg_share_export"}, new int[]{4}, new int[]{R.layout.ad_gg_share_export});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.back_btn, 6);
        sparseIntArray.put(R.id.exporting_tv, 7);
        sparseIntArray.put(R.id.warning_tv, 8);
        sparseIntArray.put(R.id.progress_rl, 9);
    }

    public b4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 10, M, N));
    }

    private boolean b0(c1 c1Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    private boolean c0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    private boolean d0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.E.D();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.L = 16L;
        }
        this.E.F();
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c0((androidx.lifecycle.p0) obj, i11);
        }
        if (i10 == 1) {
            return d0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 != 2) {
            return false;
        }
        return b0((c1) obj, i11);
    }

    @Override // androidx.databinding.p
    public void S(androidx.lifecycle.b0 b0Var) {
        super.S(b0Var);
        this.E.S(b0Var);
    }

    @Override // tf.a4
    public void a0(uh.g0 g0Var) {
        this.J = g0Var;
        synchronized (this) {
            this.L |= 8;
        }
        i(16);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.L;
            this.L = 0L;
        }
        uh.g0 g0Var = this.J;
        int iP = 0;
        String str = null;
        if ((27 & j10) != 0) {
            if ((j10 & 25) != 0) {
                androidx.lifecycle.p0 p0VarA = g0Var != null ? g0Var.A() : null;
                V(0, p0VarA);
                iP = androidx.databinding.p.P(p0VarA != null ? (Integer) p0VarA.f() : null);
            }
            if ((j10 & 26) != 0) {
                androidx.lifecycle.k0 k0VarB = g0Var != null ? g0Var.B() : null;
                V(1, k0VarB);
                if (k0VarB != null) {
                    str = (String) k0VarB.f();
                }
            }
        }
        if ((j10 & 26) != 0) {
            w0.d.b(this.C, str);
        }
        if ((j10 & 25) != 0) {
            this.F.setProgress(iP);
        }
        androidx.databinding.p.u(this.E);
    }

    private b4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 3, (RelativeLayout) objArr[3], (ImageView) objArr[6], (TextView) objArr[2], (TextView) objArr[7], (c1) objArr[4], (CircularProgressIndicator) objArr[1], (RelativeLayout) objArr[9], (Toolbar) objArr[5], (TextView) objArr[8]);
        this.L = -1L;
        this.A.setTag(null);
        this.C.setTag(null);
        R(this.E);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        this.F.setTag(null);
        T(view);
        F();
    }
}
