package com.google.ads.mediation.inmobi;

import android.content.Context;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public class o {
    public String a(Map map, String str) {
        return InMobiSdk.getToken(map, str);
    }

    public String b() {
        return InMobiSdk.getVersion();
    }

    public void c(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        InMobiSdk.init(context, str, jSONObject, sdkInitializationListener);
    }

    public boolean d() {
        return InMobiSdk.isSDKInitialized();
    }

    public void e(Boolean bool) {
        InMobiSdk.setIsAgeRestricted(bool.booleanValue());
    }
}
