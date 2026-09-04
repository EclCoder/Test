package tf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q extends androidx.databinding.p {
    public final AppBarLayout A;
    public final FrameLayout B;
    public final View C;
    public final ImageView D;
    public final LinearLayout E;
    public final LinearLayout F;
    public final LinearLayout G;
    public final ProgressBar H;
    public final Toolbar I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final FrameLayout M;

    protected q(Object obj, View view, int i10, AppBarLayout appBarLayout, FrameLayout frameLayout, View view2, ImageView imageView, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ProgressBar progressBar, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout2) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = frameLayout;
        this.C = view2;
        this.D = imageView;
        this.E = linearLayout;
        this.F = linearLayout2;
        this.G = linearLayout3;
        this.H = progressBar;
        this.I = toolbar;
        this.J = textView;
        this.K = textView2;
        this.L = textView3;
        this.M = frameLayout2;
    }
}
