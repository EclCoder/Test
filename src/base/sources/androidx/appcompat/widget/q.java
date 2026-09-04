package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f1671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m0 f1672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private m0 f1673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m0 f1674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private m0 f1675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m0 f1676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private m0 f1677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m0 f1678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final r f1679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f1680j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f1681k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Typeface f1682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f1683m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f1688a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f1689b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f1690c;

        b(TextView textView, Typeface typeface, int i10) {
            this.f1688a = textView;
            this.f1689b = typeface;
            this.f1690c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1688a.setTypeface(this.f1689b, this.f1690c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class c {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }

        static void b(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class d {
        static int a(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        static void b(TextView textView, int i10, int i11, int i12, int i13) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i10, i11, i12, i13);
        }

        static void c(TextView textView, int[] iArr, int i10) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i10);
        }

        static boolean d(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static class e {
        static Typeface a(Typeface typeface, int i10, boolean z10) {
            return Typeface.create(typeface, i10, z10);
        }
    }

    q(TextView textView) {
        this.f1671a = textView;
        this.f1679i = new r(textView);
    }

    private void B(int i10, float f10) {
        this.f1679i.t(i10, f10);
    }

    private void C(Context context, o0 o0Var) {
        String strO;
        this.f1680j = o0Var.k(h.j.f40029f3, this.f1680j);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int iK = o0Var.k(h.j.f40077o3, -1);
            this.f1681k = iK;
            if (iK != -1) {
                this.f1680j &= 2;
            }
        }
        int i11 = h.j.f40072n3;
        if (!o0Var.s(i11) && !o0Var.s(h.j.f40082p3)) {
            int i12 = h.j.f40023e3;
            if (o0Var.s(i12)) {
                this.f1683m = false;
                int iK2 = o0Var.k(i12, 1);
                if (iK2 == 1) {
                    this.f1682l = Typeface.SANS_SERIF;
                    return;
                } else if (iK2 == 2) {
                    this.f1682l = Typeface.SERIF;
                    return;
                } else {
                    if (iK2 != 3) {
                        return;
                    }
                    this.f1682l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1682l = null;
        int i13 = h.j.f40082p3;
        if (o0Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1681k;
        int i15 = this.f1680j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceJ = o0Var.j(i11, this.f1680j, new a(i14, i15, new WeakReference(this.f1671a)));
                if (typefaceJ != null) {
                    if (i10 < 28 || this.f1681k == -1) {
                        this.f1682l = typefaceJ;
                    } else {
                        this.f1682l = e.a(Typeface.create(typefaceJ, 0), this.f1681k, (this.f1680j & 2) != 0);
                    }
                }
                this.f1683m = this.f1682l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1682l != null || (strO = o0Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1681k == -1) {
            this.f1682l = Typeface.create(strO, this.f1680j);
        } else {
            this.f1682l = e.a(Typeface.create(strO, 0), this.f1681k, (this.f1680j & 2) != 0);
        }
    }

    private void a(Drawable drawable, m0 m0Var) {
        if (drawable == null || m0Var == null) {
            return;
        }
        h.i(drawable, m0Var, this.f1671a.getDrawableState());
    }

    private static m0 d(Context context, h hVar, int i10) {
        ColorStateList colorStateListF = hVar.f(context, i10);
        if (colorStateListF == null) {
            return null;
        }
        m0 m0Var = new m0();
        m0Var.f1657d = true;
        m0Var.f1654a = colorStateListF;
        return m0Var;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1671a.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f1671a;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1671a.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f1671a.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1671a.getCompoundDrawables();
        TextView textView2 = this.f1671a;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    private void z() {
        m0 m0Var = this.f1678h;
        this.f1672b = m0Var;
        this.f1673c = m0Var;
        this.f1674d = m0Var;
        this.f1675e = m0Var;
        this.f1676f = m0Var;
        this.f1677g = m0Var;
    }

    void A(int i10, float f10) {
        if (z0.f1783c || l()) {
            return;
        }
        B(i10, f10);
    }

    void b() {
        if (this.f1672b != null || this.f1673c != null || this.f1674d != null || this.f1675e != null) {
            Drawable[] compoundDrawables = this.f1671a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1672b);
            a(compoundDrawables[1], this.f1673c);
            a(compoundDrawables[2], this.f1674d);
            a(compoundDrawables[3], this.f1675e);
        }
        if (this.f1676f == null && this.f1677g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1671a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1676f);
        a(compoundDrawablesRelative[2], this.f1677g);
    }

    void c() {
        this.f1679i.a();
    }

    int e() {
        return this.f1679i.f();
    }

    int f() {
        return this.f1679i.g();
    }

    int g() {
        return this.f1679i.h();
    }

    int[] h() {
        return this.f1679i.i();
    }

    int i() {
        return this.f1679i.j();
    }

    ColorStateList j() {
        m0 m0Var = this.f1678h;
        if (m0Var != null) {
            return m0Var.f1654a;
        }
        return null;
    }

    PorterDuff.Mode k() {
        m0 m0Var = this.f1678h;
        if (m0Var != null) {
            return m0Var.f1655b;
        }
        return null;
    }

    boolean l() {
        return this.f1679i.n();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    void m(AttributeSet attributeSet, int i10) {
        boolean zA;
        boolean z10;
        String strO;
        String strO2;
        boolean z11;
        int iA;
        float f10;
        Context context = this.f1671a.getContext();
        h hVarB = h.b();
        int[] iArr = h.j.f39996a0;
        o0 o0VarV = o0.v(context, attributeSet, iArr, i10, 0);
        TextView textView = this.f1671a;
        n0.q0.k0(textView, textView.getContext(), iArr, attributeSet, o0VarV.r(), i10, 0);
        int iN = o0VarV.n(h.j.f40002b0, -1);
        int i11 = h.j.f40020e0;
        if (o0VarV.s(i11)) {
            this.f1672b = d(context, hVarB, o0VarV.n(i11, 0));
        }
        int i12 = h.j.f40008c0;
        if (o0VarV.s(i12)) {
            this.f1673c = d(context, hVarB, o0VarV.n(i12, 0));
        }
        int i13 = h.j.f40026f0;
        if (o0VarV.s(i13)) {
            this.f1674d = d(context, hVarB, o0VarV.n(i13, 0));
        }
        int i14 = h.j.f40014d0;
        if (o0VarV.s(i14)) {
            this.f1675e = d(context, hVarB, o0VarV.n(i14, 0));
        }
        int i15 = h.j.f40032g0;
        if (o0VarV.s(i15)) {
            this.f1676f = d(context, hVarB, o0VarV.n(i15, 0));
        }
        int i16 = h.j.f40038h0;
        if (o0VarV.s(i16)) {
            this.f1677g = d(context, hVarB, o0VarV.n(i16, 0));
        }
        o0VarV.x();
        boolean z12 = this.f1671a.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iN != -1) {
            o0 o0VarT = o0.t(context, iN, h.j.f40011c3);
            if (z12) {
                zA = false;
                z10 = false;
            } else {
                int i17 = h.j.f40092r3;
                if (o0VarT.s(i17)) {
                    zA = o0VarT.a(i17, false);
                    z10 = true;
                } else {
                    zA = false;
                    z10 = false;
                }
            }
            C(context, o0VarT);
            int i18 = Build.VERSION.SDK_INT;
            int i19 = h.j.f40097s3;
            strO2 = o0VarT.s(i19) ? o0VarT.o(i19) : null;
            if (i18 >= 26) {
                int i20 = h.j.f40087q3;
                if (o0VarT.s(i20)) {
                    strO = o0VarT.o(i20);
                } else {
                    strO = null;
                }
            } else {
                strO = null;
            }
            o0VarT.x();
        } else {
            zA = false;
            z10 = false;
            strO = null;
            strO2 = null;
        }
        o0 o0VarV2 = o0.v(context, attributeSet, h.j.f40011c3, i10, 0);
        if (z12) {
            z11 = z10;
        } else {
            int i21 = h.j.f40092r3;
            if (o0VarV2.s(i21)) {
                zA = o0VarV2.a(i21, false);
                z11 = true;
            } else {
                z11 = z10;
            }
        }
        int i22 = Build.VERSION.SDK_INT;
        int i23 = h.j.f40097s3;
        if (o0VarV2.s(i23)) {
            strO2 = o0VarV2.o(i23);
        }
        if (i22 >= 26) {
            int i24 = h.j.f40087q3;
            if (o0VarV2.s(i24)) {
                strO = o0VarV2.o(i24);
            }
        }
        if (i22 >= 28) {
            int i25 = h.j.f40017d3;
            if (o0VarV2.s(i25) && o0VarV2.f(i25, -1) == 0) {
                this.f1671a.setTextSize(0, 0.0f);
            }
        }
        C(context, o0VarV2);
        o0VarV2.x();
        if (!z12 && z11) {
            s(zA);
        }
        Typeface typeface = this.f1682l;
        if (typeface != null) {
            if (this.f1681k == -1) {
                this.f1671a.setTypeface(typeface, this.f1680j);
            } else {
                this.f1671a.setTypeface(typeface);
            }
        }
        if (strO != null) {
            d.d(this.f1671a, strO);
        }
        if (strO2 != null) {
            c.b(this.f1671a, c.a(strO2));
        }
        this.f1679i.o(attributeSet, i10);
        if (z0.f1783c && this.f1679i.j() != 0) {
            int[] iArrI = this.f1679i.i();
            if (iArrI.length > 0) {
                if (d.a(this.f1671a) != -1.0f) {
                    d.b(this.f1671a, this.f1679i.g(), this.f1679i.f(), this.f1679i.h(), 0);
                } else {
                    d.c(this.f1671a, iArrI, 0);
                }
            }
        }
        o0 o0VarU = o0.u(context, attributeSet, h.j.f40044i0);
        int iN2 = o0VarU.n(h.j.f40084q0, -1);
        Drawable drawableC = iN2 != -1 ? hVarB.c(context, iN2) : null;
        int iN3 = o0VarU.n(h.j.f40109v0, -1);
        Drawable drawableC2 = iN3 != -1 ? hVarB.c(context, iN3) : null;
        int iN4 = o0VarU.n(h.j.f40089r0, -1);
        Drawable drawableC3 = iN4 != -1 ? hVarB.c(context, iN4) : null;
        int iN5 = o0VarU.n(h.j.f40074o0, -1);
        Drawable drawableC4 = iN5 != -1 ? hVarB.c(context, iN5) : null;
        int iN6 = o0VarU.n(h.j.f40094s0, -1);
        Drawable drawableC5 = iN6 != -1 ? hVarB.c(context, iN6) : null;
        int iN7 = o0VarU.n(h.j.f40079p0, -1);
        y(drawableC, drawableC2, drawableC3, drawableC4, drawableC5, iN7 != -1 ? hVarB.c(context, iN7) : null);
        int i26 = h.j.f40099t0;
        if (o0VarU.s(i26)) {
            androidx.core.widget.i.f(this.f1671a, o0VarU.c(i26));
        }
        int i27 = h.j.f40104u0;
        if (o0VarU.s(i27)) {
            androidx.core.widget.i.g(this.f1671a, y.e(o0VarU.k(i27, -1), null));
        }
        int iF = o0VarU.f(h.j.f40119x0, -1);
        int iF2 = o0VarU.f(h.j.f40124y0, -1);
        int i28 = h.j.f40129z0;
        if (o0VarU.s(i28)) {
            TypedValue typedValueW = o0VarU.w(i28);
            if (typedValueW == null || typedValueW.type != 5) {
                f10 = o0VarU.f(i28, -1);
                iA = -1;
            } else {
                iA = m0.i.a(typedValueW.data);
                f10 = TypedValue.complexToFloat(typedValueW.data);
            }
        } else {
            iA = -1;
            f10 = -1.0f;
        }
        o0VarU.x();
        if (iF != -1) {
            androidx.core.widget.i.h(this.f1671a, iF);
        }
        if (iF2 != -1) {
            androidx.core.widget.i.i(this.f1671a, iF2);
        }
        if (f10 != -1.0f) {
            if (iA == -1) {
                androidx.core.widget.i.j(this.f1671a, (int) f10);
            } else {
                androidx.core.widget.i.k(this.f1671a, iA, f10);
            }
        }
    }

    void n(WeakReference weakReference, Typeface typeface) {
        if (this.f1683m) {
            this.f1682l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new b(textView, typeface, this.f1680j));
                } else {
                    textView.setTypeface(typeface, this.f1680j);
                }
            }
        }
    }

    void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (z0.f1783c) {
            return;
        }
        c();
    }

    void p() {
        b();
    }

    void q(Context context, int i10) {
        String strO;
        o0 o0VarT = o0.t(context, i10, h.j.f40011c3);
        int i11 = h.j.f40092r3;
        if (o0VarT.s(i11)) {
            s(o0VarT.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = h.j.f40017d3;
        if (o0VarT.s(i13) && o0VarT.f(i13, -1) == 0) {
            this.f1671a.setTextSize(0, 0.0f);
        }
        C(context, o0VarT);
        if (i12 >= 26) {
            int i14 = h.j.f40087q3;
            if (o0VarT.s(i14) && (strO = o0VarT.o(i14)) != null) {
                d.d(this.f1671a, strO);
            }
        }
        o0VarT.x();
        Typeface typeface = this.f1682l;
        if (typeface != null) {
            this.f1671a.setTypeface(typeface, this.f1680j);
        }
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        q0.c.f(editorInfo, textView.getText());
    }

    void s(boolean z10) {
        this.f1671a.setAllCaps(z10);
    }

    void t(int i10, int i11, int i12, int i13) {
        this.f1679i.p(i10, i11, i12, i13);
    }

    void u(int[] iArr, int i10) {
        this.f1679i.q(iArr, i10);
    }

    void v(int i10) {
        this.f1679i.r(i10);
    }

    void w(ColorStateList colorStateList) {
        if (this.f1678h == null) {
            this.f1678h = new m0();
        }
        m0 m0Var = this.f1678h;
        m0Var.f1654a = colorStateList;
        m0Var.f1657d = colorStateList != null;
        z();
    }

    void x(PorterDuff.Mode mode) {
        if (this.f1678h == null) {
            this.f1678h = new m0();
        }
        m0 m0Var = this.f1678h;
        m0Var.f1655b = mode;
        m0Var.f1656c = mode != null;
        z();
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends d0.h.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f1685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ WeakReference f1686c;

        a(int i10, int i11, WeakReference weakReference) {
            this.f1684a = i10;
            this.f1685b = i11;
            this.f1686c = weakReference;
        }

        @Override // d0.h.c
        public void g(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1684a) != -1) {
                typeface = e.a(typeface, i10, (this.f1685b & 2) != 0);
            }
            q.this.n(this.f1686c, typeface);
        }

        @Override // d0.h.c
        public void f(int i10) {
        }
    }
}
