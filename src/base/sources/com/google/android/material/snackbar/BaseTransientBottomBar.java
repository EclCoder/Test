package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.c0;
import com.google.android.material.internal.d0;
import com.google.android.material.internal.z;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import java.util.List;
import n0.b0;
import n0.k1;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseTransientBottomBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f21144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f21145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f21146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewGroup f21147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f21148h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final r f21149i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.google.android.material.snackbar.a f21150j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f21151k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21152l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21155o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f21156p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f21157q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f21158r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f21159s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21160t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f21161u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f21162v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Behavior f21163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final AccessibilityManager f21164x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final TimeInterpolator f21140z = tb.b.f53276b;
    private static final TimeInterpolator A = tb.b.f53275a;
    private static final TimeInterpolator B = tb.b.f53278d;
    private static final int[] D = {sb.c.f51613i0};
    private static final String E = BaseTransientBottomBar.class.getSimpleName();
    static final Handler C = new Handler(Looper.getMainLooper(), new h());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f21153m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f21154n = new i();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    com.google.android.material.snackbar.b.InterfaceC0316b f21165y = new l();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final q f21166l = new q(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void U(BaseTransientBottomBar baseTransientBottomBar) {
            this.f21166l.c(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean J(View view) {
            return this.f21166l.a(view);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f21166l.b(coordinatorLayout, view, motionEvent);
            return super.o(coordinatorLayout, view, motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21167a;

        a(int i10) {
            this.f21167a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.N(this.f21167a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f21149i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.f21149i.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.f21149i.setScaleY(fFloatValue);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends AnimatorListenerAdapter {
        d() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.O();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f21150j.a(BaseTransientBottomBar.this.f21143c - BaseTransientBottomBar.this.f21141a, BaseTransientBottomBar.this.f21141a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements ValueAnimator.AnimatorUpdateListener {
        e() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f21149i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21173a;

        f(int i10) {
            this.f21173a = i10;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.N(this.f21173a);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.f21150j.b(0, BaseTransientBottomBar.this.f21142b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements ValueAnimator.AnimatorUpdateListener {
        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.f21149i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h implements Handler.Callback {
        h() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                ((BaseTransientBottomBar) message.obj).V();
                return true;
            }
            if (i10 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).H(message.arg1);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class i implements Runnable {
        i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.f21149i == null || baseTransientBottomBar.f21148h == null) {
                return;
            }
            int iHeight = (d0.a(BaseTransientBottomBar.this.f21148h).height() - BaseTransientBottomBar.this.F()) + ((int) BaseTransientBottomBar.this.f21149i.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f21159s) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f21160t = baseTransientBottomBar2.f21159s;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.f21149i.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.E, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f21160t = baseTransientBottomBar3.f21159s;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f21159s - iHeight;
            BaseTransientBottomBar.this.f21149i.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class j implements b0 {
        j() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            BaseTransientBottomBar.this.f21155o = k1Var.k();
            BaseTransientBottomBar.this.f21156p = k1Var.l();
            BaseTransientBottomBar.this.f21157q = k1Var.m();
            BaseTransientBottomBar.this.b0();
            return k1Var;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class k extends n0.a {
        k() {
        }

        @Override // n0.a
        public void g(View view, o0.p pVar) {
            super.g(view, pVar);
            pVar.a(ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
            pVar.z0(true);
        }

        @Override // n0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 != 1048576) {
                return super.j(view, i10, bundle);
            }
            BaseTransientBottomBar.this.w();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class l implements com.google.android.material.snackbar.b.InterfaceC0316b {
        l() {
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0316b
        public void a(int i10) {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(1, i10, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.b.InterfaceC0316b
        public void show() {
            Handler handler = BaseTransientBottomBar.C;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class m implements Runnable {
        m() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.N(3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class n implements SwipeDismissBehavior.c {
        n() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void a(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.x(0);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.c
        public void b(int i10) {
            if (i10 == 0) {
                com.google.android.material.snackbar.b.c().k(BaseTransientBottomBar.this.f21165y);
            } else if (i10 == 1 || i10 == 2) {
                com.google.android.material.snackbar.b.c().j(BaseTransientBottomBar.this.f21165y);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class o implements Runnable {
        o() {
        }

        @Override // java.lang.Runnable
        public void run() {
            r rVar = BaseTransientBottomBar.this.f21149i;
            if (rVar == null) {
                return;
            }
            if (rVar.getParent() != null) {
                BaseTransientBottomBar.this.f21149i.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.f21149i.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.X();
            } else {
                BaseTransientBottomBar.this.Z();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class p extends AnimatorListenerAdapter {
        p() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.O();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.google.android.material.snackbar.b.InterfaceC0316b f21184a;

        public q(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.Q(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.R(0);
        }

        public boolean a(View view) {
            return view instanceof r;
        }

        public void b(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                if (coordinatorLayout.B(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                    com.google.android.material.snackbar.b.c().j(this.f21184a);
                }
            } else if (actionMasked == 1 || actionMasked == 3) {
                com.google.android.material.snackbar.b.c().k(this.f21184a);
            }
        }

        public void c(BaseTransientBottomBar baseTransientBottomBar) {
            this.f21184a = baseTransientBottomBar.f21165y;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class r extends FrameLayout {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final View.OnTouchListener f21185m = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private BaseTransientBottomBar f21186a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        mc.p f21187b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f21188c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f21189d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f21190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f21191f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f21192g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private ColorStateList f21193h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private PorterDuff.Mode f21194i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Rect f21195j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f21196k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final int f21197l;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements View.OnTouchListener {
            a() {
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        }

        protected r(Context context, AttributeSet attributeSet) {
            super(pc.a.d(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, sb.m.Ab);
            int i10 = sb.m.Hb;
            if (typedArrayObtainStyledAttributes.hasValue(i10)) {
                setElevation(typedArrayObtainStyledAttributes.getDimensionPixelSize(i10, 0));
            }
            this.f21188c = typedArrayObtainStyledAttributes.getInt(sb.m.Db, 0);
            if (typedArrayObtainStyledAttributes.hasValue(sb.m.Jb) || typedArrayObtainStyledAttributes.hasValue(sb.m.Kb)) {
                this.f21187b = mc.p.k(context2, attributeSet, 0, 0).m();
            }
            this.f21189d = typedArrayObtainStyledAttributes.getFloat(sb.m.Eb, 1.0f);
            setBackgroundTintList(jc.c.a(context2, typedArrayObtainStyledAttributes, sb.m.Fb));
            setBackgroundTintMode(c0.n(typedArrayObtainStyledAttributes.getInt(sb.m.Gb, -1), PorterDuff.Mode.SRC_IN));
            this.f21190e = typedArrayObtainStyledAttributes.getFloat(sb.m.Cb, 1.0f);
            this.f21191f = typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.Bb, -1);
            this.f21192g = typedArrayObtainStyledAttributes.getDimensionPixelSize(sb.m.Ib, -1);
            typedArrayObtainStyledAttributes.recycle();
            this.f21197l = getPaddingEnd();
            setOnTouchListener(f21185m);
            setFocusable(true);
            if (getBackground() == null) {
                setBackground(d());
            }
        }

        private Drawable d() {
            int iK = ac.a.k(this, sb.c.f51620m, sb.c.f51614j, getBackgroundOverlayColorAlpha());
            mc.p pVar = this.f21187b;
            Drawable drawableV = pVar != null ? BaseTransientBottomBar.v(iK, pVar) : BaseTransientBottomBar.u(iK, getResources());
            if (this.f21193h == null) {
                return f0.a.r(drawableV);
            }
            Drawable drawableR = f0.a.r(drawableV);
            drawableR.setTintList(this.f21193h);
            return drawableR;
        }

        private void e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f21195j = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f21186a = baseTransientBottomBar;
        }

        void c(ViewGroup viewGroup) {
            this.f21196k = true;
            viewGroup.addView(this);
            this.f21196k = false;
        }

        float getActionTextColorAlpha() {
            return this.f21190e;
        }

        int getAnimationMode() {
            return this.f21188c;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.f21189d;
        }

        int getMaxInlineActionWidth() {
            return this.f21192g;
        }

        int getMaxWidth() {
            return this.f21191f;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f21186a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.K();
            }
            requestApplyInsets();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f21186a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.L();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
            super.onLayout(z10, i10, i11, i12, i13);
            BaseTransientBottomBar baseTransientBottomBar = this.f21186a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.M();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (this.f21191f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = this.f21191f;
                if (measuredWidth > i12) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
                }
            }
        }

        void setAnimationMode(int i10) {
            this.f21188c = i10;
        }

        @Override // android.view.View
        public void setBackground(Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null && this.f21193h != null) {
                drawable = f0.a.r(drawable.mutate());
                drawable.setTintList(this.f21193h);
                drawable.setTintMode(this.f21194i);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(ColorStateList colorStateList) {
            this.f21193h = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = f0.a.r(getBackground().mutate());
                drawableR.setTintList(colorStateList);
                drawableR.setTintMode(this.f21194i);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(PorterDuff.Mode mode) {
            this.f21194i = mode;
            if (getBackground() != null) {
                Drawable drawableR = f0.a.r(getBackground().mutate());
                drawableR.setTintMode(mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (this.f21196k || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                return;
            }
            e((ViewGroup.MarginLayoutParams) layoutParams);
            BaseTransientBottomBar baseTransientBottomBar = this.f21186a;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.b0();
            }
        }

        @Override // android.view.View
        public void setOnClickListener(View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f21185m);
            super.setOnClickListener(onClickListener);
        }
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.a aVar) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (aVar == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
        }
        this.f21147g = viewGroup;
        this.f21150j = aVar;
        this.f21148h = context;
        z.a(context);
        r rVar = (r) LayoutInflater.from(context).inflate(D(), viewGroup, false);
        this.f21149i = rVar;
        rVar.setBaseTransientBottomBar(this);
        if (view instanceof SnackbarContentLayout) {
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
            snackbarContentLayout.c(rVar.getActionTextColorAlpha());
            snackbarContentLayout.setMaxInlineActionWidth(rVar.getMaxInlineActionWidth());
        }
        rVar.addView(view);
        rVar.setAccessibilityLiveRegion(1);
        rVar.setImportantForAccessibility(1);
        rVar.setFitsSystemWindows(true);
        q0.w0(rVar, new j());
        q0.m0(rVar, new k());
        this.f21164x = (AccessibilityManager) context.getSystemService("accessibility");
        int i10 = sb.c.K;
        this.f21143c = gc.j.f(context, i10, 250);
        this.f21141a = gc.j.f(context, i10, 150);
        this.f21142b = gc.j.f(context, sb.c.L, 75);
        int i11 = sb.c.U;
        this.f21144d = gc.j.g(context, i11, A);
        this.f21146f = gc.j.g(context, i11, B);
        this.f21145e = gc.j.g(context, i11, f21140z);
    }

    private ValueAnimator C(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21146f);
        valueAnimatorOfFloat.addUpdateListener(new c());
        return valueAnimatorOfFloat;
    }

    private int E() {
        int height = this.f21149i.getHeight();
        ViewGroup.LayoutParams layoutParams = this.f21149i.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        int[] iArr = new int[2];
        this.f21149i.getLocationInWindow(iArr);
        return iArr[1] + this.f21149i.getHeight();
    }

    private boolean J() {
        ViewGroup.LayoutParams layoutParams = this.f21149i.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.f) && (((CoordinatorLayout.f) layoutParams).f() instanceof SwipeDismissBehavior);
    }

    private void P() {
        this.f21158r = t();
        b0();
    }

    private void R(CoordinatorLayout.f fVar) {
        SwipeDismissBehavior swipeDismissBehaviorB = this.f21163w;
        if (swipeDismissBehaviorB == null) {
            swipeDismissBehaviorB = B();
        }
        if (swipeDismissBehaviorB instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorB).U(this);
        }
        swipeDismissBehaviorB.P(new n());
        fVar.o(swipeDismissBehaviorB);
        if (z() == null) {
            fVar.f3178g = 80;
        }
    }

    private boolean T() {
        return this.f21159s > 0 && !this.f21152l && J() && z() == null;
    }

    private void W() {
        if (S()) {
            r();
            return;
        }
        if (this.f21149i.getParent() != null) {
            this.f21149i.setVisibility(0);
        }
        O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X() {
        ValueAnimator valueAnimatorY = y(0.0f, 1.0f);
        ValueAnimator valueAnimatorC = C(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorY, valueAnimatorC);
        animatorSet.setDuration(this.f21141a);
        animatorSet.addListener(new p());
        animatorSet.start();
    }

    private void Y(int i10) {
        ValueAnimator valueAnimatorY = y(1.0f, 0.0f);
        valueAnimatorY.setDuration(this.f21142b);
        valueAnimatorY.addListener(new a(i10));
        valueAnimatorY.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        int iE = E();
        this.f21149i.setTranslationY(iE);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iE, 0);
        valueAnimator.setInterpolator(this.f21145e);
        valueAnimator.setDuration(this.f21143c);
        valueAnimator.addListener(new d());
        valueAnimator.addUpdateListener(new e());
        valueAnimator.start();
    }

    private void a0(int i10) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, E());
        valueAnimator.setInterpolator(this.f21145e);
        valueAnimator.setDuration(this.f21143c);
        valueAnimator.addListener(new f(i10));
        valueAnimator.addUpdateListener(new g());
        valueAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        ViewGroup.LayoutParams layoutParams = this.f21149i.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(E, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.f21149i.f21195j == null) {
            Log.w(E, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.f21149i.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i10 = this.f21149i.f21195j.bottom + (z() != null ? this.f21158r : this.f21155o);
        int i11 = this.f21149i.f21195j.left + this.f21156p;
        int i12 = this.f21149i.f21195j.right + this.f21157q;
        int i13 = this.f21149i.f21195j.top;
        boolean z10 = (marginLayoutParams.bottomMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.topMargin == i13) ? false : true;
        if (z10) {
            marginLayoutParams.bottomMargin = i10;
            marginLayoutParams.leftMargin = i11;
            marginLayoutParams.rightMargin = i12;
            marginLayoutParams.topMargin = i13;
            this.f21149i.requestLayout();
        }
        if ((z10 || this.f21160t != this.f21159s) && Build.VERSION.SDK_INT >= 29 && T()) {
            this.f21149i.removeCallbacks(this.f21154n);
            this.f21149i.post(this.f21154n);
        }
    }

    private void s(int i10) {
        if (this.f21149i.getAnimationMode() == 1) {
            Y(i10);
        } else {
            a0(i10);
        }
    }

    private int t() {
        if (z() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        z().getLocationOnScreen(iArr);
        int i10 = iArr[1];
        int[] iArr2 = new int[2];
        this.f21147g.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.f21147g.getHeight()) - i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable u(int i10, Resources resources) {
        float dimension = resources.getDimension(sb.e.f51699l1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i10);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mc.i v(int i10, mc.p pVar) {
        mc.i iVar = new mc.i(pVar);
        iVar.l0(ColorStateList.valueOf(i10));
        return iVar;
    }

    private ValueAnimator y(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21144d);
        valueAnimatorOfFloat.addUpdateListener(new b());
        return valueAnimatorOfFloat;
    }

    public int A() {
        return this.f21151k;
    }

    protected SwipeDismissBehavior B() {
        return new Behavior();
    }

    protected int D() {
        return G() ? sb.i.F : sb.i.f51804c;
    }

    protected boolean G() {
        TypedArray typedArrayObtainStyledAttributes = this.f21148h.obtainStyledAttributes(D);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    final void H(int i10) {
        if (S() && this.f21149i.getVisibility() == 0) {
            s(i10);
        } else {
            N(i10);
        }
    }

    public boolean I() {
        return com.google.android.material.snackbar.b.c().e(this.f21165y);
    }

    void K() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.f21149i.getRootWindowInsets()) == null) {
            return;
        }
        this.f21159s = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        b0();
    }

    void L() {
        if (I()) {
            C.post(new m());
        }
    }

    void M() {
        if (this.f21161u) {
            W();
            this.f21161u = false;
        }
    }

    void N(int i10) {
        int size;
        com.google.android.material.snackbar.b.c().h(this.f21165y);
        List list = this.f21162v;
        if (list != null && (size = list.size() - 1) >= 0) {
            android.support.v4.media.session.b.a(this.f21162v.get(size));
            throw null;
        }
        ViewParent parent = this.f21149i.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.f21149i);
        }
    }

    void O() {
        int size;
        com.google.android.material.snackbar.b.c().i(this.f21165y);
        List list = this.f21162v;
        if (list == null || (size = list.size() - 1) < 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f21162v.get(size));
        throw null;
    }

    public BaseTransientBottomBar Q(int i10) {
        this.f21151k = i10;
        return this;
    }

    boolean S() {
        AccessibilityManager accessibilityManager = this.f21164x;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    public void U() {
        com.google.android.material.snackbar.b.c().m(A(), this.f21165y);
    }

    final void V() {
        if (this.f21149i.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.f21149i.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                R((CoordinatorLayout.f) layoutParams);
            }
            this.f21149i.c(this.f21147g);
            P();
            this.f21149i.setVisibility(4);
        }
        if (this.f21149i.isLaidOut()) {
            W();
        } else {
            this.f21161u = true;
        }
    }

    void r() {
        this.f21149i.post(new o());
    }

    public void w() {
        x(3);
    }

    protected void x(int i10) {
        com.google.android.material.snackbar.b.c().b(this.f21165y, i10);
    }

    public View z() {
        return null;
    }
}
