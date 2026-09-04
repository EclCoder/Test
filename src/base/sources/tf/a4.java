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
public abstract class a4 extends androidx.databinding.p {
    public final RelativeLayout A;
    public final ImageView B;
    public final TextView C;
    public final TextView D;
    public final c1 E;
    public final CircularProgressIndicator F;
    public final RelativeLayout G;
    public final Toolbar H;
    public final TextView I;
    protected uh.g0 J;

    protected a4(Object obj, View view, int i10, RelativeLayout relativeLayout, ImageView imageView, TextView textView, TextView textView2, c1 c1Var, CircularProgressIndicator circularProgressIndicator, RelativeLayout relativeLayout2, Toolbar toolbar, TextView textView3) {
        super(obj, view, i10);
        this.A = relativeLayout;
        this.B = imageView;
        this.C = textView;
        this.D = textView2;
        this.E = c1Var;
        this.F = circularProgressIndicator;
        this.G = relativeLayout2;
        this.H = toolbar;
        this.I = textView3;
    }

    public static a4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static a4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_export, viewGroup, z10, obj);
    }

    public abstract void a0(uh.g0 g0Var);
}
