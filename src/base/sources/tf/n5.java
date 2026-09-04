package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n5 extends m5 {
    private static final androidx.databinding.p.i M;
    private static final SparseIntArray N;
    private final RelativeLayout J;
    private final RelativeLayout K;
    private long L;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(11);
        M = iVar;
        iVar.a(1, new String[]{"permission_request_layout"}, new int[]{2}, new int[]{R.layout.permission_request_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.swipe_refresh_ll, 3);
        sparseIntArray.put(R.id.video_rv, 4);
        sparseIntArray.put(R.id.empty_tv, 5);
        sparseIntArray.put(R.id.load_data_pb, 6);
        sparseIntArray.put(R.id.storage_info_ll, 7);
        sparseIntArray.put(R.id.storage_pb, 8);
        sparseIntArray.put(R.id.available_storage_tv, 9);
        sparseIntArray.put(R.id.allowed_duration_tv, 10);
    }

    public n5(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 11, M, N));
    }

    private boolean Y(g7 g7Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.E.D();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.L = 2L;
        }
        this.E.F();
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
        this.E.S(b0Var);
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.L = 0L;
        }
        androidx.databinding.p.u(this.E);
    }

    private n5(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[5], (ProgressBar) objArr[6], (g7) objArr[2], (RelativeLayout) objArr[7], (ProgressBar) objArr[8], (SwipeRefreshLayout) objArr[3], (RecyclerView) objArr[4]);
        this.L = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        RelativeLayout relativeLayout2 = (RelativeLayout) objArr[1];
        this.K = relativeLayout2;
        relativeLayout2.setTag(null);
        R(this.E);
        T(view);
        F();
    }
}
