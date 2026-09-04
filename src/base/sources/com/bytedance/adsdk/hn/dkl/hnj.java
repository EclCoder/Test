package com.bytedance.adsdk.hn.dkl;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class hnj extends ValueAnimator {
    private final Set<ValueAnimator.AnimatorUpdateListener> hnj = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f11930hn = new CopyOnWriteArraySet();
    private final Set<Animator.AnimatorPauseListener> qor = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f11930hn.add(animatorListener);
    }

    @Override // android.animation.Animator
    public void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.qor.add(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.hnj.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    void gjv() {
        Iterator<Animator.AnimatorPauseListener> it = this.qor.iterator();
        while (it.hasNext()) {
            it.next().onAnimationPause(this);
        }
    }

    void hn(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f11930hn) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void hnj(boolean z10) {
        for (Animator.AnimatorListener animatorListener : this.f11930hn) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z10);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    void qor() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.hnj.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f11930hn.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.hnj.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f11930hn.remove(animatorListener);
    }

    @Override // android.animation.Animator
    public void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.qor.remove(animatorPauseListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.hnj.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    void sk() {
        Iterator<Animator.AnimatorPauseListener> it = this.qor.iterator();
        while (it.hasNext()) {
            it.next().onAnimationResume(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    void hn() {
        Iterator<Animator.AnimatorListener> it = this.f11930hn.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void hnj() {
        Iterator<Animator.AnimatorListener> it = this.f11930hn.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }
}
