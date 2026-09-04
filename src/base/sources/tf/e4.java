package tf;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e4 extends androidx.databinding.p {
    public final TextView A;
    public final RecyclerView B;
    public final g7 C;
    public final SwipeRefreshLayout D;

    protected e4(Object obj, View view, int i10, TextView textView, RecyclerView recyclerView, g7 g7Var, SwipeRefreshLayout swipeRefreshLayout) {
        super(obj, view, i10);
        this.A = textView;
        this.B = recyclerView;
        this.C = g7Var;
        this.D = swipeRefreshLayout;
    }
}
