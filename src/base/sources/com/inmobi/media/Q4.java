package com.inmobi.media;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Q4 {
    public static JSONArray a(P4 it, List skipList) {
        kotlin.jvm.internal.s.h(it, "it");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        JSONArray jSONArray = new JSONArray();
        List list = P4.f25453j;
        kotlin.jvm.internal.s.h(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME, "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains(CampaignEx.KEY_ACTIVITY_PATH_AND_NAME)) {
            jSONArray.put(it.f25454a);
        }
        kotlin.jvm.internal.s.h(BidResponsed.KEY_BID_ID, "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains(BidResponsed.KEY_BID_ID)) {
            jSONArray.put(it.f25455b);
        }
        kotlin.jvm.internal.s.h("its", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("its")) {
            jSONArray.put(it.f25456c);
        }
        kotlin.jvm.internal.s.h("vtm", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("vtm")) {
            jSONArray.put(it.f25457d);
        }
        kotlin.jvm.internal.s.h("plid", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("plid")) {
            jSONArray.put(it.f25458e);
        }
        kotlin.jvm.internal.s.h("catid", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("catid")) {
            jSONArray.put(it.f25459f);
        }
        kotlin.jvm.internal.s.h("hcd", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("hcd")) {
            jSONArray.put(it.f25460g);
        }
        kotlin.jvm.internal.s.h("hsv", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("hsv")) {
            jSONArray.put(it.f25461h);
        }
        kotlin.jvm.internal.s.h("hcv", "key");
        kotlin.jvm.internal.s.h(skipList, "skipList");
        if (!skipList.contains("hcv")) {
            jSONArray.put(it.f25462i);
        }
        return jSONArray;
    }
}
