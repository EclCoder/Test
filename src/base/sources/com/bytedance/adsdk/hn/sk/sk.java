package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class sk {
    private static com.bytedance.adsdk.hn.qor.hn.hnj hn(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.hn.hnj hnjVar = null;
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!jsonReader.hasNext()) {
                    jsonReader.endObject();
                    return hnjVar;
                }
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                if (strNextName.equals("v")) {
                    if (z10) {
                        hnjVar = new com.bytedance.adsdk.hn.qor.hn.hnj(gjv.hnj(jsonReader, dseVar));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (!strNextName.equals("ty")) {
                    jsonReader.skipValue();
                } else if (jsonReader.nextInt() == 0) {
                    z10 = true;
                }
            }
        }
    }

    static com.bytedance.adsdk.hn.qor.hn.hnj hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        com.bytedance.adsdk.hn.qor.hn.hnj hnjVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.hn.qor.hn.hnj hnjVarHn = hn(jsonReader, dseVar);
                    if (hnjVarHn != null) {
                        hnjVar = hnjVarHn;
                    }
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        return hnjVar;
    }
}
