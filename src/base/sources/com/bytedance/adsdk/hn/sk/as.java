package com.bytedance.adsdk.hn.sk;

import android.graphics.Rect;
import android.util.JsonReader;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class as {
    private static List<com.bytedance.adsdk.hn.ta.hnj> gjv(JsonReader jsonReader) {
        try {
            ArrayList arrayList = new ArrayList();
            while (jsonReader.hasNext()) {
                com.bytedance.adsdk.hn.ta.hnj hnjVar = new com.bytedance.adsdk.hn.ta.hnj();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 99) {
                        if (iHashCode != 102) {
                            if (iHashCode != 108) {
                                if (iHashCode != 115) {
                                    if (iHashCode != 3153) {
                                        if (iHashCode != 3449) {
                                            if (iHashCode == 96670 && strNextName.equals("ali")) {
                                                hnjVar.dse = jsonReader.nextString();
                                            } else {
                                                jsonReader.skipValue();
                                            }
                                        } else if (strNextName.equals("le")) {
                                            hnjVar.f12138hn = jsonReader.nextInt();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("bs")) {
                                        hnjVar.dkl = jsonReader.nextInt();
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("s")) {
                                    hnjVar.f12139sk = jsonReader.nextInt();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("l")) {
                                hnjVar.hnj = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("f")) {
                            hnjVar.gjv = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("c")) {
                        hnjVar.qor = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                arrayList.add(hnjVar);
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    private static void hn(JsonReader jsonReader, com.bytedance.adsdk.hn.dse.hnj hnjVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 3276) {
                        if (iHashCode == 107027 && strNextName.equals("lel")) {
                            hnjVar.dse = qor(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("fr")) {
                        hnjVar.f11942sk = jsonReader.nextInt();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    hnjVar.dkl = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
        }
    }

    public static com.bytedance.adsdk.hn.dse hnj(JsonReader jsonReader) throws IOException {
        float f10;
        float fHnj = com.bytedance.adsdk.hn.dkl.dkl.hnj();
        LongSparseArray<com.bytedance.adsdk.hn.qor.qor.sk> longSparseArray = new LongSparseArray<>();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        SparseArray<com.bytedance.adsdk.hn.qor.gjv> sparseArray = new SparseArray<>();
        com.bytedance.adsdk.hn.dse.qor qorVar = new com.bytedance.adsdk.hn.dse.qor();
        com.bytedance.adsdk.hn.dse.hnj hnjVar = new com.bytedance.adsdk.hn.dse.hnj();
        com.bytedance.adsdk.hn.dse.hn hnVar = new com.bytedance.adsdk.hn.dse.hn();
        com.bytedance.adsdk.hn.dse dseVar = new com.bytedance.adsdk.hn.dse();
        jsonReader.beginObject();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        String strNextString = null;
        int iNextInt = 0;
        int iNextInt2 = 0;
        float fNextDouble3 = 0.0f;
        while (jsonReader.hasNext()) {
            float f11 = fNextDouble;
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case -1408207997:
                    f10 = fNextDouble3;
                    if (strNextName.equals("assets")) {
                        b10 = 0;
                    }
                    break;
                case -1109732030:
                    f10 = fNextDouble3;
                    if (strNextName.equals("layers")) {
                        b10 = 1;
                    }
                    break;
                case -865448777:
                    f10 = fNextDouble3;
                    if (strNextName.equals("globalEvent")) {
                        b10 = 2;
                    }
                    break;
                case 104:
                    f10 = fNextDouble3;
                    if (strNextName.equals("h")) {
                        b10 = 3;
                    }
                    break;
                case PROTOBUF_SERIALIZATION_ERROR_VALUE:
                    f10 = fNextDouble3;
                    if (strNextName.equals("v")) {
                        b10 = 4;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    f10 = fNextDouble3;
                    if (strNextName.equals("w")) {
                        b10 = 5;
                    }
                    break;
                case 3208:
                    f10 = fNextDouble3;
                    if (strNextName.equals("dl")) {
                        b10 = 6;
                    }
                    break;
                case 3276:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fr")) {
                        b10 = 7;
                    }
                    break;
                case 3292:
                    f10 = fNextDouble3;
                    if (strNextName.equals("gc")) {
                        b10 = 8;
                    }
                    break;
                case 3367:
                    f10 = fNextDouble3;
                    if (strNextName.equals("ip")) {
                        b10 = 9;
                    }
                    break;
                case 3553:
                    f10 = fNextDouble3;
                    if (strNextName.equals("op")) {
                        b10 = 10;
                    }
                    break;
                case 94623709:
                    f10 = fNextDouble3;
                    if (strNextName.equals("chars")) {
                        b10 = 11;
                    }
                    break;
                case 97615364:
                    f10 = fNextDouble3;
                    if (strNextName.equals("fonts")) {
                        b10 = 12;
                    }
                    break;
                case 110364485:
                    f10 = fNextDouble3;
                    if (strNextName.equals("timer")) {
                        b10 = 13;
                    }
                    break;
                case 839250809:
                    f10 = fNextDouble3;
                    if (strNextName.equals("markers")) {
                        b10 = 14;
                    }
                    break;
                default:
                    f10 = fNextDouble3;
                    break;
            }
            switch (b10) {
                case 0:
                    hnj(jsonReader, dseVar, map, map2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 1:
                    hnj(jsonReader, dseVar, arrayList, longSparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 2:
                    hnj(jsonReader, hnVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 3:
                    iNextInt = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 4:
                    String[] strArrSplit = jsonReader.nextString().split("\\.");
                    if (!com.bytedance.adsdk.hn.dkl.dkl.hnj(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        dseVar.hnj("Lottie only supports bodymovin >= 4.4.0");
                    }
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 5:
                    iNextInt2 = jsonReader.nextInt();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 7:
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 8:
                    hnj(jsonReader, hnjVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 9:
                    fNextDouble = (float) jsonReader.nextDouble();
                    fNextDouble3 = f10;
                    break;
                case 10:
                    fNextDouble3 = ((float) jsonReader.nextDouble()) - 0.01f;
                    fNextDouble = f11;
                    break;
                case 11:
                    hnj(jsonReader, dseVar, sparseArray);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 12:
                    hnj(jsonReader, map3);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 13:
                    hnj(jsonReader, qorVar);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                case 14:
                    hnj(jsonReader, arrayList2);
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
                default:
                    jsonReader.skipValue();
                    fNextDouble = f11;
                    fNextDouble3 = f10;
                    break;
            }
        }
        jsonReader.endObject();
        dseVar.hnj(new Rect(0, 0, (int) (iNextInt2 * fHnj), (int) (iNextInt * fHnj)), fNextDouble, fNextDouble3, fNextDouble2, arrayList, longSparseArray, map, map2, sparseArray, map3, arrayList2, qorVar, strNextString, hnjVar, hnVar);
        return dseVar;
    }

    private static JSONArray qor(JsonReader jsonReader) {
        JSONArray jSONArray = new JSONArray();
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                JSONObject jSONObject = new JSONObject();
                jSONArray.put(jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName = jsonReader.nextName();
                    int iHashCode = strNextName.hashCode();
                    if (iHashCode != 3324) {
                        if (iHashCode == 116753 && strNextName.equals("vid")) {
                            try {
                                jSONObject.put("vid", jsonReader.nextString());
                            } catch (JSONException unused) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("hd")) {
                        jSONObject.put("hd", jsonReader.nextInt());
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        } catch (Exception unused2) {
        }
        return jSONArray;
    }

    private static Map<String, Object> hn(JsonReader jsonReader) throws IOException {
        HashMap map = new HashMap();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("lel")) {
                map.put("lel", qor(jsonReader));
            } else if (!strNextName.equals("lottie_back")) {
                jsonReader.skipValue();
            } else {
                JSONObject jSONObject = new JSONObject();
                map.put("lottie_back", jSONObject);
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    if (!strNextName2.equals("hd")) {
                        jsonReader.skipValue();
                    } else {
                        try {
                            jSONObject.putOpt("hd", Integer.valueOf(jsonReader.nextInt()));
                            jSONObject.putOpt("vid", "lottie_back");
                        } catch (JSONException unused) {
                        }
                    }
                }
                jsonReader.endObject();
            }
        }
        jsonReader.endObject();
        Object objRemove = map.remove("lottie_back");
        if (objRemove instanceof JSONObject) {
            Object obj = map.get("lel");
            if (obj instanceof JSONArray) {
                ((JSONArray) obj).put(objRemove);
            } else {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(objRemove);
                map.put("lel", jSONArray);
            }
        }
        return map;
    }

    private static void hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse.hn hnVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3239) {
                    if (iHashCode != 107027) {
                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                            hnVar.f11940hn = new int[][]{new int[]{-1, -1}};
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                jsonReader.beginArray();
                                for (int i10 = 0; i10 < 2; i10++) {
                                    if (jsonReader.hasNext()) {
                                        hnVar.f11940hn[0][i10] = jsonReader.nextInt();
                                    }
                                }
                                jsonReader.endArray();
                            }
                            jsonReader.endArray();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("lel")) {
                        hnVar.qor = qor(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("el")) {
                    hnVar.hnj = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse.hnj hnjVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3139) {
                    if (iHashCode != 3232) {
                        if (iHashCode != 3571) {
                            if (iHashCode != 3666) {
                                if (iHashCode == 98713 && strNextName.equals("cpf")) {
                                    hn(jsonReader, hnjVar);
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("se")) {
                                hnjVar.hnj = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("pc")) {
                            hnjVar.gjv = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("ee")) {
                        hnjVar.qor = hn(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("be")) {
                    hnjVar.f11941hn = hn(jsonReader);
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse.qor qorVar) {
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                int iHashCode = strNextName.hashCode();
                if (iHashCode != 3123) {
                    if (iHashCode != 3239) {
                        if (iHashCode != 3355) {
                            if (iHashCode != 3418) {
                                if (iHashCode != 3704) {
                                    if (iHashCode != 107027) {
                                        if (iHashCode == 3237004 && strNextName.equals("inel")) {
                                            qorVar.f11944sk = new int[]{-1, -1};
                                            jsonReader.beginArray();
                                            for (int i10 = 0; i10 < 2; i10++) {
                                                if (jsonReader.hasNext()) {
                                                    qorVar.f11944sk[i10] = jsonReader.nextInt();
                                                }
                                            }
                                            jsonReader.endArray();
                                        } else {
                                            jsonReader.skipValue();
                                        }
                                    } else if (strNextName.equals("lel")) {
                                        qorVar.dse = qor(jsonReader);
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                } else if (strNextName.equals("tl")) {
                                    qorVar.qor = jsonReader.nextString();
                                } else {
                                    jsonReader.skipValue();
                                }
                            } else if (strNextName.equals("ke")) {
                                qorVar.hnj = jsonReader.nextInt();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if (strNextName.equals("id")) {
                            qorVar.f11943hn = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (strNextName.equals("el")) {
                        qorVar.dkl = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (strNextName.equals("at")) {
                    qorVar.gjv = jsonReader.nextString();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
        } catch (Exception unused) {
        }
    }

    private static void hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, List<com.bytedance.adsdk.hn.qor.qor.sk> list, LongSparseArray<com.bytedance.adsdk.hn.qor.qor.sk> longSparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.hn.qor.qor.sk skVarHnj = wu.hnj(jsonReader, dseVar);
            skVarHnj.dnm();
            com.bytedance.adsdk.hn.qor.qor.sk.hnj hnjVar = com.bytedance.adsdk.hn.qor.qor.sk.hnj.PRE_COMP;
            list.add(skVarHnj);
            longSparseArray.put(skVarHnj.sk(), skVarHnj);
        }
        jsonReader.endArray();
    }

    private static void hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, Map<String, List<com.bytedance.adsdk.hn.qor.qor.sk>> map, Map<String, com.bytedance.adsdk.hn.ta> map2) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            ArrayList arrayList = new ArrayList();
            LongSparseArray longSparseArray = new LongSparseArray();
            jsonReader.beginObject();
            String strNextString = null;
            String strNextString2 = null;
            String strNextString3 = null;
            String strNextString4 = null;
            List<com.bytedance.adsdk.hn.ta.hnj> listGjv = null;
            String strNextString5 = null;
            int[][] iArr = null;
            JSONArray jSONArrayQor = null;
            int iNextInt = 0;
            int iNextInt2 = 0;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "layers":
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.hn.qor.qor.sk skVarHnj = wu.hnj(jsonReader, dseVar);
                            longSparseArray.put(skVarHnj.sk(), skVarHnj);
                            arrayList.add(skVarHnj);
                        }
                        jsonReader.endArray();
                        break;
                    case "h":
                        iNextInt2 = jsonReader.nextInt();
                        break;
                    case "p":
                        strNextString2 = jsonReader.nextString();
                        break;
                    case "u":
                        strNextString3 = jsonReader.nextString();
                        break;
                    case "w":
                        iNextInt = jsonReader.nextInt();
                        break;
                    case "el":
                        strNextString5 = jsonReader.nextString();
                        break;
                    case "id":
                        strNextString = jsonReader.nextString();
                        break;
                    case "tc":
                        jsonReader.beginArray();
                        listGjv = gjv(jsonReader);
                        jsonReader.endArray();
                        break;
                    case "lel":
                        jSONArrayQor = qor(jsonReader);
                        break;
                    case "rel":
                        strNextString4 = jsonReader.nextString();
                        break;
                    case "inel":
                        iArr = new int[][]{new int[]{-1, -1}};
                        jsonReader.beginArray();
                        if (jsonReader.hasNext()) {
                            jsonReader.beginArray();
                            for (int i10 = 0; i10 < 2; i10++) {
                                if (jsonReader.hasNext()) {
                                    iArr[0][i10] = jsonReader.nextInt();
                                }
                            }
                            jsonReader.endArray();
                        }
                        jsonReader.endArray();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            if (strNextString2 != null) {
                com.bytedance.adsdk.hn.ta taVar = new com.bytedance.adsdk.hn.ta(iNextInt, iNextInt2, strNextString, strNextString2, strNextString3, strNextString4, listGjv, strNextString5, iArr, jSONArrayQor);
                map2.put(taVar.aq(), taVar);
            } else {
                map.put(strNextString, arrayList);
            }
        }
        jsonReader.endArray();
    }

    private static void hnj(JsonReader jsonReader, Map<String, com.bytedance.adsdk.hn.qor.qor> map) throws IOException {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals("list")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    com.bytedance.adsdk.hn.qor.qor qorVarHnj = mjg.hnj(jsonReader);
                    map.put(qorVarHnj.hn(), qorVarHnj);
                }
                jsonReader.endArray();
            }
        }
        jsonReader.endObject();
    }

    private static void hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, SparseArray<com.bytedance.adsdk.hn.qor.gjv> sparseArray) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.bytedance.adsdk.hn.qor.gjv gjvVarHnj = orl.hnj(jsonReader, dseVar);
            sparseArray.put(gjvVarHnj.hashCode(), gjvVarHnj);
        }
        jsonReader.endArray();
    }

    private static void hnj(JsonReader jsonReader, List<com.bytedance.adsdk.hn.qor.dkl> list) throws IOException {
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            float fNextDouble = 0.0f;
            String strNextString = null;
            float fNextDouble2 = 0.0f;
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "cm":
                        strNextString = jsonReader.nextString();
                        break;
                    case "dr":
                        fNextDouble2 = (float) jsonReader.nextDouble();
                        break;
                    case "tm":
                        fNextDouble = (float) jsonReader.nextDouble();
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
            list.add(new com.bytedance.adsdk.hn.qor.dkl(strNextString, fNextDouble, fNextDouble2));
        }
        jsonReader.endArray();
    }
}
