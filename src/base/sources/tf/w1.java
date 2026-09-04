package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class w1 extends v1 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final ConstraintLayout F;
    private final View.OnClickListener G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.headerTv, 2);
        sparseIntArray.put(R.id.divider, 3);
        sparseIntArray.put(R.id.destinationsRv, 4);
    }

    public w1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 5, I, J));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.H = 2L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.v1
    public void Y(gh.o oVar) {
        this.E = oVar;
        synchronized (this) {
            this.H |= 1;
        }
        i(15);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        gh.o oVar = this.E;
        if (oVar != null) {
            oVar.T();
        }
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.H;
            this.H = 0L;
        }
        if ((j10 & 2) != 0) {
            this.A.setOnClickListener(this.G);
        }
    }

    private w1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (RecyclerView) objArr[4], (View) objArr[3], (TextView) objArr[2]);
        this.H = -1L;
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        T(view);
        this.G = new kg.a(this, 1);
        F();
    }
}
