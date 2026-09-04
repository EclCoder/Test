package com.bytedance.adsdk.hn.qor;

import com.bytedance.adsdk.hn.mjg;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class sk {
    private static final sk hnj = new sk();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final mjg<String, com.bytedance.adsdk.hn.dse> f12126hn = new mjg<>(20);

    sk() {
    }

    public static sk hnj() {
        return hnj;
    }

    public com.bytedance.adsdk.hn.dse hnj(String str) {
        if (str == null) {
            return null;
        }
        return this.f12126hn.hnj(str);
    }

    public void hnj(String str, com.bytedance.adsdk.hn.dse dseVar) {
        if (str == null) {
            return;
        }
        this.f12126hn.hnj(str, dseVar);
    }
}
