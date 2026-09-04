package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug extends YogaNodeJNIBase {
    protected void finalize() throws Throwable {
        try {
            orl();
        } finally {
            super.finalize();
        }
    }

    public void orl() {
        long j10 = this.hnj;
        if (j10 != 0) {
            this.hnj = 0L;
            YogaNative.jni_YGNodeFinalizeJNI(j10);
        }
    }
}
