package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import n0.a0;
import n0.q0;
import n0.w;
import n0.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SwipeRefreshLayout extends ViewGroup implements w {
    private static final String N = "SwipeRefreshLayout";
    private static final int[] O = {R.attr.enabled};
    int A;
    androidx.swiperefreshlayout.widget.b B;
    private Animation C;
    private Animation D;
    private Animation E;
    private Animation F;
    private Animation G;
    boolean H;
    private int I;
    boolean J;
    private Animation.AnimationListener K;
    private final Animation L;
    private final Animation M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private View f7255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    j f7256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f7257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f7259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f7260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a0 f7261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final x f7262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f7263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f7264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f7265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f7266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f7267m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f7268n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f7269o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f7270p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f7271q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f7272r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f7273s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DecelerateInterpolator f7274t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    androidx.swiperefreshlayout.widget.a f7275u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f7276v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f7277w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    float f7278x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected int f7279y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    int f7280z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends Animation {
        b() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends Animation {
        c() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends Animation {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f7284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f7285b;

        d(int i10, int i11) {
            this.f7284a = i10;
            this.f7285b = i11;
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            androidx.swiperefreshlayout.widget.b bVar = SwipeRefreshLayout.this.B;
            int i10 = this.f7284a;
            bVar.setAlpha((int) (i10 + ((this.f7285b - i10) * f10)));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class f extends Animation {
        f() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            int iAbs = !swipeRefreshLayout.J ? swipeRefreshLayout.f7280z - Math.abs(swipeRefreshLayout.f7279y) : swipeRefreshLayout.f7280z;
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i10 = swipeRefreshLayout2.f7277w;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i10 + ((int) ((iAbs - i10) * f10))) - swipeRefreshLayout2.f7275u.getTop());
            SwipeRefreshLayout.this.B.e(1.0f - f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g extends Animation {
        g() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.i(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class h extends Animation {
        h() {
        }

        @Override // android.view.animation.Animation
        public void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f11 = swipeRefreshLayout.f7278x;
            swipeRefreshLayout.setAnimationProgress(f11 + ((-f11) * f10));
            SwipeRefreshLayout.this.i(f10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface i {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface j {
        void a();
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7257c = false;
        this.f7259e = -1.0f;
        this.f7263i = new int[2];
        this.f7264j = new int[2];
        this.f7271q = -1;
        this.f7276v = -1;
        this.K = new a();
        this.L = new f();
        this.M = new g();
        this.f7258d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f7266l = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f7274t = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.I = (int) (displayMetrics.density * 40.0f);
        d();
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.f7280z = i10;
        this.f7259e = i10;
        this.f7261g = new a0(this);
        this.f7262h = new x(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.I;
        this.f7267m = i11;
        this.f7279y = i11;
        i(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, O);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void a(int i10, Animation.AnimationListener animationListener) {
        this.f7277w = i10;
        this.L.reset();
        this.L.setDuration(200L);
        this.L.setInterpolator(this.f7274t);
        if (animationListener != null) {
            this.f7275u.b(animationListener);
        }
        this.f7275u.clearAnimation();
        this.f7275u.startAnimation(this.L);
    }

    private void b(int i10, Animation.AnimationListener animationListener) {
        if (this.f7272r) {
            r(i10, animationListener);
            return;
        }
        this.f7277w = i10;
        this.M.reset();
        this.M.setDuration(200L);
        this.M.setInterpolator(this.f7274t);
        if (animationListener != null) {
            this.f7275u.b(animationListener);
        }
        this.f7275u.clearAnimation();
        this.f7275u.startAnimation(this.M);
    }

    private void d() {
        this.f7275u = new androidx.swiperefreshlayout.widget.a(getContext(), -328966);
        androidx.swiperefreshlayout.widget.b bVar = new androidx.swiperefreshlayout.widget.b(getContext());
        this.B = bVar;
        bVar.l(1);
        this.f7275u.setImageDrawable(this.B);
        this.f7275u.setVisibility(8);
        addView(this.f7275u);
    }

    private void e() {
        if (this.f7255a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.f7275u)) {
                    this.f7255a = childAt;
                    return;
                }
            }
        }
    }

    private void f(float f10) {
        if (f10 > this.f7259e) {
            l(true, true);
            return;
        }
        this.f7257c = false;
        this.B.j(0.0f, 0.0f);
        b(this.f7267m, !this.f7272r ? new e() : null);
        this.B.d(false);
    }

    private boolean g(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void h(float f10) {
        this.B.d(true);
        float fMin = Math.min(1.0f, Math.abs(f10 / this.f7259e));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f10) - this.f7259e;
        int i10 = this.A;
        if (i10 <= 0) {
            i10 = this.J ? this.f7280z - this.f7279y : this.f7280z;
        }
        float f11 = i10;
        double dMax = Math.max(0.0f, Math.min(fAbs, f11 * 2.0f) / f11) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i11 = this.f7279y + ((int) ((f11 * fMin) + (f11 * fPow * 2.0f)));
        if (this.f7275u.getVisibility() != 0) {
            this.f7275u.setVisibility(0);
        }
        if (!this.f7272r) {
            this.f7275u.setScaleX(1.0f);
            this.f7275u.setScaleY(1.0f);
        }
        if (this.f7272r) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f7259e));
        }
        if (f10 < this.f7259e) {
            if (this.B.getAlpha() > 76 && !g(this.E)) {
                p();
            }
        } else if (this.B.getAlpha() < 255 && !g(this.F)) {
            o();
        }
        this.B.j(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.B.e(Math.min(1.0f, fMax));
        this.B.g((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i11 - this.f7267m);
    }

    private void j(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f7271q) {
            this.f7271q = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    private void l(boolean z10, boolean z11) {
        if (this.f7257c != z10) {
            this.H = z11;
            e();
            this.f7257c = z10;
            if (z10) {
                a(this.f7267m, this.K);
            } else {
                q(this.K);
            }
        }
    }

    private Animation m(int i10, int i11) {
        d dVar = new d(i10, i11);
        dVar.setDuration(300L);
        this.f7275u.b(null);
        this.f7275u.clearAnimation();
        this.f7275u.startAnimation(dVar);
        return dVar;
    }

    private void n(float f10) {
        float f11 = this.f7269o;
        float f12 = f10 - f11;
        int i10 = this.f7258d;
        if (f12 <= i10 || this.f7270p) {
            return;
        }
        this.f7268n = f11 + i10;
        this.f7270p = true;
        this.B.setAlpha(76);
    }

    private void o() {
        this.F = m(this.B.getAlpha(), 255);
    }

    private void p() {
        this.E = m(this.B.getAlpha(), 76);
    }

    private void r(int i10, Animation.AnimationListener animationListener) {
        this.f7277w = i10;
        this.f7278x = this.f7275u.getScaleX();
        h hVar = new h();
        this.G = hVar;
        hVar.setDuration(150L);
        if (animationListener != null) {
            this.f7275u.b(animationListener);
        }
        this.f7275u.clearAnimation();
        this.f7275u.startAnimation(this.G);
    }

    private void s(Animation.AnimationListener animationListener) {
        this.f7275u.setVisibility(0);
        this.B.setAlpha(255);
        b bVar = new b();
        this.C = bVar;
        bVar.setDuration(this.f7266l);
        if (animationListener != null) {
            this.f7275u.b(animationListener);
        }
        this.f7275u.clearAnimation();
        this.f7275u.startAnimation(this.C);
    }

    private void setColorViewAlpha(int i10) {
        this.f7275u.getBackground().setAlpha(i10);
        this.B.setAlpha(i10);
    }

    public boolean c() {
        View view = this.f7255a;
        return view instanceof ListView ? androidx.core.widget.g.a((ListView) view, -1) : view.canScrollVertically(-1);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f7262h.a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f7262h.b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f7262h.c(i10, i11, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f7262h.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.f7276v;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        return i11 >= i12 ? i11 + 1 : i11;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f7261g.a();
    }

    public int getProgressCircleDiameter() {
        return this.I;
    }

    public int getProgressViewEndOffset() {
        return this.f7280z;
    }

    public int getProgressViewStartOffset() {
        return this.f7279y;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f7262h.j();
    }

    void i(float f10) {
        int i10 = this.f7277w;
        setTargetOffsetTopAndBottom((i10 + ((int) ((this.f7279y - i10) * f10))) - this.f7275u.getTop());
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f7262h.l();
    }

    void k() {
        this.f7275u.clearAnimation();
        this.B.stop();
        this.f7275u.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f7272r) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f7279y - this.f7267m);
        }
        this.f7267m = this.f7275u.getTop();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        e();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7273s && actionMasked == 0) {
            this.f7273s = false;
        }
        if (!isEnabled() || this.f7273s || c() || this.f7257c || this.f7265k) {
            return false;
        }
        if (actionMasked == 0) {
            setTargetOffsetTopAndBottom(this.f7279y - this.f7275u.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f7271q = pointerId;
            this.f7270p = false;
            int iFindPointerIndex = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex < 0) {
                return false;
            }
            this.f7269o = motionEvent.getY(iFindPointerIndex);
        } else if (actionMasked == 1) {
            this.f7270p = false;
            this.f7271q = -1;
        } else if (actionMasked == 2) {
            int i10 = this.f7271q;
            if (i10 == -1) {
                Log.e(N, "Got ACTION_MOVE event but don't have an active pointer id.");
                return false;
            }
            int iFindPointerIndex2 = motionEvent.findPointerIndex(i10);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            n(motionEvent.getY(iFindPointerIndex2));
        } else if (actionMasked == 3) {
            this.f7270p = false;
            this.f7271q = -1;
        } else if (actionMasked == 6) {
            j(motionEvent);
        }
        return this.f7270p;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f7255a == null) {
            e();
        }
        View view = this.f7255a;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f7275u.getMeasuredWidth();
        int measuredHeight2 = this.f7275u.getMeasuredHeight();
        int i14 = measuredWidth / 2;
        int i15 = measuredWidth2 / 2;
        int i16 = this.f7267m;
        this.f7275u.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f7255a == null) {
            e();
        }
        View view = this.f7255a;
        if (view == null) {
            return;
        }
        view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f7275u.measure(View.MeasureSpec.makeMeasureSpec(this.I, 1073741824), View.MeasureSpec.makeMeasureSpec(this.I, 1073741824));
        this.f7276v = -1;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            if (getChildAt(i12) == this.f7275u) {
                this.f7276v = i12;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f7260f;
            if (f10 > 0.0f) {
                float f11 = i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f7260f = 0.0f;
                } else {
                    this.f7260f = f10 - f11;
                    iArr[1] = i11;
                }
                h(this.f7260f);
            }
        }
        if (this.J && i11 > 0 && this.f7260f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.f7275u.setVisibility(8);
        }
        int[] iArr2 = this.f7263i;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f7264j);
        int i14 = i13 + this.f7264j[1];
        if (i14 >= 0 || c()) {
            return;
        }
        float fAbs = this.f7260f + Math.abs(i14);
        this.f7260f = fAbs;
        h(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f7261g.b(view, view2, i10);
        startNestedScroll(i10 & 2);
        this.f7260f = 0.0f;
        this.f7265k = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return (!isEnabled() || this.f7273s || this.f7257c || (i10 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f7261g.d(view);
        this.f7265k = false;
        float f10 = this.f7260f;
        if (f10 > 0.0f) {
            f(f10);
            this.f7260f = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f7273s && actionMasked == 0) {
            this.f7273s = false;
        }
        if (!isEnabled() || this.f7273s || c() || this.f7257c || this.f7265k) {
            return false;
        }
        if (actionMasked == 0) {
            this.f7271q = motionEvent.getPointerId(0);
            this.f7270p = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f7271q);
                if (iFindPointerIndex < 0) {
                    Log.e(N, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f7270p) {
                    float y10 = (motionEvent.getY(iFindPointerIndex) - this.f7268n) * 0.5f;
                    this.f7270p = false;
                    f(y10);
                }
                this.f7271q = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.f7271q);
                if (iFindPointerIndex2 < 0) {
                    Log.e(N, "Got ACTION_MOVE event but have an invalid active pointer id.");
                    return false;
                }
                float y11 = motionEvent.getY(iFindPointerIndex2);
                n(y11);
                if (this.f7270p) {
                    float f10 = (y11 - this.f7268n) * 0.5f;
                    if (f10 <= 0.0f) {
                        return false;
                    }
                    h(f10);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        Log.e(N, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                        return false;
                    }
                    this.f7271q = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    j(motionEvent);
                }
            }
        }
        return true;
    }

    void q(Animation.AnimationListener animationListener) {
        c cVar = new c();
        this.D = cVar;
        cVar.setDuration(150L);
        this.f7275u.b(animationListener);
        this.f7275u.clearAnimation();
        this.f7275u.startAnimation(this.D);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f7255a;
        if (view == null || q0.U(view)) {
            super.requestDisallowInterceptTouchEvent(z10);
        }
    }

    void setAnimationProgress(float f10) {
        this.f7275u.setScaleX(f10);
        this.f7275u.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        e();
        this.B.f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = androidx.core.content.a.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f7259e = i10;
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (z10) {
            return;
        }
        k();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        this.f7262h.m(z10);
    }

    public void setOnRefreshListener(j jVar) {
        this.f7256b = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.f7275u.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(androidx.core.content.a.getColor(getContext(), i10));
    }

    public void setRefreshing(boolean z10) {
        if (!z10 || this.f7257c == z10) {
            l(z10, false);
            return;
        }
        this.f7257c = z10;
        setTargetOffsetTopAndBottom((!this.J ? this.f7280z + this.f7279y : this.f7280z) - this.f7267m);
        this.H = false;
        s(this.K);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.I = (int) (displayMetrics.density * 56.0f);
            } else {
                this.I = (int) (displayMetrics.density * 40.0f);
            }
            this.f7275u.setImageDrawable(null);
            this.B.l(i10);
            this.f7275u.setImageDrawable(this.B);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.A = i10;
    }

    void setTargetOffsetTopAndBottom(int i10) {
        this.f7275u.bringToFront();
        q0.Y(this.f7275u, i10);
        this.f7267m = this.f7275u.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return this.f7262h.o(i10);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f7262h.q();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f7257c) {
                swipeRefreshLayout.k();
                return;
            }
            swipeRefreshLayout.B.setAlpha(255);
            SwipeRefreshLayout.this.B.start();
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            if (swipeRefreshLayout2.H && (jVar = swipeRefreshLayout2.f7256b) != null) {
                jVar.a();
            }
            SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
            swipeRefreshLayout3.f7267m = swipeRefreshLayout3.f7275u.getTop();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class e implements Animation.AnimationListener {
        e() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f7272r) {
                return;
            }
            swipeRefreshLayout.q(null);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    public void setOnChildScrollUpCallback(i iVar) {
    }
}
