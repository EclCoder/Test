package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.card.MaterialCardView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class i6 extends androidx.databinding.p {
    public final MaterialCardView A;
    public final View B;
    protected View.OnClickListener C;

    protected i6(Object obj, View view, int i10, MaterialCardView materialCardView, View view2) {
        super(obj, view, i10);
        this.A = materialCardView;
        this.B = view2;
    }

    public static i6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static i6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (i6) androidx.databinding.p.E(layoutInflater, R.layout.item_color, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);
}
