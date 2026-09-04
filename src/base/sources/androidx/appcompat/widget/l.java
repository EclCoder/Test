package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView f1642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m0 f1643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0 f1644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m0 f1645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f1646e = 0;

    public l(ImageView imageView) {
        this.f1642a = imageView;
    }

    private boolean a(Drawable drawable) {
        if (this.f1645d == null) {
            this.f1645d = new m0();
        }
        m0 m0Var = this.f1645d;
        m0Var.a();
        ColorStateList colorStateListA = androidx.core.widget.e.a(this.f1642a);
        if (colorStateListA != null) {
            m0Var.f1657d = true;
            m0Var.f1654a = colorStateListA;
        }
        PorterDuff.Mode modeB = androidx.core.widget.e.b(this.f1642a);
        if (modeB != null) {
            m0Var.f1656c = true;
            m0Var.f1655b = modeB;
        }
        if (!m0Var.f1657d && !m0Var.f1656c) {
            return false;
        }
        h.i(drawable, m0Var, this.f1642a.getDrawableState());
        return true;
    }

    private boolean l() {
        return this.f1643b != null;
    }

    void b() {
        if (this.f1642a.getDrawable() != null) {
            this.f1642a.getDrawable().setLevel(this.f1646e);
        }
    }

    void c() {
        Drawable drawable = this.f1642a.getDrawable();
        if (drawable != null) {
            y.b(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            m0 m0Var = this.f1644c;
            if (m0Var != null) {
                h.i(drawable, m0Var, this.f1642a.getDrawableState());
                return;
            }
            m0 m0Var2 = this.f1643b;
            if (m0Var2 != null) {
                h.i(drawable, m0Var2, this.f1642a.getDrawableState());
            }
        }
    }

    ColorStateList d() {
        m0 m0Var = this.f1644c;
        if (m0Var != null) {
            return m0Var.f1654a;
        }
        return null;
    }

    PorterDuff.Mode e() {
        m0 m0Var = this.f1644c;
        if (m0Var != null) {
            return m0Var.f1655b;
        }
        return null;
    }

    boolean f() {
        return !(this.f1642a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i10) {
        int iN;
        Context context = this.f1642a.getContext();
        int[] iArr = h.j.R;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        ImageView imageView = this.f1642a;
        n0.q0.k0(imageView, imageView.getContext(), iArr, attributeSet, o0VarV.r(), i10, 0);
        try {
            Drawable drawable = this.f1642a.getDrawable();
            if (drawable == null && (iN = o0VarV.n(h.j.S, -1)) != -1 && (drawable = i.a.b(this.f1642a.getContext(), iN)) != null) {
                this.f1642a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                y.b(drawable);
            }
            int i11 = h.j.T;
            if (o0VarV.s(i11)) {
                androidx.core.widget.e.c(this.f1642a, o0VarV.c(i11));
            }
            int i12 = h.j.U;
            if (o0VarV.s(i12)) {
                androidx.core.widget.e.d(this.f1642a, y.e(o0VarV.k(i12, -1), null));
            }
        } finally {
            o0VarV.x();
        }
    }

    void h(Drawable drawable) {
        this.f1646e = drawable.getLevel();
    }

    public void i(int i10) {
        if (i10 != 0) {
            Drawable drawableB = i.a.b(this.f1642a.getContext(), i10);
            if (drawableB != null) {
                y.b(drawableB);
            }
            this.f1642a.setImageDrawable(drawableB);
        } else {
            this.f1642a.setImageDrawable(null);
        }
        c();
    }

    void j(ColorStateList colorStateList) {
        if (this.f1644c == null) {
            this.f1644c = new m0();
        }
        m0 m0Var = this.f1644c;
        m0Var.f1654a = colorStateList;
        m0Var.f1657d = true;
        c();
    }

    void k(PorterDuff.Mode mode) {
        if (this.f1644c == null) {
            this.f1644c = new m0();
        }
        m0 m0Var = this.f1644c;
        m0Var.f1655b = mode;
        m0Var.f1656c = true;
        c();
    }
}
