package tf;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hecorat.screenrecorder.free.R;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f53347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f53348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f53349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f53350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f53351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f53352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ImageView f53353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f53354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AppCompatTextView f53355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ImageView f53356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f53357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LinearLayout f53358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final LinearLayout f53359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ProgressBar f53360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AppCompatTextView f53361o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecyclerView f53362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f53363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TextView f53364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final TextView f53365s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f53366t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final TextView f53367u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final TextView f53368v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final TextView f53369w;

    private i1(FrameLayout frameLayout, RecyclerView recyclerView, ConstraintLayout constraintLayout, FrameLayout frameLayout2, TextView textView, View view, ImageView imageView, TextView textView2, AppCompatTextView appCompatTextView, ImageView imageView2, ConstraintLayout constraintLayout2, LinearLayout linearLayout, LinearLayout linearLayout2, ProgressBar progressBar, AppCompatTextView appCompatTextView2, RecyclerView recyclerView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9) {
        this.f53347a = frameLayout;
        this.f53348b = recyclerView;
        this.f53349c = constraintLayout;
        this.f53350d = frameLayout2;
        this.f53351e = textView;
        this.f53352f = view;
        this.f53353g = imageView;
        this.f53354h = textView2;
        this.f53355i = appCompatTextView;
        this.f53356j = imageView2;
        this.f53357k = constraintLayout2;
        this.f53358l = linearLayout;
        this.f53359m = linearLayout2;
        this.f53360n = progressBar;
        this.f53361o = appCompatTextView2;
        this.f53362p = recyclerView2;
        this.f53363q = textView3;
        this.f53364r = textView4;
        this.f53365s = textView5;
        this.f53366t = textView6;
        this.f53367u = textView7;
        this.f53368v = textView8;
        this.f53369w = textView9;
    }

    public static i1 a(View view) {
        int i10 = R.id.benefit_rv;
        RecyclerView recyclerView = (RecyclerView) u4.a.a(view, R.id.benefit_rv);
        if (recyclerView != null) {
            i10 = R.id.btn_buy;
            ConstraintLayout constraintLayout = (ConstraintLayout) u4.a.a(view, R.id.btn_buy);
            if (constraintLayout != null) {
                i10 = R.id.btn_buy_container;
                FrameLayout frameLayout = (FrameLayout) u4.a.a(view, R.id.btn_buy_container);
                if (frameLayout != null) {
                    i10 = R.id.btn_sub_text;
                    TextView textView = (TextView) u4.a.a(view, R.id.btn_sub_text);
                    if (textView != null) {
                        i10 = R.id.divider;
                        View viewA = u4.a.a(view, R.id.divider);
                        if (viewA != null) {
                            i10 = R.id.double_down_arrow;
                            ImageView imageView = (ImageView) u4.a.a(view, R.id.double_down_arrow);
                            if (imageView != null) {
                                i10 = R.id.feature_label_tv;
                                TextView textView2 = (TextView) u4.a.a(view, R.id.feature_label_tv);
                                if (textView2 != null) {
                                    i10 = R.id.free_tv;
                                    AppCompatTextView appCompatTextView = (AppCompatTextView) u4.a.a(view, R.id.free_tv);
                                    if (appCompatTextView != null) {
                                        i10 = R.id.iv_arrow;
                                        ImageView imageView2 = (ImageView) u4.a.a(view, R.id.iv_arrow);
                                        if (imageView2 != null) {
                                            i10 = R.id.ll_benefit_title;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) u4.a.a(view, R.id.ll_benefit_title);
                                            if (constraintLayout2 != null) {
                                                i10 = R.id.ll_link;
                                                LinearLayout linearLayout = (LinearLayout) u4.a.a(view, R.id.ll_link);
                                                if (linearLayout != null) {
                                                    i10 = R.id.ll_title;
                                                    LinearLayout linearLayout2 = (LinearLayout) u4.a.a(view, R.id.ll_title);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.pb_loading;
                                                        ProgressBar progressBar = (ProgressBar) u4.a.a(view, R.id.pb_loading);
                                                        if (progressBar != null) {
                                                            i10 = R.id.pro_tv;
                                                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) u4.a.a(view, R.id.pro_tv);
                                                            if (appCompatTextView2 != null) {
                                                                i10 = R.id.subs_rv;
                                                                RecyclerView recyclerView2 = (RecyclerView) u4.a.a(view, R.id.subs_rv);
                                                                if (recyclerView2 != null) {
                                                                    i10 = R.id.tvCTA;
                                                                    TextView textView3 = (TextView) u4.a.a(view, R.id.tvCTA);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.tv_link_privacy;
                                                                        TextView textView4 = (TextView) u4.a.a(view, R.id.tv_link_privacy);
                                                                        if (textView4 != null) {
                                                                            i10 = R.id.tv_link_tos;
                                                                            TextView textView5 = (TextView) u4.a.a(view, R.id.tv_link_tos);
                                                                            if (textView5 != null) {
                                                                                i10 = R.id.tv_pro;
                                                                                TextView textView6 = (TextView) u4.a.a(view, R.id.tv_pro);
                                                                                if (textView6 != null) {
                                                                                    i10 = R.id.tv_subtitle;
                                                                                    TextView textView7 = (TextView) u4.a.a(view, R.id.tv_subtitle);
                                                                                    if (textView7 != null) {
                                                                                        i10 = R.id.tv_term;
                                                                                        TextView textView8 = (TextView) u4.a.a(view, R.id.tv_term);
                                                                                        if (textView8 != null) {
                                                                                            i10 = R.id.tv_title;
                                                                                            TextView textView9 = (TextView) u4.a.a(view, R.id.tv_title);
                                                                                            if (textView9 != null) {
                                                                                                return new i1((FrameLayout) view, recyclerView, constraintLayout, frameLayout, textView, viewA, imageView, textView2, appCompatTextView, imageView2, constraintLayout2, linearLayout, linearLayout2, progressBar, appCompatTextView2, recyclerView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
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
