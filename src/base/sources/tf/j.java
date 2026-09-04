package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hecorat.screenrecorder.free.R;
import com.liuguangqiang.swipeback.SwipeBackLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j extends i {
    private static final androidx.databinding.p.i T = null;
    private static final SparseIntArray U;
    private long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(R.id.root_view, 1);
        sparseIntArray.put(R.id.exo_player_view, 2);
        sparseIntArray.put(R.id.actionbar_layout, 3);
        sparseIntArray.put(R.id.back_btn, 4);
        sparseIntArray.put(R.id.share_btn, 5);
        sparseIntArray.put(R.id.edit_btn, 6);
        sparseIntArray.put(R.id.delete_btn, 7);
        sparseIntArray.put(R.id.restore_btn, 8);
        sparseIntArray.put(R.id.controller_layout, 9);
        sparseIntArray.put(R.id.current_position_tv, 10);
        sparseIntArray.put(R.id.duration_seek_bar, 11);
        sparseIntArray.put(R.id.tv_duration, 12);
        sparseIntArray.put(R.id.rewind_btn, 13);
        sparseIntArray.put(R.id.play_btn, 14);
        sparseIntArray.put(R.id.pause_btn, 15);
        sparseIntArray.put(R.id.forward_btn, 16);
        sparseIntArray.put(R.id.rotate_btn, 17);
    }

    public j(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 18, T, U));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    private j(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RelativeLayout) objArr[3], (ImageView) objArr[4], (LinearLayout) objArr[9], (TextView) objArr[10], (ImageView) objArr[7], (SeekBar) objArr[11], (ImageView) objArr[6], (PlayerView) objArr[2], (ImageButton) objArr[16], (ImageButton) objArr[15], (ImageButton) objArr[14], (ImageView) objArr[8], (ImageButton) objArr[13], (RelativeLayout) objArr[1], (ImageButton) objArr[17], (ImageView) objArr[5], (SwipeBackLayout) objArr[0], (TextView) objArr[12]);
        this.S = -1L;
        this.Q.setTag(null);
        T(view);
        F();
    }
}
