package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class c4 extends androidx.databinding.p {
    public final RecyclerView A;
    public final TextView B;
    protected uh.y C;

    protected c4(Object obj, View view, int i10, RecyclerView recyclerView, TextView textView) {
        super(obj, view, i10);
        this.A = recyclerView;
        this.B = textView;
    }

    public static c4 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static c4 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (c4) androidx.databinding.p.E(layoutInflater, R.layout.fragment_gif_output_setting, viewGroup, z10, obj);
    }

    public abstract void a0(uh.y yVar);
}
