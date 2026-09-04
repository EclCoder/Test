package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.card.MaterialCardView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t6 extends androidx.databinding.p {
    public final MaterialCardView A;
    public final TextView B;
    public final View C;
    public final TextView D;
    protected View.OnClickListener E;

    protected t6(Object obj, View view, int i10, MaterialCardView materialCardView, TextView textView, View view2, TextView textView2) {
        super(obj, view, i10);
        this.A = materialCardView;
        this.B = textView;
        this.C = view2;
        this.D = textView2;
    }

    public static t6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static t6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (t6) androidx.databinding.p.E(layoutInflater, R.layout.item_gif_resolution, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);
}
