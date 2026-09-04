package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class r extends q {
    private static final androidx.databinding.p.i P = null;
    private static final SparseIntArray Q;
    private final RelativeLayout N;
    private long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.content, 3);
        sparseIntArray.put(R.id.divider, 4);
        sparseIntArray.put(R.id.values_layout, 5);
        sparseIntArray.put(R.id.progress_bar, 6);
        sparseIntArray.put(R.id.option_layout, 7);
        sparseIntArray.put(R.id.layout_shape, 8);
        sparseIntArray.put(R.id.iv_shape, 9);
        sparseIntArray.put(R.id.tv_shape, 10);
        sparseIntArray.put(R.id.layout_ratio, 11);
        sparseIntArray.put(R.id.tv_ratio_value, 12);
        sparseIntArray.put(R.id.tv_ratio_label, 13);
    }

    public r(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 14, P, Q));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.O = 1L;
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
            this.O = 0L;
        }
    }

    private r(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (FrameLayout) objArr[3], (View) objArr[4], (ImageView) objArr[9], (LinearLayout) objArr[11], (LinearLayout) objArr[8], (LinearLayout) objArr[7], (ProgressBar) objArr[6], (Toolbar) objArr[2], (TextView) objArr[13], (TextView) objArr[12], (TextView) objArr[10], (FrameLayout) objArr[5]);
        this.O = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.N = relativeLayout;
        relativeLayout.setTag(null);
        T(view);
        F();
    }
}
