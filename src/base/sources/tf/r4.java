package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class r4 extends q4 {
    private static final androidx.databinding.p.i H = null;
    private static final SparseIntArray I;
    private final ConstraintLayout F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.bg_container, 1);
        sparseIntArray.put(R.id.background_iv, 2);
        sparseIntArray.put(R.id.player_wrapper, 3);
        sparseIntArray.put(R.id.player_view, 4);
        sparseIntArray.put(R.id.overlay_container, 5);
    }

    public r4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 6, H, I));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    private r4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[2], (FrameLayout) objArr[1], (FragmentContainerView) objArr[5], (PlayerView) objArr[4], (ConstraintLayout) objArr[3]);
        this.G = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
