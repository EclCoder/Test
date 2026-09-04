package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p5 extends o5 {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final ConstraintLayout G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.resolution_title, 2);
        sparseIntArray.put(R.id.resolution_bsb, 3);
        sparseIntArray.put(R.id.frame_rate_tv, 4);
        sparseIntArray.put(R.id.frame_rate_bsb, 5);
    }

    public p5(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 6, I, J));
    }

    private boolean b0(androidx.lifecycle.n0 n0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.H |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.H = 4L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b0((androidx.lifecycle.n0) obj, i11);
    }

    @Override // tf.o5
    public void a0(uh.y yVar) {
        this.F = yVar;
        synchronized (this) {
            this.H |= 2;
        }
        i(15);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        uh.y yVar = this.F;
        long j11 = j10 & 7;
        String string = null;
        if (j11 != 0) {
            androidx.lifecycle.n0 n0VarK0 = yVar != null ? yVar.K0() : null;
            V(0, n0VarK0);
            string = this.E.getResources().getString(R.string.estimated_file_size, n0VarK0 != null ? (Integer) n0VarK0.f() : null);
        }
        if (j11 != 0) {
            w0.d.b(this.E, string);
        }
    }

    private p5(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (BubbleSeekBar) objArr[5], (TextView) objArr[4], (BubbleSeekBar) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        this.E.setTag(null);
        T(view);
        F();
    }
}
