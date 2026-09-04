package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class z1 extends androidx.databinding.p {
    public final ImageButton A;
    public final ImageView B;
    public final RelativeLayout C;
    public final ProgressBar D;
    public final TextView E;
    public final ImageView F;
    protected fh.v G;

    protected z1(Object obj, View view, int i10, ImageButton imageButton, ImageView imageView, RelativeLayout relativeLayout, ProgressBar progressBar, TextView textView, ImageView imageView2) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = imageView;
        this.C = relativeLayout;
        this.D = progressBar;
        this.E = textView;
        this.F = imageView2;
    }

    public static z1 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static z1 Z(LayoutInflater layoutInflater, Object obj) {
        return (z1) androidx.databinding.p.E(layoutInflater, R.layout.dialog_float_live_login, null, false, obj);
    }

    public abstract void a0(fh.v vVar);
}
