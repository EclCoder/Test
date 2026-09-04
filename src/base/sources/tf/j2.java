package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j2 extends i2 {
    private static final androidx.databinding.p.i J = null;
    private static final SparseIntArray K;
    private final RelativeLayout H;
    private long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.tab_layout, 2);
        sparseIntArray.put(R.id.view_pager, 3);
        sparseIntArray.put(R.id.type_setting_layout, 4);
        sparseIntArray.put(R.id.menu_state_iv, 5);
        sparseIntArray.put(R.id.save_btn, 6);
    }

    public j2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 7, J, K));
    }

    private boolean b0(androidx.lifecycle.p0 p0Var, int i10) {
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
                return this.I != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.I = 4L;
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

    @Override // tf.i2
    public void a0(uh.y yVar) {
        this.G = yVar;
        synchronized (this) {
            this.I |= 2;
        }
        i(15);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.I;
            this.I = 0L;
        }
        uh.y yVar = this.G;
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
            w0.d.b(this.E, str);
        }
    }

    private j2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ImageView) objArr[5], (ImageButton) objArr[6], (TabLayout) objArr[2], (ConstraintLayout) objArr[4], (TextView) objArr[1], (ViewPager2) objArr[3]);
        this.I = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        this.E.setTag(null);
        T(view);
        F();
    }
}
