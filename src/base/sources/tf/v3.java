package tf;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.CutFragment;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoRangeSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class v3 extends u3 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i X = null;
    private static final SparseIntArray Y;
    private final ConstraintLayout Q;
    private final TextView R;
    private final TextView S;
    private final TextView T;
    private final View.OnClickListener U;
    private final View.OnClickListener V;
    private long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(R.id.player_control_view, 8);
        sparseIntArray.put(R.id.action_layout, 9);
        sparseIntArray.put(R.id.header_layout, 10);
        sparseIntArray.put(R.id.close_iv, 11);
        sparseIntArray.put(R.id.toggle_group, 12);
        sparseIntArray.put(R.id.confirm_iv, 13);
        sparseIntArray.put(R.id.thumb_info_layout, 14);
        sparseIntArray.put(R.id.thumb_by_time, 15);
        sparseIntArray.put(R.id.range_seek_bar, 16);
    }

    public v3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 17, X, Y));
    }

    private boolean d0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 2;
        }
        return true;
    }

    private boolean e0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 8;
        }
        return true;
    }

    private boolean f0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 16;
        }
        return true;
    }

    private boolean g0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 1;
        }
        return true;
    }

    private boolean h0(androidx.databinding.j jVar, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.W |= 4;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.W != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.W = 256L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return g0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 1) {
            return d0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 2) {
            return h0((androidx.databinding.j) obj, i11);
        }
        if (i10 == 3) {
            return e0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return f0((androidx.lifecycle.k0) obj, i11);
    }

    @Override // tf.u3
    public void a0(uh.y yVar) {
        this.O = yVar;
        synchronized (this) {
            this.W |= 64;
        }
        i(1);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        CutFragment cutFragment;
        if (i10 != 1) {
            if (i10 == 2 && (cutFragment = this.P) != null) {
                cutFragment.M(this.I);
                return;
            }
            return;
        }
        CutFragment cutFragment2 = this.P;
        if (cutFragment2 != null) {
            cutFragment2.M(this.M);
        }
    }

    @Override // tf.u3
    public void b0(CutFragment cutFragment) {
        this.P = cutFragment;
        synchronized (this) {
            this.W |= 32;
        }
        i(5);
        super.N();
    }

    @Override // tf.u3
    public void c0(uh.n nVar) {
        this.N = nVar;
        synchronized (this) {
            this.W |= 128;
        }
        i(15);
        super.N();
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:92:0x0145  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r32v0, types: [androidx.databinding.p, tf.u3, tf.v3] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        int i10;
        int i11;
        long j11;
        long j12;
        int i12;
        ?? r10;
        int iA;
        String str;
        String str2;
        Drawable drawable;
        String str3;
        Drawable drawableB;
        String str4;
        ?? r11;
        int i13;
        Drawable drawableB2;
        androidx.databinding.j jVarV;
        boolean zJ;
        synchronized (this) {
            j10 = this.W;
            this.W = 0L;
        }
        uh.y yVar = this.O;
        uh.n nVar = this.N;
        long j13 = 322;
        long j14 = j10 & 322;
        ?? r12 = 0;
        ?? r13 = 0;
        int i14 = 0;
        if (j14 != 0) {
            androidx.lifecycle.k0 k0VarP1 = yVar != null ? yVar.p1() : null;
            V(1, k0VarP1);
            boolean zQ = androidx.databinding.p.Q(k0VarP1 != null ? (Boolean) k0VarP1.f() : null);
            if (j14 != 0) {
                j10 |= zQ ? 20480L : 10240L;
            }
            i10 = 8;
            i11 = zQ ? 0 : 8;
            if (!zQ) {
                i10 = 0;
            }
        } else {
            i10 = 0;
            i11 = 0;
        }
        if ((413 & j10) != 0) {
            if ((j10 & 385) == 0) {
                str4 = null;
            } else {
                androidx.lifecycle.k0 k0VarU = nVar != null ? nVar.u() : null;
                V(0, k0VarU);
                if (k0VarU != null) {
                    str4 = (String) k0VarU.f();
                } else {
                    str4 = null;
                }
            }
            long j15 = j10 & 388;
            if (j15 != 0) {
                if (nVar != null) {
                    jVarV = nVar.v();
                    j11 = 0;
                } else {
                    j11 = 0;
                    jVarV = null;
                }
                W(2, jVarV);
                if (jVarV != null) {
                    zJ = jVarV.j();
                }
                if (j15 != 0) {
                    j10 |= r13 != 0 ? 66560L : 33280L;
                }
                r13 = zJ;
                ToggleButton toggleButton = this.M;
                int iA2 = r13 != 0 ? androidx.databinding.p.A(toggleButton, R.color.sunset_orange) : androidx.databinding.p.A(toggleButton, R.color.white);
                int i15 = r13 ^ 1;
                j12 = 400;
                drawableB = r13 != 0 ? i.a.b(this.M.getContext(), R.drawable.bg_bottom_line) : null;
                if ((j10 & 388) != j11) {
                    j10 |= r13 == 0 ? 1310720L : 655360L;
                }
                drawableB2 = r13 == 0 ? i.a.b(this.I.getContext(), R.drawable.bg_bottom_line) : null;
                iA = r13 == 0 ? androidx.databinding.p.A(this.I, R.color.sunset_orange) : androidx.databinding.p.A(this.I, R.color.white);
                r11 = r13;
                i14 = iA2;
                i13 = i15;
            } else {
                j11 = 0;
                j12 = 400;
                r11 = 0;
                iA = 0;
                i13 = 0;
                drawableB2 = null;
                drawableB = null;
            }
            if ((j10 & 392) == j11) {
                str2 = null;
            } else {
                androidx.lifecycle.k0 k0VarQ = nVar != null ? nVar.q() : null;
                V(3, k0VarQ);
                if (k0VarQ != null) {
                    str2 = (String) k0VarQ.f();
                } else {
                    str2 = null;
                }
            }
            if ((j10 & j12) == j11) {
                Drawable drawable2 = drawableB2;
                str3 = str4;
                i12 = i14;
                r12 = i13;
                drawable = drawable2;
                str = null;
                r10 = r11;
            } else {
                androidx.lifecycle.k0 k0VarS = nVar != null ? nVar.s() : null;
                V(4, k0VarS);
                if (k0VarS != null) {
                    str = (String) k0VarS.f();
                    Drawable drawable3 = drawableB2;
                    str3 = str4;
                    i12 = i14;
                    r12 = i13;
                    drawable = drawable3;
                    r10 = r11;
                } else {
                    Drawable drawable4 = drawableB2;
                    str3 = str4;
                    i12 = i14;
                    r12 = i13;
                    drawable = drawable4;
                    str = null;
                    r10 = r11;
                }
            }
        } else {
            j11 = 0;
            j13 = 322;
            j12 = 400;
            i12 = 0;
            r10 = 0;
            iA = 0;
            str = null;
            str2 = null;
            drawable = null;
            str3 = null;
            drawableB = null;
        }
        if ((j10 & 385) != j11) {
            w0.d.b(this.R, str3);
        }
        if ((j10 & 392) != j11) {
            w0.d.b(this.S, str2);
        }
        if ((j10 & j12) != j11) {
            w0.d.b(this.T, str);
        }
        if ((j10 & j13) != j11) {
            this.E.setVisibility(i11);
            this.F.setVisibility(i10);
        }
        if ((j10 & 388) != j11) {
            w0.e.a(this.I, drawable);
            w0.b.a(this.I, r12);
            this.I.setTextColor(iA);
            w0.e.a(this.M, drawableB);
            w0.b.a(this.M, r10);
            this.M.setTextColor(i12);
        }
        if ((j10 & 256) != j11) {
            this.I.setOnClickListener(this.U);
            this.M.setOnClickListener(this.V);
        }
    }

    private v3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 5, (ConstraintLayout) objArr[9], (ImageButton) objArr[11], (ImageButton) objArr[13], (ConstraintLayout) objArr[10], (ImageButton) objArr[2], (ImageButton) objArr[1], (ConstraintLayout) objArr[8], (VideoRangeSeekBar) objArr[16], (ToggleButton) objArr[4], (FrameLayout) objArr[15], (ConstraintLayout) objArr[14], (RadioGroup) objArr[12], (ToggleButton) objArr[3]);
        this.W = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArr[5];
        this.R = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[6];
        this.S = textView2;
        textView2.setTag(null);
        TextView textView3 = (TextView) objArr[7];
        this.T = textView3;
        textView3.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.I.setTag(null);
        this.M.setTag(null);
        T(view);
        this.U = new kg.a(this, 2);
        this.V = new kg.a(this, 1);
        F();
    }
}
