package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class n4 extends m4 implements kg.b.a, kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i R = null;
    private static final SparseIntArray S;
    private final ConstraintLayout K;
    private final ProgressBar L;
    private final w0.a.InterfaceC0848a M;
    private final View.OnClickListener N;
    private final View.OnClickListener O;
    private final View.OnClickListener P;
    private long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(R.id.profile_cv, 9);
        sparseIntArray.put(R.id.title_layout, 10);
    }

    public n4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 11, R, S));
    }

    private boolean b0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 8;
        }
        return true;
    }

    private boolean c0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 4;
        }
        return true;
    }

    private boolean d0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 1;
        }
        return true;
    }

    private boolean e0(androidx.lifecycle.p0 p0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 16;
        }
        return true;
    }

    private boolean f0(androidx.lifecycle.k0 k0Var, int i10) {
        if (i10 != 0) {
            return false;
        }
        synchronized (this) {
            this.Q |= 2;
        }
        return true;
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.Q = 64L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        if (i10 == 0) {
            return d0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 1) {
            return f0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 2) {
            return c0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 == 3) {
            return b0((androidx.lifecycle.k0) obj, i11);
        }
        if (i10 != 4) {
            return false;
        }
        return e0((androidx.lifecycle.p0) obj, i11);
    }

    @Override // tf.m4
    public void a0(jh.j jVar) {
        this.J = jVar;
        synchronized (this) {
            this.Q |= 32;
        }
        i(15);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        jh.j jVar;
        if (i10 == 1) {
            jh.j jVar2 = this.J;
            if (jVar2 != null) {
                jVar2.x();
                return;
            }
            return;
        }
        if (i10 != 2) {
            if (i10 == 3 && (jVar = this.J) != null) {
                jVar.v();
                return;
            }
            return;
        }
        jh.j jVar3 = this.J;
        if (jVar3 != null) {
            jVar3.j();
        }
    }

    @Override // kg.b.a
    public final void c(int i10, AdapterView adapterView, View view, int i11, long j10) {
        jh.j jVar = this.J;
        if (jVar != null) {
            jVar.e0(i11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:40:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0087  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ba A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00db  */
    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        long j11;
        String strB;
        String str;
        String str2;
        int i10;
        int i11;
        String str3;
        int iP;
        String str4;
        androidx.lifecycle.p0 p0VarD0;
        tg.b bVar;
        androidx.lifecycle.k0 k0VarZ;
        androidx.lifecycle.k0 k0VarA0;
        Integer num;
        synchronized (this) {
            j10 = this.Q;
            this.Q = 0L;
        }
        jh.j jVar = this.J;
        if ((127 & j10) != 0) {
            if ((j10 & 97) == 0) {
                str3 = null;
            } else {
                androidx.lifecycle.k0 k0VarB0 = jVar != null ? jVar.b0() : null;
                V(0, k0VarB0);
                if (k0VarB0 != null) {
                    str3 = (String) k0VarB0.f();
                } else {
                    str3 = null;
                }
            }
            long j12 = j10 & 98;
            if (j12 != 0) {
                androidx.lifecycle.k0 k0VarN = jVar != null ? jVar.n() : null;
                j11 = 112;
                V(1, k0VarN);
                boolean zQ = androidx.databinding.p.Q(k0VarN != null ? (Boolean) k0VarN.f() : null);
                if (j12 != 0) {
                    j10 |= zQ ? 256L : 128L;
                }
                if (!zQ) {
                    i10 = 8;
                }
                if ((j10 & 100) != 0) {
                    if (jVar != null) {
                        k0VarA0 = jVar.a0();
                    } else {
                        k0VarA0 = null;
                    }
                    V(2, k0VarA0);
                    if (k0VarA0 != null) {
                        num = (Integer) k0VarA0.f();
                    } else {
                        num = null;
                    }
                    iP = androidx.databinding.p.P(num);
                } else {
                    iP = 0;
                }
                if ((j10 & 104) == 0) {
                    str4 = null;
                } else {
                    if (jVar != null) {
                        k0VarZ = jVar.Z();
                    } else {
                        k0VarZ = null;
                    }
                    V(3, k0VarZ);
                    if (k0VarZ != null) {
                        str4 = (String) k0VarZ.f();
                    } else {
                        str4 = null;
                    }
                }
                if ((j10 & j11) == 0) {
                    strB = null;
                } else {
                    if (jVar != null) {
                        p0VarD0 = jVar.d0();
                    } else {
                        p0VarD0 = null;
                    }
                    V(4, p0VarD0);
                    if (p0VarD0 != null) {
                        bVar = (tg.b) p0VarD0.f();
                    } else {
                        bVar = null;
                    }
                    if (bVar != null) {
                        strB = bVar.b();
                    } else {
                        strB = null;
                    }
                }
                str2 = str4;
                str = str3;
                i11 = iP;
            } else {
                j11 = 112;
            }
            i10 = 0;
            if ((j10 & 100) != 0) {
                if (jVar != null) {
                    k0VarA0 = jVar.a0();
                } else {
                    k0VarA0 = null;
                }
                V(2, k0VarA0);
                if (k0VarA0 != null) {
                    num = (Integer) k0VarA0.f();
                } else {
                    num = null;
                }
                iP = androidx.databinding.p.P(num);
            } else {
                iP = 0;
            }
            if ((j10 & 104) == 0) {
                str4 = null;
            } else {
                if (jVar != null) {
                    k0VarZ = jVar.Z();
                } else {
                    k0VarZ = null;
                }
                V(3, k0VarZ);
                if (k0VarZ != null) {
                    str4 = (String) k0VarZ.f();
                } else {
                    str4 = null;
                }
            }
            if ((j10 & j11) == 0) {
                strB = null;
            } else {
                if (jVar != null) {
                    p0VarD0 = jVar.d0();
                } else {
                    p0VarD0 = null;
                }
                V(4, p0VarD0);
                if (p0VarD0 != null) {
                    bVar = (tg.b) p0VarD0.f();
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    strB = bVar.b();
                } else {
                    strB = null;
                }
            }
            str2 = str4;
            str = str3;
            i11 = iP;
        } else {
            j11 = 112;
            strB = null;
            str = null;
            str2 = null;
            i10 = 0;
            i11 = 0;
        }
        if ((j10 & 64) != 0) {
            this.A.setOnClickListener(this.N);
            this.C.setOnClickListener(this.P);
            w0.a.a(this.E, this.M, null, null);
            this.G.setOnClickListener(this.O);
            EditText editText = this.H;
            editText.setHint(editText.getResources().getString(R.string.az_live_with_app, this.H.getResources().getString(R.string.app_name)));
        }
        if ((j10 & 104) != 0) {
            w0.d.b(this.B, str2);
        }
        if ((j10 & 98) != 0) {
            this.L.setVisibility(i10);
        }
        if ((j10 & j11) != 0) {
            nh.a.a(this.D, strB);
        }
        if ((j10 & 100) != 0) {
            w0.a.b(this.E, i11);
        }
        if ((j10 & 97) != 0) {
            w0.d.b(this.H, str);
        }
    }

    private n4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 5, (ImageView) objArr[2], (EditText) objArr[6], (ImageView) objArr[1], (ImageView) objArr[3], (Spinner) objArr[7], (CardView) objArr[9], (TextView) objArr[4], (EditText) objArr[5], (LinearLayout) objArr[10]);
        this.Q = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        ProgressBar progressBar = (ProgressBar) objArr[8];
        this.L = progressBar;
        progressBar.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        T(view);
        this.M = new kg.b(this, 4);
        this.N = new kg.a(this, 2);
        this.O = new kg.a(this, 3);
        this.P = new kg.a(this, 1);
        F();
    }
}
