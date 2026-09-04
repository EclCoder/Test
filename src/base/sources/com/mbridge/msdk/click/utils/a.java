package com.mbridge.msdk.click.utils;

import android.content.Context;
import android.webkit.URLUtil;
import com.bytedance.adsdk.ugeno.dkl.Rmg.PvZsvNiPV;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.vungle.ads.internal.model.b;
import java.io.File;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f28506a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f28507b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f28508c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f28509d = 1500;

    public static boolean a(CampaignEx campaignEx, String str, int i10) {
        boolean z10 = false;
        if (campaignEx != null && campaignEx.getTpOffer() == 1) {
            z10 = campaignEx.getFac() != 0;
            b(campaignEx, str, i10);
        }
        return z10;
    }

    private static void b(CampaignEx campaignEx, String str, int i10) {
        try {
            Context contextD = c.n().d();
            if (contextD == null || campaignEx == null) {
                return;
            }
            if (URLUtil.isFileUrl(str)) {
                File file = new File(str.replace("file:////", "").replace("file:///", "").replace(b.FILE_SCHEME, ""));
                if (file.exists()) {
                    str = o0.e(file);
                }
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", "2000109");
            jSONObject.put("type", i10);
            jSONObject.put("html", str);
            jSONObject.put("network_type", m0.s(contextD));
            jSONObject.put(PvZsvNiPV.EIvPFMKilN, campaignEx.getCampaignUnitId());
            jSONObject.put("rid", campaignEx.getRequestId());
            jSONObject.put("rid_n", campaignEx.getRequestIdNotice());
            jSONObject.put(BidResponsedEx.KEY_CID, campaignEx.getId());
            if (campaignEx.isBidCampaign()) {
                jSONObject.put(CampaignEx.JSON_KEY_HB, 1);
            }
            jSONObject.put("op", i10 == 3 ? 2 : 1);
            jSONObject.put(CampaignEx.JSON_KEY_FAC, campaignEx.getFac());
            d.b().a(jSONObject);
        } catch (Throwable th2) {
            q0.b("DspFilterUtils", th2.getMessage());
        }
    }
}
