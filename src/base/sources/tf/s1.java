package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class s1 extends r1 {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private final LinearLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.iv_play_pause, 1);
        sparseIntArray.put(R.id.tv_filename, 2);
        sparseIntArray.put(R.id.iv_remove_audio, 3);
        sparseIntArray.put(R.id.timeline, 4);
        sparseIntArray.put(R.id.tv_video_duration, 5);
        sparseIntArray.put(R.id.tv_audio_duration, 6);
        sparseIntArray.put(R.id.checkbox_repeat, 7);
        sparseIntArray.put(R.id.tv_select_audio, 8);
    }

    public s1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 9, K, L));
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
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    private s1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CheckBox) objArr[7], (ImageView) objArr[1], (ImageView) objArr[3], (LinearLayout) objArr[4], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[8], (TextView) objArr[5]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
