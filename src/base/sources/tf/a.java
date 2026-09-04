package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a extends androidx.databinding.p {
    public final AppBarLayout A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public final NestedScrollView F;
    public final Toolbar G;
    public final TextView H;
    public final TextView I;
    public final TextView J;

    protected a(Object obj, View view, int i10, AppBarLayout appBarLayout, ImageView imageView, TextView textView, TextView textView2, TextView textView3, NestedScrollView nestedScrollView, Toolbar toolbar, TextView textView4, TextView textView5, TextView textView6) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
        this.E = textView3;
        this.F = nestedScrollView;
        this.G = toolbar;
        this.H = textView4;
        this.I = textView5;
        this.J = textView6;
    }
}
