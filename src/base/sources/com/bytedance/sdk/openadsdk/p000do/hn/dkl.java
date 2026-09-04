package com.bytedance.sdk.openadsdk.p000do.hn;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.fvt;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dkl {
    public static boolean hnj(View view, int i10) {
        return hnj(view, false, i10);
    }

    public static boolean hnj(View view, boolean z10, int i10) {
        if (view == null) {
            return false;
        }
        return fvt.hnj(view, z10 ? 30 : 50, i10, false);
    }
}
