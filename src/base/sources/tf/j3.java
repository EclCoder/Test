package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j3 extends i3 {
    private static final androidx.databinding.p.i N;
    private static final SparseIntArray O;
    private final RelativeLayout L;
    private long M;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(12);
        N = iVar;
        iVar.a(1, new String[]{"ad_gg_share_export"}, new int[]{2}, new int[]{R.layout.ad_gg_share_export});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.back_btn, 4);
        sparseIntArray.put(R.id.phase_icon, 5);
        sparseIntArray.put(R.id.title_tv, 6);
        sparseIntArray.put(R.id.subtitle_tv, 7);
        sparseIntArray.put(R.id.progress_rl, 8);
        sparseIntArray.put(R.id.progress_bar, 9);
        sparseIntArray.put(R.id.percent_tv, 10);
        sparseIntArray.put(R.id.detail_tv, 11);
    }

    public j3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, N, O));
    }

    private boolean a0(c1 c1Var, int i10) {
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
        return a0((c1) obj, i11);
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

    private j3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (RelativeLayout) objArr[1], (ImageView) objArr[4], (TextView) objArr[11], (c1) objArr[2], (TextView) objArr[10], (ImageView) objArr[5], (CircularProgressIndicator) objArr[9], (RelativeLayout) objArr[8], (TextView) objArr[7], (TextView) objArr[6], (Toolbar) objArr[3]);
        this.M = -1L;
        this.A.setTag(null);
        R(this.D);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.L = relativeLayout;
        relativeLayout.setTag(null);
        T(view);
        F();
    }
}
