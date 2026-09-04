package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j5 extends i5 {
    private static final androidx.databinding.p.i J = null;
    private static final SparseIntArray K;
    private final ConstraintLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.player_control_view, 1);
        sparseIntArray.put(R.id.text_edit_layout, 2);
        sparseIntArray.put(R.id.close_iv, 3);
        sparseIntArray.put(R.id.input_et, 4);
        sparseIntArray.put(R.id.confirm_iv, 5);
        sparseIntArray.put(R.id.tab_layout, 6);
        sparseIntArray.put(R.id.view_pager, 7);
    }

    public j5(androidx.databinding.f fVar, View view) {
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
            this.I = 2L;
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

    private j5(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[3], (ImageButton) objArr[5], (EditText) objArr[4], (PlayerControlView) objArr[1], (TabLayout) objArr[6], (ConstraintLayout) objArr[2], (ViewPager2) objArr[7]);
        this.I = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
