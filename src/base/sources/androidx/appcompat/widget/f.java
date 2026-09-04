package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CheckedTextView f1569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ColorStateList f1570b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f1571c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f1572d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1573e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1574f;

    f(CheckedTextView checkedTextView) {
        this.f1569a = checkedTextView;
    }

    void a() {
        Drawable drawableA = androidx.core.widget.b.a(this.f1569a);
        if (drawableA != null) {
            if (this.f1572d || this.f1573e) {
                Drawable drawableMutate = f0.a.r(drawableA).mutate();
                if (this.f1572d) {
                    f0.a.o(drawableMutate, this.f1570b);
                }
                if (this.f1573e) {
                    f0.a.p(drawableMutate, this.f1571c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f1569a.getDrawableState());
                }
                this.f1569a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList b() {
        return this.f1570b;
    }

    PorterDuff.Mode c() {
        return this.f1571c;
    }

    void d(AttributeSet attributeSet, int i10) {
        int i11;
        int iN;
        int iN2;
        Context context = this.f1569a.getContext();
        int[] iArr = h.j.R0;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.f1569a;
        n0.q0.k0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, o0VarV.r(), i10, 0);
        try {
            int i12 = h.j.T0;
            if (!o0VarV.s(i12) || (iN2 = o0VarV.n(i12, 0)) == 0) {
                i11 = h.j.S0;
                if (o0VarV.s(i11) && (iN = o0VarV.n(i11, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f1569a;
                    checkedTextView2.setCheckMarkDrawable(i.a.b(checkedTextView2.getContext(), iN));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f1569a;
                    checkedTextView3.setCheckMarkDrawable(i.a.b(checkedTextView3.getContext(), iN2));
                } catch (Resources.NotFoundException unused) {
                    i11 = h.j.S0;
                    if (o0VarV.s(i11)) {
                        CheckedTextView checkedTextView4 = this.f1569a;
                        checkedTextView4.setCheckMarkDrawable(i.a.b(checkedTextView4.getContext(), iN));
                    }
                }
            }
            int i13 = h.j.U0;
            if (o0VarV.s(i13)) {
                androidx.core.widget.b.b(this.f1569a, o0VarV.c(i13));
            }
            int i14 = h.j.V0;
            if (o0VarV.s(i14)) {
                androidx.core.widget.b.c(this.f1569a, y.e(o0VarV.k(i14, -1), null));
            }
        } finally {
            o0VarV.x();
        }
    }

    void e() {
        if (this.f1574f) {
            this.f1574f = false;
        } else {
            this.f1574f = true;
            a();
        }
    }

    void f(ColorStateList colorStateList) {
        this.f1570b = colorStateList;
        this.f1572d = true;
        a();
    }

    void g(PorterDuff.Mode mode) {
        this.f1571c = mode;
        this.f1573e = true;
        a();
    }
}
