package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.EncodeParam;
import com.hecorat.screenrecorder.free.models.Resolution;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class l4 extends k4 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i W = null;
    private static final SparseIntArray X;
    private final CoordinatorLayout Q;
    private final TextView R;
    private final TextView S;
    private final View.OnClickListener T;
    private final View.OnClickListener U;
    private long V;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        X = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.settings_layout, 7);
        sparseIntArray.put(R.id.guideline_start, 8);
        sparseIntArray.put(R.id.guideline_end, 9);
        sparseIntArray.put(R.id.resolution_iv, 10);
        sparseIntArray.put(R.id.resolution_header_tv, 11);
        sparseIntArray.put(R.id.action_divider, 12);
        sparseIntArray.put(R.id.switch_account_cl, 13);
        sparseIntArray.put(R.id.account_iv, 14);
        sparseIntArray.put(R.id.account_header_tv, 15);
        sparseIntArray.put(R.id.account_divider, 16);
        sparseIntArray.put(R.id.logout_iv, 17);
    }

    public l4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 18, W, X));
    }

    private boolean b0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 1;
        }
        return true;
    }

    private boolean c0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.V |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.V != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.V = 8L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return b0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 != 1) {
            return false;
        }
        return c0((androidx.lifecycle.k0) obj, i11);
    }

    @Override // tf.k4
    public void a0(fh.i iVar) {
        this.P = iVar;
        synchronized (this) {
            this.V |= 4;
        }
        i(15);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        fh.i iVar;
        if (i10 != 1) {
            if (i10 == 2 && (iVar = this.P) != null) {
                iVar.u();
                return;
            }
            return;
        }
        fh.i iVar2 = this.P;
        if (iVar2 != null) {
            iVar2.v();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        String str;
        String name;
        synchronized (this) {
            j10 = this.V;
            this.V = 0L;
        }
        fh.i iVar = this.P;
        String strA = null;
        if ((15 & j10) != 0) {
            if ((j10 & 13) == 0) {
                name = null;
            } else {
                androidx.lifecycle.k0 k0VarM = iVar != null ? iVar.m() : null;
                V(0, k0VarM);
                EncodeParam encodeParam = k0VarM != null ? (EncodeParam) k0VarM.f() : null;
                Resolution resolution = encodeParam != null ? encodeParam.getResolution() : null;
                if (resolution != null) {
                    name = resolution.getName();
                } else {
                    name = null;
                }
            }
            if ((j10 & 14) != 0) {
                androidx.lifecycle.k0 k0VarN = iVar != null ? iVar.n() : null;
                V(1, k0VarN);
                tg.b bVar = k0VarN != null ? (tg.b) k0VarN.f() : null;
                if (bVar != null) {
                    strA = bVar.a();
                }
            }
            str = strA;
            strA = name;
        } else {
            str = null;
        }
        if ((8 & j10) != 0) {
            this.H.setOnClickListener(this.T);
            this.J.setOnClickListener(this.U);
        }
        if ((13 & j10) != 0) {
            w0.d.b(this.R, strA);
        }
        if ((j10 & 14) != 0) {
            w0.d.b(this.S, str);
        }
    }

    private l4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 2, (View) objArr[16], (TextView) objArr[15], (ImageView) objArr[14], (View) objArr[12], (AppBarLayout) objArr[5], (Guideline) objArr[9], (Guideline) objArr[8], (ConstraintLayout) objArr[4], (ImageView) objArr[17], (ConstraintLayout) objArr[1], (TextView) objArr[11], (ImageView) objArr[10], (ConstraintLayout) objArr[7], (ConstraintLayout) objArr[13], (Toolbar) objArr[6]);
        this.V = -1L;
        this.H.setTag(null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArr[0];
        this.Q = coordinatorLayout;
        coordinatorLayout.setTag(null);
        TextView textView = (TextView) objArr[2];
        this.R = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArr[3];
        this.S = textView2;
        textView2.setTag(null);
        this.J.setTag(null);
        T(view);
        this.T = new kg.a(this, 2);
        this.U = new kg.a(this, 1);
        F();
    }
}
