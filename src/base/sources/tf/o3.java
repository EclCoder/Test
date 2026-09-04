package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hecorat.screenrecorder.free.R;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o3 extends androidx.databinding.p {
    public final ImageView A;
    public final ConstraintLayout B;
    public final PlayerControlView C;
    public final PlayerView D;
    public final BubbleSeekBar E;
    public final TextView F;
    public final BubbleSeekBar G;
    public final TextView H;
    public final Toolbar I;
    public final TextView J;
    protected uh.h K;

    protected o3(Object obj, View view, int i10, ImageView imageView, ConstraintLayout constraintLayout, PlayerControlView playerControlView, PlayerView playerView, BubbleSeekBar bubbleSeekBar, TextView textView, BubbleSeekBar bubbleSeekBar2, TextView textView2, Toolbar toolbar, TextView textView3) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = constraintLayout;
        this.C = playerControlView;
        this.D = playerView;
        this.E = bubbleSeekBar;
        this.F = textView;
        this.G = bubbleSeekBar2;
        this.H = textView2;
        this.I = toolbar;
        this.J = textView3;
    }

    public static o3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static o3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (o3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_compress, viewGroup, z10, obj);
    }

    public abstract void a0(uh.h hVar);
}
