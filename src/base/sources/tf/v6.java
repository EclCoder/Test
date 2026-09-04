package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class v6 extends androidx.databinding.p {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    protected View.OnClickListener D;

    protected v6(Object obj, View view, int i10, TextView textView, ImageView imageView, TextView textView2) {
        super(obj, view, i10);
        this.A = textView;
        this.B = imageView;
        this.C = textView2;
    }

    public static v6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static v6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (v6) androidx.databinding.p.E(layoutInflater, R.layout.item_image_picker, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);
}
