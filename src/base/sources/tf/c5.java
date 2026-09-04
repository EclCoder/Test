package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c5 extends androidx.databinding.p {
    public final ImageButton A;
    public final ImageButton B;
    public final ImageButton C;
    public final TextView D;
    public final Slider E;
    protected uh.q0 F;

    protected c5(Object obj, View view, int i10, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, TextView textView, Slider slider) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = imageButton2;
        this.C = imageButton3;
        this.D = textView;
        this.E = slider;
    }

    public static c5 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static c5 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_text_align, viewGroup, z10, obj);
    }

    public abstract void a0(uh.q0 q0Var);
}
