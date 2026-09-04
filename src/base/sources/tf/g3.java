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
public abstract class g3 extends androidx.databinding.p {
    public final RecyclerView A;
    public final ImageButton B;
    public final ImageButton C;
    public final TextView D;
    public final PlayerControlView E;
    public final ConstraintLayout F;
    protected uh.y G;

    protected g3(Object obj, View view, int i10, RecyclerView recyclerView, ImageButton imageButton, ImageButton imageButton2, TextView textView, PlayerControlView playerControlView, ConstraintLayout constraintLayout) {
        super(obj, view, i10);
        this.A = recyclerView;
        this.B = imageButton;
        this.C = imageButton2;
        this.D = textView;
        this.E = playerControlView;
        this.F = constraintLayout;
    }

    public static g3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static g3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (g3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_background, viewGroup, z10, obj);
    }

    public abstract void a0(uh.y yVar);
}
