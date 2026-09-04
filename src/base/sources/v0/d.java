package v0;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.Arrays;
import n0.q0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Interpolator f55022y = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f55023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f55024b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f55026d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float[] f55027e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float[] f55028f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float[] f55029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int[] f55030h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f55031i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f55032j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f55033k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f55034l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f55035m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f55036n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f55037o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final int f55038p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f55039q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final OverScroller f55040r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final AbstractC0826d f55041s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private View f55042t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f55043u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ViewGroup f55044v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Interpolator f55045w;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f55025c = -1;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final Runnable f55046x = new b();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.O(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            return d.this.f55045w.getInterpolation(f10);
        }
    }

    private d(Context context, ViewGroup viewGroup, AbstractC0826d abstractC0826d) {
        L(viewGroup, "Parent view may not be null");
        L(abstractC0826d, "Callback may not be null");
        this.f55044v = viewGroup;
        this.f55041s = abstractC0826d;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i10 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f55038p = i10;
        this.f55037o = i10;
        this.f55024b = viewConfiguration.getScaledTouchSlop();
        this.f55035m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f55036n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f55045w = f55022y;
        this.f55040r = new OverScroller(context, new c());
    }

    private int B(int i10, int i11) {
        int i12 = i10 < this.f55044v.getLeft() + this.f55037o ? 1 : 0;
        if (i11 < this.f55044v.getTop() + this.f55037o) {
            i12 |= 4;
        }
        if (i10 > this.f55044v.getRight() - this.f55037o) {
            i12 |= 2;
        }
        return i11 > this.f55044v.getBottom() - this.f55037o ? i12 | 8 : i12;
    }

    private boolean G(int i10) {
        return F(i10);
    }

    private void J() {
        this.f55034l.computeCurrentVelocity(1000, this.f55035m);
        r(i(this.f55034l.getXVelocity(this.f55025c), this.f55036n, this.f55035m), i(this.f55034l.getYVelocity(this.f55025c), this.f55036n, this.f55035m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3, types: [v0.d$d] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void K(float f10, float f11, int i10) {
        int i11;
        boolean zE = e(f10, f11, i10, 1);
        ?? r10 = zE;
        if (e(f11, f10, i10, 4)) {
            r10 = (zE ? 1 : 0) | 4;
        }
        ?? r11 = r10;
        if (e(f10, f11, i10, 2)) {
            r11 = (r10 == true ? 1 : 0) | 2;
        }
        ?? r12 = r11;
        if (e(f11, f10, i10, 8)) {
            i11 = (r11 == true ? 1 : 0) | 8;
        }
        if (r12 == 0) {
            r12 = i11;
            return;
        }
        r12 = i11;
        int[] iArr = this.f55031i;
        iArr[i10] = (iArr[i10] | r12) == true ? 1 : 0;
        this.f55041s.f(r12, i10);
    }

    private static Object L(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private void M(float f10, float f11, int i10) {
        u(i10);
        float[] fArr = this.f55026d;
        this.f55028f[i10] = f10;
        fArr[i10] = f10;
        float[] fArr2 = this.f55027e;
        this.f55029g[i10] = f11;
        fArr2[i10] = f11;
        this.f55030h[i10] = B((int) f10, (int) f11);
        this.f55033k |= 1 << i10;
    }

    private void N(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i10 = 0; i10 < pointerCount; i10++) {
            int pointerId = motionEvent.getPointerId(i10);
            if (G(pointerId)) {
                float x10 = motionEvent.getX(i10);
                float y10 = motionEvent.getY(i10);
                this.f55028f[pointerId] = x10;
                this.f55029g[pointerId] = y10;
            }
        }
    }

    private boolean e(float f10, float f11, int i10, int i11) {
        float fAbs = Math.abs(f10);
        float fAbs2 = Math.abs(f11);
        if ((this.f55030h[i10] & i11) == i11 && (this.f55039q & i11) != 0 && (this.f55032j[i10] & i11) != i11 && (this.f55031i[i10] & i11) != i11) {
            int i12 = this.f55024b;
            if (fAbs > i12 || fAbs2 > i12) {
                if (fAbs < fAbs2 * 0.5f && this.f55041s.g(i11)) {
                    int[] iArr = this.f55032j;
                    iArr[i10] = iArr[i10] | i11;
                    return false;
                }
                if ((this.f55031i[i10] & i11) == 0 && fAbs > this.f55024b) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean h(View view, float f10, float f11) {
        if (view == null) {
            return false;
        }
        boolean z10 = this.f55041s.d(view) > 0;
        boolean z11 = this.f55041s.e(view) > 0;
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i10 = this.f55024b;
            return f12 > ((float) (i10 * i10));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f55024b);
        }
        return z11 && Math.abs(f11) > ((float) this.f55024b);
    }

    private float i(float f10, float f11, float f12) {
        float fAbs = Math.abs(f10);
        if (fAbs < f11) {
            return 0.0f;
        }
        if (fAbs > f12) {
            return f10 > 0.0f ? f12 : -f12;
        }
        return f10;
    }

    private int j(int i10, int i11, int i12) {
        int iAbs = Math.abs(i10);
        if (iAbs < i11) {
            return 0;
        }
        if (iAbs > i12) {
            return i10 > 0 ? i12 : -i12;
        }
        return i10;
    }

    private void k() {
        float[] fArr = this.f55026d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f55027e, 0.0f);
        Arrays.fill(this.f55028f, 0.0f);
        Arrays.fill(this.f55029g, 0.0f);
        Arrays.fill(this.f55030h, 0);
        Arrays.fill(this.f55031i, 0);
        Arrays.fill(this.f55032j, 0);
        this.f55033k = 0;
    }

    private void l(int i10) {
        if (this.f55026d == null || !F(i10)) {
            return;
        }
        this.f55026d[i10] = 0.0f;
        this.f55027e[i10] = 0.0f;
        this.f55028f[i10] = 0.0f;
        this.f55029g[i10] = 0.0f;
        this.f55030h[i10] = 0;
        this.f55031i[i10] = 0;
        this.f55032j[i10] = 0;
        this.f55033k = (~(1 << i10)) & this.f55033k;
    }

    private int m(int i10, int i11, int i12) {
        if (i10 == 0) {
            return 0;
        }
        int width = this.f55044v.getWidth();
        float f10 = width / 2;
        float fS = f10 + (s(Math.min(1.0f, Math.abs(i10) / width)) * f10);
        int iAbs = Math.abs(i11);
        return Math.min(iAbs > 0 ? Math.round(Math.abs(fS / iAbs) * 1000.0f) * 4 : (int) (((Math.abs(i10) / i12) + 1.0f) * 256.0f), Sdk$SDKError.b.NATIVE_ASSET_ERROR_VALUE);
    }

    private int n(View view, int i10, int i11, int i12, int i13) {
        float f10;
        float f11;
        float f12;
        float f13;
        int iJ = j(i12, (int) this.f55036n, (int) this.f55035m);
        int iJ2 = j(i13, (int) this.f55036n, (int) this.f55035m);
        int iAbs = Math.abs(i10);
        int iAbs2 = Math.abs(i11);
        int iAbs3 = Math.abs(iJ);
        int iAbs4 = Math.abs(iJ2);
        int i14 = iAbs3 + iAbs4;
        int i15 = iAbs + iAbs2;
        if (iJ != 0) {
            f10 = iAbs3;
            f11 = i14;
        } else {
            f10 = iAbs;
            f11 = i15;
        }
        float f14 = f10 / f11;
        if (iJ2 != 0) {
            f12 = iAbs4;
            f13 = i14;
        } else {
            f12 = iAbs2;
            f13 = i15;
        }
        return (int) ((m(i10, iJ, this.f55041s.d(view)) * f14) + (m(i11, iJ2, this.f55041s.e(view)) * (f12 / f13)));
    }

    public static d p(ViewGroup viewGroup, float f10, AbstractC0826d abstractC0826d) {
        d dVarQ = q(viewGroup, abstractC0826d);
        dVarQ.f55024b = (int) (dVarQ.f55024b * (1.0f / f10));
        return dVarQ;
    }

    public static d q(ViewGroup viewGroup, AbstractC0826d abstractC0826d) {
        return new d(viewGroup.getContext(), viewGroup, abstractC0826d);
    }

    private void r(float f10, float f11) {
        this.f55043u = true;
        this.f55041s.l(this.f55042t, f10, f11);
        this.f55043u = false;
        if (this.f55023a == 1) {
            O(0);
        }
    }

    private float s(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    private void t(int i10, int i11, int i12, int i13) {
        int left = this.f55042t.getLeft();
        int top = this.f55042t.getTop();
        if (i12 != 0) {
            i10 = this.f55041s.a(this.f55042t, i10, i12);
            q0.X(this.f55042t, i10 - left);
        }
        int i14 = i10;
        if (i13 != 0) {
            i11 = this.f55041s.b(this.f55042t, i11, i13);
            q0.Y(this.f55042t, i11 - top);
        }
        int i15 = i11;
        if (i12 == 0 && i13 == 0) {
            return;
        }
        this.f55041s.k(this.f55042t, i14, i15, i14 - left, i15 - top);
    }

    private void u(int i10) {
        float[] fArr = this.f55026d;
        if (fArr == null || fArr.length <= i10) {
            int i11 = i10 + 1;
            float[] fArr2 = new float[i11];
            float[] fArr3 = new float[i11];
            float[] fArr4 = new float[i11];
            float[] fArr5 = new float[i11];
            int[] iArr = new int[i11];
            int[] iArr2 = new int[i11];
            int[] iArr3 = new int[i11];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f55027e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f55028f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f55029g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f55030h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f55031i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f55032j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f55026d = fArr2;
            this.f55027e = fArr3;
            this.f55028f = fArr4;
            this.f55029g = fArr5;
            this.f55030h = iArr;
            this.f55031i = iArr2;
            this.f55032j = iArr3;
        }
    }

    private boolean w(int i10, int i11, int i12, int i13) {
        int left = this.f55042t.getLeft();
        int top = this.f55042t.getTop();
        int i14 = i10 - left;
        int i15 = i11 - top;
        if (i14 == 0 && i15 == 0) {
            this.f55040r.abortAnimation();
            O(0);
            return false;
        }
        int iN = n(this.f55042t, i14, i15, i12, i13);
        this.f55045w = f55022y;
        this.f55040r.startScroll(left, top, i14, i15, iN);
        O(2);
        return true;
    }

    private boolean x(int i10, int i11, int i12, Interpolator interpolator) {
        int left = this.f55042t.getLeft();
        int top = this.f55042t.getTop();
        int i13 = i10 - left;
        int i14 = i11 - top;
        if (i13 == 0 && i14 == 0) {
            this.f55040r.abortAnimation();
            O(0);
            return false;
        }
        if (interpolator != null) {
            this.f55045w = interpolator;
        } else {
            this.f55045w = f55022y;
        }
        this.f55040r.startScroll(left, top, i13, i14, i12);
        O(2);
        return true;
    }

    public int A() {
        return this.f55037o;
    }

    public int C() {
        return this.f55024b;
    }

    public int D() {
        return this.f55023a;
    }

    public boolean E(int i10, int i11) {
        return H(this.f55042t, i10, i11);
    }

    public boolean F(int i10) {
        return ((1 << i10) & this.f55033k) != 0;
    }

    public boolean H(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public void I(MotionEvent motionEvent) {
        int iFindPointerIndex;
        int i10;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f55034l == null) {
            this.f55034l = VelocityTracker.obtain();
        }
        this.f55034l.addMovement(motionEvent);
        int i11 = 0;
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View viewV = v((int) x10, (int) y10);
            M(x10, y10, pointerId);
            W(viewV, pointerId);
            int i12 = this.f55030h[pointerId];
            int i13 = this.f55039q;
            if ((i12 & i13) != 0) {
                this.f55041s.h(i12 & i13, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f55023a == 1) {
                J();
            }
            c();
            return;
        }
        if (actionMasked == 2) {
            if (this.f55023a != 1) {
                int pointerCount = motionEvent.getPointerCount();
                while (i11 < pointerCount) {
                    int pointerId2 = motionEvent.getPointerId(i11);
                    if (G(pointerId2)) {
                        float x11 = motionEvent.getX(i11);
                        float y11 = motionEvent.getY(i11);
                        float f10 = x11 - this.f55026d[pointerId2];
                        float f11 = y11 - this.f55027e[pointerId2];
                        K(f10, f11, pointerId2);
                        if (this.f55023a != 1) {
                            View viewV2 = v((int) x11, (int) y11);
                            if (h(viewV2, f10, f11) && W(viewV2, pointerId2)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    i11++;
                }
            } else {
                if (!G(this.f55025c) || (iFindPointerIndex = motionEvent.findPointerIndex(this.f55025c)) == -1) {
                    return;
                }
                float x12 = motionEvent.getX(iFindPointerIndex);
                float y12 = motionEvent.getY(iFindPointerIndex);
                float[] fArr = this.f55028f;
                int i14 = this.f55025c;
                int i15 = (int) (x12 - fArr[i14]);
                int i16 = (int) (y12 - this.f55029g[i14]);
                t(this.f55042t.getLeft() + i15, this.f55042t.getTop() + i16, i15, i16);
            }
            N(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f55023a == 1) {
                r(0.0f, 0.0f);
            }
            c();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x13 = motionEvent.getX(actionIndex);
            float y13 = motionEvent.getY(actionIndex);
            M(x13, y13, pointerId3);
            if (this.f55023a != 0) {
                if (E((int) x13, (int) y13)) {
                    W(this.f55042t, pointerId3);
                    return;
                }
                return;
            } else {
                W(v((int) x13, (int) y13), pointerId3);
                int i17 = this.f55030h[pointerId3];
                int i18 = this.f55039q;
                if ((i17 & i18) != 0) {
                    this.f55041s.h(i17 & i18, pointerId3);
                    return;
                }
                return;
            }
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f55023a == 1 && pointerId4 == this.f55025c) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i11 >= pointerCount2) {
                    i10 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i11);
                if (pointerId5 != this.f55025c) {
                    View viewV3 = v((int) motionEvent.getX(i11), (int) motionEvent.getY(i11));
                    View view = this.f55042t;
                    if (viewV3 == view && W(view, pointerId5)) {
                        i10 = this.f55025c;
                        break;
                    }
                }
                i11++;
            }
            if (i10 == -1) {
                J();
            }
        }
        l(pointerId4);
    }

    void O(int i10) {
        this.f55044v.removeCallbacks(this.f55046x);
        if (this.f55023a != i10) {
            this.f55023a = i10;
            this.f55041s.j(i10);
            if (this.f55023a == 0) {
                this.f55042t = null;
            }
        }
    }

    public void P(int i10) {
        this.f55037o = i10;
    }

    public void Q(int i10) {
        this.f55039q = i10;
    }

    public void R(float f10) {
        this.f55036n = f10;
    }

    public boolean S(int i10, int i11) {
        if (this.f55043u) {
            return w(i10, i11, (int) this.f55034l.getXVelocity(this.f55025c), (int) this.f55034l.getYVelocity(this.f55025c));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    public boolean T(MotionEvent motionEvent) {
        View viewV;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            c();
        }
        if (this.f55034l == null) {
            this.f55034l = VelocityTracker.obtain();
        }
        this.f55034l.addMovement(motionEvent);
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            M(x10, y10, pointerId);
            View viewV2 = v((int) x10, (int) y10);
            if (viewV2 == this.f55042t && this.f55023a == 2) {
                W(viewV2, pointerId);
            }
            int i10 = this.f55030h[pointerId];
            int i11 = this.f55039q;
            if ((i10 & i11) != 0) {
                this.f55041s.h(i10 & i11, pointerId);
            }
        } else if (actionMasked == 1) {
            c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                c();
            } else if (actionMasked == 5) {
                int pointerId2 = motionEvent.getPointerId(actionIndex);
                float x11 = motionEvent.getX(actionIndex);
                float y11 = motionEvent.getY(actionIndex);
                M(x11, y11, pointerId2);
                int i12 = this.f55023a;
                if (i12 == 0) {
                    int i13 = this.f55030h[pointerId2];
                    int i14 = this.f55039q;
                    if ((i13 & i14) != 0) {
                        this.f55041s.h(i13 & i14, pointerId2);
                    }
                } else if (i12 == 2 && (viewV = v((int) x11, (int) y11)) == this.f55042t) {
                    W(viewV, pointerId2);
                }
            } else if (actionMasked == 6) {
                l(motionEvent.getPointerId(actionIndex));
            }
        } else if (this.f55026d != null && this.f55027e != null) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i15 = 0; i15 < pointerCount; i15++) {
                int pointerId3 = motionEvent.getPointerId(i15);
                if (G(pointerId3)) {
                    float x12 = motionEvent.getX(i15);
                    float y12 = motionEvent.getY(i15);
                    float f10 = x12 - this.f55026d[pointerId3];
                    float f11 = y12 - this.f55027e[pointerId3];
                    View viewV3 = v((int) x12, (int) y12);
                    boolean zH = h(viewV3, f10, f11);
                    if (!zH) {
                        K(f10, f11, pointerId3);
                        if (this.f55023a != 1) {
                            break;
                        }
                    } else {
                        int left = viewV3.getLeft();
                        int i16 = (int) f10;
                        int iA = this.f55041s.a(viewV3, left + i16, i16);
                        int top = viewV3.getTop();
                        int i17 = (int) f11;
                        int iB = this.f55041s.b(viewV3, top + i17, i17);
                        int iD = this.f55041s.d(viewV3);
                        int iE = this.f55041s.e(viewV3);
                        if ((iD == 0 || (iD > 0 && iA == left)) && (iE == 0 || (iE > 0 && iB == top))) {
                            break;
                        }
                        K(f10, f11, pointerId3);
                        if (this.f55023a != 1 || (zH && W(viewV3, pointerId3))) {
                            break;
                        }
                    }
                }
            }
            N(motionEvent);
        }
        return this.f55023a == 1;
    }

    public boolean U(View view, int i10, int i11) {
        this.f55042t = view;
        this.f55025c = -1;
        boolean zW = w(i10, i11, 0, 0);
        if (!zW && this.f55023a == 0 && this.f55042t != null) {
            this.f55042t = null;
        }
        return zW;
    }

    public boolean V(View view, int i10, int i11, int i12, Interpolator interpolator) {
        this.f55042t = view;
        this.f55025c = -1;
        boolean zX = x(i10, i11, i12, interpolator);
        if (!zX && this.f55023a == 0 && this.f55042t != null) {
            this.f55042t = null;
        }
        return zX;
    }

    boolean W(View view, int i10) {
        if (view == this.f55042t && this.f55025c == i10) {
            return true;
        }
        if (view == null || !this.f55041s.m(view, i10)) {
            return false;
        }
        this.f55025c = i10;
        d(view, i10);
        return true;
    }

    public void a() {
        c();
        if (this.f55023a == 2) {
            int currX = this.f55040r.getCurrX();
            int currY = this.f55040r.getCurrY();
            this.f55040r.abortAnimation();
            int currX2 = this.f55040r.getCurrX();
            int currY2 = this.f55040r.getCurrY();
            this.f55041s.k(this.f55042t, currX2, currY2, currX2 - currX, currY2 - currY);
        }
        this.f55045w = f55022y;
        O(0);
    }

    public void c() {
        this.f55025c = -1;
        k();
        VelocityTracker velocityTracker = this.f55034l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f55034l = null;
        }
    }

    public void d(View view, int i10) {
        if (view.getParent() == this.f55044v) {
            this.f55042t = view;
            this.f55025c = i10;
            this.f55041s.i(view, i10);
            O(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f55044v + ")");
    }

    public boolean f(int i10) {
        float[] fArr = this.f55026d;
        if (fArr == null) {
            return false;
        }
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (g(i10, i11)) {
                return true;
            }
        }
        return false;
    }

    public boolean g(int i10, int i11) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        if (!F(i11)) {
            return false;
        }
        boolean z10 = (i10 & 1) == 1;
        boolean z11 = (i10 & 2) == 2;
        float[] fArr4 = this.f55026d;
        if (fArr4 == null || (fArr = this.f55027e) == null || (fArr2 = this.f55028f) == null || (fArr3 = this.f55029g) == null) {
            Log.w("ViewDragHelper", "Inconsistent pointer event stream: pointer is down, but there is no initial motion recorded. Is something intercepting or modifying events?");
            return false;
        }
        float f10 = fArr2[i11] - fArr4[i11];
        float f11 = fArr3[i11] - fArr[i11];
        if (z10 && z11) {
            float f12 = (f10 * f10) + (f11 * f11);
            int i12 = this.f55024b;
            return f12 > ((float) (i12 * i12));
        }
        if (z10) {
            return Math.abs(f10) > ((float) this.f55024b);
        }
        return z11 && Math.abs(f11) > ((float) this.f55024b);
    }

    public boolean o(boolean z10) {
        if (this.f55023a == 2) {
            boolean zComputeScrollOffset = this.f55040r.computeScrollOffset();
            int currX = this.f55040r.getCurrX();
            int currY = this.f55040r.getCurrY();
            int left = currX - this.f55042t.getLeft();
            int top = currY - this.f55042t.getTop();
            if (left != 0) {
                q0.X(this.f55042t, left);
            }
            if (top != 0) {
                q0.Y(this.f55042t, top);
            }
            if (left != 0 || top != 0) {
                this.f55041s.k(this.f55042t, currX, currY, left, top);
            }
            if (zComputeScrollOffset && currX == this.f55040r.getFinalX() && currY == this.f55040r.getFinalY()) {
                this.f55040r.abortAnimation();
                zComputeScrollOffset = false;
            }
            if (!zComputeScrollOffset) {
                if (z10) {
                    this.f55044v.post(this.f55046x);
                } else {
                    O(0);
                }
            }
        }
        return this.f55023a == 2;
    }

    public View v(int i10, int i11) {
        for (int childCount = this.f55044v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f55044v.getChildAt(this.f55041s.c(childCount));
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public View y() {
        return this.f55042t;
    }

    public int z() {
        return this.f55038p;
    }

    /* JADX INFO: renamed from: v0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public static abstract class AbstractC0826d {
        public abstract int a(View view, int i10, int i11);

        public int b(View view, int i10, int i11) {
            return 0;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public boolean g(int i10) {
            return false;
        }

        public abstract void l(View view, float f10, float f11);

        public abstract boolean m(View view, int i10);

        public int c(int i10) {
            return i10;
        }

        public void j(int i10) {
        }

        public void f(int i10, int i11) {
        }

        public void h(int i10, int i11) {
        }

        public void i(View view, int i10) {
        }

        public void k(View view, int i10, int i11, int i12, int i13) {
        }
    }
}
