package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h extends g {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private final ConstraintLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.type_setting_layout, 3);
        sparseIntArray.put(R.id.menu_state_iv, 4);
        sparseIntArray.put(R.id.save_btn, 5);
        sparseIntArray.put(R.id.player_container_view, 6);
        sparseIntArray.put(R.id.nav_host_fragment, 7);
    }

    public h(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 8, K, L));
    }

    private boolean b0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
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
            this.J = 4L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b0((androidx.lifecycle.p0) obj, i11);
    }

    @Override // tf.g
    public void a0(uh.y yVar) {
        this.H = yVar;
        synchronized (this) {
            this.J |= 2;
        }
        i(15);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        uh.y yVar = this.H;
        long j11 = j10 & 7;
        String str = null;
        if (j11 != 0) {
            androidx.lifecycle.p0 p0VarU0 = yVar != null ? yVar.U0() : null;
            V(0, p0VarU0);
            if (p0VarU0 != null) {
                str = (String) p0VarU0.f();
            }
        }
        if (j11 != 0) {
            w0.d.b(this.G, str);
        }
    }

    private h(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ImageView) objArr[4], (FragmentContainerView) objArr[7], (FragmentContainerView) objArr[6], (ImageButton) objArr[5], (Toolbar) objArr[2], (ConstraintLayout) objArr[3], (TextView) objArr[1]);
        this.J = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        this.G.setTag(null);
        T(view);
        F();
    }
}
