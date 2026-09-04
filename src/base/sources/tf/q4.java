package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q4 extends androidx.databinding.p {
    public final ImageView A;
    public final FrameLayout B;
    public final FragmentContainerView C;
    public final PlayerView D;
    public final ConstraintLayout E;

    protected q4(Object obj, View view, int i10, ImageView imageView, FrameLayout frameLayout, FragmentContainerView fragmentContainerView, PlayerView playerView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = frameLayout;
        this.C = fragmentContainerView;
        this.D = playerView;
        this.E = constraintLayout;
    }

    public static q4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static q4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_player, viewGroup, z10, obj);
    }
}
