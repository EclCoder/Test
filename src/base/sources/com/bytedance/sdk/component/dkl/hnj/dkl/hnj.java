package com.bytedance.sdk.component.dkl.hnj.dkl;

import com.bytedance.sdk.component.dkl.hnj.dse;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    private static volatile hn hnj;

    public static hn hnj() {
        if (hnj == null) {
            synchronized (hn.class) {
                try {
                    if (hnj == null) {
                        hnj = new qor(dse.dkl().sk(), new dkl(dse.dkl().sk()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }
}
