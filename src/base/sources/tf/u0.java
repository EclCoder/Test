package tf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class u0 extends androidx.databinding.p {
    public final AppBarLayout A;
    public final ConstraintLayout B;
    public final Toolbar C;
    public final TextView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final FrameLayout H;

    protected u0(Object obj, View view, int i10, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, Toolbar toolbar, TextView textView, TextView textView2, TextView textView3, TextView textView4, FrameLayout frameLayout) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = constraintLayout;
        this.C = toolbar;
        this.D = textView;
        this.E = textView2;
        this.F = textView3;
        this.G = textView4;
        this.H = frameLayout;
    }
}
