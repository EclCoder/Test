package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;
import com.xw.repo.BubbleSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class o5 extends androidx.databinding.p {
    public final BubbleSeekBar A;
    public final TextView B;
    public final BubbleSeekBar C;
    public final TextView D;
    public final TextView E;
    protected uh.y F;

    protected o5(Object obj, View view, int i10, BubbleSeekBar bubbleSeekBar, TextView textView, BubbleSeekBar bubbleSeekBar2, TextView textView2, TextView textView3) {
        super(obj, view, i10);
        this.A = bubbleSeekBar;
        this.B = textView;
        this.C = bubbleSeekBar2;
        this.D = textView2;
        this.E = textView3;
    }

    public static o5 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static o5 Z(LayoutInflater layoutInflater, Object obj) {
        return (o5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_video_output_setting, null, false, obj);
    }

    public abstract void a0(uh.y yVar);
}
