package com.inmobi.media;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class D8 {
    public static HashMap a() {
        String str;
        HashMap map = new HashMap();
        try {
            map.put("mk-version", Yi.a());
            C3314t1 c3314t1 = Qk.f25565a;
            Boolean bool = c3314t1 != null ? c3314t1.f27500c : null;
            if (bool != null) {
                map.put("u-id-adt", bool.booleanValue() ? "1" : MBridgeConstans.ENDCARD_URL_TYPE_PL);
            }
            map.put(CampaignEx.JSON_KEY_ST_TS, String.valueOf(Calendar.getInstance().getTimeInMillis()));
            Calendar calendar = Calendar.getInstance();
            map.put("tz", String.valueOf(calendar.get(16) + calendar.get(15)));
            C2944ej.f26502a.getClass();
            HashMap map2 = new HashMap();
            if (C2944ej.f26506e && (str = C2944ej.f26505d) != null) {
                map2.put("u-s-id", str);
            }
            map.putAll(map2);
            return map;
        } catch (Exception e10) {
            kotlin.jvm.internal.s.g("D8", "TAG");
            e10.getMessage();
            return map;
        }
    }
}
