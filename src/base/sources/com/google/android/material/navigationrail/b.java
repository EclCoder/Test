package com.google.android.material.navigationrail;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.m;
import androidx.transition.x;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
class b extends m {
    b() {
    }

    @Override // androidx.transition.m
    public void g(x xVar) {
        xVar.f7464a.put("NavigationRailLabelVisibility", Integer.valueOf(xVar.f7465b.getVisibility()));
    }

    @Override // androidx.transition.m
    public void j(x xVar) {
        xVar.f7464a.put("NavigationRailLabelVisibility", Integer.valueOf(xVar.f7465b.getVisibility()));
    }

    @Override // androidx.transition.m
    public Animator n(ViewGroup viewGroup, x xVar, x xVar2) {
        if (xVar == null || xVar2 == null || xVar.f7464a.get("NavigationRailLabelVisibility") == null || xVar2.f7464a.get("NavigationRailLabelVisibility") == null) {
            return super.n(viewGroup, xVar, xVar2);
        }
        if (((Integer) xVar.f7464a.get("NavigationRailLabelVisibility")).intValue() != 8 || ((Integer) xVar2.f7464a.get("NavigationRailLabelVisibility")).intValue() != 0) {
            return super.n(viewGroup, xVar, xVar2);
        }
        final View view = xVar2.f7465b;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigationrail.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view.setTranslationX((1.0f - valueAnimator.getAnimatedFraction()) * (-30.0f));
            }
        });
        return valueAnimatorOfFloat;
    }
}
