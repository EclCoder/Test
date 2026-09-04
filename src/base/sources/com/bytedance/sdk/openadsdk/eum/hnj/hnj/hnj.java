package com.bytedance.sdk.openadsdk.eum.hnj.hnj;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.apu;
import com.bytedance.sdk.openadsdk.core.model.as;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.core.sk;
import com.bytedance.sdk.openadsdk.gjv.mjg;
import com.bytedance.sdk.openadsdk.utils.orp;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    public static boolean hnj(Context context, String str, as asVar, int i10, Map<String, Object> map, boolean z10) {
        Map<String, Object> map2 = map;
        String strHnj = orp.hnj(asVar);
        sk.hnj(asVar, strHnj, 1, null);
        Intent intentHnj = hnj(context, str, asVar);
        if (TextUtils.isEmpty(str) || intentHnj == null) {
            sk.hnj(asVar, strHnj, -2, asVar.pdc().gjv());
            return false;
        }
        boolean zGjv = orp.gjv(context);
        if (map2 == null) {
            map2 = new HashMap<>();
        }
        Map<String, Object> map3 = map2;
        if (asVar != null && asVar.vz() == 0) {
            map3.put("auto_click", Boolean.valueOf(!asVar.xn()));
        }
        map3.put("can_query_install", Integer.valueOf(zGjv ? 1 : 0));
        map3.put("url", str);
        if (zGjv) {
            orp.hn hnVarHnj = orp.hnj(context, intentHnj);
            if (hnVarHnj.f14706hn <= 0) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("intent", intentHnj.toString());
                    jSONObject.put("can_query_install", 1);
                } catch (Exception unused) {
                }
                sk.hnj(asVar, strHnj, -3, jSONObject);
                return false;
            }
            try {
                hnj(context, asVar, map3);
                map3.put("matched_count", Integer.valueOf(hnVarHnj.f14706hn));
                ComponentName componentName = hnVarHnj.hnj;
                if (componentName != null) {
                    intentHnj.setComponent(componentName);
                }
            } catch (Throwable th2) {
                apu.qor("DeepLinkUtils", th2.getMessage());
            }
        }
        if (oj.gjv().ojm()) {
            orp.hnj(asVar, strHnj);
        }
        try {
            com.bytedance.sdk.openadsdk.gjv.qor.hnj(asVar, strHnj, "open_url_app", map3);
            context.startActivity(intentHnj);
            mjg.hnj().hnj(map3).hnj(asVar, strHnj);
            com.bytedance.sdk.openadsdk.gjv.qor.hnj("dp_start_act_success", asVar, strHnj, map3);
            return true;
        } catch (Throwable th3) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("exception", th3.getMessage());
                jSONObject2.put("intent", intentHnj.toString());
                jSONObject2.put("can_query_install", zGjv ? 1 : 0);
            } catch (Exception unused2) {
            }
            sk.hnj(asVar, strHnj, -4, jSONObject2);
            if (zGjv && !oj.gjv().ojm()) {
                com.bytedance.sdk.openadsdk.core.orp.hnj(context, asVar.xe(), asVar, i10, strHnj, z10);
            }
            return false;
        }
    }

    private static Intent hnj(Context context, String str, as asVar) {
        try {
            Uri uri = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            if (asVar != null && asVar.ui() != null && !TextUtils.isEmpty(asVar.ui().gjv())) {
                intent.setPackage(asVar.ui().gjv());
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            return intent;
        } catch (Throwable th2) {
            apu.qor("DeepLinkUtils", th2.getMessage());
            return null;
        }
    }

    private static void hnj(Context context, as asVar, Map<String, Object> map) {
        if (asVar != null && asVar.vz() == 0) {
            map.put("auto_click", Boolean.valueOf(!asVar.xn()));
        }
        map.put("can_query_install", Integer.valueOf(orp.gjv(context) ? 1 : 0));
    }
}
