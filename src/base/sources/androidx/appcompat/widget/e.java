package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f1557a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m0 f1560d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m0 f1561e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m0 f1562f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f1559c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f1558b = h.b();

    e(View view) {
        this.f1557a = view;
    }

    private boolean a(Drawable drawable) {
        if (this.f1562f == null) {
            this.f1562f = new m0();
        }
        m0 m0Var = this.f1562f;
        m0Var.a();
        ColorStateList colorStateListT = n0.q0.t(this.f1557a);
        if (colorStateListT != null) {
            m0Var.f1657d = true;
            m0Var.f1654a = colorStateListT;
        }
        PorterDuff.Mode modeU = n0.q0.u(this.f1557a);
        if (modeU != null) {
            m0Var.f1656c = true;
            m0Var.f1655b = modeU;
        }
        if (!m0Var.f1657d && !m0Var.f1656c) {
            return false;
        }
        h.i(drawable, m0Var, this.f1557a.getDrawableState());
        return true;
    }

    private boolean k() {
        return this.f1560d != null;
    }

    void b() {
        Drawable background = this.f1557a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            m0 m0Var = this.f1561e;
            if (m0Var != null) {
                h.i(background, m0Var, this.f1557a.getDrawableState());
                return;
            }
            m0 m0Var2 = this.f1560d;
            if (m0Var2 != null) {
                h.i(background, m0Var2, this.f1557a.getDrawableState());
            }
        }
    }

    ColorStateList c() {
        m0 m0Var = this.f1561e;
        if (m0Var != null) {
            return m0Var.f1654a;
        }
        return null;
    }

    PorterDuff.Mode d() {
        m0 m0Var = this.f1561e;
        if (m0Var != null) {
            return m0Var.f1655b;
        }
        return null;
    }

    void e(AttributeSet attributeSet, int i10) {
        Context context = this.f1557a.getContext();
        int[] iArr = h.j.f40000a4;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        View view = this.f1557a;
        n0.q0.k0(view, view.getContext(), iArr, attributeSet, o0VarV.r(), i10, 0);
        try {
            int i11 = h.j.f40006b4;
            if (o0VarV.s(i11)) {
                this.f1559c = o0VarV.n(i11, -1);
                ColorStateList colorStateListF = this.f1558b.f(this.f1557a.getContext(), this.f1559c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            int i12 = h.j.f40012c4;
            if (o0VarV.s(i12)) {
                n0.q0.q0(this.f1557a, o0VarV.c(i12));
            }
            int i13 = h.j.f40018d4;
            if (o0VarV.s(i13)) {
                n0.q0.r0(this.f1557a, y.e(o0VarV.k(i13, -1), null));
            }
        } finally {
            o0VarV.x();
        }
    }

    void f(Drawable drawable) {
        this.f1559c = -1;
        h(null);
        b();
    }

    void g(int i10) {
        this.f1559c = i10;
        h hVar = this.f1558b;
        h(hVar != null ? hVar.f(this.f1557a.getContext(), i10) : null);
        b();
    }

    void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1560d == null) {
                this.f1560d = new m0();
            }
            m0 m0Var = this.f1560d;
            m0Var.f1654a = colorStateList;
            m0Var.f1657d = true;
        } else {
            this.f1560d = null;
        }
        b();
    }

    void i(ColorStateList colorStateList) {
        if (this.f1561e == null) {
            this.f1561e = new m0();
        }
        m0 m0Var = this.f1561e;
        m0Var.f1654a = colorStateList;
        m0Var.f1657d = true;
        b();
    }

    void j(PorterDuff.Mode mode) {
        if (this.f1561e == null) {
            this.f1561e = new m0();
        }
        m0 m0Var = this.f1561e;
        m0Var.f1655b = mode;
        m0Var.f1656c = true;
        b();
    }
}
