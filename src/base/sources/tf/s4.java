package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.PreviewFragment;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class s4 extends androidx.databinding.p {
    public final HorizontalScrollView A;
    public final Button B;
    public final Button C;
    public final ConstraintLayout D;
    public final Button E;
    public final PlayerControlView F;
    public final RecyclerView G;
    protected uh.y H;
    protected PreviewFragment I;

    protected s4(Object obj, View view, int i10, HorizontalScrollView horizontalScrollView, Button button, Button button2, ConstraintLayout constraintLayout, Button button3, PlayerControlView playerControlView, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.A = horizontalScrollView;
        this.B = button;
        this.C = button2;
        this.D = constraintLayout;
        this.E = button3;
        this.F = playerControlView;
        this.G = recyclerView;
    }

    public static s4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static s4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (s4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_preview, viewGroup, z10, obj);
    }

    public abstract void a0(PreviewFragment previewFragment);

    public abstract void b0(uh.y yVar);
}
