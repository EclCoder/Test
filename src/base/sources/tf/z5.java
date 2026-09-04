package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class z5 extends y5 {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.thumb_container, 1);
        sparseIntArray.put(R.id.iv_thumb, 2);
        sparseIntArray.put(R.id.checkbox_container, 3);
        sparseIntArray.put(R.id.cb_select, 4);
        sparseIntArray.put(R.id.iv_check, 5);
        sparseIntArray.put(R.id.tv_selectedId, 6);
    }

    public z5(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 7, I, J));
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
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    private z5(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCheckBox) objArr[4], (RelativeLayout) objArr[3], (ImageView) objArr[5], (ImageView) objArr[2], (ConstraintLayout) objArr[0], (CardView) objArr[1], (TextView) objArr[6]);
        this.H = -1L;
        this.E.setTag(null);
        T(view);
        F();
    }
}
