package tf;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.hecorat.screenrecorder.free.widget.CustomScrollView;
import com.wang.avi.AVLoadingIndicatorView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class s extends androidx.databinding.p {
    public final AppBarLayout A;
    public final AVLoadingIndicatorView B;
    public final LinearLayout C;
    public final CustomScrollView D;
    public final Toolbar E;
    public final LinearLayout F;

    protected s(Object obj, View view, int i10, AppBarLayout appBarLayout, AVLoadingIndicatorView aVLoadingIndicatorView, LinearLayout linearLayout, CustomScrollView customScrollView, Toolbar toolbar, LinearLayout linearLayout2) {
        super(obj, view, i10);
        this.A = appBarLayout;
        this.B = aVLoadingIndicatorView;
        this.C = linearLayout;
        this.D = customScrollView;
        this.E = toolbar;
        this.F = linearLayout2;
    }
}
