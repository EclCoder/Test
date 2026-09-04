package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class X8 implements Interpolator {
    public final float A00;

    public X8(float f10) {
        this.A00 = f10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) (1.0d - Math.pow(1.0f - f10, this.A00));
    }
}
