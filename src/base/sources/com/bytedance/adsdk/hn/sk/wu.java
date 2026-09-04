package com.bytedance.adsdk.hn.sk;

import android.graphics.Color;
import android.graphics.Rect;
import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class wu {

    /* JADX INFO: renamed from: com.bytedance.adsdk.hn.sk.wu$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] hnj;

        static {
            int[] iArr = new int[com.bytedance.adsdk.hn.qor.qor.sk.hn.values().length];
            hnj = iArr;
            try {
                iArr[com.bytedance.adsdk.hn.qor.qor.sk.hn.LUMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                hnj[com.bytedance.adsdk.hn.qor.qor.sk.hn.LUMA_INVERTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static com.bytedance.adsdk.hn.qor.qor.sk hnj(com.bytedance.adsdk.hn.dse dseVar) {
        Rect rectGjv = dseVar.gjv();
        List list = Collections.EMPTY_LIST;
        return new com.bytedance.adsdk.hn.qor.qor.sk(list, dseVar, "__container", -1L, com.bytedance.adsdk.hn.qor.qor.sk.hnj.PRE_COMP, -1L, null, list, new com.bytedance.adsdk.hn.qor.hnj.bug(), 0, 0, 0, 0.0f, 0.0f, rectGjv.width(), rectGjv.height(), null, null, list, com.bytedance.adsdk.hn.qor.qor.sk.hn.NONE, null, false, null, null);
    }

    public static com.bytedance.adsdk.hn.qor.qor.sk hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) {
        Float fValueOf = Float.valueOf(0.0f);
        Float fValueOf2 = Float.valueOf(1.0f);
        com.bytedance.adsdk.hn.qor.qor.sk.hn hnVar = com.bytedance.adsdk.hn.qor.qor.sk.hn.NONE;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.qor.sk.hn hnVar2 = hnVar;
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hnj.bug bugVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.ta taVarDkl = null;
        com.bytedance.adsdk.hn.qor.hnj.dnm dnmVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        com.bytedance.adsdk.hn.qor.hn.hnj hnjVarHnj = null;
        ta taVarHnj = null;
        float fNextDouble = 0.0f;
        float fDse = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        long jNextInt = 0;
        long jNextInt2 = -1;
        int iNextInt = 0;
        int iNextInt2 = 0;
        int color = 0;
        boolean zNextBoolean = false;
        float fNextDouble5 = 1.0f;
        String strNextString2 = "UNSET";
        String strNextString3 = null;
        com.bytedance.adsdk.hn.qor.qor.sk.hnj hnjVar = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "parent":
                    jNextInt2 = jsonReader.nextInt();
                    break;
                case "shapes":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        com.bytedance.adsdk.hn.qor.hn.qor qorVarHnj = aq.hnj(jsonReader, dseVar);
                        if (qorVarHnj != null) {
                            arrayList2.add(qorVarHnj);
                        }
                    }
                    jsonReader.endArray();
                    break;
                case "h":
                    fNextDouble3 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.hn.dkl.dkl.hnj()));
                    break;
                case "t":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("a")) {
                            jsonReader.beginArray();
                            if (jsonReader.hasNext()) {
                                dnmVarHnj = hn.hnj(jsonReader, dseVar);
                            }
                            while (jsonReader.hasNext()) {
                                jsonReader.skipValue();
                            }
                            jsonReader.endArray();
                        } else if (!strNextName2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                            jsonReader.skipValue();
                        } else {
                            taVarDkl = gjv.dkl(jsonReader, dseVar);
                        }
                    }
                    jsonReader.endObject();
                    break;
                case "w":
                    fNextDouble2 = (float) (jsonReader.nextDouble() * ((double) com.bytedance.adsdk.hn.dkl.dkl.hnj()));
                    break;
                case "cl":
                    strNextString3 = jsonReader.nextString();
                    break;
                case "ef":
                    jsonReader.beginArray();
                    ArrayList arrayList3 = new ArrayList();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName3 = jsonReader.nextName();
                            strNextName3.getClass();
                            if (strNextName3.equals("nm")) {
                                arrayList3.add(jsonReader.nextString());
                            } else if (!strNextName3.equals("ty")) {
                                jsonReader.skipValue();
                            } else {
                                int iNextInt3 = jsonReader.nextInt();
                                if (iNextInt3 == 29) {
                                    hnjVarHnj = sk.hnj(jsonReader, dseVar);
                                } else if (iNextInt3 == 25) {
                                    taVarHnj = new dnm().hnj(jsonReader, dseVar);
                                }
                            }
                        }
                        jsonReader.endObject();
                    }
                    jsonReader.endArray();
                    dseVar.hnj("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ".concat(String.valueOf(arrayList3)));
                    break;
                case "hd":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ip":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "ks":
                    bugVarHnj = qor.hnj(jsonReader, dseVar);
                    break;
                case "nm":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "op":
                    fDse = (float) jsonReader.nextDouble();
                    break;
                case "sc":
                    color = Color.parseColor(jsonReader.nextString());
                    break;
                case "sh":
                    iNextInt2 = (int) (jsonReader.nextInt() * com.bytedance.adsdk.hn.dkl.dkl.hnj());
                    break;
                case "sr":
                    fNextDouble5 = (float) jsonReader.nextDouble();
                    break;
                case "st":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sw":
                    iNextInt = (int) (jsonReader.nextInt() * com.bytedance.adsdk.hn.dkl.dkl.hnj());
                    break;
                case "tm":
                    hnVarHnj = gjv.hnj(jsonReader, dseVar, false);
                    break;
                case "tt":
                    int iNextInt4 = jsonReader.nextInt();
                    if (iNextInt4 >= com.bytedance.adsdk.hn.qor.qor.sk.hn.values().length) {
                        dseVar.hnj("Unsupported matte type: ".concat(String.valueOf(iNextInt4)));
                        break;
                    } else {
                        hnVar2 = com.bytedance.adsdk.hn.qor.qor.sk.hn.values()[iNextInt4];
                        int i10 = AnonymousClass1.hnj[hnVar2.ordinal()];
                        if (i10 == 1) {
                            dseVar.hnj("Unsupported matte type: Luma");
                        } else if (i10 == 2) {
                            dseVar.hnj("Unsupported matte type: Luma Inverted");
                        }
                        dseVar.hnj(1);
                        break;
                    }
                    break;
                case "ty":
                    int iNextInt5 = jsonReader.nextInt();
                    hnjVar = com.bytedance.adsdk.hn.qor.qor.sk.hnj.UNKNOWN;
                    if (iNextInt5 >= hnjVar.ordinal()) {
                        break;
                    } else {
                        hnjVar = com.bytedance.adsdk.hn.qor.qor.sk.hnj.values()[iNextInt5];
                        break;
                    }
                    break;
                case "ind":
                    jNextInt = jsonReader.nextInt();
                    break;
                case "refId":
                    strNextString = jsonReader.nextString();
                    break;
                case "masksProperties":
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        arrayList.add(Cdo.hnj(jsonReader, dseVar));
                    }
                    dseVar.hnj(arrayList.size());
                    jsonReader.endArray();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        ArrayList arrayList4 = new ArrayList();
        if (fNextDouble > 0.0f) {
            arrayList4.add(new com.bytedance.adsdk.hn.dse.hnj(dseVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(fNextDouble)));
        }
        if (fDse <= 0.0f) {
            fDse = dseVar.dse();
        }
        arrayList4.add(new com.bytedance.adsdk.hn.dse.hnj(dseVar, fValueOf2, fValueOf2, null, fNextDouble, Float.valueOf(fDse)));
        arrayList4.add(new com.bytedance.adsdk.hn.dse.hnj(dseVar, fValueOf, fValueOf, null, fDse, Float.valueOf(Float.MAX_VALUE)));
        if (strNextString2.endsWith(".ai") || "ai".equals(strNextString3)) {
            dseVar.hnj("Convert your Illustrator layers to shape layers.");
        }
        return new com.bytedance.adsdk.hn.qor.qor.sk(arrayList2, dseVar, strNextString2, jNextInt, hnjVar, jNextInt2, strNextString, arrayList, bugVarHnj, iNextInt, iNextInt2, color, fNextDouble5, fNextDouble4, fNextDouble2, fNextDouble3, taVarDkl, dnmVarHnj, arrayList4, hnVar2, hnVarHnj, zNextBoolean, hnjVarHnj, taVarHnj);
    }
}
