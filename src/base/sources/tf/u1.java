package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.AudioRangeSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class u1 extends t1 {
    private static final androidx.databinding.p.i R = null;
    private static final SparseIntArray S;
    private final ConstraintLayout P;
    private long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.title_tv, 1);
        sparseIntArray.put(R.id.close_iv, 2);
        sparseIntArray.put(R.id.head_line, 3);
        sparseIntArray.put(R.id.player_layout, 4);
        sparseIntArray.put(R.id.play_btn, 5);
        sparseIntArray.put(R.id.current_time_tv, 6);
        sparseIntArray.put(R.id.range_seek_bar, 7);
        sparseIntArray.put(R.id.duration_tv, 8);
        sparseIntArray.put(R.id.music_volume_tv, 9);
        sparseIntArray.put(R.id.music_volume_slider, 10);
        sparseIntArray.put(R.id.loop_tv, 11);
        sparseIntArray.put(R.id.loop_sc, 12);
        sparseIntArray.put(R.id.delete_btn, 13);
        sparseIntArray.put(R.id.vertical_guide_line, 14);
        sparseIntArray.put(R.id.confirm_btn, 15);
    }

    public u1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 16, R, S));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    private u1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[2], (Button) objArr[15], (TextView) objArr[6], (Button) objArr[13], (TextView) objArr[8], (View) objArr[3], (SwitchCompat) objArr[12], (TextView) objArr[11], (Slider) objArr[10], (TextView) objArr[9], (PlayerControlView) objArr[5], (ConstraintLayout) objArr[4], (AudioRangeSeekBar) objArr[7], (TextView) objArr[1], (Guideline) objArr[14]);
        this.Q = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.P = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
