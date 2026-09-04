package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.o0;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class b0 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextInputLayout f21375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TextView f21376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private CharSequence f21377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckableImageButton f21378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f21379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private PorterDuff.Mode f21380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ImageView.ScaleType f21382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View.OnLongClickListener f21383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21384j;

    b0(TextInputLayout textInputLayout, o0 o0Var) {
        super(textInputLayout.getContext());
        this.f21375a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(sb.i.f51815n, (ViewGroup) this, false);
        this.f21378d = checkableImageButton;
        v.e(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f21376b = appCompatTextView;
        k(o0Var);
        j(o0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
        checkableImageButton.setOnFocusableChangedListener(new CheckableImageButton.b() { // from class: com.google.android.material.textfield.a0
            @Override // com.google.android.material.internal.CheckableImageButton.b
            public final void a(View view, boolean z10) {
                b0 b0Var = this.f21373a;
                v.k(b0Var.f21378d, b0Var.f21383i, b0Var.f());
            }
        });
    }

    private void D() {
        int i10 = (this.f21377c == null || this.f21384j) ? 8 : 0;
        setVisibility((this.f21378d.getVisibility() == 0 || i10 == 0) ? 0 : 8);
        this.f21376b.setVisibility(i10);
        this.f21375a.p0();
    }

    private void j(o0 o0Var) {
        this.f21376b.setVisibility(8);
        this.f21376b.setId(sb.g.f51792w0);
        this.f21376b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f21376b.setAccessibilityLiveRegion(1);
        p(o0Var.n(sb.m.Ed, 0));
        int i10 = sb.m.Fd;
        if (o0Var.s(i10)) {
            q(o0Var.c(i10));
        }
        o(o0Var.p(sb.m.Dd));
    }

    private void k(o0 o0Var) {
        if (jc.c.k(getContext())) {
            ((ViewGroup.MarginLayoutParams) this.f21378d.getLayoutParams()).setMarginEnd(0);
        }
        v(null);
        w(null);
        int i10 = sb.m.Ld;
        if (o0Var.s(i10)) {
            this.f21379e = jc.c.b(getContext(), o0Var, i10);
        }
        int i11 = sb.m.Md;
        if (o0Var.s(i11)) {
            this.f21380f = com.google.android.material.internal.c0.n(o0Var.k(i11, -1), null);
        }
        int i12 = sb.m.Id;
        if (o0Var.s(i12)) {
            t(o0Var.g(i12));
            int i13 = sb.m.Hd;
            if (o0Var.s(i13)) {
                s(o0Var.p(i13));
            }
            r(o0Var.a(sb.m.Gd, true));
        }
        u(o0Var.f(sb.m.Jd, getResources().getDimensionPixelSize(sb.e.V0)));
        int i14 = sb.m.Kd;
        if (o0Var.s(i14)) {
            x(v.b(o0Var.k(i14, -1)));
        }
    }

    void A(boolean z10) {
        EditText editText;
        if (l() != z10) {
            if (!z10 && this.f21378d.hasFocus() && (editText = this.f21375a.getEditText()) != null) {
                editText.requestFocus();
            }
            this.f21378d.setVisibility(z10 ? 0 : 8);
            C();
            D();
        }
    }

    void B(o0.p pVar) {
        if (this.f21376b.getVisibility() != 0) {
            pVar.Z0(this.f21378d);
        } else {
            pVar.H0(this.f21376b);
            pVar.Z0(this.f21376b);
        }
    }

    void C() {
        EditText editText = this.f21375a.f21319e;
        if (editText == null) {
            return;
        }
        this.f21376b.setPaddingRelative(l() ? 0 : editText.getPaddingStart(), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(sb.e.f51719s0), editText.getCompoundPaddingBottom());
    }

    CharSequence b() {
        return this.f21377c;
    }

    ColorStateList c() {
        return this.f21376b.getTextColors();
    }

    int d() {
        return getPaddingStart() + this.f21376b.getPaddingStart() + (l() ? this.f21378d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) this.f21378d.getLayoutParams()).getMarginEnd() : 0);
    }

    TextView e() {
        return this.f21376b;
    }

    CharSequence f() {
        return this.f21378d.getContentDescription();
    }

    Drawable g() {
        return this.f21378d.getDrawable();
    }

    int h() {
        return this.f21381g;
    }

    ImageView.ScaleType i() {
        return this.f21382h;
    }

    boolean l() {
        return this.f21378d.getVisibility() == 0;
    }

    void m(boolean z10) {
        this.f21384j = z10;
        D();
    }

    void n() {
        v.d(this.f21375a, this.f21378d, this.f21379e);
    }

    void o(CharSequence charSequence) {
        this.f21377c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.f21376b.setText(charSequence);
        D();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        C();
    }

    void p(int i10) {
        androidx.core.widget.i.m(this.f21376b, i10);
    }

    void q(ColorStateList colorStateList) {
        this.f21376b.setTextColor(colorStateList);
    }

    void r(boolean z10) {
        this.f21378d.setCheckable(z10);
    }

    void s(CharSequence charSequence) {
        if (f() != charSequence) {
            this.f21378d.setContentDescription(charSequence);
            v.k(this.f21378d, this.f21383i, charSequence);
        }
    }

    void t(Drawable drawable) {
        this.f21378d.setImageDrawable(drawable);
        if (drawable != null) {
            v.a(this.f21375a, this.f21378d, this.f21379e, this.f21380f);
            A(true);
            n();
        } else {
            A(false);
            v(null);
            w(null);
            s(null);
        }
    }

    void u(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i10 != this.f21381g) {
            this.f21381g = i10;
            v.g(this.f21378d, i10);
        }
    }

    void v(View.OnClickListener onClickListener) {
        v.h(this.f21378d, onClickListener, this.f21383i);
    }

    void w(View.OnLongClickListener onLongClickListener) {
        this.f21383i = onLongClickListener;
        v.i(this.f21378d, onLongClickListener);
    }

    void x(ImageView.ScaleType scaleType) {
        this.f21382h = scaleType;
        v.j(this.f21378d, scaleType);
    }

    void y(ColorStateList colorStateList) {
        if (this.f21379e != colorStateList) {
            this.f21379e = colorStateList;
            v.a(this.f21375a, this.f21378d, colorStateList, this.f21380f);
        }
    }

    void z(PorterDuff.Mode mode) {
        if (this.f21380f != mode) {
            this.f21380f = mode;
            v.a(this.f21375a, this.f21378d, this.f21379e, mode);
        }
    }
}
