package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RadioGroup;
import android.widget.ToggleButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.CutFragment;
import com.hecorat.screenrecorder.free.videoeditor.view.VideoRangeSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class u3 extends androidx.databinding.p {
    public final ConstraintLayout A;
    public final ImageButton B;
    public final ImageButton C;
    public final ConstraintLayout D;
    public final ImageButton E;
    public final ImageButton F;
    public final ConstraintLayout G;
    public final VideoRangeSeekBar H;
    public final ToggleButton I;
    public final FrameLayout J;
    public final ConstraintLayout K;
    public final RadioGroup L;
    public final ToggleButton M;
    protected uh.n N;
    protected uh.y O;
    protected CutFragment P;

    protected u3(Object obj, View view, int i10, ConstraintLayout constraintLayout, ImageButton imageButton, ImageButton imageButton2, ConstraintLayout constraintLayout2, ImageButton imageButton3, ImageButton imageButton4, ConstraintLayout constraintLayout3, VideoRangeSeekBar videoRangeSeekBar, ToggleButton toggleButton, FrameLayout frameLayout, ConstraintLayout constraintLayout4, RadioGroup radioGroup, ToggleButton toggleButton2) {
        super(obj, view, i10);
        this.A = constraintLayout;
        this.B = imageButton;
        this.C = imageButton2;
        this.D = constraintLayout2;
        this.E = imageButton3;
        this.F = imageButton4;
        this.G = constraintLayout3;
        this.H = videoRangeSeekBar;
        this.I = toggleButton;
        this.J = frameLayout;
        this.K = constraintLayout4;
        this.L = radioGroup;
        this.M = toggleButton2;
    }

    public static u3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static u3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (u3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_cut, viewGroup, z10, obj);
    }

    public abstract void a0(uh.y yVar);

    public abstract void b0(CutFragment cutFragment);

    public abstract void c0(uh.n nVar);
}
