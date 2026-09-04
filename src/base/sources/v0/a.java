package v0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.v;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import n0.q0;
import o0.p;
import o0.q;
import o0.r;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends n0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f55004n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final v0.b.a f55005o = new C0824a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final v0.b.InterfaceC0825b f55006p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f55011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f55012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f55013j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f55007d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f55008e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f55009f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f55010g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f55014k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f55015l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f55016m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: v0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0824a implements v0.b.a {
        C0824a() {
        }

        @Override // v0.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(p pVar, Rect rect) {
            pVar.n(rect);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements v0.b.InterfaceC0825b {
        b() {
        }

        @Override // v0.b.InterfaceC0825b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p a(v vVar, int i10) {
            return (p) vVar.p(i10);
        }

        @Override // v0.b.InterfaceC0825b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(v vVar) {
            return vVar.o();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private class c extends q {
        c() {
        }

        @Override // o0.q
        public p b(int i10) {
            return p.i0(a.this.J(i10));
        }

        @Override // o0.q
        public p d(int i10) {
            int i11 = i10 == 2 ? a.this.f55014k : a.this.f55015l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // o0.q
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.R(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f55012i = view;
        this.f55011h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean G(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f55012i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f55012i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int H(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean I(int i10, Rect rect) {
        p pVar;
        v vVarY = y();
        int i11 = this.f55015l;
        p pVar2 = i11 == Integer.MIN_VALUE ? null : (p) vVarY.f(i11);
        if (i10 == 1 || i10 == 2) {
            pVar = (p) v0.b.d(vVarY, f55006p, f55005o, pVar2, i10, this.f55012i.getLayoutDirection() == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i12 = this.f55015l;
            if (i12 != Integer.MIN_VALUE) {
                z(i12, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f55012i, i10, rect2);
            }
            pVar = (p) v0.b.c(vVarY, f55006p, f55005o, pVar2, rect2, i10);
        }
        return V(pVar != null ? vVarY.k(vVarY.i(pVar)) : Integer.MIN_VALUE);
    }

    private boolean S(int i10, int i11, Bundle bundle) {
        if (i11 == 1) {
            return V(i10);
        }
        if (i11 == 2) {
            return o(i10);
        }
        if (i11 != 64) {
            return i11 != 128 ? L(i10, i11, bundle) : n(i10);
        }
        return U(i10);
    }

    private boolean T(int i10, Bundle bundle) {
        return this.f55012i.performAccessibilityAction(i10, bundle);
    }

    private boolean U(int i10) {
        int i11;
        if (!this.f55011h.isEnabled() || !this.f55011h.isTouchExplorationEnabled() || (i11 = this.f55014k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f55014k = i10;
        this.f55012i.invalidate();
        W(i10, 32768);
        return true;
    }

    private void Y(int i10) {
        int i11 = this.f55016m;
        if (i11 == i10) {
            return;
        }
        this.f55016m = i10;
        W(i10, 128);
        W(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f55014k != i10) {
            return false;
        }
        this.f55014k = Integer.MIN_VALUE;
        this.f55012i.invalidate();
        W(i10, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        return true;
    }

    private boolean p() {
        int i10 = this.f55015l;
        return i10 != Integer.MIN_VALUE && L(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        p pVarJ = J(i10);
        accessibilityEventObtain.getText().add(pVarJ.H());
        accessibilityEventObtain.setContentDescription(pVarJ.v());
        accessibilityEventObtain.setScrollable(pVarJ.b0());
        accessibilityEventObtain.setPassword(pVarJ.a0());
        accessibilityEventObtain.setEnabled(pVarJ.T());
        accessibilityEventObtain.setChecked(pVarJ.Q());
        N(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(pVarJ.s());
        r.c(accessibilityEventObtain, this.f55012i, i10);
        accessibilityEventObtain.setPackageName(this.f55012i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f55012i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private p t(int i10) {
        p pVarG0 = p.g0();
        pVarG0.A0(true);
        pVarG0.C0(true);
        pVarG0.u0("android.view.View");
        Rect rect = f55004n;
        pVarG0.p0(rect);
        pVarG0.q0(rect);
        pVarG0.N0(this.f55012i);
        P(i10, pVarG0);
        if (pVarG0.H() == null && pVarG0.v() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        pVarG0.m(this.f55008e);
        pVarG0.n(this.f55007d);
        if (this.f55008e.equals(rect) && this.f55007d.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int iK = pVarG0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        pVarG0.L0(this.f55012i.getContext().getPackageName());
        pVarG0.W0(this.f55012i, i10);
        if (this.f55014k == i10) {
            pVarG0.n0(true);
            pVarG0.a(128);
        } else {
            pVarG0.n0(false);
            pVarG0.a(64);
        }
        boolean z10 = this.f55015l == i10;
        if (z10) {
            pVarG0.a(2);
        } else if (pVarG0.V()) {
            pVarG0.a(1);
        }
        pVarG0.D0(z10);
        this.f55012i.getLocationOnScreen(this.f55010g);
        if (this.f55007d.equals(rect)) {
            X(pVarG0, this.f55008e);
            pVarG0.n(this.f55007d);
        }
        if (this.f55012i.getLocalVisibleRect(this.f55009f)) {
            this.f55009f.offset(this.f55010g[0] - this.f55012i.getScrollX(), this.f55010g[1] - this.f55012i.getScrollY());
            if (this.f55007d.intersect(this.f55009f)) {
                pVarG0.q0(this.f55007d);
                if (G(this.f55007d)) {
                    pVarG0.a1(true);
                }
            }
        }
        return pVarG0;
    }

    private p u() {
        p pVarH0 = p.h0(this.f55012i);
        q0.a0(this.f55012i, pVarH0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (pVarH0.r() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVarH0.d(this.f55012i, ((Integer) arrayList.get(i10)).intValue());
        }
        return pVarH0;
    }

    private v y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        v vVar = new v();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            vVar.l(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return vVar;
    }

    private void z(int i10, Rect rect) {
        J(i10).n(rect);
    }

    public final int A() {
        return this.f55015l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List list);

    public final void E(int i10) {
        F(i10, 0);
    }

    public final void F(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f55011h.isEnabled() || (parent = this.f55012i.getParent()) == null) {
            return;
        }
        AccessibilityEvent accessibilityEventQ = q(i10, 2048);
        o0.b.b(accessibilityEventQ, i11);
        parent.requestSendAccessibilityEvent(this.f55012i, accessibilityEventQ);
    }

    p J(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void K(boolean z10, int i10, Rect rect) {
        int i11 = this.f55015l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            I(i10, rect);
        }
    }

    protected abstract boolean L(int i10, int i11, Bundle bundle);

    protected abstract void P(int i10, p pVar);

    boolean R(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? S(i10, i11, bundle) : T(i11, bundle);
    }

    public final boolean V(int i10) {
        int i11;
        if ((!this.f55012i.isFocused() && !this.f55012i.requestFocus()) || (i11 = this.f55015l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f55015l = i10;
        Q(i10, true);
        W(i10, 8);
        return true;
    }

    public final boolean W(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f55011h.isEnabled() || (parent = this.f55012i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f55012i, q(i10, i11));
    }

    public final void X(p pVar, Rect rect) {
        pVar.p0(rect);
        Rect rect2 = new Rect();
        rect2.set(rect);
        if (pVar.f47922b != -1) {
            p pVarG0 = p.g0();
            Rect rect3 = new Rect();
            for (int i10 = pVar.f47922b; i10 != -1; i10 = pVarG0.f47922b) {
                pVarG0.O0(this.f55012i, -1);
                pVarG0.p0(f55004n);
                P(i10, pVarG0);
                pVarG0.m(rect3);
                rect2.offset(rect3.left, rect3.top);
            }
            pVarG0.k0();
        }
        this.f55012i.getLocationOnScreen(this.f55010g);
        rect2.offset(this.f55010g[0] - this.f55012i.getScrollX(), this.f55010g[1] - this.f55012i.getScrollY());
        pVar.q0(rect2);
    }

    @Override // n0.a
    public q b(View view) {
        if (this.f55013j == null) {
            this.f55013j = new c();
        }
        return this.f55013j;
    }

    @Override // n0.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        M(accessibilityEvent);
    }

    @Override // n0.a
    public void g(View view, p pVar) {
        super.g(view, pVar);
        O(pVar);
    }

    public final boolean o(int i10) {
        if (this.f55015l != i10) {
            return false;
        }
        this.f55015l = Integer.MIN_VALUE;
        Q(i10, false);
        W(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f55011h.isEnabled() && this.f55011h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f55016m == Integer.MIN_VALUE) {
                    return false;
                }
                Y(Integer.MIN_VALUE);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            Y(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    public final boolean w(KeyEvent keyEvent) {
        int i10 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                int iH = H(keyCode);
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z10 = false;
                                while (i10 < repeatCount && I(iH, null)) {
                                    i10++;
                                    z10 = true;
                                }
                                return z10;
                            }
                            break;
                        case 23:
                            if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                                p();
                                return true;
                            }
                            break;
                    }
                } else if (keyEvent.hasNoModifiers()) {
                    p();
                    return true;
                }
            } else {
                if (keyEvent.hasNoModifiers()) {
                    return I(2, null);
                }
                if (keyEvent.hasModifiers(1)) {
                    return I(1, null);
                }
            }
        }
        return false;
    }

    public final int x() {
        return this.f55014k;
    }

    protected void M(AccessibilityEvent accessibilityEvent) {
    }

    protected void O(p pVar) {
    }

    protected void N(int i10, AccessibilityEvent accessibilityEvent) {
    }

    protected void Q(int i10, boolean z10) {
    }
}
