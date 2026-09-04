package tf;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class m6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f53370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f53371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageView f53372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f53373d;

    private m6(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.f53370a = constraintLayout;
        this.f53371b = textView;
        this.f53372c = imageView;
        this.f53373d = textView2;
    }

    public static m6 a(View view) {
        int i10 = R.id.caption_text;
        TextView textView = (TextView) u4.a.a(view, R.id.caption_text);
        if (textView != null) {
            i10 = R.id.edit_icon;
            ImageView imageView = (ImageView) u4.a.a(view, R.id.edit_icon);
            if (imageView != null) {
                i10 = R.id.timestamp;
                TextView textView2 = (TextView) u4.a.a(view, R.id.timestamp);
                if (textView2 != null) {
                    return new m6((ConstraintLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m6 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.item_edit_caption, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f53370a;
    }
}
