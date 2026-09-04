package com.bytedance.sdk.openadsdk.core.bug.hn;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gjv extends com.bytedance.adsdk.ugeno.ojm.qor.hnj {
    public gjv(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.qor.hnj
    public String orl(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "unmuted":
                return "tt_reward_full_unmute";
            case "feedback":
                return "tt_reward_full_feedback";
            case "right_arrow":
                return "tt_skip_btn";
            case "logo":
                return "tt_ad_logo";
            case "close":
                return "tt_close_btn";
            case "muted":
                return "tt_reward_full_mute";
            default:
                return null;
        }
    }
}
