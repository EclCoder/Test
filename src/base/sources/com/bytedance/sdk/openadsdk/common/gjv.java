package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends bug {
    public gjv(Context context) {
        super(context);
        this.f13275hn = false;
    }

    @Override // com.bytedance.sdk.openadsdk.common.bug
    public void hnj() {
        post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.gjv.1
            @Override // java.lang.Runnable
            public void run() {
                gjv gjvVar = gjv.this;
                if (gjvVar.hnj != null) {
                    gjvVar.setVisibility(0);
                }
            }
        });
    }

    public void hnj(as asVar, String str, int i10, String str2, long j10, boolean z10, int i11, long j11) {
        if (getVisibility() != 8) {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, str, i10, str2, SystemClock.elapsedRealtime() - j10, z10, i11, j11);
            super.hn();
        }
    }
}
