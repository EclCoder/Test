package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import com.hecorat.screenrecorder.free.R;
import com.hecorat.screenrecorder.free.models.FBLiveDestination;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class n6 extends androidx.databinding.p {
    public final CheckedTextView A;
    protected FBLiveDestination B;
    protected gh.c C;

    protected n6(Object obj, View view, int i10, CheckedTextView checkedTextView) {
        super(obj, view, i10);
        this.A = checkedTextView;
    }

    public static n6 Y(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        androidx.databinding.g.g();
        return Z(layoutInflater, viewGroup, z10, null);
    }

    public static n6 Z(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10, Object obj) {
        return (n6) androidx.databinding.p.E(layoutInflater, R.layout.item_fb_destination, viewGroup, z10, obj);
    }

    public abstract void a0(gh.c cVar);

    public abstract void b0(FBLiveDestination fBLiveDestination);
}
