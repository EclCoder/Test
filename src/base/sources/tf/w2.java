package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w2 extends androidx.databinding.p {
    public final ImageButton A;
    public final ImageView B;
    public final ImageView C;
    public final TextView D;
    public final TextView E;
    public final Button F;

    protected w2(Object obj, View view, int i10, ImageButton imageButton, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, Button button) {
        super(obj, view, i10);
        this.A = imageButton;
        this.B = imageView;
        this.C = imageView2;
        this.D = textView;
        this.E = textView2;
        this.F = button;
    }

    public static w2 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static w2 Z(LayoutInflater layoutInflater, Object obj) {
        return (w2) androidx.databinding.p.E(layoutInflater, R.layout.dialog_xiaomi_background_permission, null, false, obj);
    }
}
