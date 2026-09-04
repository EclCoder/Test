package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class x0 extends w0 {
    private static final androidx.databinding.p.i H = null;
    private static final SparseIntArray I;
    private long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.gg_ad_icon, 1);
        sparseIntArray.put(R.id.gg_ad_details, 2);
        sparseIntArray.put(R.id.gg_ad_title, 3);
        sparseIntArray.put(R.id.gg_ad_description, 4);
        sparseIntArray.put(R.id.gg_ad_call_to_action_btn, 5);
    }

    public x0(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 6, H, I));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.G = 1L;
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
            this.G = 0L;
        }
    }

    private x0(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppCompatButton) objArr[5], (TextView) objArr[4], (LinearLayout) objArr[2], (ImageView) objArr[1], (TextView) objArr[3], (NativeAdView) objArr[0]);
        this.G = -1L;
        this.F.setTag(null);
        T(view);
        F();
    }
}
