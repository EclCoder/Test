package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class c extends h0 {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends AnimatorListenerAdapter implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f7359a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7360b = false;

        a(View view) {
            this.f7359a = view;
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
            this.f7359a.setTag(h.f7390d, null);
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
            this.f7359a.setTag(h.f7390d, Float.valueOf(this.f7359a.getVisibility() == 0 ? b0.b(this.f7359a) : 0.0f));
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            b0.e(this.f7359a, 1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f7359a.hasOverlappingRendering() && this.f7359a.getLayerType() == 0) {
                this.f7360b = true;
                this.f7359a.setLayerType(2, null);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (this.f7360b) {
                this.f7359a.setLayerType(0, null);
            }
            if (z10) {
                return;
            }
            b0.e(this.f7359a, 1.0f);
            b0.a(this.f7359a);
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
        }

        @Override // androidx.transition.m.g
        public void g(m mVar, boolean z10) {
        }
    }

    public c(int i10) {
        q0(i10);
    }

    private Animator r0(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        b0.e(view, f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) b0.f7357b, f11);
        a aVar = new a(view);
        objectAnimatorOfFloat.addListener(aVar);
        C().b(aVar);
        return objectAnimatorOfFloat;
    }

    private static float s0(x xVar, float f10) {
        Float f11;
        return (xVar == null || (f11 = (Float) xVar.f7464a.get("android:fade:transitionAlpha")) == null) ? f10 : f11.floatValue();
    }

    @Override // androidx.transition.h0, androidx.transition.m
    public void j(x xVar) {
        super.j(xVar);
        Float fValueOf = (Float) xVar.f7465b.getTag(h.f7390d);
        if (fValueOf == null) {
            fValueOf = xVar.f7465b.getVisibility() == 0 ? Float.valueOf(b0.b(xVar.f7465b)) : Float.valueOf(0.0f);
        }
        xVar.f7464a.put("android:fade:transitionAlpha", fValueOf);
    }

    @Override // androidx.transition.h0
    public Animator m0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        b0.c(view);
        return r0(view, s0(xVar, 0.0f), 1.0f);
    }

    @Override // androidx.transition.h0
    public Animator o0(ViewGroup viewGroup, View view, x xVar, x xVar2) {
        b0.c(view);
        Animator animatorR0 = r0(view, s0(xVar, 1.0f), 0.0f);
        if (animatorR0 == null) {
            b0.e(view, s0(xVar2, 1.0f));
        }
        return animatorR0;
    }

    public c() {
    }
}
