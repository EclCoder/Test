package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class q1 extends p1 {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final LinearLayout G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.et_edit_text, 1);
        sparseIntArray.put(R.id.iv_close, 2);
        sparseIntArray.put(R.id.v_text_color, 3);
        sparseIntArray.put(R.id.v_bg_color, 4);
        sparseIntArray.put(R.id.tv_font_name, 5);
        sparseIntArray.put(R.id.spinner_fonts, 6);
    }

    public q1(androidx.databinding.f fVar, View view) {
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

    private q1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[1], (ImageView) objArr[2], (Spinner) objArr[6], (TextView) objArr[5], (View) objArr[4], (View) objArr[3]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
