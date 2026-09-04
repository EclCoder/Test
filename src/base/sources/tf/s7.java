package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class s7 extends r7 {
    private static final androidx.databinding.p.i R = null;
    private static final SparseIntArray S;
    private long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.thumbnail, 1);
        sparseIntArray.put(R.id.tv_file_duration, 2);
        sparseIntArray.put(R.id.label_new_fl, 3);
        sparseIntArray.put(R.id.tv_file_name, 4);
        sparseIntArray.put(R.id.tv_resolution, 5);
        sparseIntArray.put(R.id.tv_no_sound_hint, 6);
        sparseIntArray.put(R.id.ll_file_size, 7);
        sparseIntArray.put(R.id.tv_file_size, 8);
        sparseIntArray.put(R.id.iv_transform, 9);
        sparseIntArray.put(R.id.tv_compressed_size, 10);
        sparseIntArray.put(R.id.iv_more, 11);
        sparseIntArray.put(R.id.iv_share, 12);
        sparseIntArray.put(R.id.iv_edit, 13);
        sparseIntArray.put(R.id.checkbox_container, 14);
        sparseIntArray.put(R.id.cb_select, 15);
    }

    public s7(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 16, R, S));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    private s7(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (MaterialCheckBox) objArr[15], (RelativeLayout) objArr[14], (ImageView) objArr[13], (ImageView) objArr[11], (ImageView) objArr[12], (ImageView) objArr[9], (FrameLayout) objArr[3], (LinearLayout) objArr[7], (CardView) objArr[0], (ImageView) objArr[1], (TextView) objArr[10], (TextView) objArr[2], (TextView) objArr[4], (TextView) objArr[8], (TextView) objArr[6], (TextView) objArr[5]);
        this.Q = -1L;
        this.I.setTag(null);
        T(view);
        F();
    }
}
