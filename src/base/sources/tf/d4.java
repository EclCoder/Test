package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class d4 extends c4 {
    private static final androidx.databinding.p.i F = null;
    private static final SparseIntArray G;
    private final ConstraintLayout D;
    private long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.resolution_list_gv, 2);
    }

    public d4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 3, F, G));
    }

    private boolean b0(androidx.lifecycle.n0 n0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
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
            this.E = 4L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 != 0) {
            return false;
        }
        return b0((androidx.lifecycle.n0) obj, i11);
    }

    @Override // tf.c4
    public void a0(uh.y yVar) {
        this.C = yVar;
        synchronized (this) {
            this.E |= 2;
        }
        i(15);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.E;
            this.E = 0L;
        }
        uh.y yVar = this.C;
        long j11 = j10 & 7;
        String string = null;
        if (j11 != 0) {
            androidx.lifecycle.n0 n0VarJ0 = yVar != null ? yVar.J0() : null;
            V(0, n0VarJ0);
            string = this.B.getResources().getString(R.string.estimated_file_size, n0VarJ0 != null ? (Integer) n0VarJ0.f() : null);
        }
        if (j11 != 0) {
            w0.d.b(this.B, string);
        }
    }

    private d4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (RecyclerView) objArr[2], (TextView) objArr[1]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        T(view);
        F();
    }
}
