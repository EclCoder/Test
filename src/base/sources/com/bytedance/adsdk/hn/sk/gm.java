package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class gm {
    static com.bytedance.adsdk.hn.qor.hn.orl hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "r":
                    hnVarHnj = gjv.hnj(jsonReader, dseVar, true);
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (zNextBoolean) {
            return null;
        }
        return new com.bytedance.adsdk.hn.qor.hn.orl(strNextString, hnVarHnj);
    }
}
