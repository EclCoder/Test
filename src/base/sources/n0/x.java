package n0;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f46763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f46764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f46765c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f46766d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f46767e;

    public x(View view) {
        this.f46765c = view;
    }

    private boolean g(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentH;
        int i15;
        int i16;
        int[] iArr3;
        if (!l() || (viewParentH = h(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f46765c.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        y0.d(viewParentH, this.f46765c, i10, i11, i12, i13, i14, iArr3);
        if (iArr != null) {
            this.f46765c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    private ViewParent h(int i10) {
        if (i10 == 0) {
            return this.f46763a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f46764b;
    }

    private int[] i() {
        if (this.f46767e == null) {
            this.f46767e = new int[2];
        }
        return this.f46767e;
    }

    private void n(int i10, ViewParent viewParent) {
        if (i10 == 0) {
            this.f46763a = viewParent;
        } else {
            if (i10 != 1) {
                return;
            }
            this.f46764b = viewParent;
        }
    }

    public boolean a(float f10, float f11, boolean z10) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return y0.a(viewParentH, this.f46765c, f10, f11, z10);
    }

    public boolean b(float f10, float f11) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return y0.b(viewParentH, this.f46765c, f10, f11);
    }

    public boolean c(int i10, int i11, int[] iArr, int[] iArr2) {
        return d(i10, i11, iArr, iArr2, 0);
    }

    public boolean d(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        ViewParent viewParentH;
        int i13;
        int i14;
        if (!l() || (viewParentH = h(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f46765c.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        y0.c(viewParentH, this.f46765c, i10, i11, iArr3, i12);
        if (iArr2 != null) {
            this.f46765c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        g(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public boolean f(int i10, int i11, int i12, int i13, int[] iArr) {
        return g(i10, i11, i12, i13, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i10) {
        return h(i10) != null;
    }

    public boolean l() {
        return this.f46766d;
    }

    public void m(boolean z10) {
        if (this.f46766d) {
            q0.H0(this.f46765c);
        }
        this.f46766d = z10;
    }

    public boolean o(int i10) {
        return p(i10, 0);
    }

    public boolean p(int i10, int i11) {
        if (k(i11)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f46765c;
        for (ViewParent parent = this.f46765c.getParent(); parent != null; parent = parent.getParent()) {
            if (y0.f(parent, view, this.f46765c, i10, i11)) {
                n(i11, parent);
                y0.e(parent, view, this.f46765c, i10, i11);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i10) {
        ViewParent viewParentH = h(i10);
        if (viewParentH != null) {
            y0.g(viewParentH, this.f46765c, i10);
            n(i10, null);
        }
    }
}
