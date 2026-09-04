package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.widget.CustomScrollView;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t extends s {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final RelativeLayout G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.scroll_view, 3);
        sparseIntArray.put(R.id.list_images, 4);
        sparseIntArray.put(R.id.waiting_progress, 5);
        sparseIntArray.put(R.id.avi_loading, 6);
    }

    public t(androidx.databinding.f fVar, View view) {
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

    private t(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (AVLoadingIndicatorView) objArr[6], (LinearLayout) objArr[4], (CustomScrollView) objArr[3], (Toolbar) objArr[2], (LinearLayout) objArr[5]);
        this.H = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.G = relativeLayout;
        relativeLayout.setTag(null);
        T(view);
        F();
    }
}
