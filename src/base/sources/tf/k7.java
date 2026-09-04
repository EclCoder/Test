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
public abstract class k7 extends androidx.databinding.p {
    public final MaterialCheckBox A;
    public final RelativeLayout B;
    public final ImageView C;
    public final ConstraintLayout D;
    public final CardView E;
    public final TextView F;
    public final TextView G;

    protected k7(Object obj, View view, int i10, MaterialCheckBox materialCheckBox, RelativeLayout relativeLayout, ImageView imageView, ConstraintLayout constraintLayout, CardView cardView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.A = materialCheckBox;
        this.B = relativeLayout;
        this.C = imageView;
        this.D = constraintLayout;
        this.E = cardView;
        this.F = textView;
        this.G = textView2;
    }
}
