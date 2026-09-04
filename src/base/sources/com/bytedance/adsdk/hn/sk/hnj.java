package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class hnj {
    static com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> hn(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) {
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.hnj.sk skVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj2 = null;
        boolean z10 = false;
        while (jsonReader.peek() != JsonToken.END_OBJECT) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "k":
                    skVarHnj = hnj(jsonReader, dseVar);
                    break;
                case "x":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        hnVarHnj = gjv.hnj(jsonReader, dseVar);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                case "y":
                    if (jsonReader.peek() != JsonToken.STRING) {
                        hnVarHnj2 = gjv.hnj(jsonReader, dseVar);
                        break;
                    } else {
                        z10 = true;
                        jsonReader.skipValue();
                        break;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        if (z10) {
            dseVar.hnj("Lottie doesn't support expressions.");
        }
        return skVarHnj != null ? skVarHnj : new com.bytedance.adsdk.hn.qor.hnj.ojm(hnVarHnj, hnVarHnj2);
    }

    public static com.bytedance.adsdk.hn.qor.hnj.sk hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                arrayList.add(tgn.hnj(jsonReader, dseVar));
            }
            jsonReader.endArray();
            eum.hnj(arrayList);
        } else {
            arrayList.add(new com.bytedance.adsdk.hn.dse.hnj(xn.hn(jsonReader, com.bytedance.adsdk.hn.dkl.dkl.hnj())));
        }
        return new com.bytedance.adsdk.hn.qor.hnj.sk(arrayList);
    }
}
