package tf;

import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class k extends androidx.databinding.p {
    public final AppBarLayout A;
    public final ExpandableListView B;
    public final LinearLayout C;
    public final Toolbar D;

    protected k(Object obj, View view, int i10, AppBarLayout appBarLayout, ExpandableListView expandableListView, LinearLayout linearLayout, Toolbar toolbar) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = expandableListView;
        this.C = linearLayout;
        this.D = toolbar;
    }
}
