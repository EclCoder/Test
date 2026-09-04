package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f19746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f19747b;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    enum a {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr2[i10] = iArr[i10] * 2;
        }
        return iArr2;
    }

    public static float b(float f10, float f11, float f12) {
        return 1.0f - ((f10 - f12) / (f11 - f12));
    }

    public float c() {
        return this.f19747b;
    }

    public float d() {
        return this.f19746a;
    }

    a e() {
        return a.CONTAINED;
    }

    void f(Context context) {
        float fH = this.f19746a;
        if (fH <= 0.0f) {
            fH = d.h(context);
        }
        this.f19746a = fH;
        float fG = this.f19747b;
        if (fG <= 0.0f) {
            fG = d.g(context);
        }
        this.f19747b = fG;
    }

    public abstract e g(yb.a aVar, View view);

    public abstract boolean h(yb.a aVar, int i10);
}
