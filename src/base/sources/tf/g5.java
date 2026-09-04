package tf;

import android.view.LayoutInflater;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class g5 extends androidx.databinding.p {
    public final RecyclerView A;

    protected g5(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.A = recyclerView;
    }

    public static g5 Y(LayoutInflater layoutInflater) {
        androidx.databinding.g.g();
        return Z(layoutInflater, null);
    }

    public static g5 Z(LayoutInflater layoutInflater, Object obj) {
        return (g5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_text_font, null, false, obj);
    }
}
