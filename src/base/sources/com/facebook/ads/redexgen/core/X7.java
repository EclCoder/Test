package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class X7 implements Interpolator {
    public final float A00;

    public X7(float f10) {
        this.A00 = f10;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        return (float) Math.pow(f10, this.A00);
    }
}
