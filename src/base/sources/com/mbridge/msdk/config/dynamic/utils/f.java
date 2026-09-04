package com.mbridge.msdk.config.dynamic.utils;

import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public class f {
    public static void a(XMLView xMLView, Object obj, Map<String, Object> map) {
        HashMap<String, Object> mapA;
        if (xMLView == null || xMLView.getXmlViewActionListener() == null) {
            return;
        }
        com.mbridge.msdk.config.dynamic.baseview.touch.a touchEventData = xMLView.getTouchEventData();
        HashMap map2 = new HashMap();
        if (touchEventData != null && (mapA = touchEventData.a()) != null) {
            com.mbridge.msdk.config.dynamic.baseview.touch.a.C0380a c0380aB = touchEventData.b();
            if (c0380aB != null) {
                mapA.put("click_x", String.valueOf(c0380aB.f29388b));
                mapA.put("click_y", String.valueOf(c0380aB.f29389c));
            }
            mapA.put("click_time", String.valueOf(System.currentTimeMillis()));
            map2.putAll(mapA);
        }
        if (map != null) {
            map2.putAll(map);
        }
        xMLView.getXmlViewActionListener().a(String.valueOf(obj), map2);
    }
}
