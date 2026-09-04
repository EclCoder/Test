package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class l extends i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Property f20848i = new b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f20849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m1.b f20850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f20851e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20852f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f20853g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20854h;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            l lVar = l.this;
            lVar.f20852f = (lVar.f20852f + 1) % l.this.f20851e.f20734e.length;
            l.this.f20853g = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(l lVar) {
            return Float.valueOf(lVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(l lVar, Float f10) {
            lVar.r(f10.floatValue());
        }
    }

    public l(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f20852f = 1;
        this.f20851e = linearProgressIndicatorSpec;
        this.f20850d = new m1.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f20854h;
    }

    private void o() {
        if (this.f20849c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<l, Float>) f20848i, 0.0f, 1.0f);
            this.f20849c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20851e.f20743n * 333.0f));
            this.f20849c.setInterpolator(null);
            this.f20849c.setRepeatCount(-1);
            this.f20849c.addListener(new a());
        }
    }

    private void p() {
        if (!this.f20853g || ((h.a) this.f20834b.get(1)).f20822b >= 1.0f) {
            return;
        }
        ((h.a) this.f20834b.get(2)).f20823c = ((h.a) this.f20834b.get(1)).f20823c;
        ((h.a) this.f20834b.get(1)).f20823c = ((h.a) this.f20834b.get(0)).f20823c;
        ((h.a) this.f20834b.get(0)).f20823c = this.f20851e.f20734e[this.f20852f];
        this.f20853g = false;
    }

    private void s() {
        o();
        this.f20849c.setDuration((long) (this.f20851e.f20743n * 333.0f));
    }

    private void t(int i10) {
        ((h.a) this.f20834b.get(0)).f20821a = 0.0f;
        float fB = b(i10, 0, 667);
        h.a aVar = (h.a) this.f20834b.get(0);
        h.a aVar2 = (h.a) this.f20834b.get(1);
        float interpolation = this.f20850d.getInterpolation(fB);
        aVar2.f20821a = interpolation;
        aVar.f20822b = interpolation;
        h.a aVar3 = (h.a) this.f20834b.get(1);
        h.a aVar4 = (h.a) this.f20834b.get(2);
        float interpolation2 = this.f20850d.getInterpolation(fB + 0.49925038f);
        aVar4.f20821a = interpolation2;
        aVar3.f20822b = interpolation2;
        ((h.a) this.f20834b.get(2)).f20822b = 1.0f;
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f20849c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        s();
        q();
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f20849c.start();
    }

    void q() {
        this.f20853g = true;
        this.f20852f = 1;
        for (h.a aVar : this.f20834b) {
            com.google.android.material.progressindicator.b bVar = this.f20851e;
            aVar.f20823c = bVar.f20734e[0];
            aVar.f20824d = bVar.f20738i / 2;
        }
    }

    void r(float f10) {
        this.f20854h = f10;
        t((int) (f10 * 333.0f));
        p();
        this.f20833a.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
    }
}
