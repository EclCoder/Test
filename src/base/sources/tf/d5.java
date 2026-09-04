package tf;

import android.text.Layout;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d5 extends c5 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i L = null;
    private static final SparseIntArray M;
    private final ConstraintLayout G;
    private final View.OnClickListener H;
    private final View.OnClickListener I;
    private final View.OnClickListener J;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.scale_label, 5);
    }

    public d5(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 6, L, M));
    }

    private boolean b0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 2;
        }
        return true;
    }

    private boolean c0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.K |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.K = 8L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c0((androidx.lifecycle.p0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return b0((androidx.lifecycle.p0) obj, i11);
    }

    @Override // tf.c5
    public void a0(uh.q0 q0Var) {
        this.F = q0Var;
        synchronized (this) {
            this.K |= 4;
        }
        i(15);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        uh.q0 q0Var;
        if (i10 == 1) {
            uh.q0 q0Var2 = this.F;
            if (q0Var2 != null) {
                q0Var2.C(Layout.Alignment.ALIGN_NORMAL);
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 && (q0Var = this.F) != null) {
                q0Var.C(Layout.Alignment.ALIGN_OPPOSITE);
                return;
            }
            return;
        }
        uh.q0 q0Var3 = this.F;
        if (q0Var3 != null) {
            q0Var3.C(Layout.Alignment.ALIGN_CENTER);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x00c6 A[PHI: r12
      0x00c6: PHI (r12v1 float) = (r12v0 float), (r12v3 float) binds: [B:7:0x0017, B:19:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        long j11;
        int iA;
        int iA2;
        synchronized (this) {
            j10 = this.K;
            this.K = 0L;
        }
        uh.q0 q0Var = this.F;
        int iA3 = 0;
        float fO = 0.0f;
        if ((15 & j10) != 0) {
            if ((j10 & 13) != 0) {
                androidx.lifecycle.p0 p0VarW = q0Var != null ? q0Var.w() : null;
                V(0, p0VarW);
                fO = androidx.databinding.p.O(p0VarW != null ? (Float) p0VarW.f() : null);
            }
            long j12 = j10 & 14;
            if (j12 != 0) {
                androidx.lifecycle.p0 p0VarP = q0Var != null ? q0Var.p() : null;
                V(1, p0VarP);
                Layout.Alignment alignment = p0VarP != null ? (Layout.Alignment) p0VarP.f() : null;
                boolean z10 = alignment == Layout.Alignment.ALIGN_NORMAL;
                boolean z11 = alignment == Layout.Alignment.ALIGN_OPPOSITE;
                j11 = 0;
                iA3 = alignment == Layout.Alignment.ALIGN_CENTER ? 1 : 0;
                if (j12 != 0) {
                    j10 |= z10 ? 128L : 64L;
                }
                if ((j10 & 14) != 0) {
                    j10 |= z11 ? 512L : 256L;
                }
                if ((j10 & 14) != 0) {
                    j10 |= iA3 != 0 ? 32L : 16L;
                }
                iA = z10 ? androidx.databinding.p.A(this.B, R.color.sunset_orange) : androidx.databinding.p.A(this.B, R.color.grey);
                ImageButton imageButton = this.C;
                iA2 = z11 ? androidx.databinding.p.A(imageButton, R.color.sunset_orange) : androidx.databinding.p.A(imageButton, R.color.grey);
                iA3 = iA3 != 0 ? androidx.databinding.p.A(this.A, R.color.sunset_orange) : androidx.databinding.p.A(this.A, R.color.grey);
            } else {
                j11 = 0;
                iA = 0;
                iA2 = 0;
            }
        } else {
            j11 = 0;
            iA = 0;
            iA2 = 0;
        }
        if ((8 & j10) != j11) {
            this.A.setOnClickListener(this.H);
            this.B.setOnClickListener(this.J);
            this.C.setOnClickListener(this.I);
        }
        if ((j10 & 14) != j11 && androidx.databinding.p.z() >= 21) {
            this.A.setBackgroundTintList(w0.c.a(iA3));
            this.B.setBackgroundTintList(w0.c.a(iA));
            this.C.setBackgroundTintList(w0.c.a(iA2));
        }
        if ((j10 & 13) != j11) {
            this.E.setValue(fO);
        }
    }

    private d5(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (ImageButton) objArr[2], (ImageButton) objArr[1], (ImageButton) objArr[3], (TextView) objArr[5], (Slider) objArr[4]);
        this.K = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.C.setTag(null);
        this.E.setTag(null);
        T(view);
        this.H = new kg.a(this, 2);
        this.I = new kg.a(this, 3);
        this.J = new kg.a(this, 1);
        F();
    }
}
