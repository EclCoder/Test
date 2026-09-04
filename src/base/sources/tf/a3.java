package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoElementSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a3 extends androidx.databinding.p {
    public final ImageButton A;
    public final FrameLayout B;
    public final ImageButton C;
    public final VideoElementSeekBar D;
    public final PlayerControlView E;
    public final RecyclerView F;
    public final ConstraintLayout G;
    public final HorizontalScrollView H;
    public final View I;
    protected uh.y J;

    protected a3(Object obj, View view, int i10, ImageButton imageButton, FrameLayout frameLayout, ImageButton imageButton2, VideoElementSeekBar videoElementSeekBar, PlayerControlView playerControlView, RecyclerView recyclerView, ConstraintLayout constraintLayout, HorizontalScrollView horizontalScrollView, View view2) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = frameLayout;
        this.C = imageButton2;
        this.D = videoElementSeekBar;
        this.E = playerControlView;
        this.F = recyclerView;
        this.G = constraintLayout;
        this.H = horizontalScrollView;
        this.I = view2;
    }

    public static a3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static a3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_add_element, viewGroup, z10, obj);
    }

    public abstract void a0(uh.y yVar);
}
