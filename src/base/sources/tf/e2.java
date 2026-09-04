package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e2 extends androidx.databinding.p {
    public final ImageView A;
    public final Button B;
    public final Button C;
    public final TextView D;
    public final TextView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final LinearLayout L;

    protected e2(Object obj, View view, int i10, ImageView imageView, Button button, Button button2, TextView textView, TextView textView2, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = button;
        this.C = button2;
        this.D = textView;
        this.E = textView2;
        this.F = imageView2;
        this.G = imageView3;
        this.H = imageView4;
        this.I = imageView5;
        this.J = imageView6;
        this.K = imageView7;
        this.L = linearLayout;
    }

    public static e2 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static e2 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e2) androidx.databinding.p.E(layoutInflater, R.layout.dialog_internal_app_rating, viewGroup, z10, obj);
    }
}
