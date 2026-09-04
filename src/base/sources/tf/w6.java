package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class w6 extends v6 {
    private static final androidx.databinding.p.i G = null;
    private static final SparseIntArray H;
    private final ConstraintLayout E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.image_view, 1);
        sparseIntArray.put(R.id.counter_tv, 2);
        sparseIntArray.put(R.id.name_tv, 3);
    }

    public w6(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 4, G, H));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.F = 2L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.v6
    public void a0(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        synchronized (this) {
            this.F |= 1;
        }
        i(9);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        View.OnClickListener onClickListener = this.D;
        if ((j10 & 3) != 0) {
            this.E.setOnClickListener(onClickListener);
        }
    }

    private w6(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (TextView) objArr[2], (ImageView) objArr[1], (TextView) objArr[3]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
