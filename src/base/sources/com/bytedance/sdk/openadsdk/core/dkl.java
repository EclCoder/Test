package com.bytedance.sdk.openadsdk.core;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl extends dse {
    private static volatile dkl hnj;

    private dkl(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.openadsdk.core.dse
    public /* bridge */ /* synthetic */ dse.qor hnj() {
        return super.hnj();
    }

    public static dkl hnj(Context context) {
        if (hnj == null) {
            synchronized (dkl.class) {
                try {
                    if (hnj == null) {
                        hnj = new dkl(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }
}
