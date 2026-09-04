package com.mbridge.msdk.splash.request;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.out.MBridgeIds;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class a {
    public static com.mbridge.msdk.foundation.same.net.wrapper.e a(Context context, MBridgeIds mBridgeIds, f fVar) {
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.n().b() + com.mbridge.msdk.foundation.controller.c.n().c());
        com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(mBridgeIds.getUnitId(), "splash");
        String strA2 = v0.a(context, mBridgeIds.getUnitId());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.APP_ID, strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, mBridgeIds.getUnitId());
        if (!TextUtils.isEmpty(mBridgeIds.getPlacementId())) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, mBridgeIds.getPlacementId());
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", fVar.d() + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f30650g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f30651h, strA2);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.same.net.wrapper.e.f30652i, fVar.e());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", "297");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", fVar.c() + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, com.mbridge.msdk.foundation.entity.b.JSON_KEY_UNIT_SIZE, fVar.b() + "x" + fVar.a());
        return eVar;
    }
}
