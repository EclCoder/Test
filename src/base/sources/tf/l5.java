package tf;

import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l5 extends k5 {
    private static final androidx.databinding.p.i C = null;
    private static final SparseIntArray D = null;
    private long B;

    public l5(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 1, C, D));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.B = 1L;
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
            this.B = 0L;
        }
    }

    private l5(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RecyclerView) objArr[0]);
        this.B = -1L;
        this.A.setTag(null);
        T(view);
        F();
    }
}
