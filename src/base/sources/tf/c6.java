package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c6 extends androidx.databinding.p {
    public final ImageView A;
    public final TextView B;
    public final FrameLayout C;
    public final TextView D;
    public final FrameLayout E;
    public final ImageView F;
    public final ImageView G;
    protected View.OnClickListener H;
    protected View.OnClickListener I;
    protected View.OnClickListener J;

    protected c6(Object obj, View view, int i10, ImageView imageView, TextView textView, FrameLayout frameLayout, TextView textView2, FrameLayout frameLayout2, ImageView imageView2, ImageView imageView3) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = textView;
        this.C = frameLayout;
        this.D = textView2;
        this.E = frameLayout2;
        this.F = imageView2;
        this.G = imageView3;
    }

    public static c6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static c6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c6) androidx.databinding.p.E(layoutInflater, R.layout.item_audio_picker, viewGroup, z10, obj);
    }

    public abstract void a0(View.OnClickListener onClickListener);

    public abstract void b0(View.OnClickListener onClickListener);

    public abstract void c0(View.OnClickListener onClickListener);
}
