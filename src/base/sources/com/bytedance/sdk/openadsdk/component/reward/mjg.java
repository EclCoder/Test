package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.model.as;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class mjg {
    private static final ConcurrentHashMap<hnj, mjg> hnj = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private final Context f13527hn;
    private final hnj qor;

    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    public enum hnj {
        REWARD_VIDEO("sp_reward_video", "sp_reward_video_new", "reward_video_cache"),
        FULL_SCREEN_VIDEO("sp_full_screen_video", "sp_full_screen_video_new", "full_screen_video_cache");

        final String gjv;
        final String qor;

        /* JADX INFO: renamed from: sk, reason: collision with root package name */
        final String f13529sk;

        hnj(String str, String str2, String str3) {
            this.qor = str;
            this.gjv = str2;
            this.f13529sk = str3;
        }
    }

    private mjg(Context context, hnj hnjVar) {
        this.f13527hn = context == null ? com.bytedance.sdk.openadsdk.core.oj.hnj() : context.getApplicationContext();
        this.qor = hnjVar;
    }

    public static mjg hnj(Context context, hnj hnjVar) {
        ConcurrentHashMap<hnj, mjg> concurrentHashMap = hnj;
        if (!concurrentHashMap.containsKey(hnjVar)) {
            synchronized (mjg.class) {
                try {
                    if (!concurrentHashMap.containsKey(hnjVar)) {
                        concurrentHashMap.put(hnjVar, new mjg(context, hnjVar));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return concurrentHashMap.get(hnjVar);
    }

    public void hnj(String str, as asVar) {
        com.bytedance.sdk.openadsdk.common.hn.hnj(this.qor.gjv).hnj(str, asVar);
    }

    public void hnj() {
        com.bytedance.sdk.openadsdk.common.hn.hnj(this.qor.gjv).hnj();
    }

    public void hnj(AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        if (hnjVar == null || hnjVar.dkl() == null || !hnjVar.dkl().era()) {
            com.bytedance.sdk.openadsdk.common.hn.hnj(this.qor.gjv).hnj(adSlot, hnjVar);
        }
    }

    public String hnj(String str, boolean z10) {
        com.bytedance.sdk.openadsdk.common.hn hnVarHnj = com.bytedance.sdk.openadsdk.common.hn.hnj(this.qor.gjv);
        String strHnj = hnVarHnj.hnj(str, 10500000L);
        if (z10 && !TextUtils.isEmpty(strHnj) && hnVarHnj.gjv(str)) {
            return null;
        }
        return strHnj;
    }

    public boolean hnj(com.bytedance.sdk.openadsdk.core.model.hnj hnjVar) {
        return com.bytedance.sdk.openadsdk.common.hn.hnj(this.qor.gjv).hnj(hnjVar, true);
    }

    public void hnj(String str) {
        com.bytedance.sdk.openadsdk.common.hn.hnj(this.qor.gjv).qor(str);
    }
}
