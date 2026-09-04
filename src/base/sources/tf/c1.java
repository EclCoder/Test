package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAdView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c1 extends androidx.databinding.p {
    public final AppCompatButton A;
    public final TextView B;
    public final ConstraintLayout C;
    public final ImageView D;
    public final MediaView E;
    public final TextView F;
    public final NativeAdView G;
    public final ConstraintLayout H;

    protected c1(Object obj, View view, int i10, AppCompatButton appCompatButton, TextView textView, ConstraintLayout constraintLayout, ImageView imageView, MediaView mediaView, TextView textView2, NativeAdView nativeAdView, ConstraintLayout constraintLayout2) {
        super(obj, view, i10);
        this.A = appCompatButton;
        this.B = textView;
        this.C = constraintLayout;
        this.D = imageView;
        this.E = mediaView;
        this.F = textView2;
        this.G = nativeAdView;
        this.H = constraintLayout2;
    }
}
