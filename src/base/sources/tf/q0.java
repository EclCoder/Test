package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class q0 extends p0 {
    private static final androidx.databinding.p.i H = null;
    private static final SparseIntArray I;
    private final i1 E;
    private final ConstraintLayout F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.background_image, 2);
        sparseIntArray.put(R.id.close_btn, 3);
        sparseIntArray.put(R.id.restore_btn, 4);
        sparseIntArray.put(R.id.guideline_85, 5);
    }

    public q0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 6, H, I));
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
            this.G = 1L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.G = 0L;
        }
    }

    private q0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[2], (ImageButton) objArr[3], (Guideline) objArr[5], (TextView) objArr[4]);
        this.G = -1L;
        Object obj = objArr[1];
        this.E = obj != null ? i1.a((View) obj) : null;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
