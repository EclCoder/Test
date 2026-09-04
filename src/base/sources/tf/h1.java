package tf;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.cardview.widget.CardView;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class h1 extends g1 {
    private static final androidx.databinding.p.i I = null;
    private static final SparseIntArray J;
    private final CardView G;
    private long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.loading_progress, 1);
        sparseIntArray.put(R.id.gg_ad_container, 2);
        sparseIntArray.put(R.id.gg_ad_icon, 3);
        sparseIntArray.put(R.id.gg_ad_title, 4);
        sparseIntArray.put(R.id.gg_ad_description, 5);
        sparseIntArray.put(R.id.gg_ad_call_to_action_btn, 6);
    }

    public h1(androidx.databinding.f fVar, View view) {
        this(fVar, view, androidx.databinding.p.I(fVar, view, 7, I, J));
    }

    @Override // androidx.databinding.p
    public boolean D() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.databinding.p
    public void F() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    private h1(androidx.databinding.f fVar, View view, Object[] objArr) {
        super(fVar, view, 0, (AppCompatButton) objArr[6], (NativeAdView) objArr[2], (TextView) objArr[5], (ImageView) objArr[3], (TextView) objArr[4], (ProgressBar) objArr[1]);
        this.H = -1L;
        CardView cardView = (CardView) objArr[0];
        this.G = cardView;
        cardView.setTag(null);
        T(view);
        F();
    }
}
