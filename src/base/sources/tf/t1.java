package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.material.slider.Slider;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.videoeditor.view.AudioRangeSeekBar;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class t1 extends androidx.databinding.p {
    public final ImageView A;
    public final Button B;
    public final TextView C;
    public final Button D;
    public final TextView E;
    public final View F;
    public final SwitchCompat G;
    public final TextView H;
    public final Slider I;
    public final TextView J;
    public final PlayerControlView K;
    public final ConstraintLayout L;
    public final AudioRangeSeekBar M;
    public final TextView N;
    public final Guideline O;

    protected t1(Object obj, View view, int i10, ImageView imageView, Button button, TextView textView, Button button2, TextView textView2, View view2, SwitchCompat switchCompat, TextView textView3, Slider slider, TextView textView4, PlayerControlView playerControlView, ConstraintLayout constraintLayout, AudioRangeSeekBar audioRangeSeekBar, TextView textView5, Guideline guideline) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = button;
        this.C = textView;
        this.D = button2;
        this.E = textView2;
        this.F = view2;
        this.G = switchCompat;
        this.H = textView3;
        this.I = slider;
        this.J = textView4;
        this.K = playerControlView;
        this.L = constraintLayout;
        this.M = audioRangeSeekBar;
        this.N = textView5;
        this.O = guideline;
    }

    public static t1 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static t1 Z(LayoutInflater layoutInflater, Object obj) {
        return (t1) androidx.databinding.p.E(layoutInflater, R.layout.dialog_edit_audio, null, false, obj);
    }
}
