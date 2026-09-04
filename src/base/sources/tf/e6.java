package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e6 extends androidx.databinding.p {
    public final ImageView A;
    protected View.OnClickListener B;

    protected e6(Object obj, View view, int i10, ImageView imageView) {
        super(obj, view, i10);
        this.A = imageView;
    }

    public static e6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static e6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e6) androidx.databinding.p.E(layoutInflater, R.layout.item_background, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);
}
