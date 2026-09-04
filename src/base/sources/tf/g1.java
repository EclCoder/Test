package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.ads.nativead.NativeAdView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g1 extends androidx.databinding.p {
    public final AppCompatButton A;
    public final NativeAdView B;
    public final TextView C;
    public final ImageView D;
    public final TextView E;
    public final ProgressBar F;

    protected g1(Object obj, View view, int i10, AppCompatButton appCompatButton, NativeAdView nativeAdView, TextView textView, ImageView imageView, TextView textView2, ProgressBar progressBar) {
        super(obj, view, i10);
        this.A = appCompatButton;
        this.B = nativeAdView;
        this.C = textView;
        this.D = imageView;
        this.E = textView2;
        this.F = progressBar;
    }
}
