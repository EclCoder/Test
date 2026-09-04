package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k5 extends androidx.databinding.p {
    public final RecyclerView A;

    protected k5(Object obj, View view, int i10, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.A = recyclerView;
    }

    public static k5 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static k5 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (k5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_utility, viewGroup, z10, obj);
    }
}
