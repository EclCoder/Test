package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j0 extends androidx.databinding.p {
    public final AppBarLayout A;
    public final ImageView B;
    public final LinearLayout C;
    public final ImageView D;
    public final RelativeLayout E;
    public final Toolbar F;

    protected j0(Object obj, View view, int i10, AppBarLayout appBarLayout, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, RelativeLayout relativeLayout, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = imageView;
        this.C = linearLayout;
        this.D = imageView2;
        this.E = relativeLayout;
        this.F = toolbar;
    }
}
