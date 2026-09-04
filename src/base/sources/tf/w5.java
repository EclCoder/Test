package tf;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w5 extends androidx.databinding.p {
    public final ImageView A;
    public final TextView B;
    public final MaterialCardView C;

    protected w5(Object obj, View view, int i10, ImageView imageView, TextView textView, MaterialCardView materialCardView) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = textView;
        this.C = materialCardView;
    }
}
