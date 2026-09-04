package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p2 extends o2 {
    private static final androidx.databinding.p.i J = null;
    private static final SparseIntArray K;
    private final LinearLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.storage_rg, 1);
        sparseIntArray.put(R.id.internal_storage_rb, 2);
        sparseIntArray.put(R.id.internal_free_space_tv, 3);
        sparseIntArray.put(R.id.internal_duration_tv, 4);
        sparseIntArray.put(R.id.external_storage_rb, 5);
        sparseIntArray.put(R.id.sd_free_space_tv, 6);
        sparseIntArray.put(R.id.sd_duration_tv, 7);
    }

    public p2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 8, J, K));
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
            this.I = 1L;
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
            this.I = 0L;
        }
    }

    private p2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialRadioButton) objArr[5], (TextView) objArr[4], (TextView) objArr[3], (MaterialRadioButton) objArr[2], (TextView) objArr[7], (TextView) objArr[6], (RadioGroup) objArr[1]);
        this.I = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.H = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
