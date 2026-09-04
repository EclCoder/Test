package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fvt {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private long f14637hn;
    public long hnj;

    private fvt(boolean z10) {
        if (z10) {
            sk();
        }
    }

    public static fvt hn() {
        return new fvt(true);
    }

    public static fvt qor() {
        return new fvt(false);
    }

    public boolean dkl() {
        return this.f14637hn > 0;
    }

    public long gjv() {
        return SystemClock.elapsedRealtime() - this.f14637hn;
    }

    public long hnj() {
        return this.f14637hn;
    }

    public void sk() {
        this.hnj = System.currentTimeMillis();
        this.f14637hn = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return String.valueOf(this.hnj);
    }

    public long hnj(fvt fvtVar) {
        return Math.abs(fvtVar.f14637hn - this.f14637hn);
    }
}
