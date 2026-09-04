package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.card.MaterialCardView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f6 extends e6 {
    private static final androidx.databinding.p.i E = null;
    private static final SparseIntArray F;
    private final MaterialCardView C;
    private long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.background_iv, 1);
    }

    public f6(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 2, E, F));
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
            this.D = 2L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.e6
    public void a0(View.OnClickListener onClickListener) {
        this.B = onClickListener;
        synchronized (this) {
            this.D |= 1;
        }
        i(12);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.D;
            this.D = 0L;
        }
        View.OnClickListener onClickListener = this.B;
        if ((j10 & 3) != 0) {
            this.C.setOnClickListener(onClickListener);
        }
    }

    private f6(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1]);
        this.D = -1L;
        MaterialCardView materialCardView = (MaterialCardView) objArr[0];
        this.C = materialCardView;
        materialCardView.setTag(null);
        T(view);
        F();
    }
}
