package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g0 extends androidx.databinding.p {
    public final View A;
    public final RelativeLayout B;
    public final AppBarLayout C;
    public final MaterialCardView D;
    public final ImageView E;
    public final TextView F;
    public final TextView G;
    public final z0 H;
    public final RelativeLayout I;
    public final ImageView J;
    public final LinearLayout K;
    public final RecyclerView L;
    public final TextView M;
    public final ImageView N;
    public final Toolbar O;

    protected g0(Object obj, View view, int i10, View view2, RelativeLayout relativeLayout, AppBarLayout appBarLayout, MaterialCardView materialCardView, ImageView imageView, TextView textView, TextView textView2, z0 z0Var, RelativeLayout relativeLayout2, ImageView imageView2, LinearLayout linearLayout, RecyclerView recyclerView, TextView textView3, ImageView imageView3, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = view2;
        this.B = relativeLayout;
        this.C = appBarLayout;
        this.D = materialCardView;
        this.E = imageView;
        this.F = textView;
        this.G = textView2;
        this.H = z0Var;
        this.I = relativeLayout2;
        this.J = imageView2;
        this.K = linearLayout;
        this.L = recyclerView;
        this.M = textView3;
        this.N = imageView3;
        this.O = toolbar;
    }
}
