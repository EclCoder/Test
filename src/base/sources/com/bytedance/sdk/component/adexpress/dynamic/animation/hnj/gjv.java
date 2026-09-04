package com.bytedance.sdk.component.adexpress.dynamic.animation.hnj;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public abstract class gjv implements ua {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj f12512hn;
    public View qor;
    private Set<ScheduledFuture<?>> gjv = new HashSet();
    public List<ObjectAnimator> hnj = hnj();

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public class hnj implements Runnable {

        /* JADX INFO: renamed from: hn, reason: collision with root package name */
        ScheduledFuture<?> f12515hn;
        ObjectAnimator hnj;

        hnj(ObjectAnimator objectAnimator) {
            this.hnj = objectAnimator;
        }

        public void hnj(ScheduledFuture<?> scheduledFuture) {
            this.f12515hn = scheduledFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor() != null) {
                com.bytedance.sdk.component.adexpress.hnj.hnj.hnj.hnj().qor().qor().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv.hnj.1
                    @Override // java.lang.Runnable
                    public void run() {
                        hnj.this.hnj.resume();
                    }
                });
                if (this.f12515hn != null) {
                    gjv.this.gjv.remove(this.f12515hn);
                }
            }
        }
    }

    public gjv(View view, com.bytedance.sdk.component.adexpress.dynamic.gjv.hnj hnjVar) {
        this.qor = view;
        this.f12512hn = hnjVar;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ua
    public void hn() {
        List<ObjectAnimator> list = this.hnj;
        if (list == null) {
            return;
        }
        for (ObjectAnimator objectAnimator : list) {
            objectAnimator.cancel();
            objectAnimator.removeAllUpdateListeners();
        }
        Iterator<ScheduledFuture<?>> it = this.gjv.iterator();
        while (it.hasNext()) {
            it.next().cancel(true);
        }
    }

    abstract List<ObjectAnimator> hnj();

    public void qor() {
        List<ObjectAnimator> list = this.hnj;
        if (list == null) {
            return;
        }
        for (final ObjectAnimator objectAnimator : list) {
            objectAnimator.start();
            if (this.f12512hn.uua() > 0.0d) {
                objectAnimator.addListener(new Animator.AnimatorListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv.1
                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationRepeat(Animator animator) {
                        objectAnimator.pause();
                        hnj hnjVar = gjv.this.new hnj(objectAnimator);
                        ScheduledFuture<?> scheduledFutureHnj = com.bytedance.sdk.component.adexpress.gjv.gjv.hnj(hnjVar, (long) (gjv.this.f12512hn.uua() * 1000.0d), TimeUnit.MILLISECONDS);
                        hnjVar.hnj(scheduledFutureHnj);
                        gjv.this.gjv.add(scheduledFutureHnj);
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public void onAnimationStart(Animator animator) {
                    }
                });
            }
        }
    }

    ObjectAnimator hnj(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f12512hn.mjg() * 1000.0d));
        if (this.f12512hn.fc() > 0) {
            objectAnimator.setRepeatCount(this.f12512hn.fc() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!"normal".equals(this.f12512hn.jip())) {
            if ("alternate".equals(this.f12512hn.jip()) || "alternate-reverse".equals(this.f12512hn.jip())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f12512hn.orl())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f12512hn.jip())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f12512hn.jip())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.animation.hnj.gjv.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    gjv.this.qor.setVisibility(0);
                    if (gjv.this.qor.getParent() instanceof com.bytedance.sdk.component.adexpress.dynamic.dynamicview.dkl) {
                        ((View) gjv.this.qor.getParent()).setVisibility(0);
                    }
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }
}
