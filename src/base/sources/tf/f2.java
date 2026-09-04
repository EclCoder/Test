package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f2 extends e2 {
    private static final androidx.databinding.p.i O = null;
    private static final SparseIntArray P;
    private final FrameLayout M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.rate_msg_top_tv, 1);
        sparseIntArray.put(R.id.rate_msg_bottom_tv, 2);
        sparseIntArray.put(R.id.star_ll, 3);
        sparseIntArray.put(R.id.rate_star_one, 4);
        sparseIntArray.put(R.id.rate_star_two, 5);
        sparseIntArray.put(R.id.rate_star_three, 6);
        sparseIntArray.put(R.id.rate_star_four, 7);
        sparseIntArray.put(R.id.rate_star_five, 8);
        sparseIntArray.put(R.id.star_indicator, 9);
        sparseIntArray.put(R.id.feedback_btn, 10);
        sparseIntArray.put(R.id.rate_btn, 11);
        sparseIntArray.put(R.id.emotion_iv, 12);
    }

    public f2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 13, O, P));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    private f2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[12], (Button) objArr[10], (Button) objArr[11], (TextView) objArr[2], (TextView) objArr[1], (ImageView) objArr[8], (ImageView) objArr[7], (ImageView) objArr[4], (ImageView) objArr[6], (ImageView) objArr[5], (ImageView) objArr[9], (LinearLayout) objArr[3]);
        this.N = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.M = frameLayout;
        frameLayout.setTag(null);
        T(view);
        F();
    }
}
