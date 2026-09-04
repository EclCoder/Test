package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f4 extends e4 {
    private static final androidx.databinding.p.i G;
    private static final SparseIntArray H;
    private final RelativeLayout E;
    private long F;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(5);
        G = iVar;
        iVar.a(0, new String[]{"permission_request_layout"}, new int[]{1}, new int[]{R.layout.permission_request_layout});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.swipe_refresh_ll, 2);
        sparseIntArray.put(R.id.image_rv, 3);
        sparseIntArray.put(R.id.empty_tv, 4);
    }

    public f4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 5, G, H));
    }

    private boolean Y(g7 g7Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.C.D();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.F = 2L;
        }
        this.C.F();
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
        this.C.S(b0Var);
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.F = 0L;
        }
        androidx.databinding.p.u(this.C);
    }

    private f4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (TextView) objArr[4], (RecyclerView) objArr[3], (g7) objArr[1], (SwipeRefreshLayout) objArr[2]);
        this.F = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.E = relativeLayout;
        relativeLayout.setTag(null);
        R(this.C);
        T(view);
        F();
    }
}
