package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class k0 extends j0 {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final LinearLayout G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.how_dev_options_rl, 3);
        sparseIntArray.put(R.id.expand_iv, 4);
        sparseIntArray.put(R.id.collapse_iv, 5);
        sparseIntArray.put(R.id.dev_options_content_ll, 6);
    }

    public k0(androidx.databinding.f fVar, View view) {
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

    private k0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (ImageView) objArr[5], (LinearLayout) objArr[6], (ImageView) objArr[4], (RelativeLayout) objArr[3], (Toolbar) objArr[2]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
