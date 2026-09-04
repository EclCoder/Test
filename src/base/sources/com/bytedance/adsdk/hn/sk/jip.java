package com.bytedance.adsdk.hn.sk;

import android.graphics.Path;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class jip {
    static com.bytedance.adsdk.hn.qor.hn.sk hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hn.dse dseVar2 = null;
        com.bytedance.adsdk.hn.qor.hnj.qor qorVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVarQor = null;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVarQor2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int iNextInt = -1;
            switch (strNextName) {
                case "e":
                    dklVarQor2 = gjv.qor(jsonReader, dseVar);
                    break;
                case "g":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            qorVarHnj = gjv.hnj(jsonReader, dseVar, iNextInt);
                        } else if (strNextName2.equals(TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "o":
                    gjvVar = gjv.hn(jsonReader, dseVar);
                    break;
                case "r":
                    fillType = jsonReader.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case "s":
                    dklVarQor = gjv.qor(jsonReader, dseVar);
                    break;
                case "t":
                    dseVar2 = jsonReader.nextInt() == 1 ? com.bytedance.adsdk.hn.qor.hn.dse.LINEAR : com.bytedance.adsdk.hn.qor.hn.dse.RADIAL;
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
        if (gjvVar == null) {
            gjvVar = new com.bytedance.adsdk.hn.qor.hnj.gjv(Collections.singletonList(new com.bytedance.adsdk.hn.dse.hnj(100)));
        }
        return new com.bytedance.adsdk.hn.qor.hn.sk(strNextString, dseVar2, fillType, qorVarHnj, gjvVar, dklVarQor, dklVarQor2, null, null, zNextBoolean);
    }
}
