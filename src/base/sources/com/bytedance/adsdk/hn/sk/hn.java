package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hn {
    private static com.bytedance.adsdk.hn.qor.hnj.dnm hn(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVarDse = null;
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVarDse2 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "t":
                    hnVarHnj2 = gjv.hnj(jsonReader, dseVar);
                    break;
                case "fc":
                    hnjVarDse = gjv.dse(jsonReader, dseVar);
                    break;
                case "sc":
                    hnjVarDse2 = gjv.dse(jsonReader, dseVar);
                    break;
                case "sw":
                    hnVarHnj = gjv.hnj(jsonReader, dseVar);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.hn.qor.hnj.dnm(hnjVarDse, hnjVarDse2, hnVarHnj, hnVarHnj2);
    }

    public static com.bytedance.adsdk.hn.qor.hnj.dnm hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.hnj.dnm dnmVarHn = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("a")) {
                dnmVarHn = hn(jsonReader, dseVar);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return dnmVarHn == null ? new com.bytedance.adsdk.hn.qor.hnj.dnm(null, null, null, null) : dnmVarHn;
    }
}
