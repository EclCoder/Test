package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class t implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f20421a;

    public t(Rect rect) {
        this.f20421a = rect;
    }

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f10, Rect rect, Rect rect2) {
        int i10 = rect.left;
        int i11 = i10 + ((int) ((rect2.left - i10) * f10));
        int i12 = rect.top;
        int i13 = i12 + ((int) ((rect2.top - i12) * f10));
        int i14 = rect.right;
        int i15 = i14 + ((int) ((rect2.right - i14) * f10));
        int i16 = rect.bottom;
        this.f20421a.set(i11, i13, i15, i16 + ((int) ((rect2.bottom - i16) * f10)));
        return this.f20421a;
    }
}
