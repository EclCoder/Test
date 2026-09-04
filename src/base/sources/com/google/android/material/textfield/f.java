package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class f extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f21390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f21391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeInterpolator f21392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final TimeInterpolator f21393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private EditText f21394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f21395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final View.OnFocusChangeListener f21396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private AnimatorSet f21397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ValueAnimator f21398m;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            f.this.f21457b.c0(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f21457b.c0(false);
        }
    }

    f(t tVar) {
        super(tVar);
        this.f21395j = new View.OnClickListener() { // from class: com.google.android.material.textfield.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f.v(this.f21372a, view);
            }
        };
        this.f21396k = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.b
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                f fVar = this.f21374a;
                fVar.A(fVar.E());
            }
        };
        Context context = tVar.getContext();
        int i10 = sb.c.Q;
        this.f21390e = gc.j.f(context, i10, 100);
        this.f21391f = gc.j.f(tVar.getContext(), i10, 150);
        this.f21392g = gc.j.g(tVar.getContext(), sb.c.V, tb.b.f53275a);
        this.f21393h = gc.j.g(tVar.getContext(), sb.c.U, tb.b.f53278d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z10) {
        boolean z11 = this.f21457b.H() == z10;
        if (z10 && !this.f21397l.isRunning()) {
            this.f21398m.cancel();
            this.f21397l.start();
            if (z11) {
                this.f21397l.end();
                return;
            }
            return;
        }
        if (z10) {
            return;
        }
        this.f21397l.cancel();
        this.f21398m.start();
        if (z11) {
            this.f21398m.end();
        }
    }

    private ValueAnimator B(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.f21392g);
        valueAnimatorOfFloat.setDuration(this.f21390e);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.x(this.f21385a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private ValueAnimator C() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.f21393h);
        valueAnimatorOfFloat.setDuration(this.f21391f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.e
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.y(this.f21388a, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void D() {
        ValueAnimator valueAnimatorC = C();
        ValueAnimator valueAnimatorB = B(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f21397l = animatorSet;
        animatorSet.playTogether(valueAnimatorC, valueAnimatorB);
        this.f21397l.addListener(new a());
        ValueAnimator valueAnimatorB2 = B(1.0f, 0.0f);
        this.f21398m = valueAnimatorB2;
        valueAnimatorB2.addListener(new b());
    }

    private boolean E() {
        EditText editText = this.f21394i;
        if (editText == null) {
            return false;
        }
        return (editText.hasFocus() || this.f21459d.hasFocus()) && ((this.f21394i.getText().length() > 0) || (this.f21457b.y() != null));
    }

    public static /* synthetic */ void v(f fVar, View view) {
        EditText editText = fVar.f21394i;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (view.hasFocus()) {
            fVar.f21394i.requestFocus();
        }
        if (text != null) {
            text.clear();
        }
        fVar.r();
    }

    public static /* synthetic */ void x(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        fVar.f21459d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static /* synthetic */ void y(f fVar, ValueAnimator valueAnimator) {
        fVar.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        fVar.f21459d.setScaleX(fFloatValue);
        fVar.f21459d.setScaleY(fFloatValue);
    }

    @Override // com.google.android.material.textfield.u
    void a(Editable editable) {
        if (this.f21457b.y() != null) {
            return;
        }
        A(E());
    }

    @Override // com.google.android.material.textfield.u
    int c() {
        return sb.k.f51842n;
    }

    @Override // com.google.android.material.textfield.u
    int d() {
        return sb.f.f51744k;
    }

    @Override // com.google.android.material.textfield.u
    View.OnFocusChangeListener e() {
        return this.f21396k;
    }

    @Override // com.google.android.material.textfield.u
    View.OnClickListener f() {
        return this.f21395j;
    }

    @Override // com.google.android.material.textfield.u
    View.OnFocusChangeListener g() {
        return this.f21396k;
    }

    @Override // com.google.android.material.textfield.u
    public void n(EditText editText) {
        this.f21394i = editText;
        this.f21456a.setEndIconVisible(E());
    }

    @Override // com.google.android.material.textfield.u
    void q(boolean z10) {
        if (this.f21457b.y() == null) {
            return;
        }
        A(z10);
    }

    @Override // com.google.android.material.textfield.u
    void s() {
        D();
    }

    @Override // com.google.android.material.textfield.u
    void u() {
        EditText editText = this.f21394i;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21387a.A(true);
                }
            });
        }
    }
}
