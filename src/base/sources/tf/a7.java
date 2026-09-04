package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a7 extends androidx.databinding.p {
    public final ConstraintLayout A;
    public final ImageButton B;
    public final ImageView C;
    protected View.OnClickListener D;
    protected View.OnClickListener E;
    protected ng.d F;

    protected a7(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageButton imageButton, ImageView imageView) {
        super(obj, view, i10);
        this.A = constraintLayout;
        this.B = imageButton;
        this.C = imageView;
    }

    public static a7 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static a7 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a7) androidx.databinding.p.E(layoutInflater, R.layout.list_item_editing_video, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);

    public abstract void b0(ng.d dVar);

    public abstract void c0(View.OnClickListener onClickListener);
}
