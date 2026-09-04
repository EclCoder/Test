package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b7 extends a7 {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private final ConstraintLayout G;
    private final ConstraintLayout H;
    private final TextView I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.border_cl, 4);
        sparseIntArray.put(R.id.video_iv, 5);
    }

    public b7(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 6, K, L));
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
            this.J = 8L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.a7
    public void a0(View.OnClickListener onClickListener) {
        this.E = onClickListener;
        synchronized (this) {
            this.J |= 2;
        }
        i(3);
        super.N();
    }

    @Override // tf.a7
    public void b0(ng.d dVar) {
        this.F = dVar;
        synchronized (this) {
            this.J |= 1;
        }
        i(13);
        super.N();
    }

    @Override // tf.a7
    public void c0(View.OnClickListener onClickListener) {
        this.D = onClickListener;
        synchronized (this) {
            this.J |= 4;
        }
        i(14);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.J;
            this.J = 0L;
        }
        ng.d dVar = this.F;
        View.OnClickListener onClickListener = this.E;
        View.OnClickListener onClickListener2 = this.D;
        long j11 = 9 & j10;
        String strL = (j11 == 0 || dVar == null) ? null : dVar.l();
        long j12 = 10 & j10;
        long j13 = j10 & 12;
        if (j12 != 0) {
            this.B.setOnClickListener(onClickListener);
        }
        if (j13 != 0) {
            this.H.setOnClickListener(onClickListener2);
        }
        if (j11 != 0) {
            w0.d.b(this.I, strL);
        }
    }

    private b7(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ConstraintLayout) objArr[4], (ImageButton) objArr[3], (ImageView) objArr[5]);
        this.J = -1L;
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.G = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.H = constraintLayout2;
        constraintLayout2.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.I = textView;
        textView.setTag(null);
        T(view);
        F();
    }
}
