package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
final class a extends d {
    a() {
    }

    @Override // com.google.android.material.behavior.d
    int a(View view, ViewGroup.MarginLayoutParams marginLayoutParams) {
        return view.getMeasuredHeight() + marginLayoutParams.bottomMargin;
    }

    @Override // com.google.android.material.behavior.d
    int b() {
        return 0;
    }

    @Override // com.google.android.material.behavior.d
    int c() {
        return 1;
    }

    @Override // com.google.android.material.behavior.d
    ViewPropertyAnimator d(View view, int i10) {
        return view.animate().translationY(i10);
    }

    @Override // com.google.android.material.behavior.d
    void e(View view, int i10) {
        view.setTranslationY(i10);
    }
}
