package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: renamed from: com.bytedance.adsdk.hn.sk.do, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class Cdo {
    static com.bytedance.adsdk.hn.qor.hn.aq hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.hn.aq.hnj hnjVar = null;
        com.bytedance.adsdk.hn.qor.hnj.aq aqVarSk = null;
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVarHn = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "o":
                    gjvVarHn = gjv.hn(jsonReader, dseVar);
                    break;
                case "pt":
                    aqVarSk = gjv.sk(jsonReader, dseVar);
                    break;
                case "inv":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "mode":
                    String strNextString = jsonReader.nextString();
                    strNextString.getClass();
                    switch (strNextString) {
                        case "a":
                            hnjVar = com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_ADD;
                            break;
                        case "i":
                            dseVar.hnj("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            hnjVar = com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            hnjVar = com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_NONE;
                            break;
                        case "s":
                            hnjVar = com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            hnjVar = com.bytedance.adsdk.hn.qor.hn.aq.hnj.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.hn.qor.hn.aq(hnjVar, aqVarSk, gjvVarHn, zNextBoolean);
    }
}
