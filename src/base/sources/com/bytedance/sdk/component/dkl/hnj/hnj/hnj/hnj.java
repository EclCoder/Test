package com.bytedance.sdk.component.dkl.hnj.hnj.hnj;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends hn {
    private static volatile hnj hnj;

    private hnj(Context context) {
        super(context);
    }

    @Override // com.bytedance.sdk.component.dkl.hnj.hnj.hnj.hn
    public /* bridge */ /* synthetic */ hn.C0187hn hnj() {
        return super.hnj();
    }

    public static hnj hnj(Context context) {
        if (hnj == null) {
            synchronized (hnj.class) {
                try {
                    if (hnj == null) {
                        hnj = new hnj(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }
}
