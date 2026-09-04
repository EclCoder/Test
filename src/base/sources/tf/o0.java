package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class o0 extends n0 {
    private static final androidx.databinding.p.i J;
    private static final SparseIntArray K;
    private final RelativeLayout H;
    private long I;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(8);
        J = iVar;
        iVar.a(0, new String[]{"permission_request_layout"}, new int[]{1}, new int[]{R.layout.permission_request_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 2);
        sparseIntArray.put(R.id.tool_bar, 3);
        sparseIntArray.put(R.id.trash_day_explanation_tv, 4);
        sparseIntArray.put(R.id.swipe_refresh_ll, 5);
        sparseIntArray.put(R.id.media_rv, 6);
        sparseIntArray.put(R.id.empty_tv, 7);
    }

    public o0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 8, J, K));
    }

    private boolean Y(g7 g7Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.D.D();
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
        this.D.F();
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return Y((g7) obj, i11);
    }

    @Override // androidx.databinding.p
    public void S(androidx.lifecycle.b0 b0Var) {
        super.S(b0Var);
        this.D.S(b0Var);
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.I = 0L;
        }
        androidx.databinding.p.u(this.D);
    }

    private o0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (AppBarLayout) objArr[2], (TextView) objArr[7], (RecyclerView) objArr[6], (g7) objArr[1], (SwipeRefreshLayout) objArr[5], (Toolbar) objArr[3], (TextView) objArr[4]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        R(this.D);
        T(view);
        F();
    }
}
