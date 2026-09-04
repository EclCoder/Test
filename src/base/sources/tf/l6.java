package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l6 extends k6 {
    private static final androidx.databinding.p.i H = null;
    private static final SparseIntArray I;
    private final ConstraintLayout F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.ratio_cl, 1);
        sparseIntArray.put(R.id.ratio_fl, 2);
        sparseIntArray.put(R.id.ratio_iv, 3);
        sparseIntArray.put(R.id.ratio_tv, 4);
    }

    public l6(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 5, H, I));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.G = 2L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.k6
    public void a0(View.OnClickListener onClickListener) {
        this.E = onClickListener;
        synchronized (this) {
            this.G |= 1;
        }
        i(12);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.G;
            this.G = 0L;
        }
        View.OnClickListener onClickListener = this.E;
        if ((j10 & 3) != 0) {
            this.F.setOnClickListener(onClickListener);
        }
    }

    private l6(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[1], (FrameLayout) objArr[2], (ImageView) objArr[3], (TextView) objArr[4]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
