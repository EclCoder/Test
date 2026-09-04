package tf;

import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.ui.StyledPlayerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o4 extends androidx.databinding.p {
    public final LinearLayout A;
    public final p7 B;
    public final StyledPlayerView C;
    public final ImageView D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final HorizontalScrollView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final RelativeLayout K;

    protected o4(Object obj, View view, int i10, LinearLayout linearLayout, p7 p7Var, StyledPlayerView styledPlayerView, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, HorizontalScrollView horizontalScrollView, TextView textView, TextView textView2, TextView textView3, RelativeLayout relativeLayout) {
        super(obj, view, i10);
        this.A = linearLayout;
        this.B = p7Var;
        this.C = styledPlayerView;
        this.D = imageView;
        this.E = linearLayout2;
        this.F = linearLayout3;
        this.G = horizontalScrollView;
        this.H = textView;
        this.I = textView2;
        this.J = textView3;
        this.K = relativeLayout;
    }
}
