package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hecorat.screenrecorder.free.R;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class p3 extends o3 {
    private static final androidx.databinding.p.i O = null;
    private static final SparseIntArray P;
    private final ConstraintLayout L;
    private final TextView M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.player_view, 4);
        sparseIntArray.put(R.id.player_control_view, 5);
        sparseIntArray.put(R.id.resolution_title, 6);
        sparseIntArray.put(R.id.resolution_bsb, 7);
        sparseIntArray.put(R.id.quality_tv, 8);
        sparseIntArray.put(R.id.quality_bsb, 9);
        sparseIntArray.put(R.id.file_size_layout, 10);
        sparseIntArray.put(R.id.double_arrow_iv, 11);
    }

    public p3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, O, P));
    }

    private boolean b0(androidx.lifecycle.n0 n0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.N = 4L;
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

    @Override // tf.o3
    public void a0(uh.h hVar) {
        this.K = hVar;
        synchronized (this) {
            this.N |= 2;
        }
        i(15);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        String str;
        synchronized (this) {
            j10 = this.N;
            this.N = 0L;
        }
        uh.h hVar = this.K;
        long j11 = 7 & j10;
        String string = null;
        if (j11 != 0) {
            androidx.lifecycle.n0 n0VarQ = hVar != null ? hVar.q() : null;
            V(0, n0VarQ);
            String string2 = this.M.getResources().getString(R.string.size_in_mb, n0VarQ != null ? (Float) n0VarQ.f() : null);
            if ((j10 & 6) != 0) {
                string = this.J.getResources().getString(R.string.file_size, Float.valueOf(hVar != null ? hVar.s() : 0.0f));
            }
            str = string;
            string = string2;
        } else {
            str = null;
        }
        if (j11 != 0) {
            w0.d.b(this.M, string);
        }
        if ((j10 & 6) != 0) {
            w0.d.b(this.J, str);
        }
    }

    private p3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 1, (ImageView) objArr[11], (ConstraintLayout) objArr[10], (PlayerControlView) objArr[5], (PlayerView) objArr[4], (BubbleSeekBar) objArr[9], (TextView) objArr[8], (BubbleSeekBar) objArr[7], (TextView) objArr[6], (Toolbar) objArr[3], (TextView) objArr[1]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.M = textView;
        textView.setTag(null);
        this.J.setTag(null);
        T(view);
        F();
    }
}
