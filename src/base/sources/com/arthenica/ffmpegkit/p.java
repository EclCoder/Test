package com.arthenica.ffmpegkit;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f11111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f11113c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f11114d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f11115e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f11116f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f11117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f11118h;

    public p(long j10, int i10, float f10, float f11, long j11, double d10, double d11, double d12) {
        this.f11111a = j10;
        this.f11112b = i10;
        this.f11113c = f10;
        this.f11114d = f11;
        this.f11115e = j11;
        this.f11116f = d10;
        this.f11117g = d11;
        this.f11118h = d12;
    }

    public double a() {
        return this.f11116f;
    }

    public String toString() {
        return "Statistics{sessionId=" + this.f11111a + ", videoFrameNumber=" + this.f11112b + ", videoFps=" + this.f11113c + ", videoQuality=" + this.f11114d + ", size=" + this.f11115e + ", time=" + this.f11116f + ", bitrate=" + this.f11117g + ", speed=" + this.f11118h + '}';
    }
}
