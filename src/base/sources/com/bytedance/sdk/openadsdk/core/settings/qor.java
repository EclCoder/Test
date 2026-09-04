package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.openadsdk.core.oj;
import com.bytedance.sdk.openadsdk.utils.orl;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    private static final ConcurrentHashMap<String, hn> hnj = new ConcurrentHashMap<>();

    private static HashMap<String, hn> hn(JSONArray jSONArray) {
        HashMap<String, hn> map = new HashMap<>();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                hn hnVarHnj = hnj(jSONArray.getJSONObject(i10));
                if (hnVarHnj != null) {
                    map.put(hnVarHnj.hnj, hnVarHnj);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }

    public static void hnj(boolean z10) {
        File fileHn = hn();
        if (fileHn.exists()) {
            try {
                HashMap<String, hn> mapHn = hn(new JSONArray(new String(com.bytedance.sdk.component.utils.dse.gjv(fileHn))));
                if (mapHn.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, hn> entry : mapHn.entrySet()) {
                    hnj.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    private static File hn() {
        return com.bytedance.sdk.component.utils.dse.hnj(oj.hnj(), oj.hnj().getFilesDir(), "tt_ads_conf_sr");
    }

    private static hn hn(String str) {
        return new hn(str, 1);
    }

    private static hn hnj(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new hn(jSONObject);
    }

    public static hn hnj(String str) {
        hn hnVar = hnj.get(str);
        return hnVar == null ? hn(str) : hnVar;
    }

    public static void hnj(JSONArray jSONArray) throws Throwable {
        if (jSONArray == null) {
            return;
        }
        File fileHn = hn();
        File file = new File(fileHn.getParent(), fileHn.getName() + ".tmp");
        FileWriter fileWriter = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                FileWriter fileWriter2 = new FileWriter(file);
                try {
                    fileWriter2.write(jSONArray.toString());
                    file.renameTo(fileHn);
                    if (file.exists()) {
                        file.delete();
                    }
                    orl.hnj(fileWriter2);
                } catch (Exception e10) {
                    e = e10;
                    fileWriter = fileWriter2;
                    Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
                    if (file.exists()) {
                        file.delete();
                    }
                    orl.hnj(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter = fileWriter2;
                    if (file.exists()) {
                        file.delete();
                    }
                    orl.hnj(fileWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e11) {
            e = e11;
        }
        HashMap<String, hn> mapHn = hn(jSONArray);
        if (mapHn.isEmpty()) {
            return;
        }
        for (Map.Entry<String, hn> entry : mapHn.entrySet()) {
            hnj.put(entry.getKey(), entry.getValue());
        }
    }

    public static void hnj() {
        File fileHn = hn();
        if (fileHn.exists()) {
            fileHn.delete();
        }
    }
}
