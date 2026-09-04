package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a2 extends z1 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i N = null;
    private static final SparseIntArray O;
    private final RelativeLayout H;
    private final View.OnClickListener I;
    private final View.OnClickListener J;
    private final View.OnClickListener K;
    private final View.OnClickListener L;
    private long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.layout_top, 4);
        sparseIntArray.put(R.id.title_live_stream, 5);
        sparseIntArray.put(R.id.loading_ads_progress, 6);
    }

    public a2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 7, N, O));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.M = 2L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.z1
    public void a0(fh.v vVar) {
        this.G = vVar;
        synchronized (this) {
            this.M |= 1;
        }
        i(15);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        fh.v vVar;
        if (i10 == 1) {
            fh.v vVar2 = this.G;
            if (vVar2 != null) {
                vVar2.j();
                return;
            }
            return;
        }
        if (i10 == 2) {
            fh.v vVar3 = this.G;
            if (vVar3 != null) {
                vVar3.j();
                return;
            }
            return;
        }
        if (i10 != 3) {
            if (i10 == 4 && (vVar = this.G) != null) {
                vVar.o();
                return;
            }
            return;
        }
        fh.v vVar4 = this.G;
        if (vVar4 != null) {
            vVar4.n();
        }
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.M;
            this.M = 0L;
        }
        if ((j10 & 2) != 0) {
            this.A.setOnClickListener(this.L);
            this.B.setOnClickListener(this.I);
            this.H.setOnClickListener(this.K);
            this.F.setOnClickListener(this.J);
        }
    }

    private a2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageButton) objArr[1], (ImageView) objArr[2], (RelativeLayout) objArr[4], (ProgressBar) objArr[6], (TextView) objArr[5], (ImageView) objArr[3]);
        this.M = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.H = relativeLayout;
        relativeLayout.setTag(null);
        this.F.setTag(null);
        T(view);
        this.I = new kg.a(this, 3);
        this.J = new kg.a(this, 4);
        this.K = new kg.a(this, 1);
        this.L = new kg.a(this, 2);
        F();
    }
}
