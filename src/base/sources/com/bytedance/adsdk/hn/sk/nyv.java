package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class nyv {
    static com.bytedance.adsdk.hn.qor.hn.dnm hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVarHn = null;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVarQor = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "p":
                    orlVarHn = hnj.hn(jsonReader, dseVar);
                    break;
                case "r":
                    hnVarHnj = gjv.hnj(jsonReader, dseVar);
                    break;
                case "s":
                    dklVarQor = gjv.qor(jsonReader, dseVar);
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
        return new com.bytedance.adsdk.hn.qor.hn.dnm(strNextString, orlVarHn, dklVarQor, hnVarHnj, zNextBoolean);
    }
}
