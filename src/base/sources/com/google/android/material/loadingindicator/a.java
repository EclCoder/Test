package com.google.android.material.loadingindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import f1.f;
import f1.h;
import f1.i;
import tb.d;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Property f20494i = new b(Float.class, "animationFraction");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final f f20495j = new c("morphFactor");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f20496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f20497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f20498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f20499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private h f20500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    LoadingIndicatorSpec f20501f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    com.google.android.material.loadingindicator.b f20502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    com.google.android.material.loadingindicator.c.a f20503h = new com.google.android.material.loadingindicator.c.a();

    /* JADX INFO: renamed from: com.google.android.material.loadingindicator.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class C0312a extends AnimatorListenerAdapter {
        C0312a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            a.this.f20500e.s(a.a(a.this));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(a aVar) {
            return Float.valueOf(aVar.f());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(a aVar, Float f10) {
            aVar.l(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class c extends f {
        c(String str) {
            super(str);
        }

        @Override // f1.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(a aVar) {
            return aVar.g();
        }

        @Override // f1.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(a aVar, float f10) {
            aVar.m(f10);
        }
    }

    public a(LoadingIndicatorSpec loadingIndicatorSpec) {
        this.f20501f = loadingIndicatorSpec;
    }

    static /* synthetic */ int a(a aVar) {
        int i10 = aVar.f20496a + 1;
        aVar.f20496a = i10;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float f() {
        return this.f20497b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float g() {
        return this.f20498c;
    }

    private void i() {
        if (this.f20500e == null) {
            this.f20500e = (h) new h(this, f20495j).x(new i().h(200.0f).f(0.6f)).l(0.01f);
        }
        if (this.f20499d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<a, Float>) f20494i, 0.0f, 1.0f);
            this.f20499d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(650L);
            this.f20499d.setInterpolator(null);
            this.f20499d.setRepeatCount(-1);
            this.f20499d.addListener(new C0312a());
        }
    }

    private void o(int i10) {
        float f10 = this.f20496a - 1;
        float f11 = this.f20498c - f10;
        float f12 = i10 / 650.0f;
        if (f12 == 1.0f) {
            f12 = 0.0f;
        }
        this.f20503h.f20520c = (((f10 * 140.0f) + (f12 * 50.0f)) + (f11 * 90.0f)) % 360.0f;
    }

    private void p() {
        com.google.android.material.loadingindicator.c.a aVar = this.f20503h;
        aVar.f20519b = this.f20498c;
        int i10 = this.f20496a - 1;
        int[] iArr = this.f20501f.f20492e;
        int length = i10 % iArr.length;
        aVar.f20518a = d.b().evaluate(h0.a.a(this.f20498c - (this.f20496a - 1), 0.0f, 1.0f), Integer.valueOf(iArr[length]), Integer.valueOf(iArr[(length + 1) % iArr.length])).intValue();
    }

    void e() {
        ObjectAnimator objectAnimator = this.f20499d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        h hVar = this.f20500e;
        if (hVar != null) {
            hVar.y();
        }
    }

    void h() {
        k();
    }

    protected void j(com.google.android.material.loadingindicator.b bVar) {
        this.f20502g = bVar;
    }

    void k() {
        this.f20496a = 1;
        m(0.0f);
        this.f20503h.f20518a = this.f20501f.f20492e[0];
    }

    void l(float f10) {
        this.f20497b = f10;
        o((int) (f10 * 650.0f));
        com.google.android.material.loadingindicator.b bVar = this.f20502g;
        if (bVar != null) {
            bVar.invalidateSelf();
        }
    }

    void m(float f10) {
        this.f20498c = f10;
        p();
        com.google.android.material.loadingindicator.b bVar = this.f20502g;
        if (bVar != null) {
            bVar.invalidateSelf();
        }
    }

    void n() {
        i();
        k();
        this.f20500e.s(this.f20496a);
        this.f20499d.start();
    }
}
