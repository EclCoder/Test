package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class e extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final TimeInterpolator f20773k = tb.b.f53276b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f20774l = {0, 1500, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, 4500};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final float[] f20775m = {0.1f, 0.87f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Property f20776n = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Property f20777o = new d(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f20778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f20779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final TimeInterpolator f20780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f20781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f20783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20784i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f20785j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            e eVar = e.this;
            eVar.f20782g = (eVar.f20782g + e.f20774l.length) % e.this.f20781f.f20734e.length;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            e.this.a();
            e eVar = e.this;
            androidx.vectordrawable.graphics.drawable.b bVar = eVar.f20785j;
            if (bVar != null) {
                bVar.b(eVar.f20833a);
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
        public Float get(e eVar) {
            return Float.valueOf(eVar.p());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f10) {
            eVar.u(f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class d extends Property {
        d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(e eVar) {
            return Float.valueOf(eVar.q());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(e eVar, Float f10) {
            eVar.v(f10.floatValue());
        }
    }

    public e(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f20782g = 0;
        this.f20785j = null;
        this.f20781f = circularProgressIndicatorSpec;
        this.f20780e = gc.j.g(context, sb.c.Z, f20773k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f20783h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float q() {
        return this.f20784i;
    }

    private void r() {
        if (this.f20778c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<e, Float>) f20776n, 0.0f, 1.0f);
            this.f20778c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20781f.f20743n * 6000.0f));
            this.f20778c.setInterpolator(null);
            this.f20778c.setRepeatCount(-1);
            this.f20778c.addListener(new a());
        }
        if (this.f20779d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<e, Float>) f20777o, 0.0f, 1.0f);
            this.f20779d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f20781f.f20743n * 500.0f));
            this.f20779d.addListener(new b());
        }
    }

    private void s(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f20774l;
            if (i11 >= iArr.length) {
                return;
            }
            float fB = b(i10, iArr[i11], 100);
            if (fB >= 0.0f && fB <= 1.0f) {
                int i12 = i11 + this.f20782g;
                int[] iArr2 = this.f20781f.f20734e;
                int length = i12 % iArr2.length;
                int length2 = (length + 1) % iArr2.length;
                int i13 = iArr2[length];
                int i14 = iArr2[length2];
                ((h.a) this.f20834b.get(0)).f20823c = tb.d.b().evaluate(this.f20780e.getInterpolation(fB), Integer.valueOf(i13), Integer.valueOf(i14)).intValue();
                return;
            }
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v(float f10) {
        this.f20784i = f10;
    }

    private void w() {
        r();
        this.f20778c.setDuration((long) (this.f20781f.f20743n * 6000.0f));
        this.f20779d.setDuration((long) (this.f20781f.f20743n * 500.0f));
    }

    private void x(int i10) {
        h.a aVar = (h.a) this.f20834b.get(0);
        float f10 = this.f20783h * 1080.0f;
        float interpolation = 0.0f;
        for (int i11 : f20774l) {
            interpolation += this.f20780e.getInterpolation(b(i10, i11, 500)) * 90.0f;
        }
        aVar.f20827g = f10 + interpolation;
        float interpolation2 = this.f20780e.getInterpolation(b(i10, 0, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS)) - this.f20780e.getInterpolation(b(i10, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS));
        aVar.f20821a = 0.0f;
        float[] fArr = f20775m;
        float fD = fc.a.d(fArr[0], fArr[1], interpolation2);
        aVar.f20822b = fD;
        float f11 = this.f20784i;
        if (f11 > 0.0f) {
            aVar.f20822b = fD * (1.0f - f11);
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void a() {
        ObjectAnimator objectAnimator = this.f20778c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void c() {
        w();
        t();
    }

    @Override // com.google.android.material.progressindicator.i
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f20785j = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    void f() {
        ObjectAnimator objectAnimator = this.f20779d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f20833a.isVisible()) {
            this.f20779d.start();
        } else {
            a();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    void g() {
        r();
        t();
        this.f20778c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f20785j = null;
    }

    void t() {
        this.f20782g = 0;
        ((h.a) this.f20834b.get(0)).f20823c = this.f20781f.f20734e[0];
        this.f20784i = 0.0f;
    }

    void u(float f10) {
        this.f20783h = f10;
        int i10 = (int) (f10 * 6000.0f);
        x(i10);
        s(i10);
        this.f20833a.invalidateSelf();
    }
}
