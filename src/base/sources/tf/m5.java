package tf;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class m5 extends androidx.databinding.p {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final ProgressBar D;
    public final g7 E;
    public final RelativeLayout F;
    public final ProgressBar G;
    public final SwipeRefreshLayout H;
    public final RecyclerView I;

    protected m5(Object obj, View view, int i10, TextView textView, TextView textView2, TextView textView3, ProgressBar progressBar, g7 g7Var, RelativeLayout relativeLayout, ProgressBar progressBar2, SwipeRefreshLayout swipeRefreshLayout, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = progressBar;
        this.E = g7Var;
        this.F = relativeLayout;
        this.G = progressBar2;
        this.H = swipeRefreshLayout;
        this.I = recyclerView;
    }
}
