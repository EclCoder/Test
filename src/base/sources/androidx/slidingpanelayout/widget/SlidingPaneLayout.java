package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.transition.t;
import androidx.window.layout.j;
import androidx.window.layout.q;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import n0.k1;
import n0.q0;
import o0.p;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class SlidingPaneLayout extends ViewGroup implements v0.c {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static boolean f7201x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f7202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f7204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f7205d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7206e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    View f7207f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f7208g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f7209h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f7210i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f7211j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f7212k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f7213l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f7214m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f7215n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final v0.d f7216o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    boolean f7217p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f7218q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Rect f7219r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final ArrayList f7220s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7221t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    j f7222u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.a.InterfaceC0086a f7223v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.a f7224w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements androidx.slidingpanelayout.widget.a.InterfaceC0086a {
        a() {
        }

        @Override // androidx.slidingpanelayout.widget.a.InterfaceC0086a
        public void a(j jVar) {
            SlidingPaneLayout.this.f7222u = jVar;
            androidx.transition.b bVar = new androidx.transition.b();
            bVar.c0(300L);
            bVar.e0(p0.a.a(0.2f, 0.0f, 0.0f, 1.0f));
            t.b(SlidingPaneLayout.this, bVar);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends n0.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f7226d = new Rect();

        b() {
        }

        private void n(p pVar, p pVar2) {
            Rect rect = this.f7226d;
            pVar2.n(rect);
            pVar.q0(rect);
            pVar.a1(pVar2.f0());
            pVar.L0(pVar2.D());
            pVar.u0(pVar2.s());
            pVar.y0(pVar2.v());
            pVar.A0(pVar2.T());
            pVar.v0(pVar2.R());
            pVar.C0(pVar2.V());
            pVar.D0(pVar2.W());
            pVar.n0(pVar2.O());
            pVar.T0(pVar2.c0());
            pVar.I0(pVar2.Z());
            pVar.a(pVar2.k());
            pVar.K0(pVar2.B());
        }

        @Override // n0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.slidingpanelayout.widget.SlidingPaneLayout");
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            p pVarI0 = p.i0(pVar);
            super.g(view, pVarI0);
            n(pVar, pVarI0);
            pVarI0.k0();
            pVar.u0("androidx.slidingpanelayout.widget.SlidingPaneLayout");
            pVar.V0(view);
            Object objH = q0.H(view);
            if (objH instanceof View) {
                pVar.N0((View) objH);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!o(childAt) && childAt.getVisibility() == 0) {
                    q0.t0(childAt, 1);
                    pVar.c(childAt);
                }
            }
        }

        @Override // n0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (o(view)) {
                return false;
            }
            return super.i(viewGroup, view, accessibilityEvent);
        }

        public boolean o(View view) {
            return SlidingPaneLayout.this.j(view);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends v0.d.AbstractC0826d {
        c() {
        }

        private boolean n() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (slidingPaneLayout.f7211j || slidingPaneLayout.getLockMode() == 3) {
                return false;
            }
            if (SlidingPaneLayout.this.l() && SlidingPaneLayout.this.getLockMode() == 1) {
                return false;
            }
            return SlidingPaneLayout.this.l() || SlidingPaneLayout.this.getLockMode() != 2;
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            d dVar = (d) SlidingPaneLayout.this.f7207f.getLayoutParams();
            if (SlidingPaneLayout.this.k()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin) + SlidingPaneLayout.this.f7207f.getWidth());
                return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.f7210i);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
            return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.f7210i + paddingLeft);
        }

        @Override // v0.d.AbstractC0826d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // v0.d.AbstractC0826d
        public int d(View view) {
            return SlidingPaneLayout.this.f7210i;
        }

        @Override // v0.d.AbstractC0826d
        public void f(int i10, int i11) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f7216o.d(slidingPaneLayout.f7207f, i11);
            }
        }

        @Override // v0.d.AbstractC0826d
        public void h(int i10, int i11) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f7216o.d(slidingPaneLayout.f7207f, i11);
            }
        }

        @Override // v0.d.AbstractC0826d
        public void i(View view, int i10) {
            SlidingPaneLayout.this.s();
        }

        @Override // v0.d.AbstractC0826d
        public void j(int i10) {
            if (SlidingPaneLayout.this.f7216o.D() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f7208g != 1.0f) {
                    slidingPaneLayout.e(slidingPaneLayout.f7207f);
                    SlidingPaneLayout.this.f7217p = true;
                } else {
                    slidingPaneLayout.v(slidingPaneLayout.f7207f);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.d(slidingPaneLayout2.f7207f);
                    SlidingPaneLayout.this.f7217p = false;
                }
            }
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout.this.o(i10);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            int paddingLeft;
            d dVar = (d) view.getLayoutParams();
            if (SlidingPaneLayout.this.k()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                if (f10 < 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f7208g > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f7210i;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f7207f.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) dVar).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f10 > 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f7208g > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f7210i;
                }
            }
            SlidingPaneLayout.this.f7216o.S(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            if (n()) {
                return ((d) view.getLayoutParams()).f7231b;
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class f extends u0.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7233c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f7234d;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i10) {
                return new f[i10];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7233c ? 1 : 0);
            parcel.writeInt(this.f7234d);
        }

        f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7233c = parcel.readInt() != 0;
            this.f7234d = parcel.readInt();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class g extends FrameLayout {
        g(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    static {
        f7201x = Build.VERSION.SDK_INT >= 29;
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7202a = 0;
        this.f7208g = 1.0f;
        this.f7215n = new CopyOnWriteArrayList();
        this.f7218q = true;
        this.f7219r = new Rect();
        this.f7220s = new ArrayList();
        this.f7223v = new a();
        float f10 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        q0.m0(this, new b());
        q0.t0(this, 1);
        v0.d dVarP = v0.d.p(this, 0.5f, new c());
        this.f7216o = dVarP;
        dVarP.R(f10 * 400.0f);
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.a(q.a(context), androidx.core.content.a.getMainExecutor(context)));
    }

    private boolean c(int i10) {
        if (!this.f7206e) {
            this.f7217p = false;
        }
        if (!this.f7218q && !t(1.0f, i10)) {
            return false;
        }
        this.f7217p = false;
        return true;
    }

    private static Activity g(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private e0.b getSystemGestureInsets() {
        k1 k1VarI;
        if (!f7201x || (k1VarI = q0.I(this)) == null) {
            return null;
        }
        return k1VarI.j();
    }

    private static Rect h(j jVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], view.getWidth() + i10, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(jVar.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int i(View view) {
        return view instanceof g ? q0.D(((g) view).getChildAt(0)) : q0.D(view);
    }

    private static int n(View view, int i10, int i11) {
        d dVar = (d) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) dVar).width != 0 || dVar.f7230a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i10, i11, ((ViewGroup.MarginLayoutParams) dVar).height);
    }

    private boolean q(int i10) {
        if (!this.f7206e) {
            this.f7217p = true;
        }
        if (!this.f7218q && !t(0.0f, i10)) {
            return false;
        }
        this.f7217p = true;
        return true;
    }

    private void r(float f10) {
        boolean zK = k();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f7207f) {
                float f11 = 1.0f - this.f7209h;
                int i11 = this.f7212k;
                this.f7209h = f10;
                int i12 = ((int) (f11 * i11)) - ((int) ((1.0f - f10) * i11));
                if (zK) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.a aVar) {
        this.f7224w = aVar;
        aVar.f(this.f7223v);
    }

    private ArrayList u() {
        Rect rectH;
        j jVar = this.f7222u;
        if (jVar == null || !jVar.a() || this.f7222u.getBounds().left == 0 || this.f7222u.getBounds().top != 0 || (rectH = h(this.f7222u, this)) == null) {
            return null;
        }
        Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectH.left), getHeight() - getPaddingBottom());
        int width = getWidth() - getPaddingRight();
        return new ArrayList(Arrays.asList(rect, new Rect(Math.min(width, rectH.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
    }

    private static boolean w(View view) {
        return view.isOpaque();
    }

    public void a(e eVar) {
        this.f7215n.add(eVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new g(view), i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    public boolean b() {
        return c(0);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f7216o.o(true)) {
            if (this.f7206e) {
                q0.d0(this);
            } else {
                this.f7216o.a();
            }
        }
    }

    void d(View view) {
        Iterator it = this.f7215n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int right;
        super.draw(canvas);
        Drawable drawable = k() ? this.f7205d : this.f7204c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (k()) {
            right = childAt.getRight();
            i10 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i11 = left - intrinsicWidth;
            i10 = left;
            right = i11;
        }
        drawable.setBounds(right, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        if (k() ^ l()) {
            this.f7216o.Q(1);
            e0.b systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                v0.d dVar = this.f7216o;
                dVar.P(Math.max(dVar.z(), systemGestureInsets.f37000a));
            }
        } else {
            this.f7216o.Q(2);
            e0.b systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                v0.d dVar2 = this.f7216o;
                dVar2.P(Math.max(dVar2.z(), systemGestureInsets2.f37002c));
            }
        }
        d dVar3 = (d) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f7206e && !dVar3.f7231b && this.f7207f != null) {
            canvas.getClipBounds(this.f7219r);
            if (k()) {
                Rect rect = this.f7219r;
                rect.left = Math.max(rect.left, this.f7207f.getRight());
            } else {
                Rect rect2 = this.f7219r;
                rect2.right = Math.min(rect2.right, this.f7207f.getLeft());
            }
            canvas.clipRect(this.f7219r);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void e(View view) {
        Iterator it = this.f7215n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        sendAccessibilityEvent(32);
    }

    void f(View view) {
        Iterator it = this.f7215n.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @Deprecated
    public int getCoveredFadeColor() {
        return this.f7203b;
    }

    public final int getLockMode() {
        return this.f7221t;
    }

    public int getParallaxDistance() {
        return this.f7212k;
    }

    @Deprecated
    public int getSliderFadeColor() {
        return this.f7202a;
    }

    boolean j(View view) {
        if (view == null) {
            return false;
        }
        return this.f7206e && ((d) view.getLayoutParams()).f7232c && this.f7208g > 0.0f;
    }

    boolean k() {
        return q0.B(this) == 1;
    }

    public boolean l() {
        return !this.f7206e || this.f7208g == 0.0f;
    }

    public boolean m() {
        return this.f7206e;
    }

    void o(int i10) {
        if (this.f7207f == null) {
            this.f7208g = 0.0f;
            return;
        }
        boolean zK = k();
        d dVar = (d) this.f7207f.getLayoutParams();
        int width = this.f7207f.getWidth();
        if (zK) {
            i10 = (getWidth() - i10) - width;
        }
        float paddingRight = (i10 - ((zK ? getPaddingRight() : getPaddingLeft()) + (zK ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin))) / this.f7210i;
        this.f7208g = paddingRight;
        if (this.f7212k != 0) {
            r(paddingRight);
        }
        f(this.f7207f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityG;
        super.onAttachedToWindow();
        this.f7218q = true;
        if (this.f7224w == null || (activityG = g(getContext())) == null) {
            return;
        }
        this.f7224w.e(activityG);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f7218q = true;
        androidx.slidingpanelayout.widget.a aVar = this.f7224w;
        if (aVar != null) {
            aVar.g();
        }
        if (this.f7220s.size() <= 0) {
            this.f7220s.clear();
        } else {
            android.support.v4.media.session.b.a(this.f7220s.get(0));
            throw null;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.f7206e && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f7217p = this.f7216o.H(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.f7206e || (this.f7211j && actionMasked != 0)) {
            this.f7216o.c();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.f7216o.c();
            return false;
        }
        if (actionMasked == 0) {
            this.f7211j = false;
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f7213l = x10;
            this.f7214m = y10;
            if (this.f7216o.H(this.f7207f, (int) x10, (int) y10) && j(this.f7207f)) {
                z10 = true;
            }
            return !this.f7216o.T(motionEvent) || z10;
        }
        if (actionMasked == 2) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float fAbs = Math.abs(x11 - this.f7213l);
            float fAbs2 = Math.abs(y11 - this.f7214m);
            if (fAbs > this.f7216o.C() && fAbs2 > fAbs) {
                this.f7216o.c();
                this.f7211j = true;
                return false;
            }
        }
        z10 = false;
        if (this.f7216o.T(motionEvent)) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        j jVar;
        int iWidth;
        boolean zK = k();
        int i18 = i12 - i10;
        int paddingRight = zK ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zK ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f7218q) {
            this.f7208g = (this.f7206e && this.f7217p) ? 0.0f : 1.0f;
        }
        int i19 = paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (dVar.f7231b) {
                    int i21 = i18 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i21) - i19) - (((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin);
                    this.f7210i = iMin;
                    int i22 = zK ? ((ViewGroup.MarginLayoutParams) dVar).rightMargin : ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                    dVar.f7232c = ((i19 + i22) + iMin) + (measuredWidth / 2) > i21;
                    int i23 = (int) (iMin * this.f7208g);
                    i19 += i22 + i23;
                    this.f7208g = i23 / iMin;
                } else {
                    if (!this.f7206e || (i14 = this.f7212k) == 0) {
                        i19 = paddingRight;
                    } else {
                        i15 = (int) ((1.0f - this.f7208g) * i14);
                        i19 = paddingRight;
                    }
                    if (zK) {
                        i17 = (i18 - i19) + i15;
                        i16 = i17 - measuredWidth;
                    } else {
                        i16 = i19 - i15;
                        i17 = i16 + measuredWidth;
                    }
                    childAt.layout(i16, paddingTop, i17, childAt.getMeasuredHeight() + paddingTop);
                    jVar = this.f7222u;
                    if (jVar == null && jVar.b() == j.a.f7708c && this.f7222u.a()) {
                        iWidth = this.f7222u.getBounds().width();
                    } else {
                        iWidth = 0;
                    }
                    paddingRight += childAt.getWidth() + Math.abs(iWidth);
                }
                i15 = 0;
                if (zK) {
                    i17 = (i18 - i19) + i15;
                    i16 = i17 - measuredWidth;
                } else {
                    i16 = i19 - i15;
                    i17 = i16 + measuredWidth;
                }
                childAt.layout(i16, paddingTop, i17, childAt.getMeasuredHeight() + paddingTop);
                jVar = this.f7222u;
                if (jVar == null) {
                    iWidth = 0;
                } else {
                    iWidth = 0;
                }
                paddingRight += childAt.getWidth() + Math.abs(iWidth);
            }
        }
        if (this.f7218q) {
            if (this.f7206e && this.f7212k != 0) {
                r(this.f7208g);
            }
            v(this.f7207f);
        }
        this.f7218q = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int paddingTop;
        int iMin;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int i13;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.f7207f = null;
        int i14 = 0;
        boolean z10 = false;
        int i15 = iMax2;
        float f10 = 0.0f;
        while (true) {
            i12 = 8;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            d dVar = (d) childAt.getLayoutParams();
            int i16 = iMax2;
            if (childAt.getVisibility() == 8) {
                dVar.f7232c = false;
            } else {
                float f11 = dVar.f7230a;
                if (f11 > 0.0f) {
                    f10 += f11;
                    if (((ViewGroup.MarginLayoutParams) dVar).width == 0) {
                    }
                    i14 = i13 + 1;
                    iMax2 = i16;
                }
                int iMax3 = Math.max(i16 - (((ViewGroup.MarginLayoutParams) dVar).leftMargin + ((ViewGroup.MarginLayoutParams) dVar).rightMargin), 0);
                int i17 = ((ViewGroup.MarginLayoutParams) dVar).width;
                i13 = i14;
                childAt.measure(i17 == -2 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE) : i17 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i17, 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) dVar).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > iMin) {
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        iMin = measuredHeight;
                    }
                }
                i15 -= measuredWidth;
                if (i13 != 0) {
                    boolean z11 = i15 < 0;
                    dVar.f7231b = z11;
                    z10 |= z11;
                    if (z11) {
                        this.f7207f = childAt;
                    }
                }
                i14 = i13 + 1;
                iMax2 = i16;
            }
            i13 = i14;
            i14 = i13 + 1;
            iMax2 = i16;
        }
        int i18 = iMax2;
        if (z10 || f10 > 0.0f) {
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() != i12) {
                    d dVar2 = (d) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) dVar2).width != 0 || dVar2.f7230a <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z10) {
                        iMax = i18 - (((ViewGroup.MarginLayoutParams) dVar2).leftMargin + ((ViewGroup.MarginLayoutParams) dVar2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (dVar2.f7230a > 0.0f) {
                        iMax = ((int) ((dVar2.f7230a * Math.max(0, i15)) / f10)) + measuredWidth2;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int iN = n(childAt2, i11, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iN);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight2;
                            }
                        }
                    }
                }
                i19++;
                i12 = 8;
            }
        }
        ArrayList arrayListU = u();
        if (arrayListU != null && !z10) {
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = (Rect) arrayListU.get(i20);
                    d dVar3 = (d) childAt3.getLayoutParams();
                    int i21 = ((ViewGroup.MarginLayoutParams) dVar3).leftMargin + ((ViewGroup.MarginLayoutParams) dVar3).rightMargin;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & C.DEFAULT_MUXED_BUFFER_SIZE) == 1 || (i(childAt3) != 0 && rect.width() < i(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(i18 - i21, 1073741824), iMakeMeasureSpec2);
                        if (i20 != 0) {
                            dVar3.f7231b = true;
                            this.f7207f = childAt3;
                            z10 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec2);
                    }
                }
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.f7206e = z10;
        if (this.f7216o.D() == 0 || z10) {
            return;
        }
        this.f7216o.a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        if (fVar.f7233c) {
            p();
        } else {
            b();
        }
        this.f7217p = fVar.f7233c;
        setLockMode(fVar.f7234d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f7233c = m() ? l() : this.f7217p;
        fVar.f7234d = this.f7221t;
        return fVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f7218q = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f7206e) {
            return super.onTouchEvent(motionEvent);
        }
        this.f7216o.I(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f7213l = x10;
            this.f7214m = y10;
            return true;
        }
        if (actionMasked == 1 && j(this.f7207f)) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f10 = x11 - this.f7213l;
            float f11 = y11 - this.f7214m;
            int iC = this.f7216o.C();
            if ((f10 * f10) + (f11 * f11) < iC * iC && this.f7216o.H(this.f7207f, (int) x11, (int) y11)) {
                c(0);
            }
        }
        return true;
    }

    @Override // v0.c
    public void open() {
        p();
    }

    public boolean p() {
        return q(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (view.getParent() instanceof g) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f7206e) {
            return;
        }
        this.f7217p = view == this.f7207f;
    }

    void s() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void setCoveredFadeColor(int i10) {
        this.f7203b = i10;
    }

    public final void setLockMode(int i10) {
        this.f7221t = i10;
    }

    @Deprecated
    public void setPanelSlideListener(e eVar) {
        if (eVar != null) {
            a(eVar);
        }
    }

    public void setParallaxDistance(int i10) {
        this.f7212k = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.f7204c = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.f7205d = drawable;
    }

    @Deprecated
    public void setShadowResource(int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(androidx.core.content.a.getDrawable(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(int i10) {
        this.f7202a = i10;
    }

    boolean t(float f10, int i10) {
        int paddingLeft;
        if (!this.f7206e) {
            return false;
        }
        boolean zK = k();
        d dVar = (d) this.f7207f.getLayoutParams();
        if (zK) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) dVar).rightMargin) + (f10 * this.f7210i)) + this.f7207f.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) dVar).leftMargin + (f10 * this.f7210i));
        }
        v0.d dVar2 = this.f7216o;
        View view = this.f7207f;
        if (!dVar2.U(view, paddingLeft, view.getTop())) {
            return false;
        }
        s();
        q0.d0(this);
        return true;
    }

    void v(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View childAt;
        View view2 = view;
        boolean zK = k();
        int width = zK ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zK ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !w(view2)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount && (childAt = getChildAt(i10)) != view2) {
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zK ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zK ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i10++;
            view2 = view;
            zK = zK;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class d extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final int[] f7229d = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f7230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f7231b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f7232c;

        public d() {
            super(-1, -1);
            this.f7230a = 0.0f;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f7230a = 0.0f;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f7230a = 0.0f;
        }

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f7230a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f7229d);
            this.f7230a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }
}
