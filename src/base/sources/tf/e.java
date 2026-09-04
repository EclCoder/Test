package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e extends androidx.databinding.p {
    public final ImageView A;
    public final Button B;
    public final Button C;
    public final TextView D;
    public final TextView E;

    protected e(Object obj, View view, int i10, ImageView imageView, Button button, Button button2, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = button;
        this.C = button2;
        this.D = textView;
        this.E = textView2;
    }

    public static e Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static e Z(LayoutInflater layoutInflater, Object obj) {
        return (e) androidx.databinding.p.E(layoutInflater, R.layout.activity_ask_quality, null, false, obj);
    }
}
