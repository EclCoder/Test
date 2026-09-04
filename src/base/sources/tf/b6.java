package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b6 extends a6 {
    private static final androidx.databinding.p.i G = null;
    private static final SparseIntArray H;
    private final ConstraintLayout E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.image_iv, 2);
    }

    public b6(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 3, G, H));
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
            this.F = 4L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.a6
    public void a0(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        synchronized (this) {
            this.F |= 2;
        }
        i(3);
        super.N();
    }

    @Override // tf.a6
    public void b0(View.OnClickListener onClickListener) {
        this.C = onClickListener;
        synchronized (this) {
            this.F |= 1;
        }
        i(6);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.F;
            this.F = 0L;
        }
        View.OnClickListener onClickListener = this.C;
        View.OnClickListener onClickListener2 = this.D;
        long j11 = 5 & j10;
        if ((j10 & 6) != 0) {
            this.A.setOnClickListener(onClickListener2);
        }
        if (j11 != 0) {
            this.E.setOnClickListener(onClickListener);
        }
    }

    private b6(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[1], (ImageView) objArr[2]);
        this.F = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        F();
    }
}
