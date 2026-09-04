package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CompoundButton f1585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1586b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1587c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1588d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1589e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1590f;

    g(CompoundButton compoundButton) {
        this.f1585a = compoundButton;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.c.a(this.f1585a);
        if (drawableA != null) {
            if (this.f1588d || this.f1589e) {
                Drawable drawableMutate = f0.a.r(drawableA).mutate();
                if (this.f1588d) {
                    f0.a.o(drawableMutate, this.f1586b);
                }
                if (this.f1589e) {
                    f0.a.p(drawableMutate, this.f1587c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1585a.getDrawableState());
                }
                this.f1585a.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f1586b;
    }

    PorterDuff.Mode c() {
        return this.f1587c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f1585a.getContext();
        int[] iArr = h.j.W0;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.f1585a;
        n0.q0.k0(compoundButton, compoundButton.getContext(), iArr, attributeSet, o0VarV.r(), i10, 0);
        try {
            int i12 = h.j.Y0;
            if (!o0VarV.s(i12) || (iN2 = o0VarV.n(i12, 0)) == 0) {
                i11 = h.j.X0;
                if (o0VarV.s(i11) && (iN = o0VarV.n(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f1585a;
                    compoundButton2.setButtonDrawable(i.a.b(compoundButton2.getContext(), iN));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f1585a;
                    compoundButton3.setButtonDrawable(i.a.b(compoundButton3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = h.j.X0;
                    if (o0VarV.s(i11)) {
                        CompoundButton compoundButton4 = this.f1585a;
                        compoundButton4.setButtonDrawable(i.a.b(compoundButton4.getContext(), iN));
                    }
                }
            }
            int i13 = h.j.Z0;
            if (o0VarV.s(i13)) {
                androidx.core.widget.c.d(this.f1585a, o0VarV.c(i13));
            }
            int i14 = h.j.f39997a1;
            if (o0VarV.s(i14)) {
                androidx.core.widget.c.e(this.f1585a, y.e(o0VarV.k(i14, -1), null));
            }
        } finally {
            o0VarV.x();
        }
    }

    void e() {
        if (this.f1590f) {
            this.f1590f = false;
        } else {
            this.f1590f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f1586b = colorStateList;
        this.f1588d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f1587c = mode;
        this.f1589e = true;
        a();
    }
}
