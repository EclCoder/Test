package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d6 extends c6 {
    private static final androidx.databinding.p.i M = null;
    private static final SparseIntArray N;
    private final ConstraintLayout K;
    private long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.icon_fl, 4);
        sparseIntArray.put(R.id.name_tv, 5);
        sparseIntArray.put(R.id.duration_tv, 6);
        sparseIntArray.put(R.id.play_fl, 7);
    }

    public d6(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 8, M, N));
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
            this.L = 8L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.c6
    public void a0(View.OnClickListener onClickListener) {
        this.H = onClickListener;
        synchronized (this) {
            this.L |= 4;
        }
        i(8);
        super.N();
    }

    @Override // tf.c6
    public void b0(View.OnClickListener onClickListener) {
        this.J = onClickListener;
        synchronized (this) {
            this.L |= 2;
        }
        i(10);
        super.N();
    }

    @Override // tf.c6
    public void c0(View.OnClickListener onClickListener) {
        this.I = onClickListener;
        synchronized (this) {
            this.L |= 1;
        }
        i(11);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.L;
            this.L = 0L;
        }
        View.OnClickListener onClickListener = this.I;
        View.OnClickListener onClickListener2 = this.J;
        View.OnClickListener onClickListener3 = this.H;
        long j11 = 9 & j10;
        long j12 = 10 & j10;
        if ((j10 & 12) != 0) {
            this.A.setOnClickListener(onClickListener3);
        }
        if (j11 != 0) {
            this.F.setOnClickListener(onClickListener);
        }
        if (j12 != 0) {
            this.G.setOnClickListener(onClickListener2);
        }
    }

    private d6(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (TextView) objArr[6], (FrameLayout) objArr[4], (TextView) objArr[5], (FrameLayout) objArr[7], (ImageView) objArr[2], (ImageView) objArr[3]);
        this.L = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        T(view);
        F();
    }
}
