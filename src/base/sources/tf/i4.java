package tf;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i4 extends androidx.databinding.p {
    public final ImageView A;
    public final TextView B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final CardView F;
    public final TextView G;
    public final EditText H;
    public final LinearLayout I;
    protected gh.o J;

    protected i4(Object obj, View view, int i10, ImageView imageView, TextView textView, ImageView imageView2, ImageView imageView3, ImageView imageView4, CardView cardView, TextView textView2, EditText editText, LinearLayout linearLayout) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = textView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = imageView4;
        this.F = cardView;
        this.G = textView2;
        this.H = editText;
        this.I = linearLayout;
    }

    public abstract void Y(gh.o oVar);
}
