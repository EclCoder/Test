package com.bytedance.adsdk.ugeno.gjv;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class bug {
    public static dkl.hnj hnj(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        dkl.hnj hnjVar = new dkl.hnj();
        String strHnj = com.bytedance.adsdk.ugeno.qor.hn.hnj(str, jSONObject);
        if (strHnj.contains("#")) {
            strHnj = strHnj.replace("#", "%23");
        }
        Uri uri = Uri.parse(strHnj);
        if (uri == null) {
            return null;
        }
        hnjVar.qor(strHnj);
        if (!TextUtils.isEmpty(uri.getScheme())) {
            hnjVar.hnj(uri.getScheme());
        }
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = uri.getPath();
        }
        hnjVar.hn(authority);
        hnjVar.gjv(hnjVar.hnj() + "://" + hnjVar.hn());
        HashMap map = new HashMap();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                map.put(str2, com.bytedance.adsdk.ugeno.qor.hn.hnj(uri.getQueryParameter(str2), jSONObject));
            }
        }
        hnjVar.hnj(map);
        return hnjVar;
    }
}
