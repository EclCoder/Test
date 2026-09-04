package com.bytedance.sdk.openadsdk.utils;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class fc implements com.bytedance.sdk.openadsdk.oem.hnj {

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private static com.bytedance.sdk.openadsdk.component.reward.hnj.hnj f14635hn;
    private static final fc hnj = new fc();
    private static boolean qor;

    public static void hn() {
        qor = true;
    }

    public static void hnj(com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar) {
        com.bytedance.sdk.openadsdk.core.model.vf vfVarUi = hnjVar.f13456hn.ui();
        if (vfVarUi != null) {
            if (vfVarUi.dse() || vfVarUi.aq()) {
                f14635hn = hnjVar;
                IPBroadcastReceiver iPBroadcastReceiverHnj = IPBroadcastReceiver.hnj(hnjVar.jbd, hnjVar.f13456hn);
                if (iPBroadcastReceiverHnj != null) {
                    iPBroadcastReceiverHnj.hnj(hnj);
                }
            }
        }
    }

    public static void hnj() {
        if (f14635hn == null) {
            return;
        }
        IPBroadcastReceiver iPBroadcastReceiverHnj = IPBroadcastReceiver.hnj(com.bytedance.sdk.openadsdk.core.oj.hnj(), f14635hn.f13456hn);
        if (iPBroadcastReceiverHnj != null) {
            iPBroadcastReceiverHnj.hnj();
        }
        f14635hn = null;
        qor = false;
    }

    @Override // com.bytedance.sdk.openadsdk.oem.hnj
    public void hnj(String str, final int i10) {
        com.bytedance.sdk.openadsdk.core.model.dkl dklVarZyh;
        com.bytedance.sdk.openadsdk.component.reward.hnj.hnj hnjVar = f14635hn;
        if (hnjVar == null || (dklVarZyh = hnjVar.f13456hn.zyh()) == null) {
            return;
        }
        String strQor = dklVarZyh.qor();
        if (TextUtils.isEmpty(strQor) || !strQor.equals(str)) {
            return;
        }
        ua.hnj(new Runnable() { // from class: com.bytedance.sdk.openadsdk.utils.fc.1
            @Override // java.lang.Runnable
            public void run() {
                int i11;
                if (fc.f14635hn == null || (i11 = i10) <= 0 || i11 > 5) {
                    return;
                }
                boolean z10 = true;
                boolean z11 = i11 == 1;
                if (fc.qor) {
                    fc.f14635hn.sq.mkl();
                    HashMap map = new HashMap();
                    map.put("click_scence", 4);
                    com.bytedance.sdk.openadsdk.gjv.qor.hnj(CampaignEx.JSON_NATIVE_VIDEO_CLICK, fc.f14635hn.f13456hn, new com.bytedance.sdk.openadsdk.core.model.bug.hnj().hnj(), fc.f14635hn.f13461sk, true, (Map<String, Object>) map, 1);
                } else {
                    z10 = z11;
                }
                if (z10) {
                    fc.hnj();
                }
            }
        });
    }
}
