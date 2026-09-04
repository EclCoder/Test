package com.bytedance.adsdk.hn.qor;

import android.graphics.PointF;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final PointF f12091hn;
    private final PointF hnj;
    private final PointF qor;

    public hnj() {
        this.hnj = new PointF();
        this.f12091hn = new PointF();
        this.qor = new PointF();
    }

    public void hn(float f10, float f11) {
        this.f12091hn.set(f10, f11);
    }

    public void hnj(float f10, float f11) {
        this.hnj.set(f10, f11);
    }

    public void qor(float f10, float f11) {
        this.qor.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.qor.x), Float.valueOf(this.qor.y), Float.valueOf(this.hnj.x), Float.valueOf(this.hnj.y), Float.valueOf(this.f12091hn.x), Float.valueOf(this.f12091hn.y));
    }

    public PointF hn() {
        return this.f12091hn;
    }

    public PointF hnj() {
        return this.hnj;
    }

    public PointF qor() {
        return this.qor;
    }

    public hnj(PointF pointF, PointF pointF2, PointF pointF3) {
        this.hnj = pointF;
        this.f12091hn = pointF2;
        this.qor = pointF3;
    }
}
