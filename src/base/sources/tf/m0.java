package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class m0 extends l0 {
    private static final androidx.databinding.p.i O = null;
    private static final SparseIntArray P;
    private final LinearLayout M;
    private long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(R.id.title_tv, 1);
        sparseIntArray.put(R.id.close_iv, 2);
        sparseIntArray.put(R.id.screenshot_tile, 3);
        sparseIntArray.put(R.id.screenshot_tile_icon, 4);
        sparseIntArray.put(R.id.camera_tile, 5);
        sparseIntArray.put(R.id.camera_tile_icon, 6);
        sparseIntArray.put(R.id.brush_tile, 7);
        sparseIntArray.put(R.id.brush_tile_icon, 8);
        sparseIntArray.put(R.id.magic_tile, 9);
        sparseIntArray.put(R.id.magic_tile_icon, 10);
        sparseIntArray.put(R.id.audio_source_tile, 11);
        sparseIntArray.put(R.id.audio_source_value_tv, 12);
    }

    public m0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 13, O, P));
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
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    private m0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (LinearLayout) objArr[11], (TextView) objArr[12], (LinearLayout) objArr[7], (ImageView) objArr[8], (LinearLayout) objArr[5], (ImageView) objArr[6], (ImageView) objArr[2], (LinearLayout) objArr[9], (ImageView) objArr[10], (LinearLayout) objArr[3], (ImageView) objArr[4], (TextView) objArr[1]);
        this.N = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.M = linearLayout;
        linearLayout.setTag(null);
        T(view);
        F();
    }
}
