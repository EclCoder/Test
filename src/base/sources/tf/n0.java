package tf;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class n0 extends androidx.databinding.p {
    public final AppBarLayout A;
    public final TextView B;
    public final RecyclerView C;
    public final g7 D;
    public final SwipeRefreshLayout E;
    public final Toolbar F;
    public final TextView G;

    protected n0(Object obj, View view, int i10, AppBarLayout appBarLayout, TextView textView, RecyclerView recyclerView, g7 g7Var, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, TextView textView2) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = textView;
        this.C = recyclerView;
        this.D = g7Var;
        this.E = swipeRefreshLayout;
        this.F = toolbar;
        this.G = textView2;
    }
}
