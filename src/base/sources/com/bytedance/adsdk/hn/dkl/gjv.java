package com.bytedance.adsdk.hn.dkl;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private int f11929hn;
    private float hnj;

    public void hnj(float f10) {
        float f11 = this.hnj + f10;
        this.hnj = f11;
        int i10 = this.f11929hn + 1;
        this.f11929hn = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.hnj = f11 / 2.0f;
            this.f11929hn = i10 / 2;
        }
    }
}
