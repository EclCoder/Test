package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e3 extends androidx.databinding.p {
    public final FrameLayout A;
    public final LinearLayout B;
    public final LinearLayout C;
    public final ImageButton D;
    public final ImageButton E;
    public final ImageButton F;
    public final Button G;
    public final Button H;
    public final PlayerControlView I;
    public final ImageButton J;
    public final RecyclerView K;
    public final TextView L;

    protected e3(Object obj, View view, int i10, FrameLayout frameLayout, LinearLayout linearLayout, LinearLayout linearLayout2, ImageButton imageButton, ImageButton imageButton2, ImageButton imageButton3, Button button, Button button2, PlayerControlView playerControlView, ImageButton imageButton4, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.A = frameLayout;
        this.B = linearLayout;
        this.C = linearLayout2;
        this.D = imageButton;
        this.E = imageButton2;
        this.F = imageButton3;
        this.G = button;
        this.H = button2;
        this.I = playerControlView;
        this.J = imageButton4;
        this.K = recyclerView;
        this.L = textView;
    }

    public static e3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static e3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (e3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_auto_caption, viewGroup, z10, obj);
    }
}
