package com.google.ads.mediation.inmobi;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.inmobi.compliance.InMobiPrivacyCompliance;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {
    public static h a(Context context, Bundle bundle, String str) {
        HashMap map = new HashMap();
        if (bundle != null && bundle.keySet() != null) {
            for (String str2 : bundle.keySet()) {
                if (!str2.contains("IABUSPrivacy_String")) {
                    map.put(str2, bundle.getString(str2));
                }
            }
        }
        String string = context.getSharedPreferences("NonNullPackage", 0).getString("IABUSPrivacy_String", null);
        if (string != null) {
            InMobiPrivacyCompliance.setUSPrivacyString(string);
        }
        map.put("tp", str);
        map.put("tp-ver", MobileAds.getVersion().toString());
        if (MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment() == 1) {
            map.put("coppa", "1");
        } else {
            map.put("coppa", MBridgeConstans.ENDCARD_URL_TYPE_PL);
        }
        return new h(map, "");
    }
}
