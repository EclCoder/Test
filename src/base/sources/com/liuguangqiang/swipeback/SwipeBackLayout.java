package com.liuguangqiang.swipeback;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.viewpager.widget.ViewPager;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class SwipeBackLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f28055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f28056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v0.d f28057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f28058d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private View f28059e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f28060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f28061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f28062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f28063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f28065k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f28066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    float f28067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f28068n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f28069o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    float f28070p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    float f28071q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    float f28072r;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements View.OnTouchListener {
        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                SwipeBackLayout.this.f28067m = motionEvent.getRawY();
                SwipeBackLayout.this.f28070p = motionEvent.getRawX();
            } else if (motionEvent.getAction() == 2) {
                SwipeBackLayout.this.f28068n = motionEvent.getRawY();
                SwipeBackLayout.this.f28070p = motionEvent.getRawX();
                SwipeBackLayout swipeBackLayout = SwipeBackLayout.this;
                swipeBackLayout.f28069o = Math.abs(swipeBackLayout.f28068n - swipeBackLayout.f28067m);
                SwipeBackLayout swipeBackLayout2 = SwipeBackLayout.this;
                swipeBackLayout2.f28067m = swipeBackLayout2.f28068n;
                swipeBackLayout2.f28072r = Math.abs(swipeBackLayout2.f28071q - swipeBackLayout2.f28070p);
                SwipeBackLayout swipeBackLayout3 = SwipeBackLayout.this;
                swipeBackLayout3.f28070p = swipeBackLayout3.f28071q;
                int i10 = b.f28074a[swipeBackLayout3.f28056b.ordinal()];
                if (i10 == 1 || i10 == 2) {
                    SwipeBackLayout swipeBackLayout4 = SwipeBackLayout.this;
                    swipeBackLayout4.setEnablePullToBack(swipeBackLayout4.f28069o > swipeBackLayout4.f28072r);
                } else if (i10 == 3 || i10 == 4) {
                }
                SwipeBackLayout swipeBackLayout5 = SwipeBackLayout.this;
                swipeBackLayout5.setEnablePullToBack(swipeBackLayout5.f28069o < swipeBackLayout5.f28072r);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28074a;

        static {
            int[] iArr = new int[d.values().length];
            f28074a = iArr;
            try {
                iArr[d.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28074a[d.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28074a[d.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28074a[d.RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum c {
        EDGE,
        VERTICAL,
        HORIZONTAL
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum d {
        LEFT,
        TOP,
        RIGHT,
        BOTTOM
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class f extends v0.d.AbstractC0826d {
        private f() {
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            if (SwipeBackLayout.this.f28055a == c.HORIZONTAL) {
                if (!SwipeBackLayout.this.y() && i10 > 0) {
                    SwipeBackLayout.this.f28056b = d.LEFT;
                } else if (!SwipeBackLayout.this.x() && i10 < 0) {
                    SwipeBackLayout.this.f28056b = d.RIGHT;
                }
            }
            if (SwipeBackLayout.this.f28056b == d.LEFT && !SwipeBackLayout.this.y() && i10 > 0) {
                int paddingLeft = SwipeBackLayout.this.getPaddingLeft();
                return Math.min(Math.max(i10, paddingLeft), SwipeBackLayout.this.f28061g);
            }
            if (SwipeBackLayout.this.f28056b != d.RIGHT || SwipeBackLayout.this.x() || i10 >= 0) {
                return 0;
            }
            int i12 = -SwipeBackLayout.this.f28061g;
            return Math.min(Math.max(i10, i12), SwipeBackLayout.this.getPaddingLeft());
        }

        @Override // v0.d.AbstractC0826d
        public int b(View view, int i10, int i11) {
            if (SwipeBackLayout.this.f28055a == c.VERTICAL) {
                if (!SwipeBackLayout.this.z() && i10 > 0) {
                    SwipeBackLayout.this.f28056b = d.TOP;
                } else if (!SwipeBackLayout.this.w() && i10 < 0) {
                    SwipeBackLayout.this.f28056b = d.BOTTOM;
                }
            }
            if (SwipeBackLayout.this.f28056b == d.TOP && !SwipeBackLayout.this.z() && i10 > 0) {
                int paddingTop = SwipeBackLayout.this.getPaddingTop();
                return Math.min(Math.max(i10, paddingTop), SwipeBackLayout.this.f28060f);
            }
            if (SwipeBackLayout.this.f28056b != d.BOTTOM || SwipeBackLayout.this.w() || i10 >= 0) {
                return 0;
            }
            int i12 = -SwipeBackLayout.this.f28060f;
            return Math.min(Math.max(i10, i12), SwipeBackLayout.this.getPaddingTop());
        }

        @Override // v0.d.AbstractC0826d
        public int d(View view) {
            return SwipeBackLayout.this.f28061g;
        }

        @Override // v0.d.AbstractC0826d
        public int e(View view) {
            return SwipeBackLayout.this.f28060f;
        }

        @Override // v0.d.AbstractC0826d
        public void j(int i10) {
            if (i10 == SwipeBackLayout.this.f28062h) {
                return;
            }
            if ((SwipeBackLayout.this.f28062h == 1 || SwipeBackLayout.this.f28062h == 2) && i10 == 0 && SwipeBackLayout.this.f28063i == SwipeBackLayout.this.getDragRange()) {
                SwipeBackLayout.this.D();
            }
            SwipeBackLayout.this.f28062h = i10;
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            int i14 = b.f28074a[SwipeBackLayout.this.f28056b.ordinal()];
            if (i14 == 1 || i14 == 2) {
                SwipeBackLayout.this.f28063i = Math.abs(i11);
            } else if (i14 == 3 || i14 == 4) {
                SwipeBackLayout.this.f28063i = Math.abs(i10);
            }
            int unused = SwipeBackLayout.this.f28063i;
            float unused2 = SwipeBackLayout.this.f28065k;
            int unused3 = SwipeBackLayout.this.f28063i;
            SwipeBackLayout.this.getDragRange();
            SwipeBackLayout.h(SwipeBackLayout.this);
        }

        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            boolean z10;
            if (SwipeBackLayout.this.f28063i == 0 || SwipeBackLayout.this.f28063i == SwipeBackLayout.this.getDragRange()) {
                return;
            }
            if (SwipeBackLayout.this.f28066l && SwipeBackLayout.this.v(f10, f11)) {
                z10 = !SwipeBackLayout.this.z();
            } else if (SwipeBackLayout.this.f28063i >= SwipeBackLayout.this.f28065k) {
                z10 = true;
            } else {
                int unused = SwipeBackLayout.this.f28063i;
                float unused2 = SwipeBackLayout.this.f28065k;
                z10 = false;
            }
            int i10 = b.f28074a[SwipeBackLayout.this.f28056b.ordinal()];
            if (i10 == 1) {
                SwipeBackLayout.this.F(z10 ? SwipeBackLayout.this.f28060f : 0);
                return;
            }
            if (i10 == 2) {
                SwipeBackLayout.this.F(z10 ? -SwipeBackLayout.this.f28060f : 0);
            } else if (i10 == 3) {
                SwipeBackLayout.this.E(z10 ? SwipeBackLayout.this.f28061g : 0);
            } else {
                if (i10 != 4) {
                    return;
                }
                SwipeBackLayout.this.E(z10 ? -SwipeBackLayout.this.f28061g : 0);
            }
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            return view == SwipeBackLayout.this.f28058d && SwipeBackLayout.this.f28064j;
        }

        /* synthetic */ f(SwipeBackLayout swipeBackLayout, a aVar) {
            this();
        }
    }

    public SwipeBackLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f28055a = c.EDGE;
        this.f28056b = d.TOP;
        this.f28060f = 0;
        this.f28061g = 0;
        this.f28062h = 0;
        this.f28064j = true;
        this.f28065k = 0.0f;
        this.f28066l = true;
        this.f28067m = 0.0f;
        this.f28068n = 0.0f;
        this.f28069o = 0.0f;
        this.f28070p = 0.0f;
        this.f28071q = 0.0f;
        this.f28072r = 0.0f;
        this.f28057c = v0.d.p(this, 1.0f, new f(this, null));
        A();
    }

    private void A() {
        setOnTouchListener(new a());
    }

    private void B() {
        if (this.f28058d == null) {
            if (getChildCount() > 1) {
                throw new IllegalStateException("SwipeBackLayout must contains only one direct child");
            }
            View childAt = getChildAt(0);
            this.f28058d = childAt;
            if (this.f28059e != null || childAt == null) {
                return;
            }
            if (childAt instanceof ViewGroup) {
                C((ViewGroup) childAt);
            } else {
                this.f28059e = childAt;
            }
        }
    }

    private void C(ViewGroup viewGroup) {
        this.f28059e = viewGroup;
        if (viewGroup.getChildCount() > 0) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof AbsListView) || (childAt instanceof ScrollView) || (childAt instanceof ViewPager) || (childAt instanceof WebView)) {
                    this.f28059e = childAt;
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D() {
        Activity activity = (Activity) getContext();
        activity.finish();
        activity.overridePendingTransition(0, R.anim.fade_out);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(int i10) {
        if (this.f28057c.S(i10, 0)) {
            q0.d0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(int i10) {
        if (this.f28057c.S(0, i10)) {
            q0.d0(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getDragRange() {
        int i10 = b.f28074a[this.f28056b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return this.f28060f;
        }
        return (i10 == 3 || i10 == 4) ? this.f28061g : this.f28060f;
    }

    static /* synthetic */ e h(SwipeBackLayout swipeBackLayout) {
        swipeBackLayout.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean v(float f10, float f11) {
        int i10 = b.f28074a[this.f28056b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (Math.abs(f11) > Math.abs(f10) && Math.abs(f11) > 2000.0d) {
                if (this.f28056b == d.TOP) {
                    return !z();
                }
                if (!w()) {
                    return true;
                }
            }
        } else if ((i10 == 3 || i10 == 4) && Math.abs(f10) > Math.abs(f11) && Math.abs(f10) > 2000.0d) {
            if (this.f28056b == d.LEFT) {
                return !x();
            }
            return !y();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean x() {
        return q0.f(this.f28059e, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y() {
        return q0.f(this.f28059e, -1);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f28057c.o(true)) {
            q0.d0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean zT;
        B();
        if (isEnabled()) {
            zT = this.f28057c.T(motionEvent);
        } else {
            this.f28057c.c();
            zT = false;
        }
        return !zT ? super.onInterceptTouchEvent(motionEvent) : zT;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        int paddingLeft2 = getPaddingLeft();
        int paddingTop2 = getPaddingTop();
        childAt.layout(paddingLeft2, paddingTop2, paddingLeft + paddingLeft2, paddingTop + paddingTop2);
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (getChildCount() > 1) {
            throw new IllegalStateException("SwipeBackLayout must contains only one direct child.");
        }
        if (getChildCount() > 0) {
            getChildAt(0).measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f28060f = i11;
        this.f28061g = i10;
        int i14 = b.f28074a[this.f28056b.ordinal()];
        if (i14 == 1 || i14 == 2) {
            float f10 = this.f28065k;
            if (f10 <= 0.0f) {
                f10 = this.f28060f * 0.5f;
            }
            this.f28065k = f10;
            return;
        }
        if (i14 == 3 || i14 == 4) {
            float f11 = this.f28065k;
            if (f11 <= 0.0f) {
                f11 = this.f28061g * 0.5f;
            }
            this.f28065k = f11;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f28057c.I(motionEvent);
        return true;
    }

    public void setDragDirectMode(c cVar) {
        this.f28055a = cVar;
        if (cVar == c.VERTICAL) {
            this.f28056b = d.TOP;
        } else if (cVar == c.HORIZONTAL) {
            this.f28056b = d.LEFT;
        }
    }

    public void setDragEdge(d dVar) {
        this.f28056b = dVar;
    }

    public void setEnableFlingBack(boolean z10) {
        this.f28066l = z10;
    }

    public void setEnablePullToBack(boolean z10) {
        this.f28064j = z10;
        Log.i("SwipeBackLayout", "enablePullToBack:" + this.f28064j);
    }

    public void setFinishAnchor(float f10) {
        this.f28065k = f10;
    }

    public void setScrollChild(View view) {
        this.f28059e = view;
    }

    public boolean w() {
        return q0.g(this.f28059e, 1);
    }

    public boolean z() {
        return q0.g(this.f28059e, -1);
    }

    @Deprecated
    public void setOnPullToBackListener(e eVar) {
    }

    public void setOnSwipeBackListener(e eVar) {
    }
}
