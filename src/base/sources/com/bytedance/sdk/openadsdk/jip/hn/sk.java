package com.bytedance.sdk.openadsdk.jip.hn;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class sk implements qor {
    private static volatile sk hnj;

    private sk() {
    }

    @Override // com.bytedance.sdk.openadsdk.jip.hn.qor
    public void hnj(com.bytedance.sdk.openadsdk.jip.hn hnVar) {
    }

    @Override // com.bytedance.sdk.openadsdk.jip.hn.qor
    public void hnj(com.bytedance.sdk.openadsdk.jip.hn hnVar, boolean z10) {
    }

    public static sk hnj() {
        if (hnj == null) {
            synchronized (sk.class) {
                try {
                    if (hnj == null) {
                        hnj = new sk();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }
}
