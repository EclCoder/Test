package com.bytedance.adsdk.hn.sk;

import android.graphics.Path;
import android.util.JsonReader;
import java.io.IOException;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class fvt {
    static com.bytedance.adsdk.hn.qor.hn.fc hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar = null;
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVarDse = null;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        int iNextInt = 1;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "fillEnabled":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "c":
                    hnjVarDse = gjv.dse(jsonReader, dseVar);
                    break;
                case "o":
                    gjvVar = gjv.hn(jsonReader, dseVar);
                    break;
                case "r":
                    iNextInt = jsonReader.nextInt();
                    break;
                case "hd":
                    zNextBoolean2 = jsonReader.nextBoolean();
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
        return new com.bytedance.adsdk.hn.qor.hn.fc(strNextString, zNextBoolean, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, hnjVarDse, gjvVar, zNextBoolean2);
    }
}
