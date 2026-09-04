package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class w3 extends androidx.databinding.p {
    public final RecyclerView A;
    public final ImageButton B;
    public final TextView C;
    public final TextView D;

    protected w3(Object obj, View view, int i10, RecyclerView recyclerView, ImageButton imageButton, TextView textView, TextView textView2) {
        super(obj, view, i10);
        this.A = recyclerView;
        this.B = imageButton;
        this.C = textView;
        this.D = textView2;
    }

    public static w3 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static w3 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (w3) androidx.databinding.p.E(layoutInflater, R.layout.fragment_edit_captions, viewGroup, z10, obj);
    }
}
