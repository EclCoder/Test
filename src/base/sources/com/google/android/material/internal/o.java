package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class o implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f20380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View[] f20381b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    interface a {
        void a(ValueAnimator valueAnimator, View view);
    }

    public o(a aVar, View... viewArr) {
        this.f20380a = aVar;
        this.f20381b = viewArr;
    }

    public static o e(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.n
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.g(valueAnimator, view);
            }
        }, viewArr);
    }

    public static o f(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.m
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.h(valueAnimator, view);
            }
        }, viewArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(ValueAnimator valueAnimator, View view) {
        view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(ValueAnimator valueAnimator, View view) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        view.setScaleX(f10.floatValue());
        view.setScaleY(f10.floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(ValueAnimator valueAnimator, View view) {
        view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void j(ValueAnimator valueAnimator, View view) {
        view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public static o k(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.k
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.i(valueAnimator, view);
            }
        }, viewArr);
    }

    public static o l(View... viewArr) {
        return new o(new a() { // from class: com.google.android.material.internal.l
            @Override // com.google.android.material.internal.o.a
            public final void a(ValueAnimator valueAnimator, View view) {
                o.j(valueAnimator, view);
            }
        }, viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.f20381b) {
            this.f20380a.a(valueAnimator, view);
        }
    }
}
