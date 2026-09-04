package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.chip.ChipGroup;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n extends m {
    private static final androidx.databinding.p.i N = null;
    private static final SparseIntArray O;
    private final NestedScrollView L;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.community_cl, 3);
        sparseIntArray.put(R.id.arrow_iv, 4);
        sparseIntArray.put(R.id.join_community_tv, 5);
        sparseIntArray.put(R.id.issue_title_tv, 6);
        sparseIntArray.put(R.id.tag_cg, 7);
        sparseIntArray.put(R.id.feedback_edt, 8);
        sparseIntArray.put(R.id.attach_screenshot_tv, 9);
        sparseIntArray.put(R.id.attach_image_list_rv, 10);
        sparseIntArray.put(R.id.submit_btn, 11);
    }

    public n(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, N, O));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    private n(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (ImageView) objArr[4], (RecyclerView) objArr[10], (TextView) objArr[9], (ConstraintLayout) objArr[3], (EditText) objArr[8], (TextView) objArr[6], (TextView) objArr[5], (AppCompatButton) objArr[11], (ChipGroup) objArr[7], (Toolbar) objArr[2]);
        this.M = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.L = nestedScrollView;
        nestedScrollView.setTag(null);
        T(view);
        F();
    }
}
