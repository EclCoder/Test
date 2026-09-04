package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class q7 extends p7 {
    private static final androidx.databinding.p.i G = null;
    private static final SparseIntArray H;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.tv_current_position, 1);
        sparseIntArray.put(R.id.seek_bar, 2);
        sparseIntArray.put(R.id.tv_duration, 3);
        sparseIntArray.put(R.id.iv_play_pause, 4);
    }

    public q7(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 5, G, H));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    private q7(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[4], (LinearLayout) objArr[0], (SeekBar) objArr[2], (TextView) objArr[1], (TextView) objArr[3]);
        this.F = -1L;
        this.B.setTag(null);
        T(view);
        F();
    }
}
