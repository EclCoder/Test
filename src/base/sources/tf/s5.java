package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class s5 extends androidx.databinding.p {
    protected View.OnClickListener A;

    protected s5(Object obj, View view, int i10) {
        super(obj, view, i10);
    }

    public static s5 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static s5 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s5) androidx.databinding.p.E(layoutInflater, R.layout.header_item_attach_image, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);
}
