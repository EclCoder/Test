package com.google.android.material.listitem;

import android.R;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import n0.m;
import o0.p;
import sb.l;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class ListItemLayout extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f20440o = {R.attr.state_first};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f20441p = {R.attr.state_middle};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f20442q = {R.attr.state_last};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f20443r = {R.attr.state_single};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final TimeInterpolator f20444s = new PathInterpolator(0.42f, 1.67f, 0.21f, 0.9f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f20445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v0.d f20446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GestureDetector f20447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f20448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View f20450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f20451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f20452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ec.a f20453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f20454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View.AccessibilityDelegate f20455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f20456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f20457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f20458n;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends v0.d.AbstractC0826d {
        a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int n(ec.a aVar) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ((View) aVar).getLayoutParams();
            if (aVar.getPrimaryActionSwipeMode() == 0) {
                return aVar.getIntrinsicWidth() + marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ListItemLayout.this.f20450f.getLayoutParams();
            return ListItemLayout.this.f20450f.getMeasuredWidth() + (com.google.android.material.listitem.b.a((View) aVar) ? marginLayoutParams2.leftMargin : marginLayoutParams2.rightMargin);
        }

        private int o(int i10, ec.a aVar, float f10, int i11) {
            if (!ListItemLayout.this.H(i10)) {
                return 3;
            }
            if (i10 != 3) {
                f10 = -f10;
            }
            return p(i11, f10, aVar, ListItemLayout.this.z(i10), ListItemLayout.this.A(i10));
        }

        private int p(int i10, float f10, ec.a aVar, int i11, int i12) {
            boolean z10 = aVar.getPrimaryActionSwipeMode() != 0;
            boolean z11 = aVar.getPrimaryActionSwipeMode() == 2;
            if (f10 > 500.0f) {
                return (!z10 || (ListItemLayout.this.f20457m == 3 && !z11)) ? 4 : 5;
            }
            if (f10 < -500.0f) {
                return (z11 || ListItemLayout.this.f20457m != 5) ? 3 : 4;
            }
            if (z10 && Math.abs(i10 - i12) < Math.abs(i10 - i11)) {
                return 5;
            }
            if (z10 && z11) {
                i11 = i12;
            }
            if (Math.abs(i10 - i11) < Math.abs(i10 - ListItemLayout.this.getSwipeViewClosedOffset())) {
                return (z10 && z11) ? 5 : 4;
            }
            return 3;
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            if (!(ListItemLayout.this.f20450f instanceof ec.b) || !ListItemLayout.this.G()) {
                return 0;
            }
            ec.b bVar = (ec.b) ListItemLayout.this.f20450f;
            int iN = ListItemLayout.this.f20449e;
            int swipeMaxOvershoot = ListItemLayout.this.f20449e;
            if (ListItemLayout.this.f20452h instanceof ec.a) {
                iN = ListItemLayout.this.f20449e - (n((ec.a) ListItemLayout.this.f20452h) + bVar.getSwipeMaxOvershoot());
            }
            if (ListItemLayout.this.f20451g instanceof ec.a) {
                int iN2 = n((ec.a) ListItemLayout.this.f20451g);
                swipeMaxOvershoot = iN2 + bVar.getSwipeMaxOvershoot() + ListItemLayout.this.f20449e;
            }
            return Math.max(iN, Math.min(i10, swipeMaxOvershoot));
        }

        @Override // v0.d.AbstractC0826d
        public int d(View view) {
            if (!(ListItemLayout.this.f20450f instanceof ec.b)) {
                return 0;
            }
            ec.b bVar = (ec.b) ListItemLayout.this.f20450f;
            int intrinsicWidth = ListItemLayout.this.f20451g instanceof ec.a ? ((ec.a) ListItemLayout.this.f20451g).getIntrinsicWidth() + bVar.getSwipeMaxOvershoot() : 0;
            return ListItemLayout.this.f20452h instanceof ec.a ? intrinsicWidth + ((ec.a) ListItemLayout.this.f20452h).getIntrinsicWidth() + bVar.getSwipeMaxOvershoot() : intrinsicWidth;
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            if (ListItemLayout.this.f20446b != null && (ListItemLayout.this.f20450f instanceof ec.b) && ListItemLayout.this.G()) {
                super.k(view, i10, i11, i12, i13);
                ListItemLayout.this.J(i10);
                if (ListItemLayout.this.f20446b.D() != 1 || ListItemLayout.this.f20453i == null) {
                    return;
                }
                ListItemLayout listItemLayout = ListItemLayout.this;
                listItemLayout.E(1, listItemLayout.x((View) listItemLayout.f20453i));
            }
        }

        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            int left;
            if ((ListItemLayout.this.f20450f instanceof ec.b) && ListItemLayout.this.G() && (left = view.getLeft()) != ListItemLayout.this.f20449e) {
                int i10 = left > ListItemLayout.this.f20449e ? 3 : 5;
                ec.a aVar = i10 == 3 ? (ec.a) ListItemLayout.this.f20451g : (ec.a) ListItemLayout.this.f20452h;
                if (aVar == null) {
                    return;
                }
                int iO = o(i10, aVar, f10, left);
                ListItemLayout listItemLayout = ListItemLayout.this;
                listItemLayout.F(listItemLayout.f20450f, iO, i10);
            }
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            if ((!(ListItemLayout.this.f20450f instanceof ec.b) || ((ec.b) ListItemLayout.this.f20450f).b()) && ListItemLayout.this.G() && ListItemLayout.this.f20450f != null) {
                ListItemLayout.this.f20446b.d(ListItemLayout.this.f20450f, i10);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
            if (ListItemLayout.this.getParent() == null) {
                return false;
            }
            ListItemLayout.this.getParent().requestDisallowInterceptTouchEvent(true);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends View.AccessibilityDelegate {
        c() {
        }

        private void a(View view, p pVar) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    if (d(childAt)) {
                        pVar.b(new p.a(b(childAt), childAt.getContentDescription()));
                    }
                }
            }
        }

        private int b(View view) {
            return view.getId();
        }

        private boolean c(View view, int i10) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    View childAt = viewGroup.getChildAt(i11);
                    if (b(childAt) == i10) {
                        return childAt.performClick();
                    }
                }
            }
            return false;
        }

        private boolean d(View view) {
            return view.isClickable() && view.getContentDescription() != null && view.isEnabled() && view.getVisibility() == 0;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            p pVarC1 = p.c1(accessibilityNodeInfo);
            a(ListItemLayout.this.f20451g, pVarC1);
            a(ListItemLayout.this.f20452h, pVarC1);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (c(ListItemLayout.this.f20451g, i10) || c(ListItemLayout.this.f20452h, i10)) {
                return true;
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }
    }

    public ListItemLayout(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, l.f51880x);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int A(int i10) {
        View view = this.f20450f;
        if (view == null) {
            return 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return this.f20449e + ((B(i10) ? 1 : -1) * (this.f20450f.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin));
    }

    private boolean B(int i10) {
        return w(i10) == 3;
    }

    private void C(View view, int i10, int i11) {
        int measuredWidth;
        int measuredWidth2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        if (com.google.android.material.listitem.b.a(view)) {
            measuredWidth2 = i11 - layoutParams.rightMargin;
            measuredWidth = measuredWidth2 - view.getMeasuredWidth();
        } else {
            measuredWidth = i10 + layoutParams.leftMargin;
            measuredWidth2 = view.getMeasuredWidth() + measuredWidth;
        }
        view.layout(measuredWidth, view.getTop(), measuredWidth2, view.getBottom());
    }

    private void D() {
        View view = this.f20451g;
        boolean z10 = false;
        boolean z11 = view != null && com.google.android.material.listitem.b.a(view);
        View view2 = this.f20452h;
        if (view2 != null && !com.google.android.material.listitem.b.a(view2)) {
            z10 = true;
        }
        if (z11 && z10) {
            View view3 = this.f20451g;
            this.f20451g = this.f20452h;
            this.f20452h = view3;
            this.f20448d *= -1;
            return;
        }
        if (z11) {
            if (this.f20452h != null) {
                throw new IllegalStateException("Cannot have more than one RevealableListItem with the same absolute gravity.");
            }
            this.f20452h = this.f20451g;
            this.f20451g = null;
            this.f20448d *= -1;
            return;
        }
        if (z10) {
            if (this.f20451g != null) {
                throw new IllegalStateException("Cannot have more than one RevealableListItem with the same absolute gravity.");
            }
            this.f20451g = this.f20452h;
            this.f20452h = null;
            this.f20448d *= -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void E(int i10, int i11) {
        ec.a aVar;
        Object obj;
        int iW = w(i11);
        if (i10 == this.f20456l && ((obj = this.f20453i) == null || x((View) obj) == iW)) {
            return;
        }
        if (i10 == 3 || H(iW)) {
            if (i10 == 5 && ((aVar = this.f20453i) == null || aVar.getPrimaryActionSwipeMode() == 0)) {
                return;
            }
            ec.a aVar2 = B(iW) ? (ec.a) this.f20451g : (ec.a) this.f20452h;
            this.f20453i = aVar2;
            this.f20456l = i10;
            if (i10 != 1 && i10 != 2) {
                this.f20457m = i10;
            }
            if (aVar2 != 0) {
                iW = ((FrameLayout.LayoutParams) ((View) aVar2).getLayoutParams()).gravity;
            }
            ec.b bVar = (ec.b) this.f20450f;
            View viewR = r(this.f20453i);
            if (iW == -1) {
                iW = 8388613;
            }
            bVar.c(i10, viewR, iW);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(View view, int i10, int i11) {
        if (this.f20446b == null) {
            return;
        }
        int iY = y(i10, i11);
        if (!(i10 == 4 ? this.f20446b.V(view, iY, view.getTop(), 350, (Interpolator) f20444s) : this.f20446b.U(view, iY, view.getTop()))) {
            E(i10, i11);
        } else {
            E(2, i11);
            this.f20458n.c(i10, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G() {
        return (this.f20451g instanceof ec.a) || (this.f20452h instanceof ec.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean H(int i10) {
        D();
        return B(i10) ? this.f20451g instanceof ec.a : this.f20452h instanceof ec.a;
    }

    private void I(int i10, int i11) {
        int swipeViewClosedOffset = i11 == i10 ? (getSwipeViewClosedOffset() + i10) / 2 : (i11 + i10) / 2;
        this.f20450f.setAlpha(tb.b.a(1.0f, 0.0f, (this.f20448d - swipeViewClosedOffset) / (i10 - swipeViewClosedOffset)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x002b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0033  */
    public void J(int i10) {
        KeyEvent.Callback callback;
        if ((this.f20450f instanceof ec.b) && G()) {
            int i11 = i10 - this.f20449e;
            this.f20448d = i11;
            boolean z10 = i11 > 0;
            boolean z11 = i11 < 0;
            if (z10) {
                KeyEvent.Callback callback2 = this.f20451g;
                if (callback2 instanceof ec.a) {
                    this.f20453i = (ec.a) callback2;
                } else if (z11) {
                    callback = this.f20452h;
                    if (callback instanceof ec.a) {
                        this.f20453i = (ec.a) callback;
                    }
                }
            } else if (z11) {
                callback = this.f20452h;
                if (callback instanceof ec.a) {
                    this.f20453i = (ec.a) callback;
                }
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f20450f.getLayoutParams();
            View view = this.f20451g;
            if (view instanceof ec.a) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
                int iMax = Math.max(0, ((Math.abs(this.f20449e - this.f20450f.getLeft()) - layoutParams.leftMargin) - layoutParams2.getMarginStart()) - layoutParams2.getMarginEnd());
                if (!z10) {
                    iMax = 0;
                }
                ((ec.a) this.f20451g).setRevealedWidth(iMax);
            }
            View view2 = this.f20452h;
            if (view2 instanceof ec.a) {
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) view2.getLayoutParams();
                ((ec.a) this.f20452h).setRevealedWidth(z11 ? Math.max(0, ((Math.abs(this.f20449e - this.f20450f.getLeft()) - layoutParams.rightMargin) - layoutParams3.getMarginStart()) - layoutParams3.getMarginEnd()) : 0);
            }
            ((ec.b) this.f20450f).a(this.f20448d);
            if (z11 && (this.f20452h instanceof ec.a)) {
                I(A(5), z(5));
            } else if (z10 && (this.f20451g instanceof ec.a)) {
                I(A(3), z(3));
            } else {
                this.f20450f.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getSwipeViewClosedOffset() {
        return this.f20449e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private View r(ec.a aVar) {
        return (View) aVar;
    }

    private GestureDetector s() {
        return new GestureDetector(getContext(), new b());
    }

    private View.AccessibilityDelegate t() {
        return new c();
    }

    private v0.d u() {
        return v0.d.q(this, new a());
    }

    private boolean v() {
        if (!G() || this.f20450f == null) {
            return false;
        }
        if (this.f20446b == null) {
            this.f20446b = u();
        }
        if (this.f20447c == null) {
            this.f20447c = s();
        }
        if (this.f20455k == null) {
            View.AccessibilityDelegate accessibilityDelegateT = t();
            this.f20455k = accessibilityDelegateT;
            this.f20450f.setAccessibilityDelegate(accessibilityDelegateT);
        }
        if (!getClipToPadding()) {
            return true;
        }
        this.f20454j = getClipToPadding();
        setClipToPadding(false);
        return true;
    }

    private int w(int i10) {
        int iB = m.b(i10, getLayoutDirection()) & 7;
        if (iB == 3) {
            return 3;
        }
        return (iB != 5 && getLayoutDirection() == 1) ? 3 : 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x(View view) {
        return com.google.android.material.listitem.b.a(view) ? 5 : 3;
    }

    private int y(int i10, int i11) {
        if (!H(i11)) {
            throw new IllegalArgumentException("No RevealableListItem with gravity " + i11);
        }
        if (i10 == 3) {
            return getSwipeViewClosedOffset();
        }
        if (i10 == 4) {
            return z(i11);
        }
        if (i10 == 5) {
            return A(i11);
        }
        throw new IllegalArgumentException("Invalid state to get swipe offset: " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public int z(int i10) {
        View view;
        View view2;
        int i11;
        View view3;
        if (B(i10)) {
            view3 = this.f20451g;
        } else {
            view = this.f20452h;
        }
        if (view2 == 0) {
            view2 = view;
            view2 = view3;
            return 0;
        }
        view2 = view;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view2.getLayoutParams();
        int intrinsicWidth = ((ec.a) view2).getIntrinsicWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        if (B(i10)) {
            view2 = view3;
            i11 = 1;
        } else {
            view2 = view3;
            i11 = -1;
        }
        return this.f20449e + (i11 * intrinsicWidth);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (!(view instanceof ec.a)) {
            if (this.f20450f != null && (view instanceof ec.b)) {
                throw new UnsupportedOperationException("Only one SwipeableListItem view is allowed in a ListItemLayout.");
            }
            if (view instanceof ec.b) {
                this.f20450f = view;
                return;
            }
            return;
        }
        if (com.google.android.material.listitem.b.a(view)) {
            if (this.f20452h != null) {
                throw new UnsupportedOperationException("Only one RevealableListItem with end gravity is supported.");
            }
            this.f20452h = view;
        } else {
            if (this.f20451g != null) {
                throw new UnsupportedOperationException("Only one RevealableListItem with start gravity is supported.");
            }
            this.f20451g = view;
        }
        ((ec.a) view).setRevealedWidth(0);
        view.setElevation(getElevation() - 1.0f);
    }

    public int getSwipeState() {
        return this.f20456l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        return this.f20445a == null ? super.onCreateDrawableState(i10) : View.mergeDrawableStates(super.onCreateDrawableState(i10 + 1), this.f20445a);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!v()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 1) {
            this.f20446b.c();
            return false;
        }
        this.f20447c.onTouchEvent(motionEvent);
        return this.f20446b.T(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        D();
        if (this.f20450f != null && G() && v()) {
            this.f20449e = this.f20450f.getLeft();
            int right = this.f20450f.getRight();
            this.f20450f.offsetLeftAndRight(this.f20448d);
            View view = this.f20451g;
            if (view != null) {
                C(view, this.f20449e, right);
            }
            View view2 = this.f20452h;
            if (view2 != null) {
                C(view2, this.f20449e, right);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (v()) {
            this.f20446b.I(motionEvent);
            this.f20447c.onTouchEvent(motionEvent);
            if (this.f20446b.D() == 1) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view == this.f20451g) {
            this.f20451g = null;
        } else if (view == this.f20452h) {
            this.f20452h = null;
        } else if (this.f20450f == view) {
            this.f20450f = null;
        }
        if (!G() || this.f20450f == null) {
            this.f20446b = null;
            this.f20447c = null;
            this.f20455k = null;
            setClipToPadding(this.f20454j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f20462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20463b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f20464c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Runnable f20465d;

        private d() {
            this.f20465d = new Runnable() { // from class: com.google.android.material.listitem.a
                @Override // java.lang.Runnable
                public final void run() {
                    ListItemLayout.d.a(this.f20477a);
                }
            };
        }

        public static /* synthetic */ void a(d dVar) {
            dVar.f20464c = false;
            if (ListItemLayout.this.f20446b != null && ListItemLayout.this.f20446b.o(true)) {
                dVar.c(dVar.f20462a, dVar.f20463b);
            } else if (ListItemLayout.this.f20456l == 2) {
                ListItemLayout.this.E(dVar.f20462a, dVar.f20463b);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(int i10, int i11) {
            this.f20462a = i10;
            this.f20463b = i11;
            if (this.f20464c) {
                return;
            }
            ListItemLayout.this.post(this.f20465d);
            this.f20464c = true;
        }

        /* synthetic */ d(ListItemLayout listItemLayout, a aVar) {
            this();
        }
    }

    public ListItemLayout(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(pc.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f20456l = 3;
        this.f20457m = 3;
        this.f20458n = new d(this, null);
        getContext();
    }
}
