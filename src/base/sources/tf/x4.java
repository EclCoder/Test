package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class x4 extends w4 {
    private static final androidx.databinding.p.i M = null;
    private static final SparseIntArray N;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.txt_free, 1);
        sparseIntArray.put(R.id.tv_169, 2);
        sparseIntArray.put(R.id.tv_54, 3);
        sparseIntArray.put(R.id.tv_43, 4);
        sparseIntArray.put(R.id.tv_32, 5);
        sparseIntArray.put(R.id.tv_11, 6);
        sparseIntArray.put(R.id.tv_23, 7);
        sparseIntArray.put(R.id.tv_34, 8);
        sparseIntArray.put(R.id.tv_45, 9);
        sparseIntArray.put(R.id.tv_916, 10);
    }

    public x4(androidx.databinding.f fVar, View view) {
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

    private x4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (HorizontalScrollView) objArr[0], (TextView) objArr[6], (TextView) objArr[2], (TextView) objArr[7], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[4], (TextView) objArr[9], (TextView) objArr[3], (TextView) objArr[10], (TextView) objArr[1]);
        this.L = -1L;
        this.A.setTag(null);
        T(view);
        F();
    }
}
