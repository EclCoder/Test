package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a1 extends z0 {
    private static final androidx.databinding.p.i K = null;
    private static final SparseIntArray L;
    private final FrameLayout I;
    private long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.gg_native_ad_view, 1);
        sparseIntArray.put(R.id.layout_ad_media, 2);
        sparseIntArray.put(R.id.gg_ad_media_view, 3);
        sparseIntArray.put(R.id.gg_ad_details, 4);
        sparseIntArray.put(R.id.gg_ad_icon, 5);
        sparseIntArray.put(R.id.gg_ad_title, 6);
        sparseIntArray.put(R.id.gg_ad_description, 7);
        sparseIntArray.put(R.id.gg_ad_call_to_action_btn, 8);
    }

    public a1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 9, K, L));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.J = 1L;
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
            this.J = 0L;
        }
    }

    private a1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppCompatButton) objArr[8], (TextView) objArr[7], (ConstraintLayout) objArr[4], (ImageView) objArr[5], (MediaView) objArr[3], (TextView) objArr[6], (NativeAdView) objArr[1], (ConstraintLayout) objArr[2]);
        this.J = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.I = frameLayout;
        frameLayout.setTag(null);
        T(view);
        F();
    }
}
