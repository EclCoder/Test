package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import com.hecorat.screenrecorder.free.R;
import com.theartofdev.edmodo.cropper.CropOverlayView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t3 extends s3 {
    private static final androidx.databinding.p.i D = null;
    private static final SparseIntArray E;
    private final FrameLayout B;
    private long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.crop_overlay_view, 1);
    }

    public t3(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 2, D, E));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.C = 2L;
        }
        N();
    }

    @Override // androidx.databinding.p
    protected boolean J(int i10, Object obj, int i11) {
        return false;
    }

    @Override // androidx.databinding.p
    protected void s() {
        synchronized (this) {
            this.C = 0L;
        }
    }

    private t3(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (CropOverlayView) objArr[1]);
        this.C = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.B = frameLayout;
        frameLayout.setTag(null);
        T(view);
        F();
    }
}
