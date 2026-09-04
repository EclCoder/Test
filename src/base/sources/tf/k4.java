package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k4 extends androidx.databinding.p {
    public final View A;
    public final TextView B;
    public final ImageView C;
    public final View D;
    public final AppBarLayout E;
    public final Guideline F;
    public final Guideline G;
    public final ConstraintLayout H;
    public final ImageView I;
    public final ConstraintLayout J;
    public final TextView K;
    public final ImageView L;
    public final ConstraintLayout M;
    public final ConstraintLayout N;
    public final Toolbar O;
    protected fh.i P;

    protected k4(Object obj, View view, int i10, View view2, TextView textView, ImageView imageView, View view3, AppBarLayout appBarLayout, Guideline guideline, Guideline guideline2, ConstraintLayout constraintLayout, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView2, ImageView imageView3, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = view2;
        this.B = textView;
        this.C = imageView;
        this.D = view3;
        this.E = appBarLayout;
        this.F = guideline;
        this.G = guideline2;
        this.H = constraintLayout;
        this.I = imageView2;
        this.J = constraintLayout2;
        this.K = textView2;
        this.L = imageView3;
        this.M = constraintLayout3;
        this.N = constraintLayout4;
        this.O = toolbar;
    }

    public static k4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static k4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_live_settings, viewGroup, z10, obj);
    }

    public abstract void a0(fh.i iVar);
}
