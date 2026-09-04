package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c0 extends androidx.databinding.p {
    public final TextView A;
    public final TextView B;
    public final FrameLayout C;
    public final Button D;
    public final TextView E;

    protected c0(Object obj, View view, int i10, TextView textView, TextView textView2, FrameLayout frameLayout, Button button, TextView textView3) {
        super(obj, view, i10);
        this.A = textView;
        this.B = textView2;
        this.C = frameLayout;
        this.D = button;
        this.E = textView3;
    }

    public static c0 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static c0 Z(LayoutInflater layoutInflater, Object obj) {
        return (c0) androidx.databinding.p.E(layoutInflater, R.layout.activity_recording_error, null, false, obj);
    }
}
