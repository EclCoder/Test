package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class r2 extends q2 {
    private static final androidx.databinding.p.i E = null;
    private static final SparseIntArray F;
    private final LinearLayout C;
    private long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.suggestion_tv, 1);
        sparseIntArray.put(R.id.share_rv, 2);
    }

    public r2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 3, E, F));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.D = 1L;
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
            this.D = 0L;
        }
    }

    private r2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.D = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.C = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
