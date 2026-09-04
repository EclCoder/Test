package com.google.android.exoplayer2.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
final class x {
    private boolean A;
    private boolean B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StyledPlayerControlView f18656a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f18657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ViewGroup f18658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ViewGroup f18659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewGroup f18660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ViewGroup f18661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f18662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ViewGroup f18663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewGroup f18664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View f18665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View f18666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AnimatorSet f18667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AnimatorSet f18668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AnimatorSet f18669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AnimatorSet f18670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final AnimatorSet f18671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ValueAnimator f18672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ValueAnimator f18673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Runnable f18674s = new Runnable() { // from class: com.google.android.exoplayer2.ui.k
        @Override // java.lang.Runnable
        public final void run() {
            this.f18643a.Y();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f18675t = new Runnable() { // from class: com.google.android.exoplayer2.ui.q
        @Override // java.lang.Runnable
        public final void run() {
            this.f18649a.D();
        }
    };

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Runnable f18676u = new Runnable() { // from class: com.google.android.exoplayer2.ui.r
        @Override // java.lang.Runnable
        public final void run() {
            this.f18650a.H();
        }
    };

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Runnable f18677v = new Runnable() { // from class: com.google.android.exoplayer2.ui.s
        @Override // java.lang.Runnable
        public final void run() {
            this.f18651a.G();
        }
    };

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f18678w = new Runnable() { // from class: com.google.android.exoplayer2.ui.t
        @Override // java.lang.Runnable
        public final void run() {
            this.f18652a.E();
        }
    };

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final View.OnLayoutChangeListener f18679x = new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.u
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f18653a.N(view, i10, i11, i12, i13, i14, i15, i16, i17);
        }
    };
    private boolean C = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f18681z = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final List f18680y = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (x.this.f18657b != null) {
                x.this.f18657b.setVisibility(4);
            }
            if (x.this.f18658c != null) {
                x.this.f18658c.setVisibility(4);
            }
            if (x.this.f18660e != null) {
                x.this.f18660e.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!(x.this.f18665j instanceof DefaultTimeBar) || x.this.A) {
                return;
            }
            ((DefaultTimeBar) x.this.f18665j).h(250L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (x.this.f18657b != null) {
                x.this.f18657b.setVisibility(0);
            }
            if (x.this.f18658c != null) {
                x.this.f18658c.setVisibility(0);
            }
            if (x.this.f18660e != null) {
                x.this.f18660e.setVisibility(x.this.A ? 0 : 4);
            }
            if (!(x.this.f18665j instanceof DefaultTimeBar) || x.this.A) {
                return;
            }
            ((DefaultTimeBar) x.this.f18665j).s(250L);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StyledPlayerControlView f18684a;

        c(StyledPlayerControlView styledPlayerControlView) {
            this.f18684a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.V(1);
            if (x.this.B) {
                this.f18684a.post(x.this.f18674s);
                x.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x.this.V(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StyledPlayerControlView f18686a;

        d(StyledPlayerControlView styledPlayerControlView) {
            this.f18686a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.V(2);
            if (x.this.B) {
                this.f18686a.post(x.this.f18674s);
                x.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x.this.V(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StyledPlayerControlView f18688a;

        e(StyledPlayerControlView styledPlayerControlView) {
            this.f18688a = styledPlayerControlView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.V(2);
            if (x.this.B) {
                this.f18688a.post(x.this.f18674s);
                x.this.B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x.this.V(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x.this.V(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            x.this.V(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            x.this.V(4);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends AnimatorListenerAdapter {
        h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (x.this.f18661f != null) {
                x.this.f18661f.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (x.this.f18663h != null) {
                x.this.f18663h.setVisibility(0);
                x.this.f18663h.setTranslationX(x.this.f18663h.getWidth());
                x.this.f18663h.scrollTo(x.this.f18663h.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i extends AnimatorListenerAdapter {
        i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (x.this.f18663h != null) {
                x.this.f18663h.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (x.this.f18661f != null) {
                x.this.f18661f.setVisibility(0);
            }
        }
    }

    public x(StyledPlayerControlView styledPlayerControlView) {
        this.f18656a = styledPlayerControlView;
        this.f18657b = styledPlayerControlView.findViewById(mb.m.f45461l);
        this.f18658c = (ViewGroup) styledPlayerControlView.findViewById(mb.m.f45456g);
        this.f18660e = (ViewGroup) styledPlayerControlView.findViewById(mb.m.f45471v);
        ViewGroup viewGroup = (ViewGroup) styledPlayerControlView.findViewById(mb.m.f45454e);
        this.f18659d = viewGroup;
        this.f18664i = (ViewGroup) styledPlayerControlView.findViewById(mb.m.T);
        View viewFindViewById = styledPlayerControlView.findViewById(mb.m.H);
        this.f18665j = viewFindViewById;
        this.f18661f = (ViewGroup) styledPlayerControlView.findViewById(mb.m.f45453d);
        this.f18662g = (ViewGroup) styledPlayerControlView.findViewById(mb.m.f45464o);
        this.f18663h = (ViewGroup) styledPlayerControlView.findViewById(mb.m.f45465p);
        View viewFindViewById2 = styledPlayerControlView.findViewById(mb.m.f45475z);
        this.f18666k = viewFindViewById2;
        View viewFindViewById3 = styledPlayerControlView.findViewById(mb.m.f45474y);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18654a.P(view);
                }
            });
            viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.v
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18654a.P(view);
                }
            });
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                x.d(this.f18655a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.l
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                x.g(this.f18644a, valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = styledPlayerControlView.getResources();
        int i10 = mb.j.f45427b;
        float dimension = resources.getDimension(i10) - resources.getDimension(mb.j.f45428c);
        float dimension2 = resources.getDimension(i10);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f18667l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(styledPlayerControlView));
        animatorSet.play(valueAnimatorOfFloat).with(J(0.0f, dimension, viewFindViewById)).with(J(0.0f, dimension, viewGroup));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f18668m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(styledPlayerControlView));
        animatorSet2.play(J(dimension, dimension2, viewFindViewById)).with(J(dimension, dimension2, viewGroup));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f18669n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(styledPlayerControlView));
        animatorSet3.play(valueAnimatorOfFloat).with(J(0.0f, dimension2, viewFindViewById)).with(J(0.0f, dimension2, viewGroup));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f18670o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(J(dimension, 0.0f, viewFindViewById)).with(J(dimension, 0.0f, viewGroup));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f18671p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(J(dimension2, 0.0f, viewFindViewById)).with(J(dimension2, 0.0f, viewGroup));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f18672q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.o
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                x.b(this.f18647a, valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f18673r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.exoplayer2.ui.p
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                x.m(this.f18648a, valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    private static int B(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        this.f18669n.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        V(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        this.f18667l.start();
        Q(this.f18676u, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        this.f18668m.start();
    }

    private static ObjectAnimator J(float f10, float f11, View view) {
        return ObjectAnimator.ofFloat(view, "translationY", f10, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        boolean zA0 = a0();
        if (this.A != zA0) {
            this.A = zA0;
            view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18645a.Z();
                }
            });
        }
        boolean z10 = i12 - i10 != i16 - i14;
        if (this.A || !z10) {
            return;
        }
        view.post(new Runnable() { // from class: com.google.android.exoplayer2.ui.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f18646a.O();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        int i10;
        if (this.f18661f == null || this.f18662g == null) {
            return;
        }
        int width = (this.f18656a.getWidth() - this.f18656a.getPaddingLeft()) - this.f18656a.getPaddingRight();
        while (true) {
            if (this.f18662g.getChildCount() <= 1) {
                break;
            }
            int childCount = this.f18662g.getChildCount() - 2;
            View childAt = this.f18662g.getChildAt(childCount);
            this.f18662g.removeViewAt(childCount);
            this.f18661f.addView(childAt, 0);
        }
        View view = this.f18666k;
        if (view != null) {
            view.setVisibility(8);
        }
        int iB = B(this.f18664i);
        int childCount2 = this.f18661f.getChildCount() - 1;
        for (int i11 = 0; i11 < childCount2; i11++) {
            iB += B(this.f18661f.getChildAt(i11));
        }
        if (iB <= width) {
            ViewGroup viewGroup = this.f18663h;
            if (viewGroup == null || viewGroup.getVisibility() != 0 || this.f18673r.isStarted()) {
                return;
            }
            this.f18672q.cancel();
            this.f18673r.start();
            return;
        }
        View view2 = this.f18666k;
        if (view2 != null) {
            view2.setVisibility(0);
            iB += B(this.f18666k);
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = this.f18661f.getChildAt(i12);
            iB -= B(childAt2);
            arrayList.add(childAt2);
            if (iB <= width) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.f18661f.removeViews(0, arrayList.size());
        for (i10 = 0; i10 < arrayList.size(); i10++) {
            this.f18662g.addView((View) arrayList.get(i10), this.f18662g.getChildCount() - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P(View view) {
        S();
        if (view.getId() == mb.m.f45475z) {
            this.f18672q.start();
        } else if (view.getId() == mb.m.f45474y) {
            this.f18673r.start();
        }
    }

    private void Q(Runnable runnable, long j10) {
        if (j10 >= 0) {
            this.f18656a.postDelayed(runnable, j10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(int i10) {
        int i11 = this.f18681z;
        this.f18681z = i10;
        if (i10 == 2) {
            this.f18656a.setVisibility(8);
        } else if (i11 == 2) {
            this.f18656a.setVisibility(0);
        }
        if (i11 != i10) {
            this.f18656a.e0();
        }
    }

    private boolean W(View view) {
        int id2 = view.getId();
        return id2 == mb.m.f45454e || id2 == mb.m.G || id2 == mb.m.f45473x || id2 == mb.m.K || id2 == mb.m.L || id2 == mb.m.f45466q || id2 == mb.m.f45467r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!this.C) {
            V(0);
            S();
            return;
        }
        int i10 = this.f18681z;
        if (i10 == 1) {
            this.f18670o.start();
        } else if (i10 == 2) {
            this.f18671p.start();
        } else if (i10 == 3) {
            this.B = true;
        } else if (i10 == 4) {
            return;
        }
        S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        ViewGroup viewGroup = this.f18660e;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.A ? 0 : 4);
        }
        if (this.f18665j != null) {
            int dimensionPixelSize = this.f18656a.getResources().getDimensionPixelSize(mb.j.f45429d);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f18665j.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.A) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.f18665j.setLayoutParams(marginLayoutParams);
            }
            View view = this.f18665j;
            if (view instanceof DefaultTimeBar) {
                DefaultTimeBar defaultTimeBar = (DefaultTimeBar) view;
                if (this.A) {
                    defaultTimeBar.i(true);
                } else {
                    int i10 = this.f18681z;
                    if (i10 == 1) {
                        defaultTimeBar.i(false);
                    } else if (i10 != 3) {
                        defaultTimeBar.r();
                    }
                }
            }
        }
        for (View view2 : this.f18680y) {
            view2.setVisibility((this.A && W(view2)) ? 4 : 0);
        }
    }

    private boolean a0() {
        int width = (this.f18656a.getWidth() - this.f18656a.getPaddingLeft()) - this.f18656a.getPaddingRight();
        int height = (this.f18656a.getHeight() - this.f18656a.getPaddingBottom()) - this.f18656a.getPaddingTop();
        int iB = B(this.f18658c);
        ViewGroup viewGroup = this.f18658c;
        int paddingLeft = iB - (viewGroup != null ? viewGroup.getPaddingLeft() + this.f18658c.getPaddingRight() : 0);
        int iZ = z(this.f18658c);
        ViewGroup viewGroup2 = this.f18658c;
        return width <= Math.max(paddingLeft, B(this.f18664i) + B(this.f18666k)) || height <= (iZ - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.f18658c.getPaddingBottom() : 0)) + (z(this.f18659d) * 2);
    }

    public static /* synthetic */ void b(x xVar, ValueAnimator valueAnimator) {
        xVar.getClass();
        xVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void d(x xVar, ValueAnimator valueAnimator) {
        xVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = xVar.f18657b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = xVar.f18658c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = xVar.f18660e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void g(x xVar, ValueAnimator valueAnimator) {
        xVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        View view = xVar.f18657b;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup = xVar.f18658c;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        ViewGroup viewGroup2 = xVar.f18660e;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    public static /* synthetic */ void m(x xVar, ValueAnimator valueAnimator) {
        xVar.getClass();
        xVar.y(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void y(float f10) {
        ViewGroup viewGroup = this.f18663h;
        if (viewGroup != null) {
            this.f18663h.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f10)));
        }
        ViewGroup viewGroup2 = this.f18664i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f10);
        }
        ViewGroup viewGroup3 = this.f18661f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f10);
        }
    }

    private static int z(View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return height;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public boolean A(View view) {
        return view != null && this.f18680y.contains(view);
    }

    public void C() {
        int i10 = this.f18681z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        if (!this.C) {
            E();
        } else if (this.f18681z == 1) {
            H();
        } else {
            D();
        }
    }

    public void F() {
        int i10 = this.f18681z;
        if (i10 == 3 || i10 == 2) {
            return;
        }
        R();
        E();
    }

    public boolean I() {
        return this.f18681z == 0 && this.f18656a.d0();
    }

    public void K() {
        this.f18656a.addOnLayoutChangeListener(this.f18679x);
    }

    public void L() {
        this.f18656a.removeOnLayoutChangeListener(this.f18679x);
    }

    public void M(boolean z10, int i10, int i11, int i12, int i13) {
        View view = this.f18657b;
        if (view != null) {
            view.layout(0, 0, i12 - i10, i13 - i11);
        }
    }

    public void R() {
        this.f18656a.removeCallbacks(this.f18678w);
        this.f18656a.removeCallbacks(this.f18675t);
        this.f18656a.removeCallbacks(this.f18677v);
        this.f18656a.removeCallbacks(this.f18676u);
    }

    public void S() {
        if (this.f18681z == 3) {
            return;
        }
        R();
        int showTimeoutMs = this.f18656a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.C) {
                Q(this.f18678w, showTimeoutMs);
            } else if (this.f18681z == 1) {
                Q(this.f18676u, 2000L);
            } else {
                Q(this.f18677v, showTimeoutMs);
            }
        }
    }

    public void T(boolean z10) {
        this.C = z10;
    }

    public void U(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (!z10) {
            view.setVisibility(8);
            this.f18680y.remove(view);
            return;
        }
        if (this.A && W(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.f18680y.add(view);
    }

    public void X() {
        if (!this.f18656a.d0()) {
            this.f18656a.setVisibility(0);
            this.f18656a.n0();
            this.f18656a.j0();
        }
        Y();
    }
}
