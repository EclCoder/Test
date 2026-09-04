package com.bytedance.adsdk.hn.qor.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class aq {
    private final boolean gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final com.bytedance.adsdk.hn.qor.hnj.aq f12052hn;
    private final hnj hnj;
    private final com.bytedance.adsdk.hn.qor.hnj.gjv qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public aq(hnj hnjVar, com.bytedance.adsdk.hn.qor.hnj.aq aqVar, com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar, boolean z10) {
        this.hnj = hnjVar;
        this.f12052hn = aqVar;
        this.qor = gjvVar;
        this.gjv = z10;
    }

    public boolean gjv() {
        return this.gjv;
    }

    public com.bytedance.adsdk.hn.qor.hnj.aq hn() {
        return this.f12052hn;
    }

    public hnj hnj() {
        return this.hnj;
    }

    public com.bytedance.adsdk.hn.qor.hnj.gjv qor() {
        return this.qor;
    }
}
