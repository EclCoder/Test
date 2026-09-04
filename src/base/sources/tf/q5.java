package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class q5 extends androidx.databinding.p {
    public final Button A;
    public final ImageView B;
    public final Spinner C;
    public final TextView D;
    public final Toolbar E;
    public final RecyclerView F;

    protected q5(Object obj, View view, int i10, Button button, ImageView imageView, Spinner spinner, TextView textView, Toolbar toolbar, RecyclerView recyclerView) {
        super(obj, view, i10);
        this.A = button;
        this.B = imageView;
        this.C = spinner;
        this.D = textView;
        this.E = toolbar;
        this.F = recyclerView;
    }

    public static q5 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static q5 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (q5) androidx.databinding.p.E(layoutInflater, R.layout.fragment_video_picker, viewGroup, z10, obj);
    }
}
