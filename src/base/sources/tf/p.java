package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p extends o {
    private static final androidx.databinding.p.i N;
    private static final SparseIntArray O;
    private final ScrollView K;
    private final z6 L;
    private long M;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(12);
        N = iVar;
        iVar.a(1, new String[]{"ad_gg_home"}, new int[]{4}, new int[]{R.layout.ad_gg_home});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.drawer_layout, 5);
        sparseIntArray.put(R.id.app_bar, 6);
        sparseIntArray.put(R.id.tool_bar, 7);
        sparseIntArray.put(R.id.tabs, 8);
        sparseIntArray.put(R.id.view_pager, 9);
        sparseIntArray.put(R.id.record_fab, 10);
        sparseIntArray.put(R.id.left_drawer, 11);
    }

    public p(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, N, O));
    }

    private boolean Y(w0 w0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                if (this.M != 0) {
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
            this.M = 2L;
        }
        this.D.F();
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return Y((w0) obj, i11);
    }

    @Override // androidx.databinding.p
    public void S(androidx.lifecycle.b0 b0Var) {
        super.S(b0Var);
        this.D.S(b0Var);
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.M = 0L;
        }
        androidx.databinding.p.u(this.D);
    }

    private p(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (FrameLayout) objArr[1], (AppBarLayout) objArr[6], (DrawerLayout) objArr[5], (w0) objArr[4], (NavigationView) objArr[11], (RelativeLayout) objArr[0], (ExtendedFloatingActionButton) objArr[10], (TabLayout) objArr[8], (Toolbar) objArr[7], (ViewPager2) objArr[9]);
        this.M = -1L;
        this.A.setTag(null);
        R(this.D);
        this.F.setTag(null);
        ScrollView scrollView = (ScrollView) objArr[2];
        this.K = scrollView;
        scrollView.setTag(null);
        Object obj = objArr[3];
        this.L = obj != null ? z6.a((View) obj) : null;
        T(view);
        F();
    }
}
