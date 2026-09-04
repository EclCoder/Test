package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class y5 extends androidx.databinding.p {
    public final MaterialCheckBox A;
    public final RelativeLayout B;
    public final ImageView C;
    public final ImageView D;
    public final ConstraintLayout E;
    public final CardView F;
    public final TextView G;

    protected y5(Object obj, View view, int i10, MaterialCheckBox materialCheckBox, RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, CardView cardView, TextView textView) {
        super(obj, view, i10);
        this.A = materialCheckBox;
        this.B = relativeLayout;
        this.C = imageView;
        this.D = imageView2;
        this.E = constraintLayout;
        this.F = cardView;
        this.G = textView;
    }
}
