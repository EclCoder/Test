package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ta.QXA.YSHErhbVu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class t extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f21426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FrameLayout f21427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckableImageButton f21428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorStateList f21429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PorterDuff.Mode f21430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private View.OnLongClickListener f21431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CheckableImageButton f21432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f21433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f21434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LinkedHashSet f21435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorStateList f21436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private PorterDuff.Mode f21437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f21438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ImageView.ScaleType f21439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f21440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f21441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final TextView f21442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f21443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private EditText f21444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AccessibilityManager f21445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private AccessibilityManager.TouchExplorationStateChangeListener f21446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final TextWatcher f21447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final TextInputLayout.g f21448w;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends com.google.android.material.internal.y {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            t.this.o().a(editable);
        }

        @Override // com.google.android.material.internal.y, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            t.this.o().b(charSequence, i10, i11, i12);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b implements TextInputLayout.g {
        b() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.g
        public void a(TextInputLayout textInputLayout) {
            if (t.this.f21444s == textInputLayout.getEditText()) {
                return;
            }
            if (t.this.f21444s != null) {
                t.this.f21444s.removeTextChangedListener(t.this.f21447v);
                if (t.this.f21444s.getOnFocusChangeListener() == t.this.o().e()) {
                    t.this.f21444s.setOnFocusChangeListener(null);
                }
            }
            t.this.f21444s = textInputLayout.getEditText();
            if (t.this.f21444s != null) {
                t.this.f21444s.addTextChangedListener(t.this.f21447v);
            }
            t.this.o().n(t.this.f21444s);
            t tVar = t.this;
            tVar.j0(tVar.o());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c implements View.OnAttachStateChangeListener {
        c() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            t.this.i();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            t.this.O();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SparseArray f21452a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t f21453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21454c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f21455d;

        d(t tVar, o0 o0Var) {
            this.f21453b = tVar;
            this.f21454c = o0Var.n(sb.m.Xc, 0);
            this.f21455d = o0Var.n(sb.m.f52231wd, 0);
        }

        private u b(int i10) {
            if (i10 == -1) {
                return new g(this.f21453b);
            }
            if (i10 == 0) {
                return new x(this.f21453b);
            }
            if (i10 == 1) {
                return new z(this.f21453b, this.f21455d);
            }
            if (i10 == 2) {
                return new f(this.f21453b);
            }
            if (i10 == 3) {
                return new p(this.f21453b);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i10);
        }

        u c(int i10) {
            u uVar = (u) this.f21452a.get(i10);
            if (uVar != null) {
                return uVar;
            }
            u uVarB = b(i10);
            this.f21452a.append(i10, uVarB);
            return uVarB;
        }
    }

    t(TextInputLayout textInputLayout, o0 o0Var) {
        super(textInputLayout.getContext());
        this.f21434i = 0;
        this.f21435j = new LinkedHashSet();
        this.f21447v = new a();
        b bVar = new b();
        this.f21448w = bVar;
        this.f21445t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f21426a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21427b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonK = k(this, layoutInflaterFrom, sb.g.f51782r0);
        this.f21428c = checkableImageButtonK;
        CheckableImageButton checkableImageButtonK2 = k(frameLayout, layoutInflaterFrom, sb.g.f51780q0);
        this.f21432g = checkableImageButtonK2;
        this.f21433h = new d(this, o0Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f21442q = appCompatTextView;
        E(o0Var);
        D(o0Var);
        F(o0Var);
        frameLayout.addView(checkableImageButtonK2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonK);
        checkableImageButtonK.setOnFocusableChangedListener(new CheckableImageButton.b() { // from class: com.google.android.material.textfield.r
            @Override // com.google.android.material.internal.CheckableImageButton.b
            public final void a(View view, boolean z10) {
                t.a(this.f21424a, view, z10);
            }
        });
        checkableImageButtonK2.setOnFocusableChangedListener(new CheckableImageButton.b() { // from class: com.google.android.material.textfield.s
            @Override // com.google.android.material.internal.CheckableImageButton.b
            public final void a(View view, boolean z10) {
                t tVar = this.f21425a;
                v.k(tVar.f21432g, tVar.f21440o, tVar.n());
            }
        });
        textInputLayout.j(bVar);
        addOnAttachStateChangeListener(new c());
    }

    private void A0() {
        int visibility = this.f21442q.getVisibility();
        int i10 = (this.f21441p == null || this.f21443r) ? 8 : 0;
        if (visibility != i10) {
            o().q(i10 == 0);
        }
        x0();
        this.f21442q.setVisibility(i10);
        this.f21426a.p0();
    }

    private void D(o0 o0Var) {
        int i10 = sb.m.f52246xd;
        if (!o0Var.s(i10)) {
            int i11 = sb.m.f51913bd;
            if (o0Var.s(i11)) {
                this.f21436k = jc.c.b(getContext(), o0Var, i11);
            }
            int i12 = sb.m.f51929cd;
            if (o0Var.s(i12)) {
                this.f21437l = com.google.android.material.internal.c0.n(o0Var.k(i12, -1), null);
            }
        }
        int i13 = sb.m.Zc;
        if (o0Var.s(i13)) {
            W(o0Var.k(i13, 0));
            int i14 = sb.m.Wc;
            if (o0Var.s(i14)) {
                S(o0Var.p(i14));
            }
            Q(o0Var.a(sb.m.Vc, true));
        } else if (o0Var.s(i10)) {
            int i15 = sb.m.f52261yd;
            if (o0Var.s(i15)) {
                this.f21436k = jc.c.b(getContext(), o0Var, i15);
            }
            int i16 = sb.m.f52276zd;
            if (o0Var.s(i16)) {
                this.f21437l = com.google.android.material.internal.c0.n(o0Var.k(i16, -1), null);
            }
            W(o0Var.a(i10, false) ? 1 : 0);
            S(o0Var.p(sb.m.f52216vd));
        }
        V(o0Var.f(sb.m.Yc, getResources().getDimensionPixelSize(sb.e.V0)));
        int i17 = sb.m.f51897ad;
        if (o0Var.s(i17)) {
            Z(v.b(o0Var.k(i17, -1)));
        }
    }

    private void E(o0 o0Var) {
        int i10 = sb.m.f52006hd;
        if (o0Var.s(i10)) {
            this.f21429d = jc.c.b(getContext(), o0Var, i10);
        }
        int i11 = sb.m.f52021id;
        if (o0Var.s(i11)) {
            this.f21430e = com.google.android.material.internal.c0.n(o0Var.k(i11, -1), null);
        }
        int i12 = sb.m.f51991gd;
        if (o0Var.s(i12)) {
            e0(o0Var.g(i12));
        }
        this.f21428c.setContentDescription(getResources().getText(sb.k.f51843o));
        this.f21428c.setImportantForAccessibility(2);
        this.f21428c.setClickable(false);
        this.f21428c.setPressable(false);
        this.f21428c.setCheckable(false);
        this.f21428c.setFocusable(false);
    }

    private void F(o0 o0Var) {
        this.f21442q.setVisibility(8);
        this.f21442q.setId(sb.g.f51794x0);
        this.f21442q.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        this.f21442q.setAccessibilityLiveRegion(1);
        s0(o0Var.n(sb.m.Od, 0));
        int i10 = sb.m.Pd;
        if (o0Var.s(i10)) {
            t0(o0Var.c(i10));
        }
        r0(o0Var.p(sb.m.Nd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        AccessibilityManager accessibilityManager;
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f21446u;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.f21445t) == null) {
            return;
        }
        accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
    }

    public static /* synthetic */ void a(t tVar, View view, boolean z10) {
        CheckableImageButton checkableImageButton = tVar.f21428c;
        v.k(checkableImageButton, tVar.f21431f, checkableImageButton.getContentDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f21446u == null || this.f21445t == null || !isAttachedToWindow()) {
            return;
        }
        this.f21445t.addTouchExplorationStateChangeListener(this.f21446u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(u uVar) {
        if (this.f21444s == null) {
            return;
        }
        if (uVar.e() != null) {
            this.f21444s.setOnFocusChangeListener(uVar.e());
        }
        if (uVar.g() != null) {
            this.f21432g.setOnFocusChangeListener(uVar.g());
        }
    }

    private CheckableImageButton k(ViewGroup viewGroup, LayoutInflater layoutInflater, int i10) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(sb.i.f51814m, viewGroup, false);
        checkableImageButton.setId(i10);
        v.e(checkableImageButton);
        if (jc.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    private void l(int i10) {
        Iterator it = this.f21435j.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
    }

    private void u0(u uVar) {
        uVar.s();
        this.f21446u = uVar.h();
        i();
    }

    private int v(u uVar) {
        int i10 = this.f21433h.f21454c;
        return i10 == 0 ? uVar.d() : i10;
    }

    private void v0(u uVar) {
        O();
        this.f21446u = null;
        uVar.u();
    }

    private void w0(boolean z10) {
        if (!z10 || p() == null) {
            v.a(this.f21426a, this.f21432g, this.f21436k, this.f21437l);
            return;
        }
        Drawable drawableMutate = f0.a.r(p()).mutate();
        drawableMutate.setTint(this.f21426a.getErrorCurrentTextColors());
        this.f21432g.setImageDrawable(drawableMutate);
    }

    private void x0() {
        this.f21427b.setVisibility((this.f21432g.getVisibility() != 0 || I()) ? 8 : 0);
        setVisibility((H() || I() || ((this.f21441p == null || this.f21443r) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void y0() {
        this.f21428c.setVisibility(u() != null && this.f21426a.O() && this.f21426a.d0() ? 0 : 8);
        x0();
        z0();
        if (C()) {
            return;
        }
        this.f21426a.p0();
    }

    int A() {
        return getPaddingEnd() + this.f21442q.getPaddingEnd() + ((H() || I()) ? this.f21432g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f21432g.getLayoutParams()).getMarginStart() : 0);
    }

    TextView B() {
        return this.f21442q;
    }

    boolean C() {
        return this.f21434i != 0;
    }

    boolean G() {
        return C() && this.f21432g.isChecked();
    }

    boolean H() {
        return this.f21427b.getVisibility() == 0 && this.f21432g.getVisibility() == 0;
    }

    boolean I() {
        return this.f21428c.getVisibility() == 0;
    }

    void J(boolean z10) {
        this.f21443r = z10;
        A0();
    }

    void K() {
        y0();
        M();
        L();
        if (o().t()) {
            w0(this.f21426a.d0());
        }
    }

    void L() {
        v.d(this.f21426a, this.f21432g, this.f21436k);
    }

    void M() {
        v.d(this.f21426a, this.f21428c, this.f21429d);
    }

    void N(boolean z10) {
        boolean z11;
        boolean zIsActivated;
        boolean zIsChecked;
        u uVarO = o();
        boolean z12 = true;
        if (!uVarO.l() || (zIsChecked = this.f21432g.isChecked()) == uVarO.m()) {
            z11 = false;
        } else {
            this.f21432g.setChecked(!zIsChecked);
            z11 = true;
        }
        if (!uVarO.j() || (zIsActivated = this.f21432g.isActivated()) == uVarO.k()) {
            z12 = z11;
        } else {
            P(!zIsActivated);
        }
        if (z10 || z12) {
            L();
        }
    }

    void P(boolean z10) {
        this.f21432g.setActivated(z10);
    }

    void Q(boolean z10) {
        this.f21432g.setCheckable(z10);
    }

    void R(int i10) {
        S(i10 != 0 ? getResources().getText(i10) : null);
    }

    void S(CharSequence charSequence) {
        if (n() != charSequence) {
            this.f21432g.setContentDescription(charSequence);
            v.k(this.f21432g, this.f21440o, charSequence);
        }
    }

    void T(int i10) {
        U(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    void U(Drawable drawable) {
        this.f21432g.setImageDrawable(drawable);
        if (drawable != null) {
            v.a(this.f21426a, this.f21432g, this.f21436k, this.f21437l);
            L();
        }
    }

    void V(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i10 != this.f21438m) {
            this.f21438m = i10;
            v.g(this.f21432g, i10);
            v.g(this.f21428c, i10);
        }
    }

    void X(View.OnClickListener onClickListener) {
        v.h(this.f21432g, onClickListener, this.f21440o);
    }

    void Y(View.OnLongClickListener onLongClickListener) {
        this.f21440o = onLongClickListener;
        v.i(this.f21432g, onLongClickListener);
    }

    void Z(ImageView.ScaleType scaleType) {
        this.f21439n = scaleType;
        v.j(this.f21432g, scaleType);
        v.j(this.f21428c, scaleType);
    }

    void a0(ColorStateList colorStateList) {
        if (this.f21436k != colorStateList) {
            this.f21436k = colorStateList;
            v.a(this.f21426a, this.f21432g, colorStateList, this.f21437l);
        }
    }

    void b0(PorterDuff.Mode mode) {
        if (this.f21437l != mode) {
            this.f21437l = mode;
            v.a(this.f21426a, this.f21432g, this.f21436k, mode);
        }
    }

    void c0(boolean z10) {
        EditText editText;
        if (H() != z10) {
            if (!z10 && this.f21432g.hasFocus() && (editText = this.f21444s) != null) {
                editText.requestFocus();
            }
            this.f21432g.setVisibility(z10 ? 0 : 8);
            x0();
            z0();
            this.f21426a.p0();
        }
    }

    void d0(int i10) {
        e0(i10 != 0 ? i.a.b(getContext(), i10) : null);
        M();
    }

    void e0(Drawable drawable) {
        this.f21428c.setImageDrawable(drawable);
        y0();
        v.a(this.f21426a, this.f21428c, this.f21429d, this.f21430e);
    }

    void f0(View.OnClickListener onClickListener) {
        v.h(this.f21428c, onClickListener, this.f21431f);
    }

    void g0(View.OnLongClickListener onLongClickListener) {
        this.f21431f = onLongClickListener;
        v.i(this.f21428c, onLongClickListener);
    }

    void h0(ColorStateList colorStateList) {
        if (this.f21429d != colorStateList) {
            this.f21429d = colorStateList;
            v.a(this.f21426a, this.f21428c, colorStateList, this.f21430e);
        }
    }

    void i0(PorterDuff.Mode mode) {
        if (this.f21430e != mode) {
            this.f21430e = mode;
            v.a(this.f21426a, this.f21428c, this.f21429d, mode);
        }
    }

    void j() {
        this.f21432g.performClick();
        this.f21432g.jumpDrawablesToCurrentState();
    }

    void k0(int i10) {
        l0(i10 != 0 ? getResources().getText(i10) : null);
    }

    void l0(CharSequence charSequence) {
        this.f21432g.setContentDescription(charSequence);
    }

    CheckableImageButton m() {
        if (I()) {
            return this.f21428c;
        }
        if (C() && H()) {
            return this.f21432g;
        }
        return null;
    }

    void m0(int i10) {
        n0(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    CharSequence n() {
        return this.f21432g.getContentDescription();
    }

    void n0(Drawable drawable) {
        this.f21432g.setImageDrawable(drawable);
    }

    u o() {
        return this.f21433h.c(this.f21434i);
    }

    void o0(boolean z10) {
        if (z10 && this.f21434i != 1) {
            W(1);
        } else {
            if (z10) {
                return;
            }
            W(0);
        }
    }

    Drawable p() {
        return this.f21432g.getDrawable();
    }

    void p0(ColorStateList colorStateList) {
        this.f21436k = colorStateList;
        v.a(this.f21426a, this.f21432g, colorStateList, this.f21437l);
    }

    int q() {
        return this.f21438m;
    }

    void q0(PorterDuff.Mode mode) {
        this.f21437l = mode;
        v.a(this.f21426a, this.f21432g, this.f21436k, mode);
    }

    int r() {
        return this.f21434i;
    }

    void r0(CharSequence charSequence) {
        this.f21441p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f21442q.setText(charSequence);
        A0();
    }

    ImageView.ScaleType s() {
        return this.f21439n;
    }

    void s0(int i10) {
        androidx.core.widget.i.m(this.f21442q, i10);
    }

    CheckableImageButton t() {
        return this.f21432g;
    }

    void t0(ColorStateList colorStateList) {
        this.f21442q.setTextColor(colorStateList);
    }

    Drawable u() {
        return this.f21428c.getDrawable();
    }

    CharSequence w() {
        return this.f21432g.getContentDescription();
    }

    Drawable x() {
        return this.f21432g.getDrawable();
    }

    CharSequence y() {
        return this.f21441p;
    }

    ColorStateList z() {
        return this.f21442q.getTextColors();
    }

    void z0() {
        if (this.f21426a.f21319e == null) {
            return;
        }
        this.f21442q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(sb.e.f51719s0), this.f21426a.f21319e.getPaddingTop(), (H() || I()) ? 0 : this.f21426a.f21319e.getPaddingEnd(), this.f21426a.f21319e.getPaddingBottom());
    }

    void W(int i10) {
        if (this.f21434i == i10) {
            return;
        }
        v0(o());
        int i11 = this.f21434i;
        this.f21434i = i10;
        l(i11);
        c0(i10 != 0);
        u uVarO = o();
        T(v(uVarO));
        Q(uVarO.l());
        if (!uVarO.i(this.f21426a.getBoxBackgroundMode())) {
            throw new IllegalStateException(YSHErhbVu.Odi + this.f21426a.getBoxBackgroundMode() + " is not supported by the end icon mode " + i10);
        }
        u0(uVarO);
        X(uVarO.f());
        R(uVarO.c());
        EditText editText = this.f21444s;
        if (editText != null) {
            uVarO.n(editText);
            j0(uVarO);
        }
        v.a(this.f21426a, this.f21432g, this.f21436k, this.f21437l);
        N(true);
    }
}
