package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d extends c {
    private static final androidx.databinding.p.i N = null;
    private static final SparseIntArray O;
    private final RelativeLayout L;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.request_title, 1);
        sparseIntArray.put(R.id.request_description, 2);
        sparseIntArray.put(R.id.allow_layout, 3);
        sparseIntArray.put(R.id.app_ll, 4);
        sparseIntArray.put(R.id.toggle_rl, 5);
        sparseIntArray.put(R.id.toggle_iv, 6);
        sparseIntArray.put(R.id.swipe_iv, 7);
        sparseIntArray.put(R.id.center_bubble_iv, 8);
        sparseIntArray.put(R.id.permission_enable_btn, 9);
        sparseIntArray.put(R.id.notification_use_btn, 10);
        sparseIntArray.put(R.id.not_again_cb, 11);
    }

    public d(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, N, O));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    private d(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RelativeLayout) objArr[3], (LinearLayout) objArr[4], (FrameLayout) objArr[8], (CheckBox) objArr[11], (TextView) objArr[10], (TextView) objArr[9], (TextView) objArr[2], (TextView) objArr[1], (ImageView) objArr[7], (ImageView) objArr[6], (RelativeLayout) objArr[5]);
        this.M = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.L = relativeLayout;
        relativeLayout.setTag(null);
        T(view);
        F();
    }
}
