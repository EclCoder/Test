package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.google.api.client.googleapis.media.MediaHttpUploader;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;
import n0.k1;
import n0.m;
import n0.q0;
import o0.p;
import o0.s;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class DrawerLayout extends ViewGroup implements v0.c {
    private static final int[] L = {R.attr.colorPrimaryDark};
    static final int[] M = {R.attr.layout_gravity};
    static final boolean N;
    private static final boolean O;
    private static boolean P;
    private CharSequence A;
    private Object B;
    private boolean C;
    private Drawable D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private final ArrayList H;
    private Rect I;
    private Matrix J;
    private final s K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f3783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f3784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f3785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3786d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f3787e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Paint f3788f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0.d f3789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v0.d f3790h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final i f3791i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final i f3792j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3793k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f3794l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f3795m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f3796n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f3797o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f3798p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f3799q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f3800r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private e f3801s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private List f3802t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f3803u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f3804v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Drawable f3805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f3806x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f3807y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private CharSequence f3808z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements s {
        a() {
        }

        @Override // o0.s
        public boolean a(View view, s.a aVar) {
            if (!DrawerLayout.this.D(view) || DrawerLayout.this.r(view) == 2) {
                return false;
            }
            DrawerLayout.this.f(view);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements View.OnApplyWindowInsetsListener {
        b() {
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends n0.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f3811d = new Rect();

        c() {
        }

        private void n(p pVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (DrawerLayout.A(childAt)) {
                    pVar.c(childAt);
                }
            }
        }

        private void o(p pVar, p pVar2) {
            Rect rect = this.f3811d;
            pVar2.n(rect);
            pVar.q0(rect);
            pVar.a1(pVar2.f0());
            pVar.L0(pVar2.D());
            pVar.u0(pVar2.s());
            pVar.y0(pVar2.v());
            pVar.A0(pVar2.T());
            pVar.D0(pVar2.W());
            pVar.n0(pVar2.O());
            pVar.T0(pVar2.c0());
            pVar.a(pVar2.k());
        }

        @Override // n0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() != 32) {
                return super.a(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View viewP = DrawerLayout.this.p();
            if (viewP == null) {
                return true;
            }
            CharSequence charSequenceS = DrawerLayout.this.s(DrawerLayout.this.t(viewP));
            if (charSequenceS == null) {
                return true;
            }
            text.add(charSequenceS);
            return true;
        }

        @Override // n0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            if (DrawerLayout.N) {
                super.g(view, pVar);
            } else {
                p pVarI0 = p.i0(pVar);
                super.g(view, pVarI0);
                pVar.V0(view);
                Object objH = q0.H(view);
                if (objH instanceof View) {
                    pVar.N0((View) objH);
                }
                o(pVar, pVarI0);
                pVarI0.k0();
                n(pVar, (ViewGroup) view);
            }
            pVar.u0("androidx.drawerlayout.widget.DrawerLayout");
            pVar.C0(false);
            pVar.D0(false);
            pVar.l0(p.a.f47924e);
            pVar.l0(p.a.f47925f);
        }

        @Override // n0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.N || DrawerLayout.A(view)) {
                return super.i(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static final class d extends n0.a {
        d() {
        }

        @Override // n0.a
        public void g(View view, p pVar) {
            super.g(view, pVar);
            if (DrawerLayout.A(view)) {
                return;
            }
            pVar.N0(null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public interface e {
        void a(View view);

        void b(View view);

        void c(int i10);

        void d(View view, float f10);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class i extends v0.d.AbstractC0826d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v0.d f3823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f3824c = new a();

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.o();
            }
        }

        i(int i10) {
            this.f3822a = i10;
        }

        private void n() {
            View viewN = DrawerLayout.this.n(this.f3822a == 3 ? 5 : 3);
            if (viewN != null) {
                DrawerLayout.this.f(viewN);
            }
        }

        @Override // v0.d.AbstractC0826d
        public int a(View view, int i10, int i11) {
            if (DrawerLayout.this.c(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i10, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i10, width));
        }

        @Override // v0.d.AbstractC0826d
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // v0.d.AbstractC0826d
        public int d(View view) {
            if (DrawerLayout.this.E(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // v0.d.AbstractC0826d
        public void f(int i10, int i11) {
            View viewN = (i10 & 1) == 1 ? DrawerLayout.this.n(3) : DrawerLayout.this.n(5);
            if (viewN == null || DrawerLayout.this.r(viewN) != 0) {
                return;
            }
            this.f3823b.d(viewN, i11);
        }

        @Override // v0.d.AbstractC0826d
        public boolean g(int i10) {
            return false;
        }

        @Override // v0.d.AbstractC0826d
        public void h(int i10, int i11) {
            DrawerLayout.this.postDelayed(this.f3824c, 160L);
        }

        @Override // v0.d.AbstractC0826d
        public void i(View view, int i10) {
            ((f) view.getLayoutParams()).f3815c = false;
            n();
        }

        @Override // v0.d.AbstractC0826d
        public void j(int i10) {
            DrawerLayout.this.X(i10, this.f3823b.y());
        }

        @Override // v0.d.AbstractC0826d
        public void k(View view, int i10, int i11, int i12, int i13) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.c(view, 3) ? i10 + width : DrawerLayout.this.getWidth() - i10) / width;
            DrawerLayout.this.U(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        @Override // v0.d.AbstractC0826d
        public void l(View view, float f10, float f11) {
            int i10;
            float fU = DrawerLayout.this.u(view);
            int width = view.getWidth();
            if (DrawerLayout.this.c(view, 3)) {
                i10 = (f10 > 0.0f || (f10 == 0.0f && fU > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f10 < 0.0f || (f10 == 0.0f && fU > 0.5f)) {
                    width2 -= width;
                }
                i10 = width2;
            }
            this.f3823b.S(i10, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // v0.d.AbstractC0826d
        public boolean m(View view, int i10) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.f3822a) && DrawerLayout.this.r(view) == 0;
        }

        void o() {
            View viewN;
            int width;
            int iA = this.f3823b.A();
            boolean z10 = this.f3822a == 3;
            if (z10) {
                viewN = DrawerLayout.this.n(3);
                width = (viewN != null ? -viewN.getWidth() : 0) + iA;
            } else {
                viewN = DrawerLayout.this.n(5);
                width = DrawerLayout.this.getWidth() - iA;
            }
            if (viewN != null) {
                if (((!z10 || viewN.getLeft() >= width) && (z10 || viewN.getLeft() <= width)) || DrawerLayout.this.r(viewN) != 0) {
                    return;
                }
                f fVar = (f) viewN.getLayoutParams();
                this.f3823b.U(viewN, width, viewN.getTop());
                fVar.f3815c = true;
                DrawerLayout.this.invalidate();
                n();
                DrawerLayout.this.b();
            }
        }

        public void p() {
            DrawerLayout.this.removeCallbacks(this.f3824c);
        }

        public void q(v0.d dVar) {
            this.f3823b = dVar;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        N = true;
        O = true;
        P = i10 >= 29;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e1.a.f37030a);
    }

    static boolean A(View view) {
        return (q0.z(view) == 4 || q0.z(view) == 2) ? false : true;
    }

    private boolean H(float f10, float f11, View view) {
        if (this.I == null) {
            this.I = new Rect();
        }
        view.getHitRect(this.I);
        return this.I.contains((int) f10, (int) f11);
    }

    private void I(Drawable drawable, int i10) {
        if (drawable == null || !f0.a.h(drawable)) {
            return;
        }
        f0.a.m(drawable, i10);
    }

    private Drawable P() {
        int iB = q0.B(this);
        if (iB == 0) {
            Drawable drawable = this.D;
            if (drawable != null) {
                I(drawable, iB);
                return this.D;
            }
        } else {
            Drawable drawable2 = this.E;
            if (drawable2 != null) {
                I(drawable2, iB);
                return this.E;
            }
        }
        return this.F;
    }

    private Drawable Q() {
        int iB = q0.B(this);
        if (iB == 0) {
            Drawable drawable = this.E;
            if (drawable != null) {
                I(drawable, iB);
                return this.E;
            }
        } else {
            Drawable drawable2 = this.D;
            if (drawable2 != null) {
                I(drawable2, iB);
                return this.D;
            }
        }
        return this.G;
    }

    private void R() {
        if (O) {
            return;
        }
        this.f3806x = P();
        this.f3807y = Q();
    }

    private void V(View view) {
        p.a aVar = p.a.f47944y;
        q0.g0(view, aVar.b());
        if (!D(view) || r(view) == 2) {
            return;
        }
        q0.i0(view, aVar, null, this.K);
    }

    private void W(View view, boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((z10 || E(childAt)) && !(z10 && childAt == view)) {
                q0.t0(childAt, 4);
            } else {
                q0.t0(childAt, 1);
            }
        }
    }

    private boolean m(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventV = v(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventV);
            motionEventV.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    private MotionEvent v(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.J == null) {
                this.J = new Matrix();
            }
            matrix.invert(this.J);
            motionEventObtain.transform(this.J);
        }
        return motionEventObtain;
    }

    static String w(int i10) {
        if ((i10 & 3) == 3) {
            return "LEFT";
        }
        return (i10 & 5) == 5 ? "RIGHT" : Integer.toHexString(i10);
    }

    private static boolean x(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean y() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((f) getChildAt(i10).getLayoutParams()).f3815c) {
                return true;
            }
        }
        return false;
    }

    private boolean z() {
        return p() != null;
    }

    boolean B(View view) {
        return ((f) view.getLayoutParams()).f3813a == 0;
    }

    public boolean C(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return D(viewN);
        }
        return false;
    }

    public boolean D(View view) {
        if (E(view)) {
            return (((f) view.getLayoutParams()).f3816d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    boolean E(View view) {
        int iB = m.b(((f) view.getLayoutParams()).f3813a, q0.B(view));
        return ((iB & 3) == 0 && (iB & 5) == 0) ? false : true;
    }

    public boolean F(int i10) {
        View viewN = n(i10);
        if (viewN != null) {
            return G(viewN);
        }
        return false;
    }

    public boolean G(View view) {
        if (E(view)) {
            return ((f) view.getLayoutParams()).f3814b > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void J(View view, float f10) {
        float fU = u(view);
        float width = view.getWidth();
        int i10 = ((int) (width * f10)) - ((int) (fU * width));
        if (!c(view, 3)) {
            i10 = -i10;
        }
        view.offsetLeftAndRight(i10);
        U(view, f10);
    }

    public void K(int i10) {
        L(i10, true);
    }

    public void L(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            N(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void M(View view) {
        N(view, true);
    }

    public void N(View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f3795m) {
            fVar.f3814b = 1.0f;
            fVar.f3816d = 1;
            W(view, true);
            V(view);
        } else if (z10) {
            fVar.f3816d |= 2;
            if (c(view, 3)) {
                this.f3789g.U(view, 0, view.getTop());
            } else {
                this.f3790h.U(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            J(view, 1.0f);
            X(0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void O(e eVar) {
        List list;
        if (eVar == null || (list = this.f3802t) == null) {
            return;
        }
        list.remove(eVar);
    }

    public void S(Object obj, boolean z10) {
        this.B = obj;
        this.C = z10;
        setWillNotDraw(!z10 && getBackground() == null);
        requestLayout();
    }

    public void T(int i10, int i11) {
        View viewN;
        int iB = m.b(i11, q0.B(this));
        if (i11 == 3) {
            this.f3796n = i10;
        } else if (i11 == 5) {
            this.f3797o = i10;
        } else if (i11 == 8388611) {
            this.f3798p = i10;
        } else if (i11 == 8388613) {
            this.f3799q = i10;
        }
        if (i10 != 0) {
            (iB == 3 ? this.f3789g : this.f3790h).c();
        }
        if (i10 != 1) {
            if (i10 == 2 && (viewN = n(iB)) != null) {
                M(viewN);
                return;
            }
            return;
        }
        View viewN2 = n(iB);
        if (viewN2 != null) {
            f(viewN2);
        }
    }

    void U(View view, float f10) {
        f fVar = (f) view.getLayoutParams();
        if (f10 == fVar.f3814b) {
            return;
        }
        fVar.f3814b = f10;
        l(view, f10);
    }

    void X(int i10, View view) {
        int i11;
        int iD = this.f3789g.D();
        int iD2 = this.f3790h.D();
        if (iD == 1 || iD2 == 1) {
            i11 = 1;
        } else {
            i11 = 2;
            if (iD != 2 && iD2 != 2) {
                i11 = 0;
            }
        }
        if (view != null && i10 == 0) {
            float f10 = ((f) view.getLayoutParams()).f3814b;
            if (f10 == 0.0f) {
                j(view);
            } else if (f10 == 1.0f) {
                k(view);
            }
        }
        if (i11 != this.f3793k) {
            this.f3793k = i11;
            List list = this.f3802t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f3802t.get(size)).c(i11);
                }
            }
        }
    }

    public void a(e eVar) {
        if (eVar == null) {
            return;
        }
        if (this.f3802t == null) {
            this.f3802t = new ArrayList();
        }
        this.f3802t.add(eVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i10, int i11) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (!E(childAt)) {
                this.H.add(childAt);
            } else if (D(childAt)) {
                childAt.addFocusables(arrayList, i10, i11);
                z10 = true;
            }
        }
        if (!z10) {
            int size = this.H.size();
            for (int i13 = 0; i13 < size; i13++) {
                View view = (View) this.H.get(i13);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i10, i11);
                }
            }
        }
        this.H.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
        if (o() != null || E(view)) {
            q0.t0(view, 4);
        } else {
            q0.t0(view, 1);
        }
        if (N) {
            return;
        }
        q0.m0(view, this.f3783a);
    }

    void b() {
        if (this.f3800r) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.f3800r = true;
    }

    boolean c(View view, int i10) {
        return (t(view) & i10) == i10;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof f) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < childCount; i10++) {
            fMax = Math.max(fMax, ((f) getChildAt(i10).getLayoutParams()).f3814b);
        }
        this.f3787e = fMax;
        boolean zO = this.f3789g.o(true);
        boolean zO2 = this.f3790h.o(true);
        if (zO || zO2) {
            q0.d0(this);
        }
    }

    public void d(int i10) {
        e(i10, true);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.f3787e <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt = getChildAt(i10);
            if (H(x10, y10, childAt) && !B(childAt) && m(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        int height = getHeight();
        boolean zB = B(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i10 = 0;
        if (zB) {
            int childCount = getChildCount();
            int i11 = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt != view && childAt.getVisibility() == 0 && x(childAt) && E(childAt) && childAt.getHeight() >= height) {
                    if (c(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i11) {
                            i11 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i11, 0, width, getHeight());
            i10 = i11;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        float f10 = this.f3787e;
        if (f10 > 0.0f && zB) {
            int i13 = this.f3786d;
            this.f3788f.setColor((i13 & 16777215) | (((int) ((((-16777216) & i13) >>> 24) * f10)) << 24));
            canvas.drawRect(i10, 0.0f, width, getHeight(), this.f3788f);
            return zDrawChild;
        }
        if (this.f3806x != null && c(view, 3)) {
            int intrinsicWidth = this.f3806x.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f3789g.A(), 1.0f));
            this.f3806x.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f3806x.setAlpha((int) (fMax * 255.0f));
            this.f3806x.draw(canvas);
            return zDrawChild;
        }
        if (this.f3807y != null && c(view, 5)) {
            int intrinsicWidth2 = this.f3807y.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f3790h.A(), 1.0f));
            this.f3807y.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f3807y.setAlpha((int) (fMax2 * 255.0f));
            this.f3807y.draw(canvas);
        }
        return zDrawChild;
    }

    public void e(int i10, boolean z10) {
        View viewN = n(i10);
        if (viewN != null) {
            g(viewN, z10);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + w(i10));
    }

    public void f(View view) {
        g(view, true);
    }

    public void g(View view, boolean z10) {
        if (!E(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        f fVar = (f) view.getLayoutParams();
        if (this.f3795m) {
            fVar.f3814b = 0.0f;
            fVar.f3816d = 0;
        } else if (z10) {
            fVar.f3816d |= 4;
            if (c(view, 3)) {
                this.f3789g.U(view, -view.getWidth(), view.getTop());
            } else {
                this.f3790h.U(view, getWidth(), view.getTop());
            }
        } else {
            J(view, 0.0f);
            X(0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new f(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof f) {
            return new f((f) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new f((ViewGroup.MarginLayoutParams) layoutParams) : new f(layoutParams);
    }

    public float getDrawerElevation() {
        if (O) {
            return this.f3784b;
        }
        return 0.0f;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.f3805w;
    }

    public void h() {
        i(false);
    }

    void i(boolean z10) {
        int childCount = getChildCount();
        boolean zU = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            f fVar = (f) childAt.getLayoutParams();
            if (E(childAt) && (!z10 || fVar.f3815c)) {
                zU |= c(childAt, 3) ? this.f3789g.U(childAt, -childAt.getWidth(), childAt.getTop()) : this.f3790h.U(childAt, getWidth(), childAt.getTop());
                fVar.f3815c = false;
            }
        }
        this.f3791i.p();
        this.f3792j.p();
        if (zU) {
            invalidate();
        }
    }

    void j(View view) {
        View rootView;
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f3816d & 1) == 1) {
            fVar.f3816d = 0;
            List list = this.f3802t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f3802t.get(size)).b(view);
                }
            }
            W(view, false);
            V(view);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void k(View view) {
        f fVar = (f) view.getLayoutParams();
        if ((fVar.f3816d & 1) == 0) {
            fVar.f3816d = 1;
            List list = this.f3802t;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((e) this.f3802t.get(size)).a(view);
                }
            }
            W(view, true);
            V(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    void l(View view, float f10) {
        List list = this.f3802t;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((e) this.f3802t.get(size)).d(view, f10);
            }
        }
    }

    View n(int i10) {
        int iB = m.b(i10, q0.B(this)) & 7;
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if ((t(childAt) & 7) == iB) {
                return childAt;
            }
        }
        return null;
    }

    View o() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if ((((f) childAt.getLayoutParams()).f3816d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3795m = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f3795m = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.C || this.f3805w == null) {
            return;
        }
        Object obj = this.B;
        int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
        if (systemWindowInsetTop > 0) {
            this.f3805w.setBounds(0, 0, getWidth(), systemWindowInsetTop);
            this.f3805w.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewV;
        int actionMasked = motionEvent.getActionMasked();
        boolean zT = this.f3789g.T(motionEvent) | this.f3790h.T(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                i(true);
                this.f3800r = false;
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    i(true);
                    this.f3800r = false;
                }
            } else if (this.f3789g.f(3)) {
                this.f3791i.p();
                this.f3792j.p();
            }
            z10 = false;
        } else {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f3803u = x10;
            this.f3804v = y10;
            z10 = this.f3787e > 0.0f && (viewV = this.f3789g.v((int) x10, (int) y10)) != null && B(viewV);
            this.f3800r = false;
        }
        return zT || z10 || y() || this.f3800r;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 != 4 || !z()) {
            return super.onKeyDown(i10, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (i10 != 4) {
            return super.onKeyUp(i10, keyEvent);
        }
        View viewP = p();
        if (viewP != null && r(viewP) == 0) {
            h();
        }
        return viewP != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        WindowInsets rootWindowInsets;
        float f10;
        int i14;
        boolean z11 = true;
        this.f3794l = true;
        int i15 = i12 - i10;
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (B(childAt)) {
                    int i17 = ((ViewGroup.MarginLayoutParams) fVar).leftMargin;
                    childAt.layout(i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin, childAt.getMeasuredWidth() + i17, ((ViewGroup.MarginLayoutParams) fVar).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (c(childAt, 3)) {
                        float f11 = measuredWidth;
                        i14 = (-measuredWidth) + ((int) (fVar.f3814b * f11));
                        f10 = (measuredWidth + i14) / f11;
                    } else {
                        float f12 = measuredWidth;
                        int i18 = i15 - ((int) (fVar.f3814b * f12));
                        f10 = (i15 - i18) / f12;
                        i14 = i18;
                    }
                    boolean z12 = f10 != fVar.f3814b ? z11 : false;
                    int i19 = fVar.f3813a & Sdk$SDKError.b.ASSET_REQUEST_ERROR_VALUE;
                    if (i19 == 16) {
                        int i20 = i13 - i11;
                        int i21 = (i20 - measuredHeight) / 2;
                        int i22 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        if (i21 < i22) {
                            i21 = i22;
                        } else {
                            int i23 = i21 + measuredHeight;
                            int i24 = ((ViewGroup.MarginLayoutParams) fVar).bottomMargin;
                            if (i23 > i20 - i24) {
                                i21 = (i20 - i24) - measuredHeight;
                            }
                        }
                        childAt.layout(i14, i21, measuredWidth + i14, measuredHeight + i21);
                    } else if (i19 != 80) {
                        int i25 = ((ViewGroup.MarginLayoutParams) fVar).topMargin;
                        childAt.layout(i14, i25, measuredWidth + i14, measuredHeight + i25);
                    } else {
                        int i26 = i13 - i11;
                        childAt.layout(i14, (i26 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i14, i26 - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
                    }
                    if (z12) {
                        U(childAt, f10);
                    }
                    int i27 = fVar.f3814b > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i27) {
                        childAt.setVisibility(i27);
                    }
                }
            }
            i16++;
            z11 = true;
        }
        if (P && (rootWindowInsets = getRootWindowInsets()) != null) {
            e0.b bVarJ = k1.E(rootWindowInsets).j();
            v0.d dVar = this.f3789g;
            dVar.P(Math.max(dVar.z(), bVarJ.f37000a));
            v0.d dVar2 = this.f3790h;
            dVar2.P(Math.max(dVar2.z(), bVarJ.f37002c));
        }
        this.f3794l = false;
        this.f3795m = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z10 = this.B != null && q0.y(this);
        int iB = q0.B(this);
        int childCount = getChildCount();
        boolean z11 = false;
        boolean z12 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                f fVar = (f) childAt.getLayoutParams();
                if (z10) {
                    int iB2 = m.b(fVar.f3813a, iB);
                    if (q0.y(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.B;
                        if (iB2 == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iB2 == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.B;
                        if (iB2 == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iB2 == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) fVar).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) fVar).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) fVar).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) fVar).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (B(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) fVar).leftMargin) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) fVar).topMargin) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, 1073741824));
                } else {
                    if (!E(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i12 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (O) {
                        float fW = q0.w(childAt);
                        float f10 = this.f3784b;
                        if (fW != f10) {
                            q0.s0(childAt, f10);
                        }
                    }
                    int iT = t(childAt) & 7;
                    boolean z13 = iT == 3;
                    if ((z13 && z11) || (!z13 && z12)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + w(iT) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z13) {
                        z11 = true;
                    } else {
                        z12 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i10, this.f3785c + ((ViewGroup.MarginLayoutParams) fVar).leftMargin + ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((ViewGroup.MarginLayoutParams) fVar).width), ViewGroup.getChildMeasureSpec(i11, ((ViewGroup.MarginLayoutParams) fVar).topMargin + ((ViewGroup.MarginLayoutParams) fVar).bottomMargin, ((ViewGroup.MarginLayoutParams) fVar).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewN;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        int i10 = gVar.f3817c;
        if (i10 != 0 && (viewN = n(i10)) != null) {
            M(viewN);
        }
        int i11 = gVar.f3818d;
        if (i11 != 3) {
            T(i11, 3);
        }
        int i12 = gVar.f3819e;
        if (i12 != 3) {
            T(i12, 5);
        }
        int i13 = gVar.f3820f;
        if (i13 != 3) {
            T(i13, 8388611);
        }
        int i14 = gVar.f3821g;
        if (i14 != 3) {
            T(i14, 8388613);
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        R();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            f fVar = (f) getChildAt(i10).getLayoutParams();
            int i11 = fVar.f3816d;
            boolean z10 = i11 == 1;
            boolean z11 = i11 == 2;
            if (z10 || z11) {
                gVar.f3817c = fVar.f3813a;
                break;
            }
        }
        gVar.f3818d = this.f3796n;
        gVar.f3819e = this.f3797o;
        gVar.f3820f = this.f3798p;
        gVar.f3821g = this.f3799q;
        return gVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005a  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View viewO;
        this.f3789g.I(motionEvent);
        this.f3790h.I(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f3803u = x10;
            this.f3804v = y10;
            this.f3800r = false;
        } else if (action == 1) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            View viewV = this.f3789g.v((int) x11, (int) y11);
            if (viewV != null && B(viewV)) {
                float f10 = x11 - this.f3803u;
                float f11 = y11 - this.f3804v;
                int iC = this.f3789g.C();
                z10 = (f10 * f10) + (f11 * f11) >= ((float) (iC * iC)) || (viewO = o()) == null || r(viewO) == 2;
            }
            i(z10);
        } else if (action == 3) {
            i(true);
            this.f3800r = false;
        }
        return true;
    }

    @Override // v0.c
    public void open() {
        K(8388611);
    }

    View p() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt) && G(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public int q(int i10) {
        int iB = q0.B(this);
        if (i10 == 3) {
            int i11 = this.f3796n;
            if (i11 != 3) {
                return i11;
            }
            int i12 = iB == 0 ? this.f3798p : this.f3799q;
            if (i12 != 3) {
                return i12;
            }
            return 0;
        }
        if (i10 == 5) {
            int i13 = this.f3797o;
            if (i13 != 3) {
                return i13;
            }
            int i14 = iB == 0 ? this.f3799q : this.f3798p;
            if (i14 != 3) {
                return i14;
            }
            return 0;
        }
        if (i10 == 8388611) {
            int i15 = this.f3798p;
            if (i15 != 3) {
                return i15;
            }
            int i16 = iB == 0 ? this.f3796n : this.f3797o;
            if (i16 != 3) {
                return i16;
            }
            return 0;
        }
        if (i10 != 8388613) {
            return 0;
        }
        int i17 = this.f3799q;
        if (i17 != 3) {
            return i17;
        }
        int i18 = iB == 0 ? this.f3797o : this.f3796n;
        if (i18 != 3) {
            return i18;
        }
        return 0;
    }

    public int r(View view) {
        if (E(view)) {
            return q(((f) view.getLayoutParams()).f3813a);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (z10) {
            i(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3794l) {
            return;
        }
        super.requestLayout();
    }

    public CharSequence s(int i10) {
        int iB = m.b(i10, q0.B(this));
        if (iB == 3) {
            return this.f3808z;
        }
        if (iB == 5) {
            return this.A;
        }
        return null;
    }

    public void setDrawerElevation(float f10) {
        this.f3784b = f10;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (E(childAt)) {
                q0.s0(childAt, this.f3784b);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(e eVar) {
        e eVar2 = this.f3801s;
        if (eVar2 != null) {
            O(eVar2);
        }
        if (eVar != null) {
            a(eVar);
        }
        this.f3801s = eVar;
    }

    public void setDrawerLockMode(int i10) {
        T(i10, 3);
        T(i10, 5);
    }

    public void setScrimColor(int i10) {
        this.f3786d = i10;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.f3805w = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i10) {
        this.f3805w = new ColorDrawable(i10);
        invalidate();
    }

    int t(View view) {
        return m.b(((f) view.getLayoutParams()).f3813a, q0.B(this));
    }

    float u(View view) {
        return ((f) view.getLayoutParams()).f3814b;
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f3783a = new d();
        this.f3786d = -1728053248;
        this.f3788f = new Paint();
        this.f3795m = true;
        this.f3796n = 3;
        this.f3797o = 3;
        this.f3798p = 3;
        this.f3799q = 3;
        this.D = null;
        this.E = null;
        this.F = null;
        this.G = null;
        this.K = new a();
        setDescendantFocusability(MediaHttpUploader.MINIMUM_CHUNK_SIZE);
        float f10 = getResources().getDisplayMetrics().density;
        this.f3785c = (int) ((64.0f * f10) + 0.5f);
        float f11 = f10 * 400.0f;
        i iVar = new i(3);
        this.f3791i = iVar;
        i iVar2 = new i(5);
        this.f3792j = iVar2;
        v0.d dVarP = v0.d.p(this, 1.0f, iVar);
        this.f3789g = dVarP;
        dVarP.Q(1);
        dVarP.R(f11);
        iVar.q(dVarP);
        v0.d dVarP2 = v0.d.p(this, 1.0f, iVar2);
        this.f3790h = dVarP2;
        dVarP2.Q(2);
        dVarP2.R(f11);
        iVar2.q(dVarP2);
        setFocusableInTouchMode(true);
        q0.t0(this, 1);
        q0.m0(this, new c());
        setMotionEventSplittingEnabled(false);
        if (q0.y(this)) {
            setOnApplyWindowInsetsListener(new b());
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(L);
            try {
                this.f3805w = typedArrayObtainStyledAttributes.getDrawable(0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, e1.c.f37033b, i10, 0);
        try {
            int i11 = e1.c.f37034c;
            if (typedArrayObtainStyledAttributes2.hasValue(i11)) {
                this.f3784b = typedArrayObtainStyledAttributes2.getDimension(i11, 0.0f);
            } else {
                this.f3784b = getResources().getDimension(e1.b.f37031a);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.H = new ArrayList();
        } catch (Throwable th3) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th3;
        }
    }

    public void setStatusBarBackground(int i10) {
        this.f3805w = i10 != 0 ? androidx.core.content.a.getDrawable(getContext(), i10) : null;
        invalidate();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static class f extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f3814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f3815c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3816d;

        public f(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3813a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.M);
            this.f3813a = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public f(int i10, int i11) {
            super(i10, i11);
            this.f3813a = 0;
        }

        public f(f fVar) {
            super((ViewGroup.MarginLayoutParams) fVar);
            this.f3813a = 0;
            this.f3813a = fVar.f3813a;
        }

        public f(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3813a = 0;
        }

        public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3813a = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new f(getContext(), attributeSet);
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    protected static class g extends u0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f3818d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f3819e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f3820f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3821g;

        /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3817c = 0;
            this.f3817c = parcel.readInt();
            this.f3818d = parcel.readInt();
            this.f3819e = parcel.readInt();
            this.f3820f = parcel.readInt();
            this.f3821g = parcel.readInt();
        }

        @Override // u0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f3817c);
            parcel.writeInt(this.f3818d);
            parcel.writeInt(this.f3819e);
            parcel.writeInt(this.f3820f);
            parcel.writeInt(this.f3821g);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
            this.f3817c = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class h implements e {
        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i10) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f10) {
        }
    }
}
