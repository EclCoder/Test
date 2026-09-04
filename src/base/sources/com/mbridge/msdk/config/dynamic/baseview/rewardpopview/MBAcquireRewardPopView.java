package com.mbridge.msdk.config.dynamic.baseview.rewardpopview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class MBAcquireRewardPopView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f29338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f29339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f29340d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f29341e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29342f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f29343g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f29344h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View.OnClickListener f29345i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Runnable f29346j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Runnable f29347k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View.OnTouchListener f29348l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View.OnClickListener f29349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View.OnClickListener f29350n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f29346j);
            if (TextUtils.isEmpty((String) view.getTag())) {
                return;
            }
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MBAcquireRewardPopView.this.f29342f <= 0) {
                MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                throw null;
            }
            MBAcquireRewardPopView.j(MBAcquireRewardPopView.this);
            MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
            mBAcquireRewardPopView.postDelayed(mBAcquireRewardPopView.f29346j, 1000L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements View.OnTouchListener {
        e() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action == 0) {
                MBAcquireRewardPopView.this.f29338b = motionEvent.getX();
                MBAcquireRewardPopView.this.f29339c = motionEvent.getY();
            } else {
                if (action == 1) {
                    if (MBAcquireRewardPopView.this.f29340d <= MBAcquireRewardPopView.this.f29338b) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (Math.abs(MBAcquireRewardPopView.this.f29340d - MBAcquireRewardPopView.this.f29338b) <= 50.0f || Math.abs(MBAcquireRewardPopView.this.f29341e - MBAcquireRewardPopView.this.f29339c) >= 100.0f) {
                        MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                        throw null;
                    }
                    if (MBAcquireRewardPopView.this.f29344h) {
                        return false;
                    }
                    MBAcquireRewardPopView mBAcquireRewardPopView = MBAcquireRewardPopView.this;
                    mBAcquireRewardPopView.removeCallbacks(mBAcquireRewardPopView.f29346j);
                    MBAcquireRewardPopView.this.f29344h = true;
                    View rightAnswerView = MBAcquireRewardPopView.this.getRightAnswerView();
                    View childAt = MBAcquireRewardPopView.this.getChildAt(0);
                    if (childAt != null) {
                        MBAcquireRewardPopView.this.a(childAt, rightAnswerView);
                    }
                    MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
                    throw null;
                }
                if (action == 2) {
                    MBAcquireRewardPopView.this.f29340d = motionEvent.getX();
                    MBAcquireRewardPopView.this.f29341e = motionEvent.getY();
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBAcquireRewardPopView.g(MBAcquireRewardPopView.this);
            throw null;
        }
    }

    public MBAcquireRewardPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29337a = "MBAcquireRewardPopView";
        this.f29338b = 0.0f;
        this.f29339c = 0.0f;
        this.f29340d = 0.0f;
        this.f29341e = 0.0f;
        this.f29345i = new b();
        this.f29346j = new c();
        this.f29347k = new d();
        this.f29348l = new e();
        this.f29349m = new f();
        this.f29350n = new a();
    }

    static /* synthetic */ com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a g(MBAcquireRewardPopView mBAcquireRewardPopView) {
        mBAcquireRewardPopView.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View getRightAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getSlidePopView() {
        int iA = v0.a(getContext(), 290.0f);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iA, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    private View getWrongAnswerView() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        new MBGradientAndShadowTextView.a();
        throw null;
    }

    static /* synthetic */ int j(MBAcquireRewardPopView mBAcquireRewardPopView) {
        int i10 = mBAcquireRewardPopView.f29342f;
        mBAcquireRewardPopView.f29342f = i10 - 1;
        return i10;
    }

    public void init(com.mbridge.msdk.config.dynamic.baseview.rewardpopview.a aVar) {
        q0.b("MBAcquireRewardPopView", "Must generate parameters.");
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f29346j);
    }

    public void onPause() {
        if (!this.f29343g || this.f29342f <= 0) {
            return;
        }
        removeCallbacks(this.f29346j);
    }

    public void onResume() {
        if (!this.f29343g || this.f29342f <= 0) {
            return;
        }
        post(this.f29346j);
    }

    public void onStop() {
        if (!this.f29343g || this.f29342f <= 0) {
            return;
        }
        removeCallbacks(this.f29346j);
    }

    public void onTimeLessThanReduce(int i10) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view, View view2) {
        removeView(view);
        addView(view2);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new a());
            MBAcquireRewardPopView.this.startAnimation(alphaAnimation);
        }

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Animation.AnimationListener {
            a() {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                MBAcquireRewardPopView.this.f29343g = false;
                MBAcquireRewardPopView.this.setVisibility(8);
                MBAcquireRewardPopView.this.removeAllViews();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        }
    }
}
