package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v1 extends androidx.databinding.p {
    public final ImageView A;
    public final RecyclerView B;
    public final View C;
    public final TextView D;
    protected gh.o E;

    protected v1(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, View view2, TextView textView) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = recyclerView;
        this.C = view2;
        this.D = textView;
    }

    public abstract void Y(gh.o oVar);
}
