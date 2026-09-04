package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a5 extends androidx.databinding.p {
    public final ImageView A;
    public final RecyclerView B;
    public final Toolbar C;

    protected a5(Object obj, View view, int i10, ImageView imageView, RecyclerView recyclerView, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = imageView;
        this.B = recyclerView;
        this.C = toolbar;
    }

    public static a5 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static a5 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (a5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_sticker_picker, viewGroup, z10, obj);
    }
}
