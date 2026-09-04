package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class o6 extends n6 implements kg.a.InterfaceC0657a {
    private static final androidx.databinding.p.i F = null;
    private static final SparseIntArray G = null;
    private final View.OnClickListener D;
    private long E;

    public o6(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 1, F, G));
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
        return false;
    }

    @Override // tf.n6
    public void a0(gh.c cVar) {
        this.C = cVar;
        synchronized (this) {
            this.E |= 1;
        }
        i(2);
        super.N();
    }

    @Override // kg.a.InterfaceC0657a
    public final void b(int i10, View view) {
        gh.c cVar = this.C;
        FBLiveDestination fBLiveDestination = this.B;
        if (cVar != null) {
            cVar.a(fBLiveDestination);
        }
    }

    @Override // tf.n6
    public void b0(FBLiveDestination fBLiveDestination) {
        this.B = fBLiveDestination;
        synchronized (this) {
            this.E |= 2;
        }
        i(4);
        super.N();
    }

    @Override // androidx.databinding.p
    protected void s() {
        long j10;
        synchronized (this) {
            j10 = this.E;
            this.E = 0L;
        }
        FBLiveDestination fBLiveDestination = this.B;
        long j11 = 6 & j10;
        String name = (j11 == 0 || fBLiveDestination == null) ? null : fBLiveDestination.getName();
        if (j11 != 0) {
            w0.d.b(this.A, name);
        }
        if ((j10 & 4) != 0) {
            this.A.setOnClickListener(this.D);
        }
    }

    private o6(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CheckedTextView) objArr[0]);
        this.E = -1L;
        this.A.setTag(null);
        T(view);
        this.D = new kg.a(this, 1);
        F();
    }
}
