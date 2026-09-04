package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w extends androidx.databinding.p {
    public final AppBarLayout A;
    public final ListView B;
    public final ProgressBar C;
    public final TextView D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;

    protected w(Object obj, View view, int i10, AppBarLayout appBarLayout, ListView listView, ProgressBar progressBar, TextView textView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = listView;
        this.C = progressBar;
        this.D = textView;
        this.E = imageView;
        this.F = imageView2;
        this.G = imageView3;
        this.H = imageView4;
        this.I = imageView5;
    }
}
