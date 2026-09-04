package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.bug.sk.hnj.UfZs.NhHRaDJCHtCTJR;
import com.bytedance.sdk.openadsdk.core.model.as;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class sk {
    private static volatile sk hnj;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f13536hn;

    private sk(Context context) {
        this.f13536hn = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context.getApplicationContext();
    }

    public void hnj(String str, as asVar) {
        com.bytedance.sdk.openadsdk.common.hn.hnj("sp_full_screen_video_new").hnj(str, asVar);
    }

    public void hnj() {
        com.bytedance.sdk.openadsdk.common.hn.hnj("sp_full_screen_video_new").hnj();
    }

    public void hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || !hnjVar.dkl().era()) {
            com.bytedance.sdk.openadsdk.common.hn.hnj("sp_full_screen_video_new").hnj(adSlot, hnjVar);
        }
    }

    public static sk hnj(Context context) {
        if (hnj == null) {
            synchronized (sk.class) {
                try {
                    if (hnj == null) {
                        hnj = new sk(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return hnj;
    }

    public String hnj(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.common.hn hnVarHnj = com.bytedance.sdk.openadsdk.common.hn.hnj("sp_full_screen_video_new");
        String strHnj = hnVarHnj.hnj(str, 10500000L);
        if (z10 && !TextUtils.isEmpty(strHnj) && hnVarHnj.gjv(str)) {
            return null;
        }
        return strHnj;
    }

    public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        return com.bytedance.sdk.openadsdk.common.hn.hnj(NhHRaDJCHtCTJR.OiAaiqrdEKzJi).hnj(hnjVar, true);
    }

    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.common.hn.hnj("sp_full_screen_video_new").qor(str);
    }
}
