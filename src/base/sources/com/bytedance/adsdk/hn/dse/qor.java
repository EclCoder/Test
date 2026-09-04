package com.bytedance.adsdk.hn.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private float f11949hn;
    private float hnj;

    public qor(float f10, float f11) {
        this.hnj = f10;
        this.f11949hn = f11;
    }

    public float hn() {
        return this.f11949hn;
    }

    public float hnj() {
        return this.hnj;
    }

    public String toString() {
        return hnj() + "x" + hn();
    }

    public boolean hn(float f10, float f11) {
        return this.hnj == f10 && this.f11949hn == f11;
    }

    public void hnj(float f10, float f11) {
        this.hnj = f10;
        this.f11949hn = f11;
    }

    public qor() {
        this(1.0f, 1.0f);
    }
}
