package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.WatermarkView;
import com.xiaopo.flying.sticker.StickerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class v4 extends u4 {
    private static final androidx.databinding.p.i F = null;
    private static final SparseIntArray G;
    private final FrameLayout D;
    private long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.sticker_view, 1);
        sparseIntArray.put(R.id.watermark_layout, 2);
        sparseIntArray.put(R.id.watermark_tv, 3);
    }

    public v4(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 4, F, G));
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
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    private v4(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (StickerView) objArr[1], (ConstraintLayout) objArr[2], (WatermarkView) objArr[3]);
        this.E = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.D = frameLayout;
        frameLayout.setTag(null);
        T(view);
        F();
    }
}
