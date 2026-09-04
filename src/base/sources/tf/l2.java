package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.NumberPicker;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l2 extends k2 {
    private static final androidx.databinding.p.i F = null;
    private static final SparseIntArray G;
    private final LinearLayout D;
    private long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.np_hours, 1);
        sparseIntArray.put(R.id.np_minutes, 2);
        sparseIntArray.put(R.id.np_seconds, 3);
    }

    public l2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 4, F, G));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    private l2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (NumberPicker) objArr[1], (NumberPicker) objArr[2], (NumberPicker) objArr[3]);
        this.E = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.D = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
