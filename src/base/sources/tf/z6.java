package tf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f53404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f53405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinearLayout f53406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f53407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinearLayout f53408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinearLayout f53409f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f53410g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinearLayout f53411h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinearLayout f53412i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final FrameLayout f53413j;

    private z6(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, FrameLayout frameLayout) {
        this.f53404a = linearLayout;
        this.f53405b = linearLayout2;
        this.f53406c = linearLayout3;
        this.f53407d = linearLayout4;
        this.f53408e = linearLayout5;
        this.f53409f = linearLayout6;
        this.f53410g = linearLayout7;
        this.f53411h = linearLayout8;
        this.f53412i = linearLayout9;
        this.f53413j = frameLayout;
    }

    public static z6 a(View view) {
        int i10 = R.id.community_ll;
        LinearLayout linearLayout = (LinearLayout) u4.a.a(view, R.id.community_ll);
        if (linearLayout != null) {
            i10 = R.id.layout_about;
            LinearLayout linearLayout2 = (LinearLayout) u4.a.a(view, R.id.layout_about);
            if (linearLayout2 != null) {
                i10 = R.id.layout_feedback;
                LinearLayout linearLayout3 = (LinearLayout) u4.a.a(view, R.id.layout_feedback);
                if (linearLayout3 != null) {
                    i10 = R.id.layout_language;
                    LinearLayout linearLayout4 = (LinearLayout) u4.a.a(view, R.id.layout_language);
                    if (linearLayout4 != null) {
                        i10 = R.id.layout_privacy_options;
                        LinearLayout linearLayout5 = (LinearLayout) u4.a.a(view, R.id.layout_privacy_options);
                        if (linearLayout5 != null) {
                            i10 = R.id.layout_question;
                            LinearLayout linearLayout6 = (LinearLayout) u4.a.a(view, R.id.layout_question);
                            if (linearLayout6 != null) {
                                i10 = R.id.layout_share;
                                LinearLayout linearLayout7 = (LinearLayout) u4.a.a(view, R.id.layout_share);
                                if (linearLayout7 != null) {
                                    i10 = R.id.layout_trash;
                                    LinearLayout linearLayout8 = (LinearLayout) u4.a.a(view, R.id.layout_trash);
                                    if (linearLayout8 != null) {
                                        i10 = R.id.layout_upgrade;
                                        FrameLayout frameLayout = (FrameLayout) u4.a.a(view, R.id.layout_upgrade);
                                        if (frameLayout != null) {
                                            return new z6((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, frameLayout);
                                        }
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
}
