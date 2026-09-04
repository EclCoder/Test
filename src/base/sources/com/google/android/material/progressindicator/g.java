package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Property;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
abstract class g extends Drawable implements Animatable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Property f20797q = new c(Float.class, "growFraction");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f20798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.google.android.material.progressindicator.b f20799b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ValueAnimator f20801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ValueAnimator f20802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f20803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20805h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f20807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private androidx.vectordrawable.graphics.drawable.b f20808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f20809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f20810m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f20812o;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20806i = -1.0f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Paint f20811n = new Paint();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    Rect f20813p = new Rect();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    ic.a f20800c = new ic.a();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            g.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            g.super.setVisible(false, false);
            g.this.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(g gVar) {
            return Float.valueOf(gVar.h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(g gVar, Float f10) {
            gVar.p(f10.floatValue());
        }
    }

    g(Context context, com.google.android.material.progressindicator.b bVar) {
        this.f20798a = context;
        this.f20799b = bVar;
        setAlpha(255);
    }

    private void d(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f20809l;
        this.f20809l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f20809l = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f20808k;
        if (bVar != null) {
            bVar.b(this);
        }
        List list = this.f20807j;
        if (list == null || this.f20809l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.vectordrawable.graphics.drawable.b) it.next()).b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        androidx.vectordrawable.graphics.drawable.b bVar = this.f20808k;
        if (bVar != null) {
            bVar.c(this);
        }
        List list = this.f20807j;
        if (list == null || this.f20809l) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((androidx.vectordrawable.graphics.drawable.b) it.next()).c(this);
        }
    }

    private void g(ValueAnimator... valueAnimatorArr) {
        boolean z10 = this.f20809l;
        this.f20809l = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f20809l = z10;
    }

    private boolean k() {
        return this instanceof f;
    }

    private void n() {
        if (this.f20801d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<g, Float>) f20797q, 0.0f, 1.0f);
            this.f20801d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f20801d.setInterpolator(tb.b.f53276b);
            r(this.f20801d);
        }
        if (this.f20802e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<g, Float>) f20797q, 1.0f, 0.0f);
            this.f20802e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f20802e.setInterpolator(tb.b.f53276b);
            q(this.f20802e);
        }
    }

    private void q(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f20802e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f20802e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    private void r(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f20801d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f20801d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f20812o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    float h() {
        if (this.f20799b.d() || this.f20799b.c()) {
            return (this.f20804g || this.f20803f) ? this.f20805h : this.f20810m;
        }
        return 1.0f;
    }

    float i() {
        float f10 = this.f20806i;
        if (f10 > 0.0f) {
            return f10;
        }
        if (this.f20799b.b(k()) && this.f20799b.f20742m != 0) {
            float fA = this.f20800c.a(this.f20798a.getContentResolver());
            if (fA > 0.0f) {
                int i10 = (int) ((((k() ? this.f20799b.f20739j : this.f20799b.f20740k) * 1000.0f) / this.f20799b.f20742m) * fA);
                float fUptimeMillis = (SystemClock.uptimeMillis() % ((long) i10)) / i10;
                return fUptimeMillis < 0.0f ? (fUptimeMillis % 1.0f) + 1.0f : fUptimeMillis;
            }
        }
        return 0.0f;
    }

    public boolean isRunning() {
        return m() || l();
    }

    public boolean j() {
        return s(false, false, false);
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.f20802e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f20804g;
    }

    public boolean m() {
        ValueAnimator valueAnimator = this.f20801d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f20803f;
    }

    public void o(androidx.vectordrawable.graphics.drawable.b bVar) {
        if (this.f20807j == null) {
            this.f20807j = new ArrayList();
        }
        if (this.f20807j.contains(bVar)) {
            return;
        }
        this.f20807j.add(bVar);
    }

    void p(float f10) {
        if (this.f20810m != f10) {
            this.f20810m = f10;
            invalidateSelf();
        }
    }

    public boolean s(boolean z10, boolean z11, boolean z12) {
        return t(z10, z11, z12 && this.f20800c.a(this.f20798a.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f20812o = i10;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f20811n.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        return s(z10, z11, true);
    }

    public void start() {
        t(true, true, false);
    }

    public void stop() {
        t(false, true, false);
    }

    boolean t(boolean z10, boolean z11, boolean z12) {
        n();
        if (!isVisible() && !z10) {
            return false;
        }
        ValueAnimator valueAnimator = z10 ? this.f20801d : this.f20802e;
        ValueAnimator valueAnimator2 = z10 ? this.f20802e : this.f20801d;
        if (!z12) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z10, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z13 = !z10 || super.setVisible(z10, false);
        if (!(z10 ? this.f20799b.d() : this.f20799b.c())) {
            g(valueAnimator);
            return z13;
        }
        if (z11 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z13;
        }
        valueAnimator.resume();
        return z13;
    }

    public boolean u(androidx.vectordrawable.graphics.drawable.b bVar) {
        List list = this.f20807j;
        if (list == null || !list.contains(bVar)) {
            return false;
        }
        this.f20807j.remove(bVar);
        if (!this.f20807j.isEmpty()) {
            return true;
        }
        this.f20807j = null;
        return true;
    }
}
