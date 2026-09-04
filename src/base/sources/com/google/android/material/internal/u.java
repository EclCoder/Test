package com.google.android.material.internal;

import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes5.dex */
public class u implements TimeInterpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f20422a;

    public u(TimeInterpolator timeInterpolator) {
        this.f20422a = timeInterpolator;
    }

    public static TimeInterpolator a(boolean z10, TimeInterpolator timeInterpolator) {
        return z10 ? timeInterpolator : new u(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f10) {
        return 1.0f - this.f20422a.getInterpolation(f10);
    }
}
