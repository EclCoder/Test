package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k6 extends androidx.databinding.p {
    public final ConstraintLayout A;
    public final FrameLayout B;
    public final ImageView C;
    public final TextView D;
    protected View.OnClickListener E;

    protected k6(Object obj, View view, int i10, ConstraintLayout constraintLayout, FrameLayout frameLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.A = constraintLayout;
        this.B = frameLayout;
        this.C = imageView;
        this.D = textView;
    }

    public static k6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static k6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k6) androidx.databinding.p.E(layoutInflater, R.layout.item_crop_ratio, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);
}
