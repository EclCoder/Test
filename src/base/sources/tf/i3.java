package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i3 extends androidx.databinding.p {
    public final RelativeLayout A;
    public final ImageView B;
    public final TextView C;
    public final c1 D;
    public final TextView E;
    public final ImageView F;
    public final CircularProgressIndicator G;
    public final RelativeLayout H;
    public final TextView I;
    public final TextView J;
    public final Toolbar K;

    protected i3(Object obj, View view, int i10, RelativeLayout relativeLayout, ImageView imageView, TextView textView, c1 c1Var, TextView textView2, ImageView imageView2, CircularProgressIndicator circularProgressIndicator, RelativeLayout relativeLayout2, TextView textView3, TextView textView4, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = relativeLayout;
        this.B = imageView;
        this.C = textView;
        this.D = c1Var;
        this.E = textView2;
        this.F = imageView2;
        this.G = circularProgressIndicator;
        this.H = relativeLayout2;
        this.I = textView3;
        this.J = textView4;
        this.K = toolbar;
    }

    public static i3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static i3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_caption_processing, viewGroup, z10, obj);
    }
}
