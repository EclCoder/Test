package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.c0;
import mc.o;
import mc.p;
import mc.s;
import mc.x;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MaterialButton f19642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private o f19643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f1.i f19644c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private mc.i.d f19645d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19646e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19647f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19648g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19649h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19650i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f19651j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f19652k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ColorStateList f19653l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ColorStateList f19654m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ColorStateList f19655n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f19656o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f19660s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private RippleDrawable f19662u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f19663v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f19657p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f19658q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f19659r = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f19661t = true;

    j(MaterialButton materialButton, o oVar) {
        this.f19642a = materialButton;
        this.f19643b = oVar;
    }

    private void G(int i10, int i11, int i12, int i13) {
        int paddingStart = this.f19642a.getPaddingStart();
        int paddingTop = this.f19642a.getPaddingTop();
        int paddingEnd = this.f19642a.getPaddingEnd();
        int paddingBottom = this.f19642a.getPaddingBottom();
        int i14 = this.f19646e;
        int i15 = this.f19648g;
        int i16 = this.f19647f;
        int i17 = this.f19649h;
        this.f19646e = i10;
        this.f19648g = i11;
        this.f19647f = i12;
        this.f19649h = i13;
        if (!this.f19658q) {
            P();
        }
        this.f19642a.setPaddingRelative((paddingStart + i10) - i14, (paddingTop + i11) - i15, (paddingEnd + i12) - i16, (paddingBottom + i13) - i17);
    }

    private void P() {
        this.f19642a.setInternalBackground(a());
        mc.i iVarI = i();
        if (iVarI != null) {
            iVarI.k0(this.f19663v);
            iVarI.setState(this.f19642a.getDrawableState());
        }
        FocusRingDrawable focusRingDrawableM = FocusRingDrawable.m(this.f19642a.getBackground());
        if (focusRingDrawableM != null) {
            focusRingDrawableM.D(iVarI);
        }
    }

    private void Q() {
        mc.i iVarI = i();
        if (iVarI != null) {
            iVarI.u0(this.f19643b);
            f1.i iVar = this.f19644c;
            if (iVar != null) {
                iVarI.j0(iVar);
            }
        }
        mc.i iVarR = r();
        if (iVarR != null) {
            iVarR.u0(this.f19643b);
            f1.i iVar2 = this.f19644c;
            if (iVar2 != null) {
                iVarR.j0(iVar2);
            }
        }
        s sVarH = h();
        if (sVarH != null) {
            if (!(sVarH instanceof mc.i)) {
                sVarH.setShapeAppearanceModel(this.f19643b.e());
                return;
            }
            mc.i iVar3 = (mc.i) sVarH;
            iVar3.u0(this.f19643b);
            f1.i iVar4 = this.f19644c;
            if (iVar4 != null) {
                iVar3.j0(iVar4);
            }
        }
    }

    private void R() {
        mc.i iVarI = i();
        mc.i iVarR = r();
        if (iVarI != null) {
            iVarI.x0(this.f19651j, this.f19654m);
            if (iVarR != null) {
                iVarR.w0(this.f19651j, this.f19657p ? ac.a.d(this.f19642a, sb.c.f51620m) : 0);
            }
        }
    }

    private InsetDrawable S(Drawable drawable) {
        return new InsetDrawable(drawable, this.f19646e, this.f19648g, this.f19647f, this.f19649h);
    }

    private Drawable a() {
        mc.i iVar = new mc.i(this.f19643b);
        f1.i iVar2 = this.f19644c;
        if (iVar2 != null) {
            iVar.j0(iVar2);
        }
        mc.i.d dVar = this.f19645d;
        if (dVar != null) {
            iVar.n0(dVar);
        }
        Context context = this.f19642a.getContext();
        iVar.Y(context);
        iVar.setTintList(this.f19653l);
        PorterDuff.Mode mode = this.f19652k;
        if (mode != null) {
            iVar.setTintMode(mode);
        }
        iVar.x0(this.f19651j, this.f19654m);
        mc.i iVar3 = new mc.i(this.f19643b);
        f1.i iVar4 = this.f19644c;
        if (iVar4 != null) {
            iVar3.j0(iVar4);
        }
        iVar3.setTint(0);
        iVar3.w0(this.f19651j, this.f19657p ? ac.a.d(this.f19642a, sb.c.f51620m) : 0);
        mc.i iVar5 = new mc.i(this.f19643b);
        this.f19656o = iVar5;
        f1.i iVar6 = this.f19644c;
        if (iVar6 != null) {
            iVar5.j0(iVar6);
        }
        this.f19656o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(kc.a.d(this.f19655n), S(new LayerDrawable(new Drawable[]{iVar3, iVar})), this.f19656o);
        this.f19662u = rippleDrawable;
        FocusRingDrawable.w(context, rippleDrawable);
        return this.f19662u;
    }

    private mc.i j(boolean z10) {
        RippleDrawable rippleDrawable = this.f19662u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (mc.i) ((LayerDrawable) ((InsetDrawable) this.f19662u.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
    }

    private mc.i r() {
        return j(true);
    }

    void A(mc.i.d dVar) {
        this.f19645d = dVar;
        mc.i iVarI = i();
        if (iVarI != null) {
            iVarI.n0(dVar);
        }
    }

    void B(f1.i iVar) {
        this.f19644c = iVar;
        if (this.f19643b instanceof x) {
            Q();
        }
    }

    public void C(int i10) {
        G(this.f19646e, this.f19648g, this.f19647f, i10);
    }

    public void D(int i10) {
        G(i10, this.f19648g, this.f19647f, this.f19649h);
    }

    public void E(int i10) {
        G(this.f19646e, this.f19648g, i10, this.f19649h);
    }

    public void F(int i10) {
        G(this.f19646e, i10, this.f19647f, this.f19649h);
    }

    void H(ColorStateList colorStateList) {
        if (this.f19655n != colorStateList) {
            this.f19655n = colorStateList;
            if (this.f19642a.getBackground() instanceof RippleDrawable) {
                ((RippleDrawable) this.f19642a.getBackground()).setColor(kc.a.d(colorStateList));
            }
        }
    }

    void I(o oVar) {
        this.f19643b = oVar;
        Q();
    }

    void J(boolean z10) {
        this.f19657p = z10;
        R();
    }

    void K(ColorStateList colorStateList) {
        if (this.f19654m != colorStateList) {
            this.f19654m = colorStateList;
            R();
        }
    }

    void L(int i10) {
        if (this.f19651j != i10) {
            this.f19651j = i10;
            R();
        }
    }

    void M(ColorStateList colorStateList) {
        if (this.f19653l != colorStateList) {
            this.f19653l = colorStateList;
            if (i() != null) {
                i().setTintList(this.f19653l);
            }
        }
    }

    void N(PorterDuff.Mode mode) {
        if (this.f19652k != mode) {
            this.f19652k = mode;
            if (i() == null || this.f19652k == null) {
                return;
            }
            i().setTintMode(this.f19652k);
        }
    }

    void O(boolean z10) {
        this.f19661t = z10;
    }

    int b() {
        return this.f19650i;
    }

    f1.i c() {
        return this.f19644c;
    }

    public int d() {
        return this.f19649h;
    }

    public int e() {
        return this.f19646e;
    }

    public int f() {
        return this.f19647f;
    }

    public int g() {
        return this.f19648g;
    }

    public s h() {
        RippleDrawable rippleDrawable = this.f19662u;
        if (rippleDrawable == null) {
            return null;
        }
        Object objFindDrawableByLayerId = rippleDrawable.findDrawableByLayerId(R.id.mask);
        if (objFindDrawableByLayerId instanceof s) {
            return (s) objFindDrawableByLayerId;
        }
        return null;
    }

    mc.i i() {
        return j(false);
    }

    ColorStateList k() {
        return this.f19655n;
    }

    o l() {
        return this.f19643b;
    }

    p m() {
        return this.f19643b.e();
    }

    ColorStateList n() {
        return this.f19654m;
    }

    int o() {
        return this.f19651j;
    }

    ColorStateList p() {
        return this.f19653l;
    }

    PorterDuff.Mode q() {
        return this.f19652k;
    }

    boolean s() {
        return this.f19658q;
    }

    boolean t() {
        return this.f19660s;
    }

    boolean u() {
        return this.f19661t;
    }

    void v(TypedArray typedArray) {
        this.f19646e = typedArray.getDimensionPixelOffset(m.Y4, 0);
        this.f19647f = typedArray.getDimensionPixelOffset(m.Z4, 0);
        this.f19648g = typedArray.getDimensionPixelOffset(m.f51889a5, 0);
        this.f19649h = typedArray.getDimensionPixelOffset(m.f51905b5, 0);
        int i10 = m.f51968f5;
        if (typedArray.hasValue(i10)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i10, -1);
            this.f19650i = dimensionPixelSize;
            I(this.f19643b.a(dimensionPixelSize));
            this.f19659r = true;
        }
        this.f19651j = typedArray.getDimensionPixelSize(m.f52208v5, 0);
        this.f19652k = c0.n(typedArray.getInt(m.f51953e5, -1), PorterDuff.Mode.SRC_IN);
        this.f19653l = jc.c.a(this.f19642a.getContext(), typedArray, m.f51937d5);
        this.f19654m = jc.c.a(this.f19642a.getContext(), typedArray, m.f52193u5);
        this.f19655n = jc.c.a(this.f19642a.getContext(), typedArray, m.f52103o5);
        this.f19660s = typedArray.getBoolean(m.f51921c5, false);
        this.f19663v = typedArray.getDimensionPixelSize(m.f51983g5, 0);
        this.f19661t = typedArray.getBoolean(m.f52223w5, true);
        int paddingStart = this.f19642a.getPaddingStart();
        int paddingTop = this.f19642a.getPaddingTop();
        int paddingEnd = this.f19642a.getPaddingEnd();
        int paddingBottom = this.f19642a.getPaddingBottom();
        if (typedArray.hasValue(m.W4)) {
            x();
        } else {
            P();
        }
        this.f19642a.setPaddingRelative(paddingStart + this.f19646e, paddingTop + this.f19648g, paddingEnd + this.f19647f, paddingBottom + this.f19649h);
    }

    void w(int i10) {
        if (i() != null) {
            i().setTint(i10);
        }
    }

    void x() {
        this.f19658q = true;
        this.f19642a.setSupportBackgroundTintList(this.f19653l);
        this.f19642a.setSupportBackgroundTintMode(this.f19652k);
    }

    void y(boolean z10) {
        this.f19660s = z10;
    }

    void z(int i10) {
        if (this.f19659r && this.f19650i == i10) {
            return;
        }
        this.f19650i = i10;
        this.f19659r = true;
        I(this.f19643b.a(i10));
    }
}
