package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b extends a {
    private static final androidx.databinding.p.i L = null;
    private static final SparseIntArray M;
    private long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.app_name, 3);
        sparseIntArray.put(R.id.app_icon, 4);
        sparseIntArray.put(R.id.tv_version, 5);
        sparseIntArray.put(R.id.copyright_text, 6);
        sparseIntArray.put(R.id.tv_link_tos, 7);
        sparseIntArray.put(R.id.tv_link_privacy, 8);
        sparseIntArray.put(R.id.icon_credit, 9);
    }

    public b(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 10, L, M));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    private b(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (ImageView) objArr[4], (TextView) objArr[3], (TextView) objArr[6], (TextView) objArr[9], (NestedScrollView) objArr[0], (Toolbar) objArr[2], (TextView) objArr[8], (TextView) objArr[7], (TextView) objArr[5]);
        this.K = -1L;
        this.F.setTag(null);
        T(view);
        F();
    }
}
