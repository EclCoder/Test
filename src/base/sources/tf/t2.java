package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class t2 extends s2 {
    private static final androidx.databinding.p.i G = null;
    private static final SparseIntArray H;
    private final FrameLayout E;
    private long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.close_btn, 1);
        sparseIntArray.put(R.id.upgrade_or_watch_ads_tv, 2);
        sparseIntArray.put(R.id.upgrade_btn, 3);
        sparseIntArray.put(R.id.watch_ads_btn, 4);
    }

    public t2(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 5, G, H));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    private t2(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (ImageView) objArr[1], (Button) objArr[3], (TextView) objArr[2], (Button) objArr[4]);
        this.F = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.E = frameLayout;
        frameLayout.setTag(null);
        T(view);
        F();
    }
}
