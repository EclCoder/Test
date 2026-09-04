package com.bytedance.sdk.openadsdk.core.bug.hn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.wu;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj extends com.bytedance.adsdk.ugeno.ojm.dkl.hn {
    public hnj(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.ojm.dkl.hn
    public void orl(String str) {
        super.orl(str);
        if (TextUtils.isEmpty(str) || TextUtils.equals("null", str)) {
            return;
        }
        try {
            String str2 = String.format(wu.hnj(this.f12280hn, "tt_comment_num"), Integer.valueOf(Integer.parseInt(str)));
            ((com.bytedance.adsdk.ugeno.ojm.dkl.hnj) this.f12293sk).setText("(" + str2 + ")");
        } catch (Exception unused) {
        }
    }
}
