package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t0 extends s0 {
    private static final androidx.databinding.p.i M = null;
    private static final SparseIntArray N;
    private final RelativeLayout K;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.layout_status, 1);
        sparseIntArray.put(R.id.tv_status, 2);
        sparseIntArray.put(R.id.layout_corrupted_video, 3);
        sparseIntArray.put(R.id.tv_corrupted_video, 4);
        sparseIntArray.put(R.id.layout_reference_video, 5);
        sparseIntArray.put(R.id.tv_reference_video, 6);
        sparseIntArray.put(R.id.tv_reference_video_info, 7);
        sparseIntArray.put(R.id.btn_change, 8);
        sparseIntArray.put(R.id.txt_repair_hint, 9);
        sparseIntArray.put(R.id.btn_repair, 10);
    }

    public t0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 11, M, N));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.L = 1L;
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
            this.L = 0L;
        }
    }

    private t0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (Button) objArr[8], (Button) objArr[10], (LinearLayout) objArr[3], (LinearLayout) objArr[5], (LinearLayout) objArr[1], (TextView) objArr[4], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (TextView) objArr[9]);
        this.L = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.K = relativeLayout;
        relativeLayout.setTag(null);
        T(view);
        F();
    }
}
