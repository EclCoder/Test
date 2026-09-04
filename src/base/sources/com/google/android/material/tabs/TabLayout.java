package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.t0;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.z;
import com.google.api.client.http.HttpStatusCodes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import n0.f0;
import n0.q0;
import o0.p;
import sb.k;
import sb.l;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
@ViewPager.e
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final int f21215a0 = l.f51872p;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final m0.d f21216b0 = new m0.f(16);
    int A;
    int B;
    int C;
    int D;
    boolean E;
    boolean F;
    int G;
    int H;
    boolean I;
    private com.google.android.material.tabs.c J;
    private final TimeInterpolator K;
    private c L;
    private final ArrayList M;
    private c N;
    private ValueAnimator O;
    ViewPager P;
    private PagerAdapter Q;
    private DataSetObserver R;
    private h S;
    private b T;
    private boolean U;
    private int V;
    private final m0.d W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f21218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f21219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final f f21220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f21221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f21222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f21223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f21224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f21225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f21226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    ColorStateList f21228l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ColorStateList f21229m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ColorStateList f21230n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f21231o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21232p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    PorterDuff.Mode f21233q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f21234r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    float f21235s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f21236t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final int f21237u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f21238v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int f21239w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f21240x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f21241y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f21242z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class b implements ViewPager.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21244a;

        b() {
        }

        @Override // androidx.viewpager.widget.ViewPager.i
        public void a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.P == viewPager) {
                tabLayout.K(pagerAdapter2, this.f21244a);
            }
        }

        void b(boolean z10) {
            this.f21244a = z10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface c {
        void a(g gVar);

        void b(g gVar);

        void c(g gVar);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d extends c {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e extends DataSetObserver {
        e() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.D();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.D();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ValueAnimator f21247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21248b;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f21250a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f21251b;

            a(View view, View view2) {
                this.f21250a = view;
                this.f21251b = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.j(this.f21250a, this.f21251b, valueAnimator.getAnimatedFraction());
            }
        }

        f(Context context) {
            super(context);
            this.f21248b = -1;
            setWillNotDraw(false);
        }

        private void e() {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f21217a == -1) {
                tabLayout.f21217a = tabLayout.getSelectedTabPosition();
            }
            f(TabLayout.this.f21217a);
        }

        private void f(int i10) {
            if (TabLayout.this.V == 0 || (TabLayout.this.getTabSelectedIndicator().getBounds().left == -1 && TabLayout.this.getTabSelectedIndicator().getBounds().right == -1)) {
                View childAt = getChildAt(i10);
                com.google.android.material.tabs.c cVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                cVar.c(tabLayout, childAt, tabLayout.f21231o);
                TabLayout.this.f21217a = i10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            f(TabLayout.this.getSelectedTabPosition());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(View view, View view2, float f10) {
            if (view == null || view.getWidth() <= 0) {
                Drawable drawable = TabLayout.this.f21231o;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f21231o.getBounds().bottom);
            } else {
                com.google.android.material.tabs.c cVar = TabLayout.this.J;
                TabLayout tabLayout = TabLayout.this;
                cVar.d(tabLayout, view, view2, f10, tabLayout.f21231o);
            }
            postInvalidateOnAnimation();
        }

        private void k(boolean z10, int i10, int i11) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.f21217a == i10) {
                return;
            }
            View childAt = getChildAt(tabLayout.getSelectedTabPosition());
            View childAt2 = getChildAt(i10);
            if (childAt2 == null) {
                g();
                return;
            }
            TabLayout.this.f21217a = i10;
            a aVar = new a(childAt, childAt2);
            if (!z10) {
                this.f21247a.removeAllUpdateListeners();
                this.f21247a.addUpdateListener(aVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f21247a = valueAnimator;
            valueAnimator.setInterpolator(TabLayout.this.K);
            valueAnimator.setDuration(i11);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(aVar);
            valueAnimator.start();
        }

        void c(int i10, int i11) {
            ValueAnimator valueAnimator = this.f21247a;
            if (valueAnimator != null && valueAnimator.isRunning() && TabLayout.this.f21217a != i10) {
                this.f21247a.cancel();
            }
            k(true, i10, i11);
        }

        boolean d() {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                if (getChildAt(i10).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            int height;
            int iHeight = TabLayout.this.f21231o.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f21231o.getIntrinsicHeight();
            }
            int i10 = TabLayout.this.C;
            if (i10 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i10 != 1) {
                height = 0;
                if (i10 != 2) {
                    iHeight = i10 != 3 ? 0 : getHeight();
                }
            } else {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            }
            if (TabLayout.this.f21231o.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f21231o.getBounds();
                TabLayout.this.f21231o.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout.this.f21231o.draw(canvas);
            }
            super.draw(canvas);
        }

        void h(int i10, float f10) {
            TabLayout.this.f21217a = Math.round(i10 + f10);
            ValueAnimator valueAnimator = this.f21247a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f21247a.cancel();
            }
            j(getChildAt(i10), getChildAt(i10 + 1), f10);
        }

        void i(int i10) {
            Rect bounds = TabLayout.this.f21231o.getBounds();
            TabLayout.this.f21231o.setBounds(bounds.left, 0, bounds.right, i10);
            requestLayout();
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            ValueAnimator valueAnimator = this.f21247a;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                e();
            } else {
                k(false, TabLayout.this.getSelectedTabPosition(), -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (View.MeasureSpec.getMode(i10) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z10 = true;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) c0.g(getContext(), 16)) * 2)) {
                    boolean z11 = false;
                    for (int i13 = 0; i13 < childCount; i13++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z11 = true;
                        }
                    }
                    z10 = z11;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.A = 0;
                    tabLayout2.S(false);
                }
                if (z10) {
                    super.onMeasure(i10, i11);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i10) {
            super.onRtlPropertiesChanged(i10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Object f21253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Drawable f21254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f21255c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f21256d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f21258f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public TabLayout f21260h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public i f21261i;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f21257e = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f21259g = 1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f21262j = -1;

        public View e() {
            return this.f21258f;
        }

        public Drawable f() {
            return this.f21254b;
        }

        public int g() {
            return this.f21257e;
        }

        public int h() {
            return this.f21259g;
        }

        public CharSequence i() {
            return this.f21255c;
        }

        public boolean j() {
            TabLayout tabLayout = this.f21260h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f21257e;
        }

        void k() {
            this.f21260h = null;
            this.f21261i = null;
            this.f21253a = null;
            this.f21254b = null;
            this.f21262j = -1;
            this.f21255c = null;
            this.f21256d = null;
            this.f21257e = -1;
            this.f21258f = null;
        }

        public void l() {
            TabLayout tabLayout = this.f21260h;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.I(this);
        }

        public g m(int i10) {
            TabLayout tabLayout = this.f21260h;
            if (tabLayout != null) {
                return n(i.a.b(tabLayout.getContext(), i10));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        public g n(Drawable drawable) {
            this.f21254b = drawable;
            TabLayout tabLayout = this.f21260h;
            if (tabLayout.A == 1 || tabLayout.D == 2) {
                tabLayout.S(true);
            }
            q();
            return this;
        }

        void o(int i10) {
            this.f21257e = i10;
        }

        public g p(CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f21256d) && !TextUtils.isEmpty(charSequence)) {
                this.f21261i.setContentDescription(charSequence);
            }
            this.f21255c = charSequence;
            q();
            return this;
        }

        void q() {
            i iVar = this.f21261i;
            if (iVar != null) {
                iVar.p();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class h implements ViewPager.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f21263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21265c;

        public h(TabLayout tabLayout) {
            this.f21263a = new WeakReference(tabLayout);
        }

        void a() {
            this.f21265c = 0;
            this.f21264b = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
            this.f21264b = this.f21265c;
            this.f21265c = i10;
            TabLayout tabLayout = (TabLayout) this.f21263a.get();
            if (tabLayout != null) {
                tabLayout.T(this.f21265c);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
            TabLayout tabLayout = (TabLayout) this.f21263a.get();
            if (tabLayout != null) {
                int i12 = this.f21265c;
                boolean z10 = true;
                if (i12 == 2 && this.f21264b != 1) {
                    z10 = false;
                }
                if (i12 == 2 && this.f21264b == 0) {
                    z10 = false;
                }
                tabLayout.N(i10, f10, z10, z10, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
            TabLayout tabLayout = (TabLayout) this.f21263a.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i10 || i10 >= tabLayout.getTabCount()) {
                return;
            }
            int i11 = this.f21265c;
            tabLayout.J(tabLayout.z(i10), i11 == 0 || (i11 == 2 && this.f21264b == 0));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public final class i extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f21266a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private TextView f21267b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ImageView f21268c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private View f21269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private ub.a f21270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f21271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private TextView f21272g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ImageView f21273h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Drawable f21274i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f21275j;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f21277a;

            a(View view) {
                this.f21277a = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                if (this.f21277a.getVisibility() == 0) {
                    i.this.o(this.f21277a);
                }
            }
        }

        public i(Context context) {
            super(context);
            this.f21275j = 2;
            q(context);
            setPaddingRelative(TabLayout.this.f21221e, TabLayout.this.f21222f, TabLayout.this.f21223g, TabLayout.this.f21224h);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            q0.x0(this, f0.b(getContext(), 1002));
        }

        private void d(View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new a(view));
        }

        private float e(Layout layout, int i10, float f10) {
            return layout.getLineWidth(i10) * (f10 / layout.getPaint().getTextSize());
        }

        private void f(boolean z10) {
            setClipChildren(z10);
            setClipToPadding(z10);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z10);
                viewGroup.setClipToPadding(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(Canvas canvas) {
            Drawable drawable = this.f21274i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f21274i.draw(canvas);
            }
        }

        private ub.a getBadge() {
            return this.f21270e;
        }

        private ub.a getOrCreateBadge() {
            if (this.f21270e == null) {
                this.f21270e = ub.a.e(getContext());
            }
            n();
            ub.a aVar = this.f21270e;
            if (aVar != null) {
                return aVar;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        private boolean h() {
            return this.f21270e != null;
        }

        private void i() {
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(sb.i.f51806e, (ViewGroup) this, false);
            this.f21268c = imageView;
            addView(imageView, 0);
        }

        private void j() {
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(sb.i.f51807f, (ViewGroup) this, false);
            this.f21267b = textView;
            addView(textView);
        }

        private void l(View view) {
            if (h() && view != null) {
                f(false);
                ub.c.b(this.f21270e, view, null);
                this.f21269d = view;
            }
        }

        private void m() {
            if (h()) {
                f(true);
                View view = this.f21269d;
                if (view != null) {
                    ub.c.e(this.f21270e, view);
                    this.f21269d = null;
                }
            }
        }

        private void n() {
            g gVar;
            g gVar2;
            if (h()) {
                if (this.f21271f != null) {
                    m();
                    return;
                }
                if (this.f21268c != null && (gVar2 = this.f21266a) != null && gVar2.f() != null) {
                    View view = this.f21269d;
                    ImageView imageView = this.f21268c;
                    if (view == imageView) {
                        o(imageView);
                        return;
                    } else {
                        m();
                        l(this.f21268c);
                        return;
                    }
                }
                if (this.f21267b == null || (gVar = this.f21266a) == null || gVar.h() != 1) {
                    m();
                    return;
                }
                View view2 = this.f21269d;
                TextView textView = this.f21267b;
                if (view2 == textView) {
                    o(textView);
                } else {
                    m();
                    l(this.f21267b);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(View view) {
            if (h() && view == this.f21269d) {
                ub.c.f(this.f21270e, view, null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(Context context) {
            int i10 = TabLayout.this.f21237u;
            if (i10 != 0) {
                Drawable drawableB = i.a.b(context, i10);
                this.f21274i = drawableB;
                if (drawableB != null && drawableB.isStateful()) {
                    this.f21274i.setState(getDrawableState());
                }
            } else {
                this.f21274i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable drawableP = gradientDrawable;
            if (TabLayout.this.f21230n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = kc.a.a(TabLayout.this.f21230n);
                if (TabLayout.this.I) {
                    drawableP = FocusRingDrawable.P(context, new RippleDrawable(colorStateListA, null, null));
                } else {
                    RippleDrawable rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable, gradientDrawable2);
                    FocusRingDrawable.w(context, rippleDrawable);
                    drawableP = rippleDrawable;
                }
            }
            setBackground(drawableP);
            TabLayout.this.invalidate();
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0060  */
        private void t(TextView textView, ImageView imageView, boolean z10) {
            boolean z11;
            g gVar = this.f21266a;
            Drawable drawableMutate = (gVar == null || gVar.f() == null) ? null : f0.a.r(this.f21266a.f()).mutate();
            if (drawableMutate != null) {
                drawableMutate.setTintList(TabLayout.this.f21229m);
                PorterDuff.Mode mode = TabLayout.this.f21233q;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            g gVar2 = this.f21266a;
            CharSequence charSequenceI = gVar2 != null ? gVar2.i() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceI);
            if (textView != null) {
                if (!zIsEmpty) {
                    z11 = this.f21266a.f21259g == 1;
                }
                textView.setText(!zIsEmpty ? charSequenceI : null);
                textView.setVisibility(z11 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z11 = false;
            }
            if (z10 && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iG = (z11 && imageView.getVisibility() == 0) ? (int) c0.g(getContext(), 8) : 0;
                if (TabLayout.this.E) {
                    if (iG != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(iG);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iG != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iG;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            g gVar3 = this.f21266a;
            CharSequence charSequence = gVar3 != null ? gVar3.f21256d : null;
            if (zIsEmpty) {
                charSequenceI = charSequence;
            }
            t0.a(this, charSequenceI);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f21274i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.f21274i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        int getContentHeight() {
            View[] viewArr = {this.f21267b, this.f21268c, this.f21271f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z10 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f21267b, this.f21268c, this.f21271f};
            int iMax = 0;
            int iMin = 0;
            boolean z10 = false;
            for (int i10 = 0; i10 < 3; i10++) {
                View view = viewArr[i10];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z10 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z10 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z10 = true;
                }
            }
            return iMax - iMin;
        }

        public g getTab() {
            return this.f21266a;
        }

        void k() {
            setTab(null);
            setSelected(false);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            p pVarC1 = p.c1(accessibilityNodeInfo);
            ub.a aVar = this.f21270e;
            if (aVar != null && aVar.isVisible()) {
                pVarC1.y0(this.f21270e.j());
            }
            pVarC1.x0(p.h.a(0, 1, this.f21266a.g(), 1, false, isSelected()));
            if (isSelected()) {
                pVarC1.v0(false);
                pVarC1.l0(p.a.f47928i);
            }
            pVarC1.Q0(getResources().getString(k.f51845q));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i10, int i11) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i10 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f21238v, Integer.MIN_VALUE);
            }
            super.onMeasure(i10, i11);
            if (this.f21267b != null) {
                float f10 = TabLayout.this.f21234r;
                if (isSelected() && TabLayout.this.f21227k != -1) {
                    f10 = TabLayout.this.f21235s;
                }
                int i12 = this.f21275j;
                ImageView imageView = this.f21268c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f21267b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f10 = TabLayout.this.f21236t;
                    }
                } else {
                    i12 = 1;
                }
                float textSize = this.f21267b.getTextSize();
                int lineCount = this.f21267b.getLineCount();
                int maxLines = this.f21267b.getMaxLines();
                if (f10 != textSize || (maxLines >= 0 && i12 != maxLines)) {
                    if (TabLayout.this.D != 1 || f10 <= textSize || lineCount != 1 || ((layout = this.f21267b.getLayout()) != null && e(layout, 0, f10) <= (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        this.f21267b.setTextSize(0, f10);
                        this.f21267b.setMaxLines(i12);
                        super.onMeasure(i10, i11);
                    }
                }
            }
        }

        final void p() {
            s();
            g gVar = this.f21266a;
            setSelected(gVar != null && gVar.j());
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f21266a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f21266a.l();
            return true;
        }

        final void r() {
            setOrientation(!TabLayout.this.E ? 1 : 0);
            TextView textView = this.f21272g;
            if (textView == null && this.f21273h == null) {
                t(this.f21267b, this.f21268c, true);
            } else {
                t(textView, this.f21273h, false);
            }
        }

        final void s() {
            ViewParent parent;
            g gVar = this.f21266a;
            View viewE = gVar != null ? gVar.e() : null;
            if (viewE != null) {
                ViewParent parent2 = viewE.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(viewE);
                    }
                    View view = this.f21271f;
                    if (view != null && (parent = view.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f21271f);
                    }
                    addView(viewE);
                }
                this.f21271f = viewE;
                TextView textView = this.f21267b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f21268c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f21268c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewE.findViewById(R.id.text1);
                this.f21272g = textView2;
                if (textView2 != null) {
                    this.f21275j = textView2.getMaxLines();
                }
                this.f21273h = (ImageView) viewE.findViewById(R.id.icon);
            } else {
                View view2 = this.f21271f;
                if (view2 != null) {
                    removeView(view2);
                    this.f21271f = null;
                }
                this.f21272g = null;
                this.f21273h = null;
            }
            if (this.f21271f == null) {
                if (this.f21268c == null) {
                    i();
                }
                if (this.f21267b == null) {
                    j();
                    this.f21275j = this.f21267b.getMaxLines();
                }
                androidx.core.widget.i.m(this.f21267b, TabLayout.this.f21225i);
                if (!isSelected() || TabLayout.this.f21227k == -1) {
                    androidx.core.widget.i.m(this.f21267b, TabLayout.this.f21226j);
                } else {
                    androidx.core.widget.i.m(this.f21267b, TabLayout.this.f21227k);
                }
                ColorStateList colorStateList = TabLayout.this.f21228l;
                if (colorStateList != null) {
                    this.f21267b.setTextColor(colorStateList);
                }
                t(this.f21267b, this.f21268c, true);
                n();
                d(this.f21268c);
                d(this.f21267b);
            } else {
                TextView textView3 = this.f21272g;
                if (textView3 != null || this.f21273h != null) {
                    t(textView3, this.f21273h, false);
                }
            }
            if (gVar == null || TextUtils.isEmpty(gVar.f21256d)) {
                return;
            }
            setContentDescription(gVar.f21256d);
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            isSelected();
            super.setSelected(z10);
            TextView textView = this.f21267b;
            if (textView != null) {
                textView.setSelected(z10);
            }
            ImageView imageView = this.f21268c;
            if (imageView != null) {
                imageView.setSelected(z10);
            }
            View view = this.f21271f;
            if (view != null) {
                view.setSelected(z10);
            }
        }

        void setTab(g gVar) {
            if (gVar != this.f21266a) {
                this.f21266a = gVar;
                p();
            }
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, sb.c.f51635t0);
    }

    private boolean A() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void H(int i10) {
        i iVar = (i) this.f21220d.getChildAt(i10);
        this.f21220d.removeViewAt(i10);
        if (iVar != null) {
            iVar.k();
            this.W.a(iVar);
        }
        requestLayout();
    }

    private void P(ViewPager viewPager, boolean z10, boolean z11) {
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            h hVar = this.S;
            if (hVar != null) {
                viewPager2.removeOnPageChangeListener(hVar);
            }
            b bVar = this.T;
            if (bVar != null) {
                this.P.removeOnAdapterChangeListener(bVar);
            }
        }
        c cVar = this.N;
        if (cVar != null) {
            G(cVar);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new h(this);
            }
            this.S.a();
            viewPager.addOnPageChangeListener(this.S);
            j jVar = new j(viewPager);
            this.N = jVar;
            g(jVar);
            PagerAdapter adapter = viewPager.getAdapter();
            if (adapter != null) {
                K(adapter, z10);
            }
            if (this.T == null) {
                this.T = new b();
            }
            this.T.b(z10);
            viewPager.addOnAdapterChangeListener(this.T);
            L(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            K(null, false);
        }
        this.U = z11;
    }

    private void Q() {
        int size = this.f21218b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((g) this.f21218b.get(i10)).q();
        }
    }

    private void R(LinearLayout.LayoutParams layoutParams) {
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private int getDefaultHeight() {
        int size = this.f21218b.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f21218b.get(i10);
            if (gVar != null && gVar.f() != null && !TextUtils.isEmpty(gVar.i())) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i10 = this.f21239w;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.D;
        if (i11 == 0 || i11 == 2) {
            return this.f21241y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f21220d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void k(g gVar) {
        i iVar = gVar.f21261i;
        iVar.setSelected(false);
        iVar.setActivated(false);
        this.f21220d.addView(iVar, gVar.g(), s());
    }

    private void l(View view) {
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    private void m(int i10) {
        if (i10 == -1) {
            return;
        }
        if (getWindowToken() == null || !isLaidOut() || this.f21220d.d()) {
            L(i10, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iP = p(i10, 0.0f);
        if (scrollX != iP) {
            y();
            this.O.setIntValues(scrollX, iP);
            this.O.start();
        }
        this.f21220d.c(i10, this.B);
    }

    private void n(int i10) {
        if (i10 == 0) {
            Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i10 == 1) {
            this.f21220d.setGravity(1);
            return;
        } else if (i10 != 2) {
            return;
        }
        this.f21220d.setGravity(8388611);
    }

    private void o() {
        int i10 = this.D;
        this.f21220d.setPaddingRelative((i10 == 0 || i10 == 2) ? Math.max(0, this.f21242z - this.f21221e) : 0, 0, 0, 0);
        int i11 = this.D;
        if (i11 == 0) {
            n(this.A);
        } else if (i11 == 1 || i11 == 2) {
            if (this.A == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f21220d.setGravity(1);
        }
        S(true);
    }

    private int p(int i10, float f10) {
        View childAt;
        int i11 = this.D;
        if ((i11 != 0 && i11 != 2) || (childAt = this.f21220d.getChildAt(i10)) == null) {
            return 0;
        }
        int i12 = i10 + 1;
        View childAt2 = i12 < this.f21220d.getChildCount() ? this.f21220d.getChildAt(i12) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i13 = (int) ((width + width2) * 0.5f * f10);
        return getLayoutDirection() == 0 ? left + i13 : left - i13;
    }

    private void q(g gVar, int i10) {
        gVar.o(i10);
        this.f21218b.add(i10, gVar);
        int size = this.f21218b.size();
        int i11 = -1;
        for (int i12 = i10 + 1; i12 < size; i12++) {
            if (((g) this.f21218b.get(i12)).g() == this.f21217a) {
                i11 = i12;
            }
            ((g) this.f21218b.get(i12)).o(i12);
        }
        this.f21217a = i11;
    }

    private static ColorStateList r(int i10, int i11) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i11, i10});
    }

    private LinearLayout.LayoutParams s() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        R(layoutParams);
        return layoutParams;
    }

    private void setSelectedTabView(int i10) {
        int childCount = this.f21220d.getChildCount();
        if (i10 < childCount) {
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = this.f21220d.getChildAt(i11);
                if ((i11 != i10 || childAt.isSelected()) && (i11 == i10 || !childAt.isSelected())) {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                } else {
                    childAt.setSelected(i11 == i10);
                    childAt.setActivated(i11 == i10);
                    if (childAt instanceof i) {
                        ((i) childAt).s();
                    }
                }
                i11++;
            }
        }
    }

    private i u(g gVar) {
        m0.d dVar = this.W;
        i iVar = dVar != null ? (i) dVar.b() : null;
        if (iVar == null) {
            iVar = new i(getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f21256d)) {
            iVar.setContentDescription(gVar.f21255c);
            return iVar;
        }
        iVar.setContentDescription(gVar.f21256d);
        return iVar;
    }

    private void v(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ((c) this.M.get(size)).c(gVar);
        }
    }

    private void w(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ((c) this.M.get(size)).a(gVar);
        }
    }

    private void x(g gVar) {
        for (int size = this.M.size() - 1; size >= 0; size--) {
            ((c) this.M.get(size)).b(gVar);
        }
    }

    private void y() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new a());
        }
    }

    public boolean B() {
        return this.F;
    }

    public g C() {
        g gVarT = t();
        gVarT.f21260h = this;
        gVarT.f21261i = u(gVarT);
        if (gVarT.f21262j != -1) {
            gVarT.f21261i.setId(gVarT.f21262j);
        }
        return gVarT;
    }

    void D() {
        int currentItem;
        F();
        PagerAdapter pagerAdapter = this.Q;
        if (pagerAdapter != null) {
            int count = pagerAdapter.getCount();
            for (int i10 = 0; i10 < count; i10++) {
                j(C().p(this.Q.getPageTitle(i10)), false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || count <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            I(z(currentItem));
        }
    }

    protected boolean E(g gVar) {
        return f21216b0.a(gVar);
    }

    public void F() {
        for (int childCount = this.f21220d.getChildCount() - 1; childCount >= 0; childCount--) {
            H(childCount);
        }
        Iterator it = this.f21218b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.k();
            E(gVar);
        }
        this.f21219c = null;
    }

    public void G(c cVar) {
        this.M.remove(cVar);
    }

    public void I(g gVar) {
        J(gVar, true);
    }

    public void J(g gVar, boolean z10) {
        g gVar2 = this.f21219c;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                v(gVar);
                m(gVar.g());
                return;
            }
            return;
        }
        int iG = gVar != null ? gVar.g() : -1;
        if (z10) {
            if ((gVar2 == null || gVar2.g() == -1) && iG != -1) {
                L(iG, 0.0f, true);
            } else {
                m(iG);
            }
            if (iG != -1) {
                setSelectedTabView(iG);
            }
        }
        this.f21219c = gVar;
        if (gVar2 != null && gVar2.f21260h != null) {
            x(gVar2);
        }
        if (gVar != null) {
            w(gVar);
        }
    }

    void K(PagerAdapter pagerAdapter, boolean z10) {
        DataSetObserver dataSetObserver;
        PagerAdapter pagerAdapter2 = this.Q;
        if (pagerAdapter2 != null && (dataSetObserver = this.R) != null) {
            pagerAdapter2.unregisterDataSetObserver(dataSetObserver);
        }
        this.Q = pagerAdapter;
        if (z10 && pagerAdapter != null) {
            if (this.R == null) {
                this.R = new e();
            }
            pagerAdapter.registerDataSetObserver(this.R);
        }
        D();
    }

    public void L(int i10, float f10, boolean z10) {
        M(i10, f10, z10, true);
    }

    public void M(int i10, float f10, boolean z10, boolean z11) {
        N(i10, f10, z10, z11, true);
    }

    void N(int i10, float f10, boolean z10, boolean z11, boolean z12) {
        int iRound = Math.round(i10 + f10);
        if (iRound < 0 || iRound >= this.f21220d.getChildCount()) {
            return;
        }
        if (z11) {
            this.f21220d.h(i10, f10);
        }
        ValueAnimator valueAnimator = this.O;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.O.cancel();
        }
        int iP = p(i10, f10);
        int scrollX = getScrollX();
        boolean z13 = (i10 < getSelectedTabPosition() && iP >= scrollX) || (i10 > getSelectedTabPosition() && iP <= scrollX) || i10 == getSelectedTabPosition();
        if (getLayoutDirection() == 1) {
            z13 = (i10 < getSelectedTabPosition() && iP <= scrollX) || (i10 > getSelectedTabPosition() && iP >= scrollX) || i10 == getSelectedTabPosition();
        }
        if (z13 || this.V == 1 || z12) {
            if (i10 < 0) {
                iP = 0;
            }
            scrollTo(iP, 0);
        }
        if (z10) {
            setSelectedTabView(iRound);
        }
    }

    public void O(ViewPager viewPager, boolean z10) {
        P(viewPager, z10, false);
    }

    void S(boolean z10) {
        for (int i10 = 0; i10 < this.f21220d.getChildCount(); i10++) {
            View childAt = this.f21220d.getChildAt(i10);
            childAt.setMinimumWidth(getTabMinWidth());
            R((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z10) {
                childAt.requestLayout();
            }
        }
    }

    void T(int i10) {
        this.V = i10;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        l(view);
    }

    public void g(c cVar) {
        if (this.M.contains(cVar)) {
            return;
        }
        this.M.add(cVar);
    }

    public int getSelectedTabPosition() {
        g gVar = this.f21219c;
        if (gVar != null) {
            return gVar.g();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f21218b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.f21229m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    int getTabMaxWidth() {
        return this.f21238v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.f21230n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f21231o;
    }

    public ColorStateList getTabTextColors() {
        return this.f21228l;
    }

    public void h(d dVar) {
        g(dVar);
    }

    public void i(g gVar, int i10, boolean z10) {
        if (gVar.f21260h != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        q(gVar, i10);
        k(gVar);
        if (z10) {
            gVar.l();
        }
    }

    public void j(g gVar, boolean z10) {
        i(gVar, this.f21218b.size(), z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mc.j.e(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                P((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        for (int i10 = 0; i10 < this.f21220d.getChildCount(); i10++) {
            View childAt = this.f21220d.getChildAt(i10);
            if (childAt instanceof i) {
                ((i) childAt).g(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        p.c1(accessibilityNodeInfo).w0(p.g.b(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return A() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int iRound = Math.round(c0.g(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i11);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i11 = View.MeasureSpec.makeMeasureSpec(iRound + getPaddingTop() + getPaddingBottom(), 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i11) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i10);
        if (View.MeasureSpec.getMode(i10) != 0) {
            int iG = this.f21240x;
            if (iG <= 0) {
                iG = (int) (size - c0.g(getContext(), 56));
            }
            this.f21238v = iG;
        }
        super.onMeasure(i10, i11);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i12 = this.D;
            if (i12 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i12 != 1) {
                if (i12 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || A()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        mc.j.d(this, f10);
    }

    public void setInlineLabel(boolean z10) {
        if (this.E != z10) {
            this.E = z10;
            for (int i10 = 0; i10 < this.f21220d.getChildCount(); i10++) {
                View childAt = this.f21220d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).r();
                }
            }
            o();
        }
    }

    public void setInlineLabelResource(int i10) {
        setInlineLabel(getResources().getBoolean(i10));
    }

    @Deprecated
    public void setOnTabSelectedListener(d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        y();
        this.O.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = f0.a.r(drawable).mutate();
        this.f21231o = drawableMutate;
        com.google.android.material.drawable.c.n(drawableMutate, this.f21232p);
        int intrinsicHeight = this.G;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f21231o.getIntrinsicHeight();
        }
        this.f21220d.i(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i10) {
        this.f21232p = i10;
        com.google.android.material.drawable.c.n(this.f21231o, i10);
        S(false);
    }

    public void setSelectedTabIndicatorGravity(int i10) {
        if (this.C != i10) {
            this.C = i10;
            this.f21220d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i10) {
        this.G = i10;
        this.f21220d.i(i10);
    }

    public void setTabGravity(int i10) {
        if (this.A != i10) {
            this.A = i10;
            o();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f21229m != colorStateList) {
            this.f21229m = colorStateList;
            Q();
        }
    }

    public void setTabIconTintResource(int i10) {
        setTabIconTint(i.a.a(getContext(), i10));
    }

    public void setTabIndicatorAnimationMode(int i10) {
        this.H = i10;
        if (i10 == 0) {
            this.J = new com.google.android.material.tabs.c();
            return;
        }
        if (i10 == 1) {
            this.J = new com.google.android.material.tabs.a();
        } else {
            if (i10 == 2) {
                this.J = new com.google.android.material.tabs.b();
                return;
            }
            throw new IllegalArgumentException(i10 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z10) {
        this.F = z10;
        this.f21220d.g();
        this.f21220d.postInvalidateOnAnimation();
    }

    public void setTabMode(int i10) {
        if (i10 != this.D) {
            this.D = i10;
            o();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f21230n != colorStateList) {
            this.f21230n = colorStateList;
            for (int i10 = 0; i10 < this.f21220d.getChildCount(); i10++) {
                View childAt = this.f21220d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(int i10) {
        setTabRippleColor(i.a.a(getContext(), i10));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f21228l != colorStateList) {
            this.f21228l = colorStateList;
            Q();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(PagerAdapter pagerAdapter) {
        K(pagerAdapter, false);
    }

    public void setUnboundedRipple(boolean z10) {
        if (this.I != z10) {
            this.I = z10;
            for (int i10 = 0; i10 < this.f21220d.getChildCount(); i10++) {
                View childAt = this.f21220d.getChildAt(i10);
                if (childAt instanceof i) {
                    ((i) childAt).q(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(int i10) {
        setUnboundedRipple(getResources().getBoolean(i10));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        O(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    protected g t() {
        g gVar = (g) f21216b0.b();
        return gVar == null ? new g() : gVar;
    }

    public g z(int i10) {
        if (i10 < 0 || i10 >= getTabCount()) {
            return null;
        }
        return (g) this.f21218b.get(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f21215a0;
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f21217a = -1;
        this.f21218b = new ArrayList();
        this.f21227k = -1;
        this.f21232p = 0;
        this.f21238v = Integer.MAX_VALUE;
        this.G = -1;
        this.M = new ArrayList();
        this.W = new m0.e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f fVar = new f(context2);
        this.f21220d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = m.Qb;
        int i12 = m.f52125pc;
        TypedArray typedArrayI = z.i(context2, attributeSet, iArr, i10, i11, i12);
        ColorStateList colorStateListG = com.google.android.material.drawable.c.g(getBackground());
        if (colorStateListG != null) {
            mc.i iVar = new mc.i();
            iVar.l0(colorStateListG);
            iVar.Y(context2);
            iVar.k0(getElevation());
            setBackground(iVar);
        }
        setSelectedTabIndicator(jc.c.e(context2, typedArrayI, m.Wb));
        setSelectedTabIndicatorColor(typedArrayI.getColor(m.Zb, 0));
        fVar.i(typedArrayI.getDimensionPixelSize(m.f51928cc, -1));
        setSelectedTabIndicatorGravity(typedArrayI.getInt(m.f51912bc, 0));
        setTabIndicatorAnimationMode(typedArrayI.getInt(m.Yb, 0));
        setTabIndicatorFullWidth(typedArrayI.getBoolean(m.f51896ac, true));
        int dimensionPixelSize = typedArrayI.getDimensionPixelSize(m.f52005hc, 0);
        this.f21224h = dimensionPixelSize;
        this.f21223g = dimensionPixelSize;
        this.f21222f = dimensionPixelSize;
        this.f21221e = dimensionPixelSize;
        this.f21221e = typedArrayI.getDimensionPixelSize(m.f52050kc, dimensionPixelSize);
        this.f21222f = typedArrayI.getDimensionPixelSize(m.f52065lc, this.f21222f);
        this.f21223g = typedArrayI.getDimensionPixelSize(m.f52035jc, this.f21223g);
        this.f21224h = typedArrayI.getDimensionPixelSize(m.f52020ic, this.f21224h);
        if (z.g(context2)) {
            this.f21225i = sb.c.f51641w0;
        } else {
            this.f21225i = sb.c.f51637u0;
        }
        int resourceId = typedArrayI.getResourceId(i12, l.f51862f);
        this.f21226j = resourceId;
        int[] iArr2 = h.j.f40011c3;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr2);
        try {
            int i13 = h.j.f40017d3;
            this.f21234r = typedArrayObtainStyledAttributes.getDimensionPixelSize(i13, 0);
            int i14 = h.j.f40035g3;
            this.f21228l = jc.c.a(context2, typedArrayObtainStyledAttributes, i14);
            typedArrayObtainStyledAttributes.recycle();
            int i15 = m.f52095nc;
            if (typedArrayI.hasValue(i15)) {
                this.f21227k = typedArrayI.getResourceId(i15, resourceId);
            }
            int i16 = this.f21227k;
            if (i16 != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i16, iArr2);
                try {
                    this.f21235s = typedArrayObtainStyledAttributes2.getDimensionPixelSize(i13, (int) this.f21234r);
                    ColorStateList colorStateListA = jc.c.a(context2, typedArrayObtainStyledAttributes2, i14);
                    if (colorStateListA != null) {
                        this.f21228l = r(this.f21228l.getDefaultColor(), colorStateListA.getColorForState(new int[]{R.attr.state_selected}, colorStateListA.getDefaultColor()));
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th2) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th2;
                }
            }
            int i17 = m.f52140qc;
            if (typedArrayI.hasValue(i17)) {
                this.f21228l = jc.c.a(context2, typedArrayI, i17);
            }
            int i18 = m.f52110oc;
            if (typedArrayI.hasValue(i18)) {
                this.f21228l = r(this.f21228l.getDefaultColor(), typedArrayI.getColor(i18, 0));
            }
            this.f21229m = jc.c.a(context2, typedArrayI, m.Ub);
            this.f21233q = c0.n(typedArrayI.getInt(m.Vb, -1), null);
            this.f21230n = jc.c.a(context2, typedArrayI, m.f52080mc);
            this.B = typedArrayI.getInt(m.Xb, HttpStatusCodes.STATUS_CODE_MULTIPLE_CHOICES);
            this.K = gc.j.g(context2, sb.c.U, tb.b.f53276b);
            this.f21239w = typedArrayI.getDimensionPixelSize(m.f51975fc, -1);
            this.f21240x = typedArrayI.getDimensionPixelSize(m.f51960ec, -1);
            this.f21237u = typedArrayI.getResourceId(m.Rb, 0);
            this.f21242z = typedArrayI.getDimensionPixelSize(m.Sb, 0);
            this.D = typedArrayI.getInt(m.f51990gc, 1);
            this.A = typedArrayI.getInt(m.Tb, 0);
            this.E = typedArrayI.getBoolean(m.f51944dc, false);
            this.I = typedArrayI.getBoolean(m.f52155rc, false);
            typedArrayI.recycle();
            Resources resources = getResources();
            this.f21236t = resources.getDimensionPixelSize(sb.e.f51712q);
            this.f21241y = resources.getDimensionPixelSize(sb.e.f51709p);
            o();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes.recycle();
            throw th3;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10) {
        l(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.L;
        if (cVar2 != null) {
            G(cVar2);
        }
        this.L = cVar;
        if (cVar != null) {
            g(cVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        l(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        l(view);
    }

    public void setSelectedTabIndicator(int i10) {
        if (i10 != 0) {
            setSelectedTabIndicator(i.a.b(getContext(), i10));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class j implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewPager f21279a;

        public j(ViewPager viewPager) {
            this.f21279a = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a(g gVar) {
            this.f21279a.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void b(g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void c(g gVar) {
        }
    }
}
