package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class i0 extends g0 {
    private static final androidx.databinding.p.i R;
    private static final SparseIntArray S;
    private final ConstraintLayout P;
    private long Q;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(16);
        R = iVar;
        iVar.a(1, new String[]{"ad_gg_share"}, new int[]{2}, new int[]{R.layout.ad_gg_share});
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.app_bar, 3);
        sparseIntArray.put(R.id.tool_bar, 4);
        sparseIntArray.put(R.id.media_layout, 5);
        sparseIntArray.put(R.id.thumb_iv, 6);
        sparseIntArray.put(R.id.play_iv, 7);
        sparseIntArray.put(R.id.share_container, 8);
        sparseIntArray.put(R.id.suggestion_tv, 9);
        sparseIntArray.put(R.id.shareable_app_rv, 10);
        sparseIntArray.put(R.id.dedicated_app_promo, 11);
        sparseIntArray.put(R.id.dedicated_app_promo_icon, 12);
        sparseIntArray.put(R.id.dedicated_app_promo_title, 13);
        sparseIntArray.put(R.id.dedicated_app_promo_subtitle, 14);
        sparseIntArray.put(R.id.ad_divider, 15);
    }

    public i0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 16, R, S));
    }

    private boolean Y(z0 z0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                if (this.Q != 0) {
                    return true;
                }
                return this.H.D();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.Q = 2L;
        }
        this.H.F();
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return Y((z0) obj, i11);
    }

    @Override // androidx.databinding.p
    public void S(androidx.lifecycle.b0 b0Var) {
        super.S(b0Var);
        this.H.S(b0Var);
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.Q = 0L;
        }
        androidx.databinding.p.u(this.H);
    }

    private i0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (View) objArr[15], (RelativeLayout) objArr[1], (AppBarLayout) objArr[3], (MaterialCardView) objArr[11], (ImageView) objArr[12], (TextView) objArr[14], (TextView) objArr[13], (z0) objArr[2], (RelativeLayout) objArr[5], (ImageView) objArr[7], (LinearLayout) objArr[8], (RecyclerView) objArr[10], (TextView) objArr[9], (ImageView) objArr[6], (Toolbar) objArr[4]);
        this.Q = -1L;
        this.B.setTag(null);
        R(this.H);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
