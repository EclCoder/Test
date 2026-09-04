package com.bytedance.adsdk.hn.gjv;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public enum qor {
    JSON(".json"),
    ZIP(".zip");

    public final String qor;

    qor(String str) {
        this.qor = str;
    }

    public String hnj() {
        return ".temp" + this.qor;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.qor;
    }
}
