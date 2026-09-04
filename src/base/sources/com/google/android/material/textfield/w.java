package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class w {
    private ColorStateList A;
    private Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f21462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TimeInterpolator f21463d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f21464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final TimeInterpolator f21465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Context f21466g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TextInputLayout f21467h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private LinearLayout f21468i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f21469j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private FrameLayout f21470k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Animator f21471l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f21472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f21473n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f21474o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f21475p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f21476q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f21477r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private CharSequence f21478s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f21479t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f21480u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f21481v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private CharSequence f21482w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f21483x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private TextView f21484y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f21485z;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f21486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f21487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f21488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f21489d;

        a(int i10, TextView textView, int i11, TextView textView2) {
            this.f21486a = i10;
            this.f21487b = textView;
            this.f21488c = i11;
            this.f21489d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            w.this.f21473n = this.f21486a;
            w.this.f21471l = null;
            TextView textView = this.f21487b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f21488c == 1 && w.this.f21477r != null) {
                    w.this.f21477r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f21489d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f21489d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f21489d;
            if (textView != null) {
                textView.setVisibility(0);
                this.f21489d.setAlpha(0.0f);
            }
        }
    }

    public w(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f21466g = context;
        this.f21467h = textInputLayout;
        this.f21472m = context.getResources().getDimensionPixelSize(sb.e.f51715r);
        int i10 = sb.c.R;
        this.f21460a = gc.j.f(context, i10, Sdk$SDKError.b.AD_RESPONSE_TIMED_OUT_VALUE);
        this.f21461b = gc.j.f(context, sb.c.N, 167);
        this.f21462c = gc.j.f(context, i10, 167);
        int i11 = sb.c.T;
        this.f21463d = gc.j.g(context, i11, tb.b.f53278d);
        TimeInterpolator timeInterpolator = tb.b.f53275a;
        this.f21464e = gc.j.g(context, i11, timeInterpolator);
        this.f21465f = gc.j.g(context, sb.c.V, timeInterpolator);
    }

    private void D(int i10, int i11) {
        TextView textViewL;
        TextView textViewL2;
        if (i10 == i11) {
            return;
        }
        if (i11 != 0 && (textViewL2 = l(i11)) != null) {
            textViewL2.setVisibility(0);
            textViewL2.setAlpha(1.0f);
        }
        if (i10 != 0 && (textViewL = l(i10)) != null) {
            textViewL.setVisibility(4);
            if (i10 == 1) {
                textViewL.setText((CharSequence) null);
            }
        }
        this.f21473n = i11;
    }

    private void M(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void O(ViewGroup viewGroup, int i10) {
        if (i10 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean P(TextView textView, CharSequence charSequence) {
        if (this.f21467h.isLaidOut() && this.f21467h.isEnabled()) {
            return (this.f21474o == this.f21473n && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void S(int i10, int i11, boolean z10) {
        w wVar;
        if (i10 == i11) {
            return;
        }
        if (z10) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f21471l = animatorSet;
            ArrayList arrayList = new ArrayList();
            wVar = this;
            wVar.h(arrayList, this.f21483x, this.f21484y, 2, i10, i11);
            wVar.h(arrayList, wVar.f21476q, wVar.f21477r, 1, i10, i11);
            tb.c.a(animatorSet, arrayList);
            animatorSet.addListener(wVar.new a(i11, l(i10), i10, l(i11)));
            animatorSet.start();
        } else {
            wVar = this;
            D(i10, i11);
        }
        wVar.f21467h.q0();
        wVar.f21467h.w0(z10);
        wVar.f21467h.C0();
    }

    private boolean f() {
        return (this.f21468i == null || this.f21467h.getEditText() == null) ? false : true;
    }

    private void h(List list, boolean z10, TextView textView, int i10, int i11, int i12) {
        if (textView == null || !z10) {
            return;
        }
        if (i10 == i12 || i10 == i11) {
            ObjectAnimator objectAnimatorI = i(textView, i12 == i10);
            if (i10 == i12 && i11 != 0) {
                objectAnimatorI.setStartDelay(this.f21462c);
            }
            list.add(objectAnimatorI);
            if (i12 != i10 || i11 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorJ = j(textView);
            objectAnimatorJ.setStartDelay(this.f21462c);
            list.add(objectAnimatorJ);
        }
    }

    private ObjectAnimator i(TextView textView, boolean z10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z10 ? this.f21461b : this.f21462c);
        objectAnimatorOfFloat.setInterpolator(z10 ? this.f21464e : this.f21465f);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f21472m, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f21460a);
        objectAnimatorOfFloat.setInterpolator(this.f21463d);
        return objectAnimatorOfFloat;
    }

    private TextView l(int i10) {
        if (i10 == 1) {
            return this.f21477r;
        }
        if (i10 != 2) {
            return null;
        }
        return this.f21484y;
    }

    private int t(boolean z10, int i10, int i11) {
        return z10 ? this.f21466g.getResources().getDimensionPixelSize(i10) : i11;
    }

    private boolean x(int i10) {
        return (i10 != 1 || this.f21477r == null || TextUtils.isEmpty(this.f21475p)) ? false : true;
    }

    private boolean y(int i10) {
        return (i10 != 2 || this.f21484y == null || TextUtils.isEmpty(this.f21482w)) ? false : true;
    }

    boolean A() {
        return this.f21476q;
    }

    boolean B() {
        return this.f21483x;
    }

    void C(TextView textView, int i10) {
        FrameLayout frameLayout;
        if (this.f21468i == null) {
            return;
        }
        if (!z(i10) || (frameLayout = this.f21470k) == null) {
            this.f21468i.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i11 = this.f21469j - 1;
        this.f21469j = i11;
        O(this.f21468i, i11);
    }

    void E(int i10) {
        this.f21479t = i10;
        TextView textView = this.f21477r;
        if (textView != null) {
            textView.setAccessibilityLiveRegion(i10);
        }
    }

    void F(CharSequence charSequence) {
        this.f21478s = charSequence;
        TextView textView = this.f21477r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void G(boolean z10) {
        if (this.f21476q == z10) {
            return;
        }
        g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f21466g);
            this.f21477r = appCompatTextView;
            appCompatTextView.setId(sb.g.f51786t0);
            this.f21477r.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f21477r.setTypeface(typeface);
            }
            H(this.f21480u);
            I(this.f21481v);
            F(this.f21478s);
            E(this.f21479t);
            this.f21477r.setVisibility(4);
            d(this.f21477r, 0);
        } else {
            v();
            C(this.f21477r, 0);
            this.f21477r = null;
            this.f21467h.q0();
            this.f21467h.C0();
        }
        this.f21476q = z10;
    }

    void H(int i10) {
        this.f21480u = i10;
        TextView textView = this.f21477r;
        if (textView != null) {
            this.f21467h.c0(textView, i10);
        }
    }

    void I(ColorStateList colorStateList) {
        this.f21481v = colorStateList;
        TextView textView = this.f21477r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void J(int i10) {
        this.f21485z = i10;
        TextView textView = this.f21484y;
        if (textView != null) {
            androidx.core.widget.i.m(textView, i10);
        }
    }

    void K(boolean z10) {
        if (this.f21483x == z10) {
            return;
        }
        g();
        if (z10) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f21466g);
            this.f21484y = appCompatTextView;
            appCompatTextView.setId(sb.g.f51788u0);
            this.f21484y.setTextAlignment(5);
            Typeface typeface = this.B;
            if (typeface != null) {
                this.f21484y.setTypeface(typeface);
            }
            this.f21484y.setVisibility(4);
            this.f21484y.setImportantForAccessibility(2);
            J(this.f21485z);
            L(this.A);
            d(this.f21484y, 1);
        } else {
            w();
            C(this.f21484y, 1);
            this.f21484y = null;
            this.f21467h.q0();
            this.f21467h.C0();
        }
        this.f21483x = z10;
    }

    void L(ColorStateList colorStateList) {
        this.A = colorStateList;
        TextView textView = this.f21484y;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void N(Typeface typeface) {
        if (typeface != this.B) {
            this.B = typeface;
            M(this.f21477r, typeface);
            M(this.f21484y, typeface);
        }
    }

    void Q(CharSequence charSequence) {
        g();
        this.f21475p = charSequence;
        this.f21477r.setText(charSequence);
        int i10 = this.f21473n;
        if (i10 != 1) {
            this.f21474o = 1;
        }
        S(i10, this.f21474o, P(this.f21477r, charSequence));
    }

    void R(CharSequence charSequence) {
        g();
        this.f21482w = charSequence;
        this.f21484y.setText(charSequence);
        int i10 = this.f21473n;
        if (i10 != 2) {
            this.f21474o = 2;
        }
        S(i10, this.f21474o, P(this.f21484y, charSequence));
    }

    void d(TextView textView, int i10) {
        if (this.f21468i == null && this.f21470k == null) {
            LinearLayout linearLayout = new LinearLayout(this.f21466g);
            this.f21468i = linearLayout;
            linearLayout.setOrientation(0);
            this.f21467h.addView(this.f21468i, -1, -2);
            this.f21470k = new FrameLayout(this.f21466g);
            this.f21468i.addView(this.f21470k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f21467h.getEditText() != null) {
                e();
            }
        }
        if (z(i10)) {
            this.f21470k.setVisibility(0);
            this.f21470k.addView(textView);
        } else {
            this.f21468i.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f21468i.setVisibility(0);
        this.f21469j++;
    }

    void e() {
        if (f()) {
            EditText editText = this.f21467h.getEditText();
            boolean zK = jc.c.k(this.f21466g);
            LinearLayout linearLayout = this.f21468i;
            int i10 = sb.e.f51713q0;
            linearLayout.setPaddingRelative(t(zK, i10, editText.getPaddingStart()), t(zK, sb.e.f51716r0, this.f21466g.getResources().getDimensionPixelSize(sb.e.f51710p0)), t(zK, i10, editText.getPaddingEnd()), 0);
        }
    }

    void g() {
        Animator animator = this.f21471l;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return x(this.f21474o);
    }

    int m() {
        return this.f21479t;
    }

    CharSequence n() {
        return this.f21478s;
    }

    CharSequence o() {
        return this.f21475p;
    }

    int p() {
        TextView textView = this.f21477r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    ColorStateList q() {
        TextView textView = this.f21477r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.f21482w;
    }

    int s() {
        TextView textView = this.f21484y;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean u() {
        return y(this.f21474o);
    }

    void v() {
        this.f21475p = null;
        g();
        if (this.f21473n == 1) {
            if (!this.f21483x || TextUtils.isEmpty(this.f21482w)) {
                this.f21474o = 0;
            } else {
                this.f21474o = 2;
            }
        }
        S(this.f21473n, this.f21474o, P(this.f21477r, ""));
    }

    void w() {
        g();
        int i10 = this.f21473n;
        if (i10 == 2) {
            this.f21474o = 0;
        }
        S(i10, this.f21474o, P(this.f21484y, ""));
    }

    boolean z(int i10) {
        return i10 == 0 || i10 == 1;
    }
}
