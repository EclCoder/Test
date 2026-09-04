package com.google.android.material.search;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class v {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final TimeInterpolator f20971z = tb.b.f53275a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SearchView f20972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f20973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f20974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ClippableRoundedCornerLayout f20975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final FrameLayout f20976e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final FrameLayout f20977f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Toolbar f20978g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Toolbar f20979h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final TextView f20980i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final TextView f20981j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final EditText f20982k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ImageButton f20983l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final View f20984m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TouchObserverFrameLayout f20985n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    tb.a f20986o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    AnimatorSet f20987p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final gc.h f20988q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AnimatorSet f20989r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SearchBar f20990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f20991t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final e f20992u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TimeInterpolator f20993v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TimeInterpolator f20994w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final int f20995x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final int f20996y;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements tb.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f20997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tb.a f20998b;

        a(boolean z10, tb.a aVar) {
            this.f20997a = z10;
            this.f20998b = aVar;
        }

        @Override // tb.a.c
        public void a() {
            v.this.f20992u.d(this.f20997a);
            v.this.f20975d.setVisibility(0);
            v.this.f20990s.l0();
        }

        @Override // tb.a.c
        public void b() {
            v.this.f20992u.a(this.f20997a);
            if (!v.this.f20972a.s()) {
                v.this.f20972a.A();
            }
            v.this.f20972a.setTransitionState(SearchView.d.SHOWN);
            v vVar = v.this;
            if (vVar.f20986o == this.f20998b) {
                vVar.f20986o = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements tb.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f21000a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ tb.a f21001b;

        b(boolean z10, tb.a aVar) {
            this.f21000a = z10;
            this.f21001b = aVar;
        }

        @Override // tb.a.c
        public void a() {
            v.this.f20992u.d(this.f21000a);
            v.this.f20972a.setTransitionState(SearchView.d.HIDING);
        }

        @Override // tb.a.c
        public void b() {
            v.this.f20992u.a(this.f21000a);
            v.this.f20975d.setVisibility(8);
            if (!v.this.f20972a.s()) {
                v.this.f20982k.clearFocus();
            }
            v.this.f20972a.setTransitionState(SearchView.d.HIDDEN);
            v vVar = v.this;
            if (vVar.f20986o == this.f21001b) {
                vVar.f20986o = null;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimatorSet f21003a;

        c(AnimatorSet animatorSet) {
            this.f21003a = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!v.this.f20972a.s()) {
                v.this.f20972a.A();
            }
            v.this.f20972a.setTransitionState(SearchView.d.SHOWN);
            v vVar = v.this;
            if (vVar.f20987p == this.f21003a) {
                vVar.f20987p = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            v.this.f20975d.setVisibility(0);
            v.this.f20972a.setTransitionState(SearchView.d.SHOWING);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ AnimatorSet f21005a;

        d(AnimatorSet animatorSet) {
            this.f21005a = animatorSet;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            v.this.f20975d.setVisibility(8);
            if (!v.this.f20972a.s()) {
                v.this.f20982k.clearFocus();
            }
            v.this.f20972a.setTransitionState(SearchView.d.HIDDEN);
            v vVar = v.this;
            if (vVar.f20987p == this.f21005a) {
                vVar.f20987p = null;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            v.this.f20972a.setTransitionState(SearchView.d.HIDING);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private interface e {
        void a(boolean z10);

        void b();

        void c();

        void d(boolean z10);

        AnimatorSet e(boolean z10);

        List f(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements e {
        private g() {
        }

        private Animator A(boolean z10) {
            return D(z10, v.this.f20980i);
        }

        private AnimatorSet B(boolean z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            m(animatorSet);
            l(animatorSet);
            animatorSet.setDuration(z10 ? 300L : 250L);
            animatorSet.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53275a));
            return animatorSet;
        }

        private Animator C(boolean z10, View view, int i10, int i11) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(i10, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.k(view));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(i11, 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.o.l(view));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.setDuration(z10 ? 300L : 250L);
            animatorSet.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
            return animatorSet;
        }

        private Animator D(boolean z10, View view) {
            TextView placeholderTextView = v.this.f20990s.getPlaceholderTextView();
            if (TextUtils.isEmpty(placeholderTextView.getText()) || z10) {
                placeholderTextView = v.this.f20990s.getTextView();
            }
            int iW = v.this.W(placeholderTextView) - v.this.W(view);
            if (com.google.android.material.internal.c0.m(v.this.f20990s)) {
                iW += placeholderTextView.getWidth() - view.getWidth();
            }
            return C(z10, view, iW, w());
        }

        private float[] E(float f10, float[] fArr, float f11) {
            return new float[]{tb.b.a(f10, fArr[0], f11), tb.b.a(f10, fArr[1], f11), tb.b.a(f10, fArr[2], f11), tb.b.a(f10, fArr[3], f11), tb.b.a(f10, fArr[4], f11), tb.b.a(f10, fArr[5], f11), tb.b.a(f10, fArr[6], f11), tb.b.a(f10, fArr[7], f11)};
        }

        private float[] F(float[] fArr, float[] fArr2) {
            return new float[]{Math.max(fArr[0], fArr2[0]), Math.max(fArr[1], fArr2[1]), Math.max(fArr[2], fArr2[2]), Math.max(fArr[3], fArr2[3]), Math.max(fArr[4], fArr2[4]), Math.max(fArr[5], fArr2[5]), Math.max(fArr[6], fArr2[6]), Math.max(fArr[7], fArr2[7])};
        }

        public static /* synthetic */ void g(g gVar, ValueAnimator valueAnimator) {
            v.this.f20982k.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            v.this.f20990s.getTextView().setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        public static /* synthetic */ void h(g gVar, Rect rect, ValueAnimator valueAnimator) {
            gVar.getClass();
            rect.right = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            v.this.f20982k.setClipBounds(rect);
        }

        public static /* synthetic */ void i(g gVar, float f10, float[] fArr, Rect rect, ValueAnimator valueAnimator) {
            gVar.getClass();
            v.this.f20975d.c(rect, gVar.E(f10, fArr, valueAnimator.getAnimatedFraction()));
        }

        private void j(AnimatorSet animatorSet) {
            ActionMenuView actionMenuViewA = com.google.android.material.internal.a0.a(v.this.f20978g);
            if (actionMenuViewA == null) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(v.this.U(com.google.android.material.internal.a0.a(v.this.f20990s), actionMenuViewA), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.k(actionMenuViewA));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(w(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.o.l(actionMenuViewA));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }

        private void k(AnimatorSet animatorSet) {
            ImageButton imageButtonD = com.google.android.material.internal.a0.d(v.this.f20978g);
            if (imageButtonD == null) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(v.this.U(com.google.android.material.internal.a0.d(v.this.f20990s), imageButtonD), 0.0f);
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.k(imageButtonD));
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(w(), 0.0f);
            valueAnimatorOfFloat2.addUpdateListener(com.google.android.material.internal.o.l(imageButtonD));
            animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        }

        private void l(AnimatorSet animatorSet) {
            if (v.this.f20990s == null || !TextUtils.equals(v.this.f20982k.getText(), v.this.f20990s.getText())) {
                return;
            }
            final Rect rect = new Rect(0, 0, v.this.f20982k.getWidth(), v.this.f20982k.getHeight());
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(v.this.f20990s.getTextView().getWidth(), v.this.f20982k.getWidth());
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.c0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v.g.h(this.f20950a, rect, valueAnimator);
                }
            });
            animatorSet.playTogether(valueAnimatorOfInt);
        }

        private void m(AnimatorSet animatorSet) {
            if (v.this.f20990s == null || TextUtils.equals(v.this.f20982k.getText(), v.this.f20990s.getText())) {
                return;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.a0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v.g.g(this.f20943a, valueAnimator);
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }

        private Animator n(boolean z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
            valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
            if (v.this.f20972a.v()) {
                valueAnimatorOfFloat.addUpdateListener(new com.google.android.material.internal.g(com.google.android.material.internal.a0.a(v.this.f20979h), com.google.android.material.internal.a0.a(v.this.f20978g)));
            }
            return valueAnimatorOfFloat;
        }

        private AnimatorSet o(boolean z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            k(animatorSet);
            j(animatorSet);
            animatorSet.setDuration(z10 ? 300L : 250L);
            animatorSet.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
            return animatorSet;
        }

        private Animator p(boolean z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(z10 ? 150L : 83L);
            valueAnimatorOfFloat.setStartDelay(z10 ? 75L : 0L);
            valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53275a));
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.e(v.this.f20984m, v.this.f20985n));
            return valueAnimatorOfFloat;
        }

        private Animator q(boolean z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(p(z10), s(z10), r(z10));
            return animatorSet;
        }

        private Animator r(boolean z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.95f, 1.0f);
            valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
            valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.f(v.this.f20985n));
            return valueAnimatorOfFloat;
        }

        private Animator s(boolean z10) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat((v.this.f20985n.getHeight() * 0.050000012f) / 2.0f, 0.0f);
            valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
            valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.l(v.this.f20984m));
            return valueAnimatorOfFloat;
        }

        private Animator t(boolean z10) {
            return C(z10, v.this.f20979h, v(v.this.f20979h) - (v.this.f20990s.getPaddingEnd() - v.this.f20979h.getPaddingEnd()), w());
        }

        private Animator u(boolean z10) {
            return D(z10, v.this.f20982k);
        }

        private int v(View view) {
            int marginEnd = ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).getMarginEnd();
            v vVar = v.this;
            int iW = vVar.W(vVar.f20990s);
            return com.google.android.material.internal.c0.m(v.this.f20990s) ? iW - marginEnd : ((iW + v.this.f20990s.getWidth()) + marginEnd) - v.this.f20972a.getWidth();
        }

        private int w() {
            int top = v.this.f20977f.getTop() + (v.this.f20977f.getHeight() / 2);
            v vVar = v.this;
            return (vVar.X(vVar.f20990s) + (v.this.f20990s.getHeight() / 2)) - top;
        }

        private Animator x(boolean z10) {
            return C(z10, v.this.f20976e, v(v.this.f20976e), w());
        }

        private Animator y(boolean z10) {
            Rect rectP = v.this.f20988q.p();
            Rect rectO = v.this.f20988q.o();
            if (rectP == null) {
                rectP = com.google.android.material.internal.c0.c(v.this.f20972a);
            }
            if (rectO == null) {
                rectO = com.google.android.material.internal.c0.b(v.this.f20975d, v.this.f20990s);
            }
            final Rect rect = new Rect(rectO);
            final float cornerSize = v.this.f20990s.getCornerSize();
            final float[] fArrF = F(v.this.f20975d.getCornerRadii(), v.this.f20988q.n());
            ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new com.google.android.material.internal.t(rect), rectO, rectP);
            valueAnimatorOfObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.b0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v.g.i(this.f20945a, cornerSize, fArrF, rect, valueAnimator);
                }
            });
            valueAnimatorOfObject.setDuration(z10 ? 300L : 250L);
            valueAnimatorOfObject.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
            return valueAnimatorOfObject;
        }

        private Animator z(boolean z10) {
            TimeInterpolator timeInterpolator = z10 ? tb.b.f53275a : tb.b.f53276b;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(z10 ? 300L : 250L);
            valueAnimatorOfFloat.setStartDelay(z10 ? 100L : 0L);
            valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.u.a(z10, timeInterpolator));
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.e(v.this.f20973b));
            return valueAnimatorOfFloat;
        }

        @Override // com.google.android.material.search.v.e
        public void a(boolean z10) {
            v.this.d0(z10 ? 1.0f : 0.0f);
            v.this.f20982k.setAlpha(1.0f);
            if (v.this.f20990s != null) {
                v.this.f20990s.getTextView().setAlpha(1.0f);
            }
            v.this.f20982k.setClipBounds(null);
            v.this.f20975d.a();
            if (z10) {
                return;
            }
            v.this.f20988q.j();
        }

        @Override // com.google.android.material.search.v.e
        public void b() {
            o(false).start();
        }

        @Override // com.google.android.material.search.v.e
        public void c() {
            Menu menu = v.this.f20979h.getMenu();
            if (menu != null) {
                menu.clear();
            }
            if (!v.this.h0()) {
                v.this.f20979h.setVisibility(8);
                return;
            }
            v.this.f20979h.x(v.this.f20990s.getMenuResId());
            v vVar = v.this;
            vVar.f0(vVar.f20979h);
            v.this.f20979h.setVisibility(0);
        }

        @Override // com.google.android.material.search.v.e
        public void d(boolean z10) {
            v.this.d0(z10 ? 0.0f : 1.0f);
        }

        @Override // com.google.android.material.search.v.e
        public AnimatorSet e(boolean z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            if (v.this.f20989r == null) {
                animatorSet.playTogether(o(z10));
            }
            animatorSet.playTogether(z(z10), y(z10), v.this.Q(z10), q(z10), x(z10), t(z10), n(z10), u(z10), A(z10), B(z10));
            return animatorSet;
        }

        @Override // com.google.android.material.search.v.e
        public List f(boolean z10) {
            return new ArrayList();
        }

        /* synthetic */ g(v vVar, a aVar) {
            this();
        }
    }

    v(Context context, SearchView searchView, boolean z10) {
        this.f20991t = context;
        this.f20972a = searchView;
        this.f20973b = searchView.f20901a;
        this.f20974c = searchView.f20903c;
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = searchView.f20902b;
        this.f20975d = clippableRoundedCornerLayout;
        this.f20976e = searchView.f20905e;
        this.f20977f = searchView.f20906f;
        this.f20978g = searchView.f20907g;
        this.f20979h = searchView.f20908h;
        this.f20980i = searchView.f20909i;
        this.f20981j = searchView.f20910j;
        this.f20982k = searchView.f20912l;
        this.f20983l = searchView.f20913m;
        this.f20984m = searchView.f20914n;
        this.f20985n = searchView.f20915o;
        this.f20988q = new gc.h(clippableRoundedCornerLayout);
        int i10 = sb.c.X;
        TimeInterpolator timeInterpolator = f20971z;
        this.f20993v = gc.j.g(context, i10, timeInterpolator);
        this.f20994w = gc.j.g(context, sb.c.Y, timeInterpolator);
        this.f20995x = gc.j.f(context, sb.c.O, 100);
        this.f20996y = gc.j.f(context, sb.c.P, 100);
        this.f20992u = z10 ? new f() : new g(this, null);
    }

    private void H(AnimatorSet animatorSet, final ImageButton imageButton) {
        SearchBar searchBar = this.f20990s;
        if (searchBar == null || searchBar.getNavigationIcon() != null) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.r
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                imageButton.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        animatorSet.playTogether(valueAnimatorOfFloat);
    }

    private void I(AnimatorSet animatorSet) {
        ImageButton imageButtonD = com.google.android.material.internal.a0.d(this.f20978g);
        if (imageButtonD == null) {
            return;
        }
        Drawable drawableQ = f0.a.q(imageButtonD.getDrawable());
        if (!this.f20972a.t()) {
            e0(drawableQ);
            return;
        }
        J(animatorSet, drawableQ);
        K(animatorSet, drawableQ);
        H(animatorSet, imageButtonD);
    }

    private void J(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof j.b) {
            final j.b bVar = (j.b) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.p
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bVar.setProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private void K(AnimatorSet animatorSet, Drawable drawable) {
        if (drawable instanceof com.google.android.material.internal.f) {
            final com.google.android.material.internal.f fVar = (com.google.android.material.internal.f) drawable;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.q
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    fVar.a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            animatorSet.playTogether(valueAnimatorOfFloat);
        }
    }

    private AnimatorSet P(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        I(animatorSet);
        animatorSet.setDuration(z10 ? 300L : 250L);
        animatorSet.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Animator Q(boolean z10) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(z10 ? 50L : 42L);
        valueAnimatorOfFloat.setStartDelay(z10 ? 250L : 0L);
        valueAnimatorOfFloat.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53275a));
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.e(this.f20983l));
        return valueAnimatorOfFloat;
    }

    private AnimatorSet R(boolean z10) {
        AnimatorSet animatorSetE = this.f20992u.e(z10);
        if (this.f20989r == null) {
            animatorSetE.playTogether(P(z10));
        }
        return animatorSetE;
    }

    private List S(boolean z10) {
        return this.f20992u.f(z10);
    }

    private AnimatorSet T(boolean z10) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(V());
        I(animatorSet);
        animatorSet.setInterpolator(com.google.android.material.internal.u.a(z10, tb.b.f53276b));
        animatorSet.setDuration(z10 ? 350L : 300L);
        return animatorSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int U(View view, View view2) {
        if (view != null) {
            return W(view) - W(view2);
        }
        int marginStart = ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).getMarginStart();
        int paddingStart = this.f20990s.getPaddingStart();
        int iW = W(this.f20990s);
        return com.google.android.material.internal.c0.m(this.f20990s) ? (((iW + this.f20990s.getWidth()) + marginStart) - paddingStart) - this.f20972a.getRight() : (iW - marginStart) + paddingStart;
    }

    private Animator V() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f20975d.getHeight(), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.l(this.f20975d));
        return valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int W(View view) {
        int left = view.getLeft();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f20972a.getParent(); parent = parent.getParent()) {
            left += ((View) parent).getLeft();
        }
        return left;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int X(View view) {
        int top = view.getTop();
        for (ViewParent parent = view.getParent(); (parent instanceof View) && parent != this.f20972a.getParent(); parent = parent.getParent()) {
            top += ((View) parent).getTop();
        }
        return top;
    }

    private boolean Y(Menu menu) {
        if (menu == null) {
            return false;
        }
        for (int i10 = 0; i10 < menu.size(); i10++) {
            if (menu.getItem(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void a(v vVar) {
        ClippableRoundedCornerLayout clippableRoundedCornerLayout = vVar.f20975d;
        clippableRoundedCornerLayout.setTranslationY(clippableRoundedCornerLayout.getHeight());
        AnimatorSet animatorSetT = vVar.T(true);
        animatorSetT.addListener(vVar.new c(animatorSetT));
        animatorSetT.start();
        vVar.f20987p = animatorSetT;
    }

    private void b0(float f10) {
        ActionMenuView actionMenuViewA;
        if (!this.f20972a.v() || (actionMenuViewA = com.google.android.material.internal.a0.a(this.f20978g)) == null) {
            return;
        }
        actionMenuViewA.setAlpha(f10);
    }

    public static /* synthetic */ void c(v vVar) {
        vVar.getClass();
        tb.a aVar = new tb.a();
        aVar.b(vVar.R(true));
        Iterator it = vVar.S(true).iterator();
        while (it.hasNext()) {
            aVar.c((f1.h) it.next());
        }
        aVar.d(vVar.new a(true, aVar));
        aVar.h();
        vVar.f20986o = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(float f10) {
        this.f20974c.getBackground().mutate().setAlpha((int) (f10 * 255.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0(float f10) {
        this.f20983l.setAlpha(f10);
        this.f20984m.setAlpha(f10);
        this.f20985n.setAlpha(f10);
        b0(f10);
    }

    private void e0(Drawable drawable) {
        if (drawable instanceof j.b) {
            ((j.b) drawable).setProgress(1.0f);
        }
        if (drawable instanceof com.google.android.material.internal.f) {
            ((com.google.android.material.internal.f) drawable).a(1.0f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(Toolbar toolbar) {
        ActionMenuView actionMenuViewA = com.google.android.material.internal.a0.a(toolbar);
        if (actionMenuViewA != null) {
            for (int i10 = 0; i10 < actionMenuViewA.getChildCount(); i10++) {
                View childAt = actionMenuViewA.getChildAt(i10);
                childAt.setClickable(false);
                childAt.setFocusable(false);
                childAt.setFocusableInTouchMode(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean h0() {
        return this.f20990s.getMenuResId() != -1 && this.f20972a.v() && Y(this.f20990s.getMenu());
    }

    private AnimatorSet k0() {
        if (this.f20972a.s()) {
            this.f20982k.clearFocus();
        }
        tb.a aVar = new tb.a();
        AnimatorSet animatorSetR = R(false);
        aVar.b(animatorSetR);
        Iterator it = S(false).iterator();
        while (it.hasNext()) {
            aVar.c((f1.h) it.next());
        }
        aVar.d(new b(false, aVar));
        aVar.h();
        this.f20986o = aVar;
        return animatorSetR;
    }

    private AnimatorSet l0() {
        if (this.f20972a.s()) {
            this.f20982k.clearFocus();
        }
        AnimatorSet animatorSetT = T(false);
        animatorSetT.addListener(new d(animatorSetT));
        animatorSetT.start();
        this.f20987p = animatorSetT;
        return animatorSetT;
    }

    private void m0() {
        if (this.f20972a.s()) {
            this.f20972a.A();
        }
        this.f20972a.setTransitionState(SearchView.d.SHOWING);
        this.f20992u.c();
        this.f20982k.setText(this.f20990s.getText());
        EditText editText = this.f20982k;
        editText.setSelection(editText.getText().length());
        this.f20975d.setVisibility(4);
        this.f20975d.post(new Runnable() { // from class: com.google.android.material.search.s
            @Override // java.lang.Runnable
            public final void run() {
                v.c(this.f20968a);
            }
        });
    }

    private void n0() {
        if (this.f20972a.s()) {
            final SearchView searchView = this.f20972a;
            Objects.requireNonNull(searchView);
            searchView.postDelayed(new Runnable() { // from class: com.google.android.material.search.t
                @Override // java.lang.Runnable
                public final void run() {
                    searchView.A();
                }
            }, 150L);
        }
        this.f20975d.setVisibility(4);
        this.f20975d.post(new Runnable() { // from class: com.google.android.material.search.u
            @Override // java.lang.Runnable
            public final void run() {
                v.a(this.f20970a);
            }
        });
    }

    public void L() {
        this.f20988q.i(this.f20990s);
        AnimatorSet animatorSet = this.f20989r;
        if (animatorSet != null) {
            animatorSet.reverse();
        }
        this.f20989r = null;
    }

    void M() {
        tb.a aVar = this.f20986o;
        if (aVar != null) {
            aVar.e();
            this.f20986o = null;
        }
        AnimatorSet animatorSet = this.f20987p;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f20987p = null;
        }
    }

    public void N() {
        this.f20988q.m(Z().getTotalDuration(), this.f20990s);
        if (this.f20989r != null) {
            this.f20992u.b();
            this.f20989r.resume();
        }
        this.f20989r = null;
    }

    gc.h O() {
        return this.f20988q;
    }

    AnimatorSet Z() {
        M();
        return this.f20990s != null ? k0() : l0();
    }

    public androidx.activity.b a0() {
        return this.f20988q.c();
    }

    void g0(SearchBar searchBar) {
        this.f20990s = searchBar;
    }

    void i0() {
        M();
        if (this.f20990s != null) {
            m0();
        } else {
            n0();
        }
    }

    void j0(androidx.activity.b bVar) {
        this.f20988q.v(bVar, this.f20990s);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void o0(androidx.activity.b bVar) {
        if (bVar.a() <= 0.0f) {
            return;
        }
        gc.h hVar = this.f20988q;
        SearchBar searchBar = this.f20990s;
        hVar.x(bVar, searchBar, searchBar.getCornerSize());
        AnimatorSet animatorSet = this.f20989r;
        if (animatorSet != null) {
            animatorSet.setCurrentPlayTime((long) (bVar.a() * this.f20989r.getDuration()));
            return;
        }
        if (this.f20972a.s()) {
            this.f20982k.clearFocus();
        }
        if (this.f20972a.t()) {
            AnimatorSet animatorSetP = P(false);
            this.f20989r = animatorSetP;
            animatorSetP.start();
            this.f20989r.pause();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f implements e {

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a extends f1.f {
            a(String str) {
                super(str);
            }

            @Override // f1.f
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public float a(View view) {
                return view.getWidth();
            }

            @Override // f1.f
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public void b(View view, float f10) {
                f.this.N(view, (int) f10);
            }
        }

        f() {
        }

        private View A() {
            ViewParent parent = v.this.f20990s.getParent();
            if (parent instanceof Toolbar) {
                return com.google.android.material.internal.a0.a((Toolbar) parent);
            }
            return null;
        }

        private Animator B(boolean z10) {
            ValueAnimator valueAnimatorL = l(z10);
            valueAnimatorL.setDuration(v.this.f20996y);
            valueAnimatorL.setInterpolator(z10 ? v.this.f20994w : v.this.f20993v);
            valueAnimatorL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.x
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v.this.f20978g.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            return valueAnimatorL;
        }

        private f1.h C(boolean z10) {
            int iH = H();
            int i10 = z10 ? iH : 0;
            if (z10) {
                iH = 0;
            }
            return x(v.this.f20977f, f1.e.f38181o, i10, iH);
        }

        private View D() {
            ViewParent parent = v.this.f20990s.getParent();
            if (parent instanceof Toolbar) {
                return com.google.android.material.internal.a0.d((Toolbar) parent);
            }
            return null;
        }

        private int E(Toolbar toolbar) {
            v vVar = v.this;
            int iW = vVar.W(vVar.f20990s);
            int paddingStart = v.this.f20977f.getPaddingStart();
            int marginStart = ((ViewGroup.MarginLayoutParams) toolbar.getLayoutParams()).getMarginStart();
            return com.google.android.material.internal.c0.m(v.this.f20990s) ? (iW + v.this.f20990s.getWidth()) - ((v.this.f20977f.getWidth() - paddingStart) - marginStart) : (iW - paddingStart) - marginStart;
        }

        private f1.h F(boolean z10) {
            return G(z10, v.this.f20978g);
        }

        private f1.h G(boolean z10, Toolbar toolbar) {
            int iE = E(toolbar);
            int i10 = z10 ? iE : 0;
            if (z10) {
                iE = 0;
            }
            return x(toolbar, f1.e.f38180n, i10, iE);
        }

        private int H() {
            v vVar = v.this;
            int iX = vVar.X(vVar.f20990s);
            v vVar2 = v.this;
            return iX - vVar2.X(vVar2.f20978g);
        }

        private int I() {
            int width = v.this.f20977f.getWidth();
            int paddingStart = v.this.f20977f.getPaddingStart() + v.this.f20977f.getPaddingEnd();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.this.f20978g.getLayoutParams();
            return (width - paddingStart) - (marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd());
        }

        private f1.h J(boolean z10) {
            return K(z10, v.this.f20978g);
        }

        private f1.h K(final boolean z10, final Toolbar toolbar) {
            int width = v.this.f20990s.getWidth();
            int I = I();
            int i10 = z10 ? width : I;
            if (z10) {
                width = I;
            }
            f1.h hVarX = x(toolbar, L(), i10, width);
            hVarX.b(new f1.e.p() { // from class: com.google.android.material.search.w
                @Override // f1.e.p
                public final void a(f1.e eVar, boolean z11, float f10, float f11) {
                    v.f.h(this.f21010a, z10, toolbar, eVar, z11, f10, f11);
                }
            });
            return hVarX;
        }

        private f1.f L() {
            return new a("width");
        }

        private void M() {
            TextView textView = v.this.f20990s.getTextView();
            v.this.f20981j.setText(textView.getText());
            v.this.f20981j.setHint(textView.getHint());
            v.this.f20981j.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void N(View view, int i10) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i10;
            view.setLayoutParams(layoutParams);
        }

        public static /* synthetic */ void h(f fVar, boolean z10, Toolbar toolbar, f1.e eVar, boolean z11, float f10, float f11) {
            if (z10) {
                fVar.N(toolbar, -1);
            } else {
                fVar.getClass();
            }
        }

        private ValueAnimator l(boolean z10) {
            return z10 ? ValueAnimator.ofFloat(0.0f, 1.0f) : ValueAnimator.ofFloat(1.0f, 0.0f);
        }

        private Animator m(boolean z10) {
            ValueAnimator valueAnimatorL = l(z10);
            valueAnimatorL.setDuration(v.this.f20996y);
            valueAnimatorL.setStartDelay(z10 ? 0L : v.this.f20995x);
            valueAnimatorL.setInterpolator(z10 ? v.this.f20994w : v.this.f20993v);
            valueAnimatorL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.y
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v.this.c0(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            return valueAnimatorL;
        }

        private Animator n(boolean z10) {
            ValueAnimator valueAnimatorL = l(z10);
            valueAnimatorL.setDuration(v.this.f20996y);
            valueAnimatorL.setStartDelay(z10 ? v.this.f20995x : 0L);
            valueAnimatorL.setInterpolator(z10 ? v.this.f20993v : v.this.f20994w);
            valueAnimatorL.addUpdateListener(com.google.android.material.internal.o.e(v.this.f20985n));
            return valueAnimatorL;
        }

        private f1.h o(boolean z10) {
            return z(z10, v.this.f20981j);
        }

        private Animator p(boolean z10) {
            v vVar = v.this;
            TextView textView = z10 ? vVar.f20990s.getTextView() : vVar.f20982k;
            v vVar2 = v.this;
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(textView.getWidth(), (z10 ? vVar2.f20982k : vVar2.f20990s.getTextView()).getWidth());
            valueAnimatorOfInt.setDuration(v.this.f20996y);
            valueAnimatorOfInt.setInterpolator(z10 ? v.this.f20994w : v.this.f20993v);
            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.search.z
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v.f fVar = this.f21015a;
                    fVar.N(v.this.f20981j, ((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            return valueAnimatorOfInt;
        }

        private f1.h q(boolean z10) {
            return G(z10, v.this.f20979h);
        }

        private f1.h r(boolean z10) {
            return K(z10, v.this.f20979h);
        }

        private f1.h s(boolean z10) {
            return z(z10, v.this.f20982k);
        }

        private Animator u(boolean z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            AppBarLayout appBarLayoutParentIfExists = v.this.f20990s.getAppBarLayoutParentIfExists();
            if (v.this.f20990s != null && appBarLayoutParentIfExists != null) {
                View viewY = y(appBarLayoutParentIfExists);
                View viewT = t(appBarLayoutParentIfExists);
                boolean zM = com.google.android.material.internal.c0.m(v.this.f20990s);
                int width = appBarLayoutParentIfExists.getWidth();
                if (viewY != null) {
                    Rect rectB = com.google.android.material.internal.c0.b(appBarLayoutParentIfExists, viewY);
                    animatorSet.playTogether(w(viewY, z10, zM ? width - rectB.left : -rectB.right));
                    animatorSet.playTogether(v(viewY, z10));
                }
                if (viewT != null) {
                    Rect rectB2 = com.google.android.material.internal.c0.b(appBarLayoutParentIfExists, viewT);
                    animatorSet.playTogether(w(viewT, z10, zM ? -rectB2.right : width - rectB2.left));
                    animatorSet.playTogether(v(viewT, z10));
                }
                animatorSet.setDuration(v.this.f20996y);
                animatorSet.setInterpolator(tb.b.f53275a);
            }
            return animatorSet;
        }

        private Animator v(View view, boolean z10) {
            ValueAnimator valueAnimatorL = l(!z10);
            valueAnimatorL.addUpdateListener(com.google.android.material.internal.o.e(view));
            return valueAnimatorL;
        }

        private Animator w(View view, boolean z10, float f10) {
            float f11 = z10 ? 0.0f : f10;
            if (!z10) {
                f10 = 0.0f;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f11, f10);
            valueAnimatorOfFloat.addUpdateListener(com.google.android.material.internal.o.k(view));
            return valueAnimatorOfFloat;
        }

        private f1.h x(View view, f1.f fVar, float f10, float f11) {
            f1.h hVar = new f1.h(view, fVar);
            hVar.x(gc.j.h(v.this.f20991t, sb.c.f51597a0, sb.l.f51857b));
            hVar.n(f10);
            hVar.u().g(f11);
            return hVar;
        }

        private f1.h z(boolean z10, View view) {
            TextView placeholderTextView = v.this.f20990s.getPlaceholderTextView();
            if (TextUtils.isEmpty(placeholderTextView.getText()) || z10) {
                placeholderTextView = v.this.f20990s.getTextView();
            }
            float fU = v.this.U(placeholderTextView, view) - E(v.this.f20978g);
            if (com.google.android.material.internal.c0.m(v.this.f20990s)) {
                fU += placeholderTextView.getWidth() - view.getWidth();
            }
            float f10 = z10 ? fU : 0.0f;
            if (z10) {
                fU = 0.0f;
            }
            return x(view, f1.e.f38180n, f10, fU);
        }

        @Override // com.google.android.material.search.v.e
        public void a(boolean z10) {
            if (z10) {
                v.this.c0(1.0f);
                v.this.f20985n.setAlpha(1.0f);
            } else {
                v.this.c0(0.0f);
                v.this.f20985n.setAlpha(0.0f);
                v.this.f20990s.setVisibility(0);
            }
            v.this.f20979h.setVisibility(4);
            N(v.this.f20981j, -2);
        }

        @Override // com.google.android.material.search.v.e
        public void c() {
            M();
            if (v.this.f20990s.getBackground() != null && v.this.f20990s.getBackground().getConstantState() != null) {
                v.this.f20979h.setBackground(v.this.f20990s.getBackground().getConstantState().newDrawable());
            }
            Menu menu = v.this.f20979h.getMenu();
            if (menu != null) {
                menu.clear();
            }
            if (v.this.h0()) {
                v.this.f20979h.x(v.this.f20990s.getMenuResId());
                v vVar = v.this;
                vVar.f0(vVar.f20979h);
            }
        }

        @Override // com.google.android.material.search.v.e
        public void d(boolean z10) {
            if (z10) {
                v.this.c0(0.0f);
                v.this.f20978g.setAlpha(0.0f);
                v.this.f20985n.setAlpha(0.0f);
                v.this.f20990s.setVisibility(4);
            } else {
                v.this.c0(1.0f);
                v.this.f20985n.setAlpha(1.0f);
            }
            v.this.f20979h.setVisibility(0);
        }

        @Override // com.google.android.material.search.v.e
        public AnimatorSet e(boolean z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(m(z10), n(z10), B(z10), p(z10), v.this.Q(z10), u(z10));
            return animatorSet;
        }

        @Override // com.google.android.material.search.v.e
        public List f(boolean z10) {
            return Arrays.asList(J(z10), F(z10), r(z10), q(z10), C(z10), s(z10), o(z10));
        }

        View t(AppBarLayout appBarLayout) {
            int endSiblingViewId = v.this.f20990s.getEndSiblingViewId();
            return endSiblingViewId != -1 ? appBarLayout.findViewById(endSiblingViewId) : A();
        }

        View y(AppBarLayout appBarLayout) {
            int startSiblingViewId = v.this.f20990s.getStartSiblingViewId();
            return startSiblingViewId != -1 ? appBarLayout.findViewById(startSiblingViewId) : D();
        }

        @Override // com.google.android.material.search.v.e
        public void b() {
        }
    }
}
