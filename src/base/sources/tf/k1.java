package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class k1 extends j1 {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.thumbnail, 1);
        sparseIntArray.put(R.id.tv_file_name, 2);
        sparseIntArray.put(R.id.tv_file_duration, 3);
        sparseIntArray.put(R.id.tv_file_size, 4);
        sparseIntArray.put(R.id.btn_repair_video, 5);
        sparseIntArray.put(R.id.btn_delete_video, 6);
        sparseIntArray.put(R.id.checkbox_container, 7);
        sparseIntArray.put(R.id.cb_select, 8);
    }

    public k1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 9, K, L));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    private k1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[6], (ImageView) objArr[5], (MaterialCheckBox) objArr[8], (RelativeLayout) objArr[7], (CardView) objArr[0], (ImageView) objArr[1], (TextView) objArr[3], (TextView) objArr[2], (TextView) objArr[4]);
        this.J = -1L;
        this.E.setTag(null);
        T(view);
        F();
    }
}
