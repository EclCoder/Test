package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f extends e {
    private static final androidx.databinding.p.i H = null;
    private static final SparseIntArray I;
    private final FrameLayout F;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.rate_msg_top_tv, 1);
        sparseIntArray.put(R.id.rate_msg_bottom_tv, 2);
        sparseIntArray.put(R.id.good_btn, 3);
        sparseIntArray.put(R.id.feedback_btn, 4);
        sparseIntArray.put(R.id.emotion_iv, 5);
    }

    public f(androidx.databinding.f fVar, View view) {
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

    private f(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[5], (Button) objArr[4], (Button) objArr[3], (TextView) objArr[2], (TextView) objArr[1]);
        this.G = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.F = frameLayout;
        frameLayout.setTag(null);
        T(view);
        F();
    }
}
