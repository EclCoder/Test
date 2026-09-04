package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f46569a;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b1 f46570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f46571b;

        a(b1 b1Var, View view) {
            this.f46570a = b1Var;
            this.f46571b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f46570a.a(this.f46571b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f46570a.b(this.f46571b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f46570a.c(this.f46571b);
        }
    }

    a1(View view) {
        this.f46569a = new WeakReference(view);
    }

    private void h(View view, b1 b1Var) {
        if (b1Var != null) {
            view.animate().setListener(new a(b1Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public a1 b(float f10) {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f46569a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public a1 e(long j10) {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public a1 f(Interpolator interpolator) {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public a1 g(b1 b1Var) {
        View view = (View) this.f46569a.get();
        if (view != null) {
            h(view, b1Var);
        }
        return this;
    }

    public a1 i(long j10) {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().setStartDelay(j10);
        }
        return this;
    }

    public a1 j(final d1 d1Var) {
        final View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().setUpdateListener(d1Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: n0.z0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    d1Var.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public a1 l(float f10) {
        View view = (View) this.f46569a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
