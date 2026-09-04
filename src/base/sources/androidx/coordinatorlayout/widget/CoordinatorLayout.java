package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n0.a0;
import n0.b0;
import n0.k1;
import n0.m;
import n0.q0;
import n0.y;
import n0.z;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements y, z {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final String f3145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final Class[] f3146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final ThreadLocal f3147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final Comparator f3148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final m0.d f3149y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f3150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a f3151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f3152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f3153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f3154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f3155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f3156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f3157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f3158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f3159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f3160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f3161l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private g f3162m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f3163n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private k1 f3164o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f3165p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Drawable f3166q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f3167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private b0 f3168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final a0 f3169t;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements b0 {
        a() {
        }

        @Override // n0.b0
        public k1 a(View view, k1 k1Var) {
            return CoordinatorLayout.this.W(k1Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface b {
        c getBehavior();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class c {
        public c() {
        }

        public boolean A(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z10) {
            return false;
        }

        public Parcelable C(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public boolean D(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
            return false;
        }

        public boolean E(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                return D(coordinatorLayout, view, view2, view3, i10);
            }
            return false;
        }

        public void G(CoordinatorLayout coordinatorLayout, View view, View view2, int i10) {
            if (i10 == 0) {
                F(coordinatorLayout, view, view2);
            }
        }

        public boolean H(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean e(CoordinatorLayout coordinatorLayout, View view) {
            return h(coordinatorLayout, view) > 0.0f;
        }

        public boolean f(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public int g(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public float h(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean l(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean p(CoordinatorLayout coordinatorLayout, View view, int i10) {
            return false;
        }

        public boolean q(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean s(CoordinatorLayout coordinatorLayout, View view, View view2, float f10, float f11) {
            return false;
        }

        public void u(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr, int i12) {
            if (i12 == 0) {
                t(coordinatorLayout, view, view2, i10, i11, iArr);
            }
        }

        public void w(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                v(coordinatorLayout, view, view2, i10, i11, i12, i13);
            }
        }

        public void x(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            w(coordinatorLayout, view, view2, i10, i11, i12, i13, i14);
        }

        public void z(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10, int i11) {
            if (i11 == 0) {
                y(coordinatorLayout, view, view2, view3, i10);
            }
        }

        public c(Context context, AttributeSet attributeSet) {
        }

        public void n() {
        }

        public void k(f fVar) {
        }

        public void B(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void F(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public k1 j(CoordinatorLayout coordinatorLayout, View view, k1 k1Var) {
            return k1Var;
        }

        public void m(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public void y(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i10) {
        }

        public void v(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int i12, int i13) {
        }

        public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11, int[] iArr) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class value();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class e implements ViewGroup.OnHierarchyChangeListener {
        e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3167r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.H(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f3167r;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class g implements ViewTreeObserver.OnPreDrawListener {
        g() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.H(0);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fO = q0.O(view);
            float fO2 = q0.O(view2);
            if (fO > fO2) {
                return -1;
            }
            return fO < fO2 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        f3145u = r10 != null ? r10.getName() : null;
        f3148x = new i();
        f3146v = new Class[]{Context.class, AttributeSet.class};
        f3147w = new ThreadLocal();
        f3149y = new m0.f(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a0.a.f68a);
    }

    private boolean A(View view) {
        return this.f3151b.j(view);
    }

    private void C(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        Rect rectA = a();
        rectA.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        if (this.f3164o != null && q0.y(this) && !q0.y(view)) {
            rectA.left += this.f3164o.l();
            rectA.top += this.f3164o.n();
            rectA.right -= this.f3164o.m();
            rectA.bottom -= this.f3164o.k();
        }
        Rect rectA2 = a();
        m.a(S(fVar.f3174c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectA, rectA2, i10);
        view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        O(rectA);
        O(rectA2);
    }

    private void D(View view, View view2, int i10) {
        Rect rectA = a();
        Rect rectA2 = a();
        try {
            t(view2, rectA);
            u(view, i10, rectA, rectA2);
            view.layout(rectA2.left, rectA2.top, rectA2.right, rectA2.bottom);
        } finally {
            O(rectA);
            O(rectA2);
        }
    }

    private void E(View view, int i10, int i11) {
        int i12;
        f fVar = (f) view.getLayoutParams();
        int iB = m.b(T(fVar.f3174c), i11);
        int i13 = iB & 7;
        int i14 = iB & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iW = w(i10) - measuredWidth;
        if (i13 == 1) {
            iW += measuredWidth / 2;
        } else if (i13 == 5) {
            iW += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(iW, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void F(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (q0.T(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            Rect rectA = a();
            Rect rectA2 = a();
            rectA2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.f(this, view, rectA)) {
                rectA.set(rectA2);
            } else if (!rectA2.contains(rectA)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectA.toShortString() + " | Bounds:" + rectA2.toShortString());
            }
            O(rectA2);
            if (rectA.isEmpty()) {
                O(rectA);
                return;
            }
            int iB = m.b(fVar.f3179h, i10);
            boolean z12 = true;
            if ((iB & 48) != 48 || (i15 = (rectA.top - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - fVar.f3181j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                V(view, i16 - i15);
                z10 = true;
            }
            if ((iB & 80) == 80 && (height = ((getHeight() - rectA.bottom) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) + fVar.f3181j) < (i14 = rect.bottom)) {
                V(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                V(view, 0);
            }
            if ((iB & 3) != 3 || (i12 = (rectA.left - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - fVar.f3180i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                U(view, i13 - i12);
                z11 = true;
            }
            if ((iB & 5) != 5 || (width = ((getWidth() - rectA.right) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin) + fVar.f3180i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                U(view, width - i11);
            }
            if (!z12) {
                U(view, 0);
            }
            O(rectA);
        }
    }

    static c K(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f3145u;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f3147w;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f3146v);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (c) constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean L(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f3152c;
        z(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zO = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = (View) list.get(i11);
            f fVar = (f) view.getLayoutParams();
            c cVarF = fVar.f();
            if (!(zO || z10) || actionMasked == 0) {
                if (!zO && cVarF != null) {
                    if (i10 == 0) {
                        zO = cVarF.o(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zO = cVarF.H(this, view, motionEvent);
                    }
                    if (zO) {
                        this.f3160k = view;
                    }
                }
                boolean zC = fVar.c();
                boolean zI = fVar.i(this, view);
                z10 = zI && !zC;
                if (zI && !z10) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarF.o(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarF.H(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zO;
    }

    private void M() {
        this.f3150a.clear();
        this.f3151b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVarY = y(childAt);
            fVarY.d(this, childAt);
            this.f3151b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (fVarY.b(this, childAt, childAt2)) {
                        if (!this.f3151b.d(childAt2)) {
                            this.f3151b.b(childAt2);
                        }
                        this.f3151b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f3150a.addAll(this.f3151b.i());
        Collections.reverse(this.f3150a);
    }

    private static void O(Rect rect) {
        rect.setEmpty();
        f3149y.a(rect);
    }

    private void Q(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarF.o(this, childAt, motionEventObtain);
                } else {
                    cVarF.H(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((f) getChildAt(i11).getLayoutParams()).m();
        }
        this.f3160k = null;
        this.f3157h = false;
    }

    private static int R(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int S(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= 8388611;
        }
        return (i10 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE) == 0 ? i10 | 48 : i10;
    }

    private static int T(int i10) {
        if (i10 == 0) {
            return 8388661;
        }
        return i10;
    }

    private void U(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f3180i;
        if (i11 != i10) {
            q0.X(view, i10 - i11);
            fVar.f3180i = i10;
        }
    }

    private void V(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        int i11 = fVar.f3181j;
        if (i11 != i10) {
            q0.Y(view, i10 - i11);
            fVar.f3181j = i10;
        }
    }

    private void X() {
        if (!q0.y(this)) {
            q0.w0(this, null);
            return;
        }
        if (this.f3168s == null) {
            this.f3168s = new a();
        }
        q0.w0(this, this.f3168s);
        setSystemUiVisibility(1280);
    }

    private static Rect a() {
        Rect rect = (Rect) f3149y.b();
        return rect == null ? new Rect() : rect;
    }

    private static int c(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void d(f fVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private k1 e(k1 k1Var) {
        c cVarF;
        if (k1Var.s()) {
            return k1Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (q0.y(childAt) && (cVarF = ((f) childAt.getLayoutParams()).f()) != null) {
                k1Var = cVarF.j(this, childAt, k1Var);
                if (k1Var.s()) {
                    return k1Var;
                }
            }
        }
        return k1Var;
    }

    private void v(View view, int i10, Rect rect, Rect rect2, f fVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iB = m.b(R(fVar.f3174c), i10);
        int iB2 = m.b(S(fVar.f3175d), i10);
        int i13 = iB & 7;
        int i14 = iB & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        int i15 = iB2 & 7;
        int i16 = iB2 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int w(int i10) {
        int[] iArr = this.f3159j;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i10);
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i10 + " out of range for " + this);
        return 0;
    }

    private void z(List list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator comparator = f3148x;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    public boolean B(View view, int i10, int i11) {
        Rect rectA = a();
        t(view, rectA);
        try {
            return rectA.contains(i10, i11);
        } finally {
            O(rectA);
        }
    }

    void G(View view, int i10) {
        c cVarF;
        f fVar = (f) view.getLayoutParams();
        if (fVar.f3182k != null) {
            Rect rectA = a();
            Rect rectA2 = a();
            Rect rectA3 = a();
            t(fVar.f3182k, rectA);
            q(view, false, rectA2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            v(view, i10, rectA, rectA3, fVar, measuredWidth, measuredHeight);
            boolean z10 = (rectA3.left == rectA2.left && rectA3.top == rectA2.top) ? false : true;
            d(fVar, rectA3, measuredWidth, measuredHeight);
            int i11 = rectA3.left - rectA2.left;
            int i12 = rectA3.top - rectA2.top;
            if (i11 != 0) {
                q0.X(view, i11);
            }
            if (i12 != 0) {
                q0.Y(view, i12);
            }
            if (z10 && (cVarF = fVar.f()) != null) {
                cVarF.l(this, view, fVar.f3182k);
            }
            O(rectA);
            O(rectA2);
            O(rectA3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    final void H(int i10) {
        int i11;
        c cVarF;
        boolean zL;
        int iB = q0.B(this);
        int size = this.f3150a.size();
        Rect rectA = a();
        Rect rectA2 = a();
        Rect rectA3 = a();
        for (int i12 = 0; i12 < size; i12++) {
            View view = (View) this.f3150a.get(i12);
            f fVar = (f) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (fVar.f3183l == ((View) this.f3150a.get(i13))) {
                        G(view, iB);
                    }
                }
                q(view, true, rectA2);
                if (fVar.f3178g != 0 && !rectA2.isEmpty()) {
                    int iB2 = m.b(fVar.f3178g, iB);
                    int i14 = iB2 & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
                    if (i14 == 48) {
                        rectA.top = Math.max(rectA.top, rectA2.bottom);
                    } else if (i14 == 80) {
                        rectA.bottom = Math.max(rectA.bottom, getHeight() - rectA2.top);
                    }
                    int i15 = iB2 & 7;
                    if (i15 == 3) {
                        rectA.left = Math.max(rectA.left, rectA2.right);
                    } else if (i15 == 5) {
                        rectA.right = Math.max(rectA.right, getWidth() - rectA2.left);
                    }
                }
                if (fVar.f3179h != 0 && view.getVisibility() == 0) {
                    F(view, rectA, iB);
                }
                if (i10 != 2) {
                    x(view, rectA3);
                    if (!rectA3.equals(rectA2)) {
                        N(view, rectA2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = (View) this.f3150a.get(i11);
                            f fVar2 = (f) view2.getLayoutParams();
                            cVarF = fVar2.f();
                            if (cVarF == null && cVarF.i(this, view2, view)) {
                                if (i10 == 0 && fVar2.g()) {
                                    fVar2.k();
                                } else {
                                    if (i10 != 2) {
                                        zL = cVarF.l(this, view2, view);
                                    } else {
                                        cVarF.m(this, view2, view);
                                        zL = true;
                                    }
                                    if (i10 == 1) {
                                        fVar2.p(zL);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = (View) this.f3150a.get(i11);
                        f fVar3 = (f) view3.getLayoutParams();
                        cVarF = fVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        O(rectA);
        O(rectA2);
        O(rectA3);
    }

    public void I(View view, int i10) {
        f fVar = (f) view.getLayoutParams();
        if (fVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = fVar.f3182k;
        if (view2 != null) {
            D(view, view2, i10);
            return;
        }
        int i11 = fVar.f3176e;
        if (i11 >= 0) {
            E(view, i11, i10);
        } else {
            C(view, i10);
        }
    }

    public void J(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void N(View view, Rect rect) {
        ((f) view.getLayoutParams()).q(rect);
    }

    void P() {
        if (this.f3158i && this.f3162m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3162m);
        }
        this.f3163n = false;
    }

    final k1 W(k1 k1Var) {
        if (m0.b.a(this.f3164o, k1Var)) {
            return k1Var;
        }
        this.f3164o = k1Var;
        boolean z10 = false;
        boolean z11 = k1Var != null && k1Var.n() > 0;
        this.f3165p = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        k1 k1VarE = e(k1Var);
        requestLayout();
        return k1VarE;
    }

    void b() {
        if (this.f3158i) {
            if (this.f3162m == null) {
                this.f3162m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3162m);
        }
        this.f3163n = true;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        f fVar = (f) view.getLayoutParams();
        c cVar = fVar.f3172a;
        if (cVar != null) {
            float fH = cVar.h(this, view);
            if (fH > 0.0f) {
                if (this.f3154e == null) {
                    this.f3154e = new Paint();
                }
                this.f3154e.setColor(fVar.f3172a.g(this, view));
                this.f3154e.setAlpha(c(Math.round(fH * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f3154e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f3166q;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public void f(View view) {
        List listG = this.f3151b.g(view);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < listG.size(); i10++) {
            View view2 = (View) listG.get(i10);
            c cVarF = ((f) view2.getLayoutParams()).f();
            if (cVarF != null) {
                cVarF.l(this, view2, view);
            }
        }
    }

    void g() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (A(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f3163n) {
            if (z10) {
                b();
            } else {
                P();
            }
        }
    }

    final List<View> getDependencySortedChildren() {
        M();
        return Collections.unmodifiableList(this.f3150a);
    }

    public final k1 getLastWindowInsets() {
        return this.f3164o;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f3169t.a();
    }

    public Drawable getStatusBarBackground() {
        return this.f3166q;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f generateDefaultLayoutParams() {
        return new f(-2, -2);
    }

    @Override // n0.y
    public void i(View view, View view2, int i10, int i11) {
        c cVarF;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f3169t.c(view, view2, i10, i11);
        this.f3161l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i11) && (cVarF = fVar.f()) != null) {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarF.z(this, childAt, view3, view4, i12, i13);
            } else {
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // n0.y
    public void j(View view, int i10) {
        this.f3169t.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            f fVar = (f) childAt.getLayoutParams();
            if (fVar.j(i10)) {
                c cVarF = fVar.f();
                if (cVarF != null) {
                    cVarF.G(this, childAt, view, i10);
                }
                fVar.l(i10);
                fVar.k();
            }
        }
        this.f3161l = null;
    }

    @Override // n0.y
    public void k(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i12) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f3155f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.u(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f3155f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f3155f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    @Override // n0.z
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(i14) && (cVarF = fVar.f()) != null) {
                    int[] iArr2 = this.f3155f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.x(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f3155f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f3155f;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            H(1);
        }
    }

    @Override // n0.y
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
        m(view, i10, i11, i12, i13, 0, this.f3156g);
    }

    @Override // n0.y
    public boolean o(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                c cVarF = fVar.f();
                if (cVarF != null) {
                    boolean zE = cVarF.E(this, childAt, view, view2, i10, i11);
                    z10 |= zE;
                    fVar.r(i11, zE);
                } else {
                    fVar.r(i11, false);
                }
            }
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Q(false);
        if (this.f3163n) {
            if (this.f3162m == null) {
                this.f3162m = new g();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f3162m);
        }
        if (this.f3164o == null && q0.y(this)) {
            q0.j0(this);
        }
        this.f3158i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Q(false);
        if (this.f3163n && this.f3162m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f3162m);
        }
        View view = this.f3161l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f3158i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f3165p || this.f3166q == null) {
            return;
        }
        k1 k1Var = this.f3164o;
        int iN = k1Var != null ? k1Var.n() : 0;
        if (iN > 0) {
            this.f3166q.setBounds(0, 0, getWidth(), iN);
            this.f3166q.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Q(true);
        }
        boolean zL = L(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zL;
        }
        Q(true);
        return zL;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iB = q0.B(this);
        int size = this.f3150a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = (View) this.f3150a.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((f) view.getLayoutParams()).f()) == null || !cVarF.p(this, view, iB))) {
                I(view, iB);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:47:0x012c  */
    /* JADX WARN: Code duplicated, block: B:48:0x012f  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zQ;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.M();
        coordinatorLayout.g();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iB = q0.B(coordinatorLayout);
        boolean z10 = iB == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f3164o != null && q0.y(coordinatorLayout);
        int size3 = coordinatorLayout.f3150a.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = (View) coordinatorLayout.f3150a.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iB;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                f fVar = (f) view2.getLayoutParams();
                int i28 = fVar.f3176e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iW = coordinatorLayout.w(i28);
                    int iB2 = m.b(T(fVar.f3174c), iB) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iB2 != 3 || z10) && !(iB2 == 5 && z10)) {
                        if ((iB2 == 5 && !z10) || (iB2 == 3 && z10)) {
                            iMax = Math.max(0, iW - paddingLeft);
                        }
                        if (z11 || q0.y(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iL = coordinatorLayout.f3164o.l() + coordinatorLayout.f3164o.m();
                            int iN = coordinatorLayout.f3164o.n() + coordinatorLayout.f3164o.k();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iL, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iN, mode2);
                        }
                        cVarF = fVar.f();
                        if (cVarF != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iB;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zQ = cVarF.q(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zQ) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iB;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.J(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iW);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z11) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarF = fVar.f();
                    if (cVarF != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iB;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zQ = cVarF.q(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zQ) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iB;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.J(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarF = fVar.f();
                if (cVarF != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iB;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zQ = cVarF.q(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zQ) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iB;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.J(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iB = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarF;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zR = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zR |= cVarF.r(this, childAt, view2, f12, f13, z11);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        if (zR) {
            H(1);
        }
        return zR;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarF;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zS = false;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                f fVar = (f) childAt.getLayoutParams();
                if (fVar.j(0) && (cVarF = fVar.f()) != null) {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zS |= cVarF.s(this, childAt, view2, f12, f13);
                } else {
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zS;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        k(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        n(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        i(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.a());
        SparseArray sparseArray = hVar.f3191c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = y(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = (Parcelable) sparseArray.get(id2)) != null) {
                cVarF.B(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableC;
        h hVar = new h(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = ((f) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableC = cVarF.C(this, childAt)) != null) {
                sparseArray.append(id2, parcelableC);
            }
        }
        hVar.f3191c = sparseArray;
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return o(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        j(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zL;
        boolean zH;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f3160k == null) {
            zL = L(motionEvent, 1);
            if (!zL) {
                zH = false;
            }
            motionEventObtain = null;
            if (this.f3160k == null) {
                zH |= super.onTouchEvent(motionEvent);
            } else if (zL) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zH;
            }
            Q(false);
            return zH;
        }
        zL = false;
        c cVarF = ((f) this.f3160k.getLayoutParams()).f();
        if (cVarF != null) {
            zH = cVarF.H(this, this.f3160k, motionEvent);
        } else {
            zH = false;
        }
        motionEventObtain = null;
        if (this.f3160k == null) {
            zH |= super.onTouchEvent(motionEvent);
        } else if (zL) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        Q(false);
        return zH;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public f generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    void q(View view, boolean z10, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z10) {
            t(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public List r(View view) {
        List listH = this.f3151b.h(view);
        this.f3153d.clear();
        if (listH != null) {
            this.f3153d.addAll(listH);
        }
        return this.f3153d;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((f) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.A(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f3157h) {
            return;
        }
        Q(false);
        this.f3157h = true;
    }

    public List s(View view) {
        List listG = this.f3151b.g(view);
        this.f3153d.clear();
        if (listG != null) {
            this.f3153d.addAll(listG);
        }
        return this.f3153d;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        X();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f3167r = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f3166q;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f3166q = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f3166q.setState(getDrawableState());
                }
                f0.a.m(this.f3166q, q0.B(this));
                this.f3166q.setVisible(getVisibility() == 0, false);
                this.f3166q.setCallback(this);
            }
            q0.d0(this);
        }
    }

    public void setStatusBarBackgroundColor(int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.a.getDrawable(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f3166q;
        if (drawable == null || drawable.isVisible() == z10) {
            return;
        }
        this.f3166q.setVisible(z10, false);
    }

    void t(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void u(View view, int i10, Rect rect, Rect rect2) {
        f fVar = (f) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        v(view, i10, rect, rect2, fVar, measuredWidth, measuredHeight);
        d(fVar, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3166q;
    }

    void x(View view, Rect rect) {
        rect.set(((f) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    f y(View view) {
        f fVar = (f) view.getLayoutParams();
        if (!fVar.f3173b) {
            if (view instanceof b) {
                c behavior = ((b) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                fVar.o(behavior);
                fVar.f3173b = true;
                return fVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    fVar.o((c) dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception e10) {
                    Log.e("CoordinatorLayout", "Default behavior class " + dVar.value().getName() + " could not be instantiated. Did you forget a default constructor?", e10);
                }
            }
            fVar.f3173b = true;
        }
        return fVar;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i10) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f3150a = new ArrayList();
        this.f3151b = new androidx.coordinatorlayout.widget.a();
        this.f3152c = new ArrayList();
        this.f3153d = new ArrayList();
        this.f3155f = new int[2];
        this.f3156g = new int[2];
        this.f3169t = new a0(this);
        TypedArray typedArrayObtainStyledAttributes = i10 == 0 ? context.obtainStyledAttributes(attributeSet, a0.c.f71b, 0, a0.b.f69a) : context.obtainStyledAttributes(attributeSet, a0.c.f71b, i10, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, a0.c.f71b, attributeSet, typedArrayObtainStyledAttributes, 0, a0.b.f69a);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, a0.c.f71b, attributeSet, typedArrayObtainStyledAttributes, i10, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(a0.c.f72c, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f3159j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f3159j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f3159j;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f3166q = typedArrayObtainStyledAttributes.getDrawable(a0.c.f73d);
        typedArrayObtainStyledAttributes.recycle();
        X();
        super.setOnHierarchyChangeListener(new e());
        if (q0.z(this) == 0) {
            q0.t0(this, 1);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class h extends u0.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray f3191c;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel) {
                return new h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public h[] newArray(int i10) {
                return new h[i10];
            }
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f3191c = new SparseArray(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f3191c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray sparseArray = this.f3191c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f3191c.keyAt(i11);
                parcelableArr[i11] = (Parcelable) this.f3191c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f3172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f3173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f3176e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3177f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3178g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f3179h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f3180i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f3181j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f3182k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f3183l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f3184m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f3185n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f3186o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f3187p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f3188q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f3189r;

        public f(int i10, int i11) {
            super(i10, i11);
            this.f3173b = false;
            this.f3174c = 0;
            this.f3175d = 0;
            this.f3176e = -1;
            this.f3177f = -1;
            this.f3178g = 0;
            this.f3179h = 0;
            this.f3188q = new Rect();
        }

        private void n(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f3177f);
            this.f3182k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f3183l = null;
                    this.f3182k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f3177f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f3183l = null;
                this.f3182k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f3183l = null;
                    this.f3182k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f3183l = viewFindViewById;
        }

        private boolean s(View view, int i10) {
            int iB = m.b(((f) view.getLayoutParams()).f3178g, i10);
            return iB != 0 && (m.b(this.f3179h, i10) & iB) == iB;
        }

        private boolean t(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f3182k.getId() != this.f3177f) {
                return false;
            }
            View view2 = this.f3182k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.f3183l = null;
                    this.f3182k = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.f3183l = view2;
            return true;
        }

        boolean a() {
            return this.f3182k == null && this.f3177f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.f3183l || s(view2, q0.B(coordinatorLayout))) {
                return true;
            }
            c cVar = this.f3172a;
            return cVar != null && cVar.i(coordinatorLayout, view, view2);
        }

        boolean c() {
            if (this.f3172a == null) {
                this.f3184m = false;
            }
            return this.f3184m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f3177f == -1) {
                this.f3183l = null;
                this.f3182k = null;
                return null;
            }
            if (this.f3182k == null || !t(view, coordinatorLayout)) {
                n(view, coordinatorLayout);
            }
            return this.f3182k;
        }

        public int e() {
            return this.f3177f;
        }

        public c f() {
            return this.f3172a;
        }

        boolean g() {
            return this.f3187p;
        }

        Rect h() {
            return this.f3188q;
        }

        boolean i(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f3184m;
            if (z10) {
                return true;
            }
            c cVar = this.f3172a;
            boolean zE = (cVar != null ? cVar.e(coordinatorLayout, view) : false) | z10;
            this.f3184m = zE;
            return zE;
        }

        boolean j(int i10) {
            if (i10 == 0) {
                return this.f3185n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f3186o;
        }

        void k() {
            this.f3187p = false;
        }

        void l(int i10) {
            r(i10, false);
        }

        void m() {
            this.f3184m = false;
        }

        public void o(c cVar) {
            c cVar2 = this.f3172a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.n();
                }
                this.f3172a = cVar;
                this.f3189r = null;
                this.f3173b = true;
                if (cVar != null) {
                    cVar.k(this);
                }
            }
        }

        void p(boolean z10) {
            this.f3187p = z10;
        }

        void q(Rect rect) {
            this.f3188q.set(rect);
        }

        void r(int i10, boolean z10) {
            if (i10 == 0) {
                this.f3185n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f3186o = z10;
            }
        }

        f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3173b = false;
            this.f3174c = 0;
            this.f3175d = 0;
            this.f3176e = -1;
            this.f3177f = -1;
            this.f3178g = 0;
            this.f3179h = 0;
            this.f3188q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.c.f74e);
            this.f3174c = typedArrayObtainStyledAttributes.getInteger(a0.c.f75f, 0);
            this.f3177f = typedArrayObtainStyledAttributes.getResourceId(a0.c.f76g, -1);
            this.f3175d = typedArrayObtainStyledAttributes.getInteger(a0.c.f77h, 0);
            this.f3176e = typedArrayObtainStyledAttributes.getInteger(a0.c.f81l, -1);
            this.f3178g = typedArrayObtainStyledAttributes.getInt(a0.c.f80k, 0);
            this.f3179h = typedArrayObtainStyledAttributes.getInt(a0.c.f79j, 0);
            int i10 = a0.c.f78i;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i10);
            this.f3173b = zHasValue;
            if (zHasValue) {
                this.f3172a = CoordinatorLayout.K(context, attributeSet, typedArrayObtainStyledAttributes.getString(i10));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f3172a;
            if (cVar != null) {
                cVar.k(this);
            }
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f3173b = false;
            this.f3174c = 0;
            this.f3175d = 0;
            this.f3176e = -1;
            this.f3177f = -1;
            this.f3178g = 0;
            this.f3179h = 0;
            this.f3188q = new Rect();
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3173b = false;
            this.f3174c = 0;
            this.f3175d = 0;
            this.f3176e = -1;
            this.f3177f = -1;
            this.f3178g = 0;
            this.f3179h = 0;
            this.f3188q = new Rect();
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3173b = false;
            this.f3174c = 0;
            this.f3175d = 0;
            this.f3176e = -1;
            this.f3177f = -1;
            this.f3178g = 0;
            this.f3179h = 0;
            this.f3188q = new Rect();
        }
    }
}
