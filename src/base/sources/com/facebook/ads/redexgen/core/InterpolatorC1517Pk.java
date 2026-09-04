package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class InterpolatorC1517Pk implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        float f11 = f10 - 1.0f;
        return (f11 * f11 * f11 * f11 * f11) + 1.0f;
    }
}
