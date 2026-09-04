package com.bytedance.adsdk.ugeno.qor;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.sk;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    public static String hnj(String str, JSONObject jSONObject) {
        hnj hnjVarQor;
        hnj.InterfaceC0174hnj interfaceC0174hnjHnj;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (str.startsWith("${") && str.endsWith("}") && (hnjVarQor = sk.hnj().qor()) != null && (interfaceC0174hnjHnj = hnjVarQor.hnj(str.substring(2, str.length() - 1))) != null) {
                    return (String) interfaceC0174hnjHnj.hnj(jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }
}
