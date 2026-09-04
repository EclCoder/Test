package tf;

import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f53374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Toolbar f53375b;

    private o7(LinearLayout linearLayout, Toolbar toolbar) {
        this.f53374a = linearLayout;
        this.f53375b = toolbar;
    }

    public static o7 a(View view) {
        Toolbar toolbar = (Toolbar) u4.a.a(view, R.id.tool_bar);
        if (toolbar != null) {
            return new o7((LinearLayout) view, toolbar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tool_bar)));
    }
}
