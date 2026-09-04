package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class x2 extends w2 {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final ScrollView G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.icon_iv, 1);
        sparseIntArray.put(R.id.close_btn, 2);
        sparseIntArray.put(R.id.enabled_iv, 3);
        sparseIntArray.put(R.id.message_tv, 4);
        sparseIntArray.put(R.id.instruction_tv, 5);
        sparseIntArray.put(R.id.open_setting_btn, 6);
    }

    public x2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 7, I, J));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    private x2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[2], (ImageView) objArr[3], (ImageView) objArr[1], (TextView) objArr[5], (TextView) objArr[4], (Button) objArr[6]);
        this.H = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.G = scrollView;
        scrollView.setTag(null);
        T(view);
        F();
    }
}
