package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class j1 extends androidx.databinding.p {
    public final ImageView A;
    public final ImageView B;
    public final MaterialCheckBox C;
    public final RelativeLayout D;
    public final CardView E;
    public final ImageView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;

    protected j1(Object obj, View view, int i10, ImageView imageView, ImageView imageView2, MaterialCheckBox materialCheckBox, RelativeLayout relativeLayout, CardView cardView, ImageView imageView3, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = imageView2;
        this.C = materialCheckBox;
        this.D = relativeLayout;
        this.E = cardView;
        this.F = imageView3;
        this.G = textView;
        this.H = textView2;
        this.I = textView3;
    }
}
