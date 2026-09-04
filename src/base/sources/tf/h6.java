package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f53344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f53345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f53346c;

    private h6(FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        this.f53344a = frameLayout;
        this.f53345b = frameLayout2;
        this.f53346c = textView;
    }

    public static h6 a(View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        TextView textView = (TextView) u4.a.a(view, R.id.preview_text);
        if (textView != null) {
            return new h6(frameLayout, frameLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.preview_text)));
    }

    public static h6 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_caption_style, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public FrameLayout b() {
        return this.f53344a;
    }
}
