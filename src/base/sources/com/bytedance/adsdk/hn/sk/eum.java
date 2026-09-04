package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class eum {
    static <T> List<com.bytedance.adsdk.hn.dse.hnj<T>> hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, float f10, xad<T> xadVar, boolean z10) throws IOException {
        JsonReader jsonReader2;
        com.bytedance.adsdk.hn.dse dseVar2;
        float f11;
        xad<T> xadVar2;
        boolean z11;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            dseVar.hnj("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(CampaignEx.JSON_KEY_AD_K)) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    JsonReader jsonReader3 = jsonReader;
                    com.bytedance.adsdk.hn.dse dseVar3 = dseVar;
                    float f12 = f10;
                    xad<T> xadVar3 = xadVar;
                    boolean z12 = z10;
                    com.bytedance.adsdk.hn.dse.hnj hnjVarHnj = apu.hnj(jsonReader3, dseVar3, f12, xadVar3, false, z12);
                    jsonReader2 = jsonReader3;
                    dseVar2 = dseVar3;
                    f11 = f12;
                    xadVar2 = xadVar3;
                    z11 = z12;
                    arrayList.add(hnjVarHnj);
                } else {
                    jsonReader2 = jsonReader;
                    dseVar2 = dseVar;
                    f11 = f10;
                    xadVar2 = xadVar;
                    z11 = z10;
                    while (jsonReader2.hasNext()) {
                        arrayList.add(apu.hnj(jsonReader2, dseVar2, f11, xadVar2, true, z11));
                    }
                }
                jsonReader2.endArray();
                jsonReader = jsonReader2;
                dseVar = dseVar2;
                f10 = f11;
                xadVar = xadVar2;
                z10 = z11;
            } else {
                JsonReader jsonReader4 = jsonReader;
                arrayList.add(apu.hnj(jsonReader4, dseVar, f10, xadVar, false, z10));
                jsonReader = jsonReader4;
            }
        }
        jsonReader.endObject();
        hnj(arrayList);
        return arrayList;
    }

    public static <T> void hnj(List<? extends com.bytedance.adsdk.hn.dse.hnj<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            com.bytedance.adsdk.hn.dse.hnj<T> hnjVar = list.get(i11);
            i11++;
            com.bytedance.adsdk.hn.dse.hnj<T> hnjVar2 = list.get(i11);
            hnjVar.dse = Float.valueOf(hnjVar2.dkl);
            if (hnjVar.f11946hn == null && (t10 = hnjVar2.hnj) != null) {
                hnjVar.f11946hn = t10;
                if (hnjVar instanceof com.bytedance.adsdk.hn.hnj.hn.ojm) {
                    ((com.bytedance.adsdk.hn.hnj.hn.ojm) hnjVar).hnj();
                }
            }
        }
        com.bytedance.adsdk.hn.dse.hnj<T> hnjVar3 = list.get(i10);
        if ((hnjVar3.hnj == null || hnjVar3.f11946hn == null) && list.size() > 1) {
            list.remove(hnjVar3);
        }
    }
}
