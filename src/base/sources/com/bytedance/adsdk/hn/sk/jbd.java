package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class jbd {
    static com.bytedance.adsdk.hn.qor.hn.oj hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        int i10;
        ArrayList arrayList = new ArrayList();
        float fNextDouble = 0.0f;
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar = null;
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar = null;
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVarDse = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        com.bytedance.adsdk.hn.qor.hn.oj.hnj hnjVar = null;
        com.bytedance.adsdk.hn.qor.hn.oj.hn hnVar2 = null;
        boolean zNextBoolean = false;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i11 = 1;
            switch (strNextName) {
                case "c":
                    hnjVarDse = gjv.dse(jsonReader, dseVar);
                    continue;
                    break;
                case "d":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        String strNextString2 = null;
                        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj2 = null;
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                hnVarHnj2 = gjv.hnj(jsonReader, dseVar);
                            } else {
                                jsonReader.skipValue();
                            }
                        }
                        jsonReader.endObject();
                        strNextString2.getClass();
                        switch (strNextString2) {
                            case "d":
                            case "g":
                                i10 = 1;
                                dseVar.hnj(true);
                                arrayList.add(hnVarHnj2);
                                i11 = i10;
                                break;
                            case "o":
                                hnVar = hnVarHnj2;
                                i11 = 1;
                                break;
                            default:
                                i10 = 1;
                                i11 = i10;
                                break;
                        }
                    }
                    int i12 = i11;
                    jsonReader.endArray();
                    if (arrayList.size() != i12) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                    }
                    break;
                case "o":
                    gjvVar = gjv.hn(jsonReader, dseVar);
                    continue;
                    break;
                case "w":
                    hnVarHnj = gjv.hnj(jsonReader, dseVar);
                    continue;
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    continue;
                    break;
                case "lc":
                    hnjVar = com.bytedance.adsdk.hn.qor.hn.oj.hnj.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "lj":
                    hnVar2 = com.bytedance.adsdk.hn.qor.hn.oj.hn.values()[jsonReader.nextInt() - 1];
                    continue;
                    break;
                case "ml":
                    fNextDouble = (float) jsonReader.nextDouble();
                    continue;
                    break;
                case "nm":
                    strNextString = jsonReader.nextString();
                    continue;
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (gjvVar == null) {
            gjvVar = new com.bytedance.adsdk.hn.qor.hnj.gjv(Collections.singletonList(new com.bytedance.adsdk.hn.dse.hnj(100)));
        }
        return new com.bytedance.adsdk.hn.qor.hn.oj(strNextString, hnVar, arrayList, hnjVarDse, gjvVar, hnVarHnj, hnjVar, hnVar2, fNextDouble, zNextBoolean);
    }
}
