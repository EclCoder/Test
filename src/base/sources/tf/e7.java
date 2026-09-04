package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class e7 extends androidx.databinding.p {
    public final LinearLayout A;
    public final ImageView B;
    public final TextView C;

    protected e7(Object obj, View view, int i10, LinearLayout linearLayout, ImageView imageView, TextView textView) {
        super(obj, view, i10);
        this.A = linearLayout;
        this.B = imageView;
        this.C = textView;
    }

    public static e7 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static e7 Z(LayoutInflater layoutInflater, Object obj) {
        return (e7) androidx.databinding.p.E(layoutInflater, R.layout.live_comments, null, false, obj);
    }
}
