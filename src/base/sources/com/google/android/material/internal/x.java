package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class x extends androidx.transition.m {

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    class a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f20431a;

        a(TextView textView) {
            this.f20431a = textView;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f20431a.setScaleX(fFloatValue);
            this.f20431a.setScaleY(fFloatValue);
        }
    }

    private void k0(androidx.transition.x xVar) {
        View view = xVar.f7465b;
        if (view instanceof TextView) {
            xVar.f7464a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.m
    public void g(androidx.transition.x xVar) {
        k0(xVar);
    }

    @Override // androidx.transition.m
    public void j(androidx.transition.x xVar) {
        k0(xVar);
    }

    @Override // androidx.transition.m
    public Animator n(ViewGroup viewGroup, androidx.transition.x xVar, androidx.transition.x xVar2) {
        if (xVar == null || xVar2 == null || !(xVar.f7465b instanceof TextView)) {
            return null;
        }
        View view = xVar2.f7465b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map map = xVar.f7464a;
        Map map2 = xVar2.f7464a;
        float fFloatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float fFloatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new a(textView));
        return valueAnimatorOfFloat;
    }
}
