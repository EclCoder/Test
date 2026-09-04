package tf;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class p0 extends androidx.databinding.p {
    public final ImageView A;
    public final ImageButton B;
    public final Guideline C;
    public final TextView D;

    protected p0(Object obj, View view, int i10, ImageView imageView, ImageButton imageButton, Guideline guideline, TextView textView) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = imageButton;
        this.C = guideline;
        this.D = textView;
    }
}
