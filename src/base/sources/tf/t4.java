package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.PreviewFragment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t4 extends s4 implements kg.a.InterfaceC0657a {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final androidx.databinding.p.i f53376e0 = null;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final SparseIntArray f53377f0;
    private final ConstraintLayout J;
    private final Button K;
    private final Button L;
    private final Button M;
    private final Button N;
    private final Button O;
    private final Button P;
    private final Button Q;
    private final Button R;
    private final View.OnClickListener S;
    private final View.OnClickListener T;
    private final View.OnClickListener U;
    private final View.OnClickListener V;
    private final View.OnClickListener W;
    private final View.OnClickListener X;
    private final View.OnClickListener Y;
    private final View.OnClickListener Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final View.OnClickListener f53378a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private final View.OnClickListener f53379b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private final View.OnClickListener f53380c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f53381d0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f53377f0 = sparseIntArray;
        sparseIntArray.put(R.id.middle_view, 12);
        sparseIntArray.put(R.id.player_control_view, 13);
        sparseIntArray.put(R.id.video_list_rv, 14);
        sparseIntArray.put(R.id.actions_view, 15);
    }

    public t4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 16, f53376e0, f53377f0));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.f53381d0 != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.f53381d0 = 4L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // tf.s4
    public void a0(PreviewFragment previewFragment) {
        this.I = previewFragment;
        synchronized (this) {
            this.f53381d0 |= 1;
        }
        i(5);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        switch (i10) {
            case 1:
                PreviewFragment previewFragment = this.I;
                if (previewFragment != null) {
                    previewFragment.p0();
                }
                break;
            case 2:
                PreviewFragment previewFragment2 = this.I;
                if (previewFragment2 != null) {
                    previewFragment2.g0();
                }
                break;
            case 3:
                PreviewFragment previewFragment3 = this.I;
                if (previewFragment3 != null) {
                    previewFragment3.i0();
                }
                break;
            case 4:
                PreviewFragment previewFragment4 = this.I;
                if (previewFragment4 != null) {
                    previewFragment4.h0();
                }
                break;
            case 5:
                PreviewFragment previewFragment5 = this.I;
                if (previewFragment5 != null) {
                    previewFragment5.j0();
                }
                break;
            case 6:
                PreviewFragment previewFragment6 = this.I;
                if (previewFragment6 != null) {
                    previewFragment6.m0();
                }
                break;
            case 7:
                PreviewFragment previewFragment7 = this.I;
                if (previewFragment7 != null) {
                    previewFragment7.f0();
                }
                break;
            case 8:
                PreviewFragment previewFragment8 = this.I;
                if (previewFragment8 != null) {
                    previewFragment8.n0();
                }
                break;
            case 9:
                PreviewFragment previewFragment9 = this.I;
                if (previewFragment9 != null) {
                    previewFragment9.o0();
                }
                break;
            case 10:
                PreviewFragment previewFragment10 = this.I;
                if (previewFragment10 != null) {
                    previewFragment10.r0();
                }
                break;
            case 11:
                PreviewFragment previewFragment11 = this.I;
                if (previewFragment11 != null) {
                    previewFragment11.Q();
                }
                break;
        }
    }

    @Override // tf.s4
    public void b0(uh.y yVar) {
        this.H = yVar;
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.f53381d0;
            this.f53381d0 = 0L;
        }
        if ((j10 & 4) != 0) {
            this.B.setOnClickListener(this.S);
            this.C.setOnClickListener(this.W);
            this.K.setOnClickListener(this.Y);
            this.L.setOnClickListener(this.Z);
            this.M.setOnClickListener(this.U);
            this.N.setOnClickListener(this.V);
            this.O.setOnClickListener(this.T);
            this.P.setOnClickListener(this.f53378a0);
            this.Q.setOnClickListener(this.f53379b0);
            this.R.setOnClickListener(this.f53380c0);
            this.E.setOnClickListener(this.X);
        }
    }

    private t4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (HorizontalScrollView) objArr[15], (Button) objArr[5], (Button) objArr[1], (ConstraintLayout) objArr[12], (Button) objArr[2], (PlayerControlView) objArr[13], (RecyclerView) objArr[14]);
        this.f53381d0 = -1L;
        this.B.setTag(null);
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        Button button = (Button) objArr[10];
        this.K = button;
        button.setTag(null);
        Button button2 = (Button) objArr[11];
        this.L = button2;
        button2.setTag(null);
        Button button3 = (Button) objArr[3];
        this.M = button3;
        button3.setTag(null);
        Button button4 = (Button) objArr[4];
        this.N = button4;
        button4.setTag(null);
        Button button5 = (Button) objArr[6];
        this.O = button5;
        button5.setTag(null);
        Button button6 = (Button) objArr[7];
        this.P = button6;
        button6.setTag(null);
        Button button7 = (Button) objArr[8];
        this.Q = button7;
        button7.setTag(null);
        Button button8 = (Button) objArr[9];
        this.R = button8;
        button8.setTag(null);
        this.E.setTag(null);
        T(view);
        this.S = new kg.a(this, 5);
        this.T = new kg.a(this, 6);
        this.U = new kg.a(this, 3);
        this.V = new kg.a(this, 4);
        this.W = new kg.a(this, 1);
        this.X = new kg.a(this, 2);
        this.Y = new kg.a(this, 10);
        this.Z = new kg.a(this, 11);
        this.f53378a0 = new kg.a(this, 7);
        this.f53379b0 = new kg.a(this, 8);
        this.f53380c0 = new kg.a(this, 9);
        F();
    }
}
