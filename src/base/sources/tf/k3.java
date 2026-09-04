package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k3 extends androidx.databinding.p {
    public final ImageButton A;
    public final ImageButton B;
    public final TextView C;
    public final PlayerControlView D;
    public final RecyclerView E;
    public final ConstraintLayout F;
    protected uh.y G;

    protected k3(Object obj, View view, int i10, ImageButton imageButton, ImageButton imageButton2, TextView textView, PlayerControlView playerControlView, RecyclerView recyclerView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = imageButton2;
        this.C = textView;
        this.D = playerControlView;
        this.E = recyclerView;
        this.F = constraintLayout;
    }

    public static k3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static k3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_change_ratio, viewGroup, z10, obj);
    }

    public abstract void a0(uh.y yVar);
}
