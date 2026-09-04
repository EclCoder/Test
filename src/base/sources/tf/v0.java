package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class v0 extends u0 {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private final NestedScrollView I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.wifi_transfer_iv, 3);
        sparseIntArray.put(R.id.tv_hint, 4);
        sparseIntArray.put(R.id.tv_ip_access, 5);
        sparseIntArray.put(R.id.layout_wifi_name, 6);
        sparseIntArray.put(R.id.wifi_name_label_tv, 7);
        sparseIntArray.put(R.id.tv_wifi_name, 8);
    }

    public v0(androidx.databinding.f fVar, View view) {
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

    private v0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (ConstraintLayout) objArr[6], (Toolbar) objArr[2], (TextView) objArr[4], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[7], (FrameLayout) objArr[3]);
        this.J = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.I = nestedScrollView;
        nestedScrollView.setTag(null);
        T(view);
        F();
    }
}
