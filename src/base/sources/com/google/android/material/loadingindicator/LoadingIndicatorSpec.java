package com.google.android.material.loadingindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.internal.z;
import sb.e;
import sb.m;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public final class LoadingIndicatorSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f20488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f20489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f20490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f20491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f20492e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f20493f;

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, LoadingIndicator.f20478h);
    }

    private void a(Context context, TypedArray typedArray) {
        int i10 = m.C4;
        if (!typedArray.hasValue(i10)) {
            this.f20492e = new int[]{ac.a.b(context, h.a.f39870w, -1)};
            return;
        }
        if (typedArray.peekValue(i10).type != 1) {
            this.f20492e = new int[]{typedArray.getColor(i10, -1)};
            return;
        }
        int[] intArray = context.getResources().getIntArray(typedArray.getResourceId(i10, -1));
        this.f20492e = intArray;
        if (intArray.length == 0) {
            throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
        }
    }

    public LoadingIndicatorSpec(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f20488a = false;
        this.f20492e = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(e.M);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(e.L);
        TypedArray typedArrayI = z.i(context, attributeSet, m.f52252y4, i10, i11, new int[0]);
        this.f20489b = typedArrayI.getDimensionPixelSize(m.D4, dimensionPixelSize);
        this.f20490c = typedArrayI.getDimensionPixelSize(m.B4, dimensionPixelSize2);
        this.f20491d = typedArrayI.getDimensionPixelSize(m.A4, dimensionPixelSize2);
        a(context, typedArrayI);
        this.f20493f = typedArrayI.getColor(m.f52267z4, 0);
        typedArrayI.recycle();
    }
}
