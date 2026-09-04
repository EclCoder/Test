package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class g6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f53335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircularProgressIndicator f53336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f53337c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f53338d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ImageView f53339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f53340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f53341g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f53342h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FrameLayout f53343i;

    private g6(ConstraintLayout constraintLayout, CircularProgressIndicator circularProgressIndicator, ImageView imageView, ProgressBar progressBar, ImageView imageView2, View view, TextView textView, TextView textView2, FrameLayout frameLayout) {
        this.f53335a = constraintLayout;
        this.f53336b = circularProgressIndicator;
        this.f53337c = imageView;
        this.f53338d = progressBar;
        this.f53339e = imageView2;
        this.f53340f = view;
        this.f53341g = textView;
        this.f53342h = textView2;
        this.f53343i = frameLayout;
    }

    public static g6 a(View view) {
        int i10 = R.id.download_progress_ring;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) u4.a.a(view, R.id.download_progress_ring);
        if (circularProgressIndicator != null) {
            i10 = R.id.idle_icon;
            ImageView imageView = (ImageView) u4.a.a(view, R.id.idle_icon);
            if (imageView != null) {
                i10 = R.id.indeterminate_spinner;
                ProgressBar progressBar = (ProgressBar) u4.a.a(view, R.id.indeterminate_spinner);
                if (progressBar != null) {
                    i10 = R.id.installed_badge;
                    ImageView imageView2 = (ImageView) u4.a.a(view, R.id.installed_badge);
                    if (imageView2 != null) {
                        i10 = R.id.installed_stripe;
                        View viewA = u4.a.a(view, R.id.installed_stripe);
                        if (viewA != null) {
                            i10 = R.id.language_name;
                            TextView textView = (TextView) u4.a.a(view, R.id.language_name);
                            if (textView != null) {
                                i10 = R.id.language_size;
                                TextView textView2 = (TextView) u4.a.a(view, R.id.language_size);
                                if (textView2 != null) {
                                    i10 = R.id.trailing_area;
                                    FrameLayout frameLayout = (FrameLayout) u4.a.a(view, R.id.trailing_area);
                                    if (frameLayout != null) {
                                        return new g6((ConstraintLayout) view, circularProgressIndicator, imageView, progressBar, imageView2, viewA, textView, textView2, frameLayout);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static g6 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_caption_language, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f53335a;
    }
}
