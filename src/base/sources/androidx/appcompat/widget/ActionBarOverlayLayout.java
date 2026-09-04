package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import n0.k1;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements s, n0.y, n0.z {
    static final int[] G = {h.a.f39849b, R.attr.windowContentOverlay};
    private static final k1 H = new k1.a().d(e0.b.c(0, 1, 0, 1)).a();
    private static final Rect I = new Rect();
    ViewPropertyAnimator A;
    final AnimatorListenerAdapter B;
    private final Runnable C;
    private final Runnable D;
    private final n0.a0 E;
    private final f F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f1176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f1177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f1178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f1179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f1180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f1181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f1182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f1183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f1184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f1186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f1187m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f1188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f1189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Rect f1190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Rect f1191q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f1192r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f1193s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f1194t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private k1 f1195u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private k1 f1196v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private k1 f1197w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private k1 f1198x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f1199y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private OverScroller f1200z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1184j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = null;
            actionBarOverlayLayout.f1184j = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1178d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.A = actionBarOverlayLayout.f1178d.animate().translationY(-ActionBarOverlayLayout.this.f1178d.getHeight()).setListener(ActionBarOverlayLayout.this.B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface d {
        void a();

        void b();

        void c(boolean z10);

        void d();

        void e();

        void onWindowVisibilityChanged(int i10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1176b = 0;
        this.f1187m = new Rect();
        this.f1188n = new Rect();
        this.f1189o = new Rect();
        this.f1190p = new Rect();
        this.f1191q = new Rect();
        this.f1192r = new Rect();
        this.f1193s = new Rect();
        this.f1194t = new Rect();
        k1 k1Var = k1.f46650b;
        this.f1195u = k1Var;
        this.f1196v = k1Var;
        this.f1197w = k1Var;
        this.f1198x = k1Var;
        this.B = new a();
        this.C = new b();
        this.D = new c();
        w(context);
        this.E = new n0.a0(this);
        f fVar = new f(context);
        this.F = fVar;
        addView(fVar);
    }

    private void B() {
        v();
        this.C.run();
    }

    private boolean C(float f10) {
        this.f1200z.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f1200z.getFinalY() > this.f1178d.getHeight();
    }

    private void p() {
        v();
        this.D.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private boolean q(View view, Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    private boolean r() {
        n0.q0.h(this.F, H, this.f1190p);
        return !this.f1190p.equals(I);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private t u(View view) {
        if (view instanceof t) {
            return (t) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(G);
        this.f1175a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f1180f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f1200z = new OverScroller(context);
    }

    private void y() {
        v();
        postDelayed(this.D, 600L);
    }

    private void z() {
        v();
        postDelayed(this.C, 600L);
    }

    void A() {
        if (this.f1177c == null) {
            this.f1177c = (ContentFrameLayout) findViewById(h.f.f39923b);
            this.f1178d = (ActionBarContainer) findViewById(h.f.f39924c);
            this.f1179e = u(findViewById(h.f.f39922a));
        }
    }

    @Override // androidx.appcompat.widget.s
    public boolean a() {
        A();
        return this.f1179e.a();
    }

    @Override // androidx.appcompat.widget.s
    public boolean b() {
        A();
        return this.f1179e.b();
    }

    @Override // androidx.appcompat.widget.s
    public boolean c() {
        A();
        return this.f1179e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.s
    public void d(Menu menu, androidx.appcompat.view.menu.j.a aVar) {
        A();
        this.f1179e.d(menu, aVar);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f1180f != null) {
            int bottom = this.f1178d.getVisibility() == 0 ? (int) (this.f1178d.getBottom() + this.f1178d.getTranslationY() + 0.5f) : 0;
            this.f1180f.setBounds(0, bottom, getWidth(), this.f1180f.getIntrinsicHeight() + bottom);
            this.f1180f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.s
    public boolean e() {
        A();
        return this.f1179e.e();
    }

    @Override // androidx.appcompat.widget.s
    public void f() {
        A();
        this.f1179e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.s
    public boolean g() {
        A();
        return this.f1179e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f1178d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f1179e.getTitle();
    }

    @Override // androidx.appcompat.widget.s
    public void h(int i10) {
        A();
        if (i10 == 2) {
            this.f1179e.p();
        } else if (i10 == 5) {
            this.f1179e.y();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // n0.y
    public void i(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // n0.y
    public void j(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // n0.y
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.s
    public void l() {
        A();
        this.f1179e.r();
    }

    @Override // n0.z
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        n(view, i10, i11, i12, i13, i14);
    }

    @Override // n0.y
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // n0.y
    public boolean o(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        k1 k1VarF = k1.F(windowInsets, this);
        boolean zQ = q(this.f1178d, new Rect(k1VarF.l(), k1VarF.n(), k1VarF.m(), k1VarF.k()), true, true, false, true);
        n0.q0.h(this, k1VarF, this.f1187m);
        Rect rect = this.f1187m;
        k1 k1VarQ = k1VarF.q(rect.left, rect.top, rect.right, rect.bottom);
        this.f1195u = k1VarQ;
        boolean z10 = true;
        if (!this.f1196v.equals(k1VarQ)) {
            this.f1196v = this.f1195u;
            zQ = true;
        }
        if (this.f1188n.equals(this.f1187m)) {
            z10 = zQ;
        } else {
            this.f1188n.set(this.f1187m);
        }
        if (z10) {
            requestLayout();
        }
        return k1VarF.a().c().b().D();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        n0.q0.j0(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f1178d, i10, 0, i11, 0);
        e eVar = (e) this.f1178d.getLayoutParams();
        int iMax = Math.max(0, this.f1178d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f1178d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f1178d.getMeasuredState());
        boolean z10 = (n0.q0.N(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f1175a;
            if (this.f1182h && this.f1178d.getTabContainer() != null) {
                measuredHeight += this.f1175a;
            }
        } else {
            measuredHeight = this.f1178d.getVisibility() != 8 ? this.f1178d.getMeasuredHeight() : 0;
        }
        this.f1189o.set(this.f1187m);
        this.f1197w = this.f1195u;
        if (this.f1181g || z10 || !r()) {
            this.f1197w = new k1.a(this.f1197w).d(e0.b.c(this.f1197w.l(), this.f1197w.n() + measuredHeight, this.f1197w.m(), this.f1197w.k())).a();
        } else {
            Rect rect = this.f1189o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f1197w = this.f1197w.q(0, measuredHeight, 0, 0);
        }
        q(this.f1177c, this.f1189o, true, true, true, true);
        if (!this.f1198x.equals(this.f1197w)) {
            k1 k1Var = this.f1197w;
            this.f1198x = k1Var;
            n0.q0.i(this.f1177c, k1Var);
        }
        measureChildWithMargins(this.f1177c, i10, 0, i11, 0);
        e eVar2 = (e) this.f1177c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f1177c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f1177c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1177c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f1183i || !z10) {
            return false;
        }
        if (C(f11)) {
            p();
        } else {
            B();
        }
        this.f1184j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f1185k + i11;
        this.f1185k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.E.b(view, view2, i10);
        this.f1185k = getActionBarHideOffset();
        v();
        d dVar = this.f1199y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f1178d.getVisibility() != 0) {
            return false;
        }
        return this.f1183i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f1183i && !this.f1184j) {
            if (this.f1185k <= this.f1178d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f1199y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        A();
        int i11 = this.f1186l ^ i10;
        this.f1186l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f1199y;
        if (dVar != null) {
            dVar.c(!z11);
            if (z10 || !z11) {
                this.f1199y.a();
            } else {
                this.f1199y.d();
            }
        }
        if ((i11 & 256) == 0 || this.f1199y == null) {
            return;
        }
        n0.q0.j0(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f1176b = i10;
        d dVar = this.f1199y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i10) {
        v();
        this.f1178d.setTranslationY(-Math.max(0, Math.min(i10, this.f1178d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f1199y = dVar;
        if (getWindowToken() != null) {
            this.f1199y.onWindowVisibilityChanged(this.f1176b);
            int i10 = this.f1186l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                n0.q0.j0(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f1182h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f1183i) {
            this.f1183i = z10;
            if (z10) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i10) {
        A();
        this.f1179e.setIcon(i10);
    }

    public void setLogo(int i10) {
        A();
        this.f1179e.t(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f1181g = z10;
    }

    @Override // androidx.appcompat.widget.s
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f1179e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.s
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f1179e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void v() {
        removeCallbacks(this.C);
        removeCallbacks(this.D);
        ViewPropertyAnimator viewPropertyAnimator = this.A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public boolean x() {
        return this.f1181g;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f1179e.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z10) {
    }

    public void setUiOptions(int i10) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }
}
