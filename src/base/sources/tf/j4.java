package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class j4 extends i4 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i S = null;
    private static final SparseIntArray T;
    private final ConstraintLayout K;
    private final ProgressBar L;
    private final View.OnClickListener M;
    private final View.OnClickListener N;
    private final View.OnClickListener O;
    private final View.OnClickListener P;
    private final View.OnClickListener Q;
    private long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(R.id.profile_cv, 9);
        sparseIntArray.put(R.id.title_layout, 10);
    }

    public j4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 11, S, T));
    }

    private boolean Z(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.R |= 1;
        }
        return true;
    }

    private boolean a0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.R |= 4;
        }
        return true;
    }

    private boolean b0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.R |= 8;
        }
        return true;
    }

    private boolean c0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.R |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.R = 32L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return Z((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 1) {
            return c0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 2) {
            return a0((androidx.lifecycle.p0) obj, i11);
        }
        if (i10 != 3) {
            return false;
        }
        return b0((androidx.lifecycle.k0) obj, i11);
    }

    @Override // tf.i4
    public void Y(gh.o oVar) {
        this.J = oVar;
        synchronized (this) {
            this.R |= 16;
        }
        i(15);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        gh.o oVar;
        if (i10 == 1) {
            gh.o oVar2 = this.J;
            if (oVar2 != null) {
                oVar2.x();
                return;
            }
            return;
        }
        if (i10 == 2) {
            gh.o oVar3 = this.J;
            if (oVar3 != null) {
                oVar3.j();
                return;
            }
            return;
        }
        if (i10 == 3) {
            gh.o oVar4 = this.J;
            if (oVar4 != null) {
                oVar4.v();
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 == 5 && (oVar = this.J) != null) {
                oVar.U();
                return;
            }
            return;
        }
        gh.o oVar5 = this.J;
        if (oVar5 != null) {
            oVar5.U();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        long j11;
        String str;
        String strB;
        String str2;
        androidx.lifecycle.k0 k0VarN;
        synchronized (this) {
            j10 = this.R;
            this.R = 0L;
        }
        gh.o oVar = this.J;
        int i10 = 0;
        String name = null;
        if ((63 & j10) != 0) {
            if ((j10 & 49) == 0) {
                str2 = null;
            } else {
                androidx.lifecycle.k0 k0VarP = oVar != null ? oVar.P() : null;
                V(0, k0VarP);
                if (k0VarP != null) {
                    str2 = (String) k0VarP.f();
                } else {
                    str2 = null;
                }
            }
            long j12 = j10 & 50;
            if (j12 != 0) {
                if (oVar != null) {
                    k0VarN = oVar.n();
                    j11 = 0;
                } else {
                    j11 = 0;
                    k0VarN = null;
                }
                V(1, k0VarN);
                boolean zQ = androidx.databinding.p.Q(k0VarN != null ? (Boolean) k0VarN.f() : null);
                if (j12 != 0) {
                    j10 |= zQ ? 128L : 64L;
                }
                if (!zQ) {
                    i10 = 8;
                }
            } else {
                j11 = 0;
            }
            if ((j10 & 52) == j11) {
                strB = null;
            } else {
                androidx.lifecycle.p0 p0VarQ = oVar != null ? oVar.Q() : null;
                V(2, p0VarQ);
                tg.b bVar = p0VarQ != null ? (tg.b) p0VarQ.f() : null;
                if (bVar != null) {
                    strB = bVar.b();
                } else {
                    strB = null;
                }
            }
            if ((j10 & 56) != j11) {
                androidx.lifecycle.k0 k0VarS = oVar != null ? oVar.S() : null;
                V(3, k0VarS);
                FBLiveDestination fBLiveDestination = k0VarS != null ? (FBLiveDestination) k0VarS.f() : null;
                if (fBLiveDestination != null) {
                    name = fBLiveDestination.getName();
                }
            }
            str = name;
        } else {
            j11 = 0;
            str = null;
            strB = null;
            str2 = null;
        }
        if ((j10 & 32) != j11) {
            this.A.setOnClickListener(this.Q);
            this.B.setOnClickListener(this.P);
            this.C.setOnClickListener(this.M);
            this.D.setOnClickListener(this.O);
            this.G.setOnClickListener(this.N);
            EditText editText = this.H;
            editText.setHint(editText.getResources().getString(R.string.az_live_with_app, this.H.getResources().getString(R.string.app_name)));
        }
        if ((j10 & 56) != j11) {
            w0.d.b(this.B, str);
        }
        if ((j10 & 50) != j11) {
            this.L.setVisibility(i10);
        }
        if ((j10 & 52) != j11) {
            nh.a.a(this.E, strB);
        }
        if ((j10 & 49) != j11) {
            w0.d.b(this.H, str2);
        }
    }

    private j4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 4, (ImageView) objArr[2], (TextView) objArr[6], (ImageView) objArr[7], (ImageView) objArr[1], (ImageView) objArr[3], (CardView) objArr[9], (TextView) objArr[4], (EditText) objArr[5], (LinearLayout) objArr[10]);
        this.R = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[8];
        this.L = progressBar;
        progressBar.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        T(view);
        this.M = new kg.a(this, 5);
        this.N = new kg.a(this, 3);
        this.O = new kg.a(this, 1);
        this.P = new kg.a(this, 4);
        this.Q = new kg.a(this, 2);
        F();
    }
}
