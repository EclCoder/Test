package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p4 extends o4 {
    private static final androidx.databinding.p.i N;
    private static final SparseIntArray O;
    private final RelativeLayout L;
    private long M;

    static {
        androidx.databinding.p.i iVar = new androidx.databinding.p.i(12);
        N = iVar;
        iVar.a(0, new String[]{"video_controller"}, new int[]{1}, new int[]{R.layout.video_controller});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.video_container, 2);
        sparseIntArray.put(R.id.exo_player_view, 3);
        sparseIntArray.put(R.id.layout_pick_time, 4);
        sparseIntArray.put(R.id.select_time_start, 5);
        sparseIntArray.put(R.id.tv_video_name, 6);
        sparseIntArray.put(R.id.iv_delete, 7);
        sparseIntArray.put(R.id.select_time_end, 8);
        sparseIntArray.put(R.id.layout_range_seek_bar, 9);
        sparseIntArray.put(R.id.scroll_view, 10);
        sparseIntArray.put(R.id.bottom_action_bar, 11);
    }

    public p4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, N, O));
    }

    private boolean Y(p7 p7Var, int i10) {
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
                return this.B.D();
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
        this.B.F();
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return Y((p7) obj, i11);
    }

    @Override // androidx.databinding.p
    public void S(androidx.lifecycle.b0 b0Var) {
        super.S(b0Var);
        this.B.S(b0Var);
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.M = 0L;
        }
        androidx.databinding.p.u(this.B);
    }

    private p4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (LinearLayout) objArr[11], (p7) objArr[1], (StyledPlayerView) objArr[3], (ImageView) objArr[7], (LinearLayout) objArr[4], (LinearLayout) objArr[9], (HorizontalScrollView) objArr[10], (TextView) objArr[8], (TextView) objArr[5], (TextView) objArr[6], (RelativeLayout) objArr[2]);
        this.M = -1L;
        R(this.B);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.L = relativeLayout;
        relativeLayout.setTag(null);
        T(view);
        F();
    }
}
