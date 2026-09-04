package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class b2 extends androidx.databinding.p {
    public final ImageView A;
    public final TextView B;
    public final TextView C;

    protected b2(Object obj, View view, int i10, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = textView;
        this.C = textView2;
    }

    public static b2 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static b2 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (b2) androidx.databinding.p.E(layoutInflater, R.layout.dialog_information_file, viewGroup, z10, obj);
    }
}
