package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
abstract class z {
    static Animator a(View view, x xVar, int i10, int i11, float f10, float f11, float f12, float f13, TimeInterpolator timeInterpolator, m mVar) {
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) xVar.f7465b.getTag(h.f7391e);
        if (iArr != null) {
            f10 = (iArr[0] - i10) + translationX;
            f11 = (iArr[1] - i11) + translationY;
        }
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f12 && f11 == f13) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f13));
        a aVar = new a(view, xVar.f7465b, translationX, translationY);
        mVar.b(aVar);
        objectAnimatorOfPropertyValuesHolder.addListener(aVar);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    private static class a extends AnimatorListenerAdapter implements m.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f7471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f7472b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f7473c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f7474d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f7475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f7476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f7477g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f7478h;

        a(View view, View view2, float f10, float f11) {
            this.f7472b = view;
            this.f7471a = view2;
            this.f7476f = f10;
            this.f7477g = f11;
            int i10 = h.f7391e;
            int[] iArr = (int[]) view2.getTag(i10);
            this.f7473c = iArr;
            if (iArr != null) {
                view2.setTag(i10, null);
            }
        }

        private void h() {
            if (this.f7473c == null) {
                this.f7473c = new int[2];
            }
            this.f7472b.getLocationOnScreen(this.f7473c);
            this.f7471a.setTag(h.f7391e, this.f7473c);
        }

        @Override // androidx.transition.m.g
        public void a(m mVar) {
            this.f7472b.setTranslationX(this.f7474d);
            this.f7472b.setTranslationY(this.f7475e);
        }

        @Override // androidx.transition.m.g
        public void c(m mVar) {
            h();
            this.f7474d = this.f7472b.getTranslationX();
            this.f7475e = this.f7472b.getTranslationY();
            this.f7472b.setTranslationX(this.f7476f);
            this.f7472b.setTranslationY(this.f7477g);
        }

        @Override // androidx.transition.m.g
        public void d(m mVar, boolean z10) {
            if (this.f7478h) {
                return;
            }
            this.f7471a.setTag(h.f7391e, null);
        }

        @Override // androidx.transition.m.g
        public void e(m mVar) {
            d(mVar, false);
        }

        @Override // androidx.transition.m.g
        public void f(m mVar) {
            this.f7478h = true;
            this.f7472b.setTranslationX(this.f7476f);
            this.f7472b.setTranslationY(this.f7477g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f7478h = true;
            this.f7472b.setTranslationX(this.f7476f);
            this.f7472b.setTranslationY(this.f7477g);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator, boolean z10) {
            if (z10) {
                return;
            }
            this.f7472b.setTranslationX(this.f7476f);
            this.f7472b.setTranslationY(this.f7477g);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            onAnimationEnd(animator, false);
        }

        @Override // androidx.transition.m.g
        public void b(m mVar) {
        }
    }
}
