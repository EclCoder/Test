package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a6 extends androidx.databinding.p {
    public final ImageButton A;
    public final ImageView B;
    protected View.OnClickListener C;
    protected View.OnClickListener D;

    protected a6(Object obj, View view, int i10, ImageButton imageButton, ImageView imageView) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = imageView;
    }

    public static a6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static a6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a6) androidx.databinding.p.E(layoutInflater, R.layout.item_attached_screenshot, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);

    public abstract void b0(View.OnClickListener onClickListener);
}
