package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class y1 extends x1 {
    private static final androidx.databinding.p.i D = null;
    private static final SparseIntArray E;
    private final LinearLayout B;
    private long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.feedback_edt, 1);
    }

    public y1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 2, D, E));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.C = 1L;
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
            this.C = 0L;
        }
    }

    private y1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (EditText) objArr[1]);
        this.C = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.B = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
