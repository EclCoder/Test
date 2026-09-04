package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l extends k {
    private static final androidx.databinding.p.i F = null;
    private static final SparseIntArray G;
    private long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 1);
        sparseIntArray.put(R.id.tool_bar, 2);
        sparseIntArray.put(R.id.exp_list_view, 3);
    }

    public l(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 4, F, G));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    private l(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppBarLayout) objArr[1], (ExpandableListView) objArr[3], (LinearLayout) objArr[0], (Toolbar) objArr[2]);
        this.E = -1L;
        this.C.setTag(null);
        T(view);
        F();
    }
}
