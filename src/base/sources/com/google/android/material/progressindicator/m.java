package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class m extends i {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int[] f20856k = {533, 567, 850, 750};

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f20857l = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Property f20858m = new c(Float.class, "animationFraction");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ObjectAnimator f20859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ObjectAnimator f20860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Interpolator[] f20861e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final com.google.android.material.progressindicator.b f20862f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20863g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20864h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f20865i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    androidx.vectordrawable.graphics.drawable.b f20866j;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            m mVar = m.this;
            mVar.f20863g = (mVar.f20863g + 1) % m.this.f20862f.f20734e.length;
            m.this.f20864h = true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            m.this.a();
            m mVar = m.this;
            androidx.vectordrawable.graphics.drawable.b bVar = mVar.f20866j;
            if (bVar != null) {
                bVar.b(mVar.f20833a);
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
        public Float get(m mVar) {
            return Float.valueOf(mVar.n());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(m mVar, Float f10) {
            mVar.r(f10.floatValue());
        }
    }

    public m(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.f20863g = 0;
        this.f20866j = null;
        this.f20862f = linearProgressIndicatorSpec;
        this.f20861e = new Interpolator[]{androidx.vectordrawable.graphics.drawable.d.a(context, sb.a.f51584a), androidx.vectordrawable.graphics.drawable.d.a(context, sb.a.f51585b), androidx.vectordrawable.graphics.drawable.d.a(context, sb.a.f51586c), androidx.vectordrawable.graphics.drawable.d.a(context, sb.a.f51587d)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n() {
        return this.f20865i;
    }

    private void o() {
        if (this.f20859c == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<m, Float>) f20858m, 0.0f, 1.0f);
            this.f20859c = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration((long) (this.f20862f.f20743n * 1800.0f));
            this.f20859c.setInterpolator(null);
            this.f20859c.setRepeatCount(-1);
            this.f20859c.addListener(new a());
        }
        if (this.f20860d == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<m, Float>) f20858m, 1.0f);
            this.f20860d = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration((long) (this.f20862f.f20743n * 1800.0f));
            this.f20860d.setInterpolator(null);
            this.f20860d.addListener(new b());
        }
    }

    private void p() {
        if (this.f20864h) {
            Iterator it = this.f20834b.iterator();
            while (it.hasNext()) {
                ((h.a) it.next()).f20823c = this.f20862f.f20734e[this.f20863g];
            }
            this.f20864h = false;
        }
    }

    private void s() {
        o();
        this.f20859c.setDuration((long) (this.f20862f.f20743n * 1800.0f));
        this.f20860d.setDuration((long) (this.f20862f.f20743n * 1800.0f));
    }

    private void t(int i10) {
        for (int i11 = 0; i11 < this.f20834b.size(); i11++) {
            h.a aVar = (h.a) this.f20834b.get(i11);
            int[] iArr = f20857l;
            int i12 = i11 * 2;
            int i13 = iArr[i12];
            int[] iArr2 = f20856k;
            aVar.f20821a = h0.a.a(this.f20861e[i12].getInterpolation(b(i10, i13, iArr2[i12])), 0.0f, 1.0f);
            int i14 = i12 + 1;
            aVar.f20822b = h0.a.a(this.f20861e[i14].getInterpolation(b(i10, iArr[i14], iArr2[i14])), 0.0f, 1.0f);
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void a() {
        ObjectAnimator objectAnimator = this.f20859c;
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
    public void d(androidx.vectordrawable.graphics.drawable.b bVar) {
        this.f20866j = bVar;
    }

    @Override // com.google.android.material.progressindicator.i
    public void f() {
        ObjectAnimator objectAnimator = this.f20860d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        a();
        if (this.f20833a.isVisible()) {
            this.f20860d.setFloatValues(this.f20865i, 1.0f);
            this.f20860d.setDuration((long) ((1.0f - this.f20865i) * 1800.0f));
            this.f20860d.start();
        }
    }

    @Override // com.google.android.material.progressindicator.i
    public void g() {
        o();
        q();
        this.f20859c.start();
    }

    @Override // com.google.android.material.progressindicator.i
    public void h() {
        this.f20866j = null;
    }

    void q() {
        this.f20863g = 0;
        Iterator it = this.f20834b.iterator();
        while (it.hasNext()) {
            ((h.a) it.next()).f20823c = this.f20862f.f20734e[0];
        }
    }

    void r(float f10) {
        this.f20865i = f10;
        t((int) (f10 * 1800.0f));
        p();
        this.f20833a.invalidateSelf();
    }
}
