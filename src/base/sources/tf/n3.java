package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n3 extends m3 {
    private static final androidx.databinding.p.i J = null;
    private static final SparseIntArray K;
    private final ConstraintLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.player_control_view, 2);
        sparseIntArray.put(R.id.text_edit_layout, 3);
        sparseIntArray.put(R.id.close_iv, 4);
        sparseIntArray.put(R.id.input_et, 5);
        sparseIntArray.put(R.id.confirm_iv, 6);
    }

    public n3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 7, J, K));
    }

    private boolean b0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.I = 4L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b0((androidx.lifecycle.k0) obj, i11);
    }

    @Override // tf.m3
    public void a0(uh.n0 n0Var) {
        this.G = n0Var;
        synchronized (this) {
            this.I |= 2;
        }
        i(15);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        float fO;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        uh.n0 n0Var = this.G;
        long j11 = j10 & 7;
        if (j11 != 0) {
            androidx.lifecycle.k0 k0VarJ = n0Var != null ? n0Var.j() : null;
            V(0, k0VarJ);
            fO = androidx.databinding.p.O(k0VarJ != null ? (Float) k0VarJ.f() : null);
        } else {
            fO = 0.0f;
        }
        if (j11 != 0) {
            this.E.setValue(fO);
        }
    }

    private n3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ImageButton) objArr[4], (ImageButton) objArr[6], (TextView) objArr[5], (PlayerControlView) objArr[2], (Slider) objArr[1], (ConstraintLayout) objArr[3]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        T(view);
        F();
    }
}
