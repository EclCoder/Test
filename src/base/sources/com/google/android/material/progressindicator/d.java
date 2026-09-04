package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class d extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f20758k = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f20759l = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f20760m = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Property f20761n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property f20762o = new C0315d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f20763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f20764d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m1.b f20765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f20766f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20767g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20768h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20769i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f20770j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f20767g = (dVar.f20767g + 4) % d.this.f20766f.f20734e.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            androidx.vectordrawable.graphics.drawable.b bVar = dVar.f20770j;
            if (bVar != null) {
                bVar.b(dVar.f20833a);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends Property {
        c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.o());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.t(f10.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0315d extends Property {
        C0315d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f10) {
            dVar.u(f10.floatValue());
        }
    }

    public d(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f20767g = 0;
        this.f20770j = null;
        this.f20766f = circularProgressIndicatorSpec;
        this.f20765e = new m1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float o() {
        return this.f20768h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f20769i;
    }

    private void q() {
        if (this.f20763c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<d, Float>) f20761n, 0.0f, 1.0f);
            this.f20763c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20766f.f20743n * 5400.0f));
            this.f20763c.setInterpolator(null);
            this.f20763c.setRepeatCount(-1);
            this.f20763c.addListener(new a());
        }
        if (this.f20764d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<d, Float>) f20762o, 0.0f, 1.0f);
            this.f20764d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f20766f.f20743n * 333.0f));
            this.f20764d.setInterpolator(this.f20765e);
            this.f20764d.addListener(new b());
        }
    }

    private void r(int i10) {
        for (int i11 = 0; i11 < 4; i11++) {
            float fB = b(i10, f20760m[i11], 333);
            if (fB > 0.0f && fB < 1.0f) {
                int i12 = i11 + this.f20767g;
                int[] iArr = this.f20766f.f20734e;
                int length = i12 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i13 = iArr[length];
                int i14 = iArr[length2];
                ((h.a) this.f20834b.get(0)).f20823c = tb.d.b().evaluate(this.f20765e.getInterpolation(fB), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(float f10) {
        this.f20769i = f10;
    }

    private void v() {
        q();
        this.f20763c.setDuration((long) (this.f20766f.f20743n * 5400.0f));
        this.f20764d.setDuration((long) (this.f20766f.f20743n * 333.0f));
    }

    private void w(int i10) {
        h.a aVar = (h.a) this.f20834b.get(0);
        float f10 = this.f20768h;
        aVar.f20821a = (f10 * 1520.0f) - 20.0f;
        aVar.f20822b = f10 * 1520.0f;
        for (int i11 = 0; i11 < 4; i11++) {
            aVar.f20822b += this.f20765e.getInterpolation(b(i10, f20758k[i11], 667)) * 250.0f;
            aVar.f20821a += this.f20765e.getInterpolation(b(i10, f20759l[i11], 667)) * 250.0f;
        }
        float f11 = aVar.f20821a;
        float f12 = aVar.f20822b;
        aVar.f20821a = (f11 + ((f12 - f11) * this.f20769i)) / 360.0f;
        aVar.f20822b = f12 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f20763c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        v();
        s();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f20770j = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        ObjectAnimator objectAnimator = this.f20764d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f20833a.isVisible()) {
            this.f20764d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        q();
        s();
        this.f20763c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f20770j = null;
    }

    void s() {
        this.f20767g = 0;
        ((h.a) this.f20834b.get(0)).f20823c = this.f20766f.f20734e[0];
        this.f20769i = 0.0f;
    }

    void t(float f10) {
        this.f20768h = f10;
        int i10 = (int) (f10 * 5400.0f);
        w(i10);
        r(i10);
        this.f20833a.invalidateSelf();
    }
}
