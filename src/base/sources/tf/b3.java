package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class b3 extends a3 {
    private static final androidx.databinding.p.i O = null;
    private static final SparseIntArray P;
    private final ConstraintLayout K;
    private final TextView L;
    private final TextView M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.player_control_view, 5);
        sparseIntArray.put(R.id.thumb_info_layout, 6);
        sparseIntArray.put(R.id.thumb_by_time, 7);
        sparseIntArray.put(R.id.time_scroll_view, 8);
        sparseIntArray.put(R.id.element_seek_bar, 9);
        sparseIntArray.put(R.id.vertical_center_line, 10);
        sparseIntArray.put(R.id.add_or_edit_layout, 11);
    }

    public b3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 12, O, P));
    }

    private boolean b0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.N |= 2;
        }
        return true;
    }

    private boolean c0(androidx.lifecycle.k0 k0Var, int i10) {
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
            this.N = 8L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return c0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return b0((androidx.lifecycle.p0) obj, i11);
    }

    @Override // tf.a3
    public void a0(uh.y yVar) {
        this.J = yVar;
        synchronized (this) {
            this.N |= 4;
        }
        i(15);
        super.N();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        long j11;
        String strL1;
        int i10;
        String str;
        synchronized (this) {
            j10 = this.N;
            j11 = 0;
            this.N = 0L;
        }
        uh.y yVar = this.J;
        String str2 = null;
        int i11 = 0;
        if ((15 & j10) != 0) {
            if ((j10 & 13) == 0) {
                str = null;
            } else {
                androidx.lifecycle.k0 k0VarY0 = yVar != null ? yVar.Y0() : null;
                V(0, k0VarY0);
                if (k0VarY0 != null) {
                    str = (String) k0VarY0.f();
                } else {
                    str = null;
                }
            }
            strL1 = ((j10 & 12) == 0 || yVar == null) ? null : yVar.l1();
            long j12 = j10 & 14;
            if (j12 != 0) {
                androidx.lifecycle.p0 p0VarN0 = yVar != null ? yVar.n0() : null;
                j11 = 0;
                V(1, p0VarN0);
                qh.k kVar = p0VarN0 != null ? (qh.k) p0VarN0.f() : null;
                Object[] objArr = kVar != null;
                boolean z10 = kVar == null;
                if (j12 != 0) {
                    j10 |= objArr != false ? 32L : 16L;
                }
                if ((j10 & 14) != 0) {
                    j10 |= z10 ? 128L : 64L;
                }
                i10 = objArr != false ? 0 : 8;
                i11 = z10 ? 0 : 8;
                str2 = str;
            } else {
                str2 = str;
            }
            if ((j10 & 14) != j11) {
                this.A.setVisibility(i11);
                this.C.setVisibility(i10);
            }
            if ((j10 & 13) != j11) {
                w0.d.b(this.L, str2);
            }
            if ((j10 & 12) != j11) {
                w0.d.b(this.M, strL1);
            }
        }
        strL1 = null;
        i10 = 0;
        if ((j10 & 14) != j11) {
            this.A.setVisibility(i11);
            this.C.setVisibility(i10);
        }
        if ((j10 & 13) != j11) {
            w0.d.b(this.L, str2);
        }
        if ((j10 & 12) != j11) {
            w0.d.b(this.M, strL1);
        }
    }

    private b3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (ImageButton) objArr[3], (FrameLayout) objArr[11], (ImageButton) objArr[4], (VideoElementSeekBar) objArr[9], (PlayerControlView) objArr[5], (RecyclerView) objArr[7], (ConstraintLayout) objArr[6], (HorizontalScrollView) objArr[8], (View) objArr[10]);
        this.N = -1L;
        this.A.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[1];
        this.L = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[2];
        this.M = textView2;
        textView2.setTag(null);
        T(view);
        F();
    }
}
