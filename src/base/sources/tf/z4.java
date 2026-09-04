package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class z4 extends y4 {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private final LinearLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.shape_rectangle, 1);
        sparseIntArray.put(R.id.iv_shape_rectangle, 2);
        sparseIntArray.put(R.id.shape_square, 3);
        sparseIntArray.put(R.id.iv_shape_square, 4);
        sparseIntArray.put(R.id.shape_oval, 5);
        sparseIntArray.put(R.id.iv_shape_oval, 6);
        sparseIntArray.put(R.id.shape_circle, 7);
        sparseIntArray.put(R.id.iv_shape_cicle, 8);
    }

    public z4(androidx.databinding.f fVar, View view) {
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

    private z4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[8], (ImageView) objArr[6], (ImageView) objArr[2], (ImageView) objArr[4], (LinearLayout) objArr[7], (LinearLayout) objArr[5], (LinearLayout) objArr[1], (LinearLayout) objArr[3]);
        this.J = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
