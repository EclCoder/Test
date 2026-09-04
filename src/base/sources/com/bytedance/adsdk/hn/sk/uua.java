package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class uua {
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[PHI: r17
      0x00dd: PHI (r17v12 int) = 
      (r17v1 int)
      (r17v2 int)
      (r17v3 int)
      (r17v4 int)
      (r17v5 int)
      (r17v6 int)
      (r17v7 int)
      (r17v8 int)
      (r17v9 int)
      (r17v10 int)
      (r17v11 int)
      (r17v13 int)
     binds: [B:53:0x00db, B:49:0x00cf, B:45:0x00c2, B:41:0x00b7, B:37:0x00ac, B:33:0x009f, B:29:0x0092, B:25:0x0085, B:21:0x0075, B:17:0x0065, B:13:0x0055, B:9:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    static com.bytedance.adsdk.hn.qor.hn.dkl hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        int i10;
        byte b10;
        com.bytedance.adsdk.hn.qor.hnj.qor qorVar;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVar;
        ArrayList arrayList = new ArrayList();
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hn.dse dseVar2 = null;
        com.bytedance.adsdk.hn.qor.hnj.qor qorVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVarQor = null;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVarQor2 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        com.bytedance.adsdk.hn.qor.hn.oj.hnj hnjVar = null;
        com.bytedance.adsdk.hn.qor.hn.oj.hn hnVar = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar2 = null;
        float fNextDouble = 0.0f;
        boolean zNextBoolean = false;
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVarHn = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            String str = strNextString;
            com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar = gjvVarHn;
            com.bytedance.adsdk.hn.qor.hn.dse dseVar3 = dseVar2;
            switch (strNextName.hashCode()) {
                case 100:
                    i10 = 1;
                    if (!strNextName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                        b10 = -1;
                    } else {
                        b10 = 0;
                    }
                    break;
                case 101:
                    i10 = 1;
                    if (!strNextName.equals("e")) {
                        b10 = -1;
                    } else {
                        b10 = 1;
                    }
                    break;
                case 103:
                    i10 = 1;
                    if (!strNextName.equals("g")) {
                        b10 = -1;
                    } else {
                        b10 = 2;
                    }
                    break;
                case 111:
                    i10 = 1;
                    if (!strNextName.equals("o")) {
                        b10 = -1;
                    } else {
                        b10 = 3;
                    }
                    break;
                case INVALID_INDEX_URL_VALUE:
                    i10 = 1;
                    if (!strNextName.equals("s")) {
                        b10 = -1;
                    } else {
                        b10 = 4;
                    }
                    break;
                case GZIP_ENCODE_ERROR_VALUE:
                    i10 = 1;
                    if (!strNextName.equals("t")) {
                        b10 = -1;
                    } else {
                        b10 = 5;
                    }
                    break;
                case JSON_ENCODE_ERROR_VALUE:
                    i10 = 1;
                    if (!strNextName.equals("w")) {
                        b10 = -1;
                    } else {
                        b10 = 6;
                    }
                    break;
                case 3324:
                    i10 = 1;
                    if (!strNextName.equals("hd")) {
                        b10 = -1;
                    } else {
                        b10 = 7;
                    }
                    break;
                case 3447:
                    i10 = 1;
                    if (!strNextName.equals("lc")) {
                        b10 = -1;
                    } else {
                        b10 = 8;
                    }
                    break;
                case 3454:
                    i10 = 1;
                    if (!strNextName.equals("lj")) {
                        b10 = -1;
                    } else {
                        b10 = 9;
                    }
                    break;
                case 3487:
                    i10 = 1;
                    if (!strNextName.equals("ml")) {
                        b10 = -1;
                    } else {
                        b10 = 10;
                    }
                    break;
                case 3519:
                    i10 = 1;
                    if (!strNextName.equals("nm")) {
                        b10 = -1;
                    } else {
                        b10 = 11;
                    }
                    break;
                default:
                    b10 = -1;
                    i10 = 1;
                    break;
            }
            switch (b10) {
                case 0:
                    jsonReader = jsonReader;
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        jsonReader.beginObject();
                        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj2 = null;
                        String strNextString2 = null;
                        while (jsonReader.hasNext()) {
                            com.bytedance.adsdk.hn.qor.hnj.qor qorVar2 = qorVarHnj;
                            String strNextName2 = jsonReader.nextName();
                            strNextName2.getClass();
                            com.bytedance.adsdk.hn.qor.hnj.dkl dklVar2 = dklVarQor;
                            if (strNextName2.equals("n")) {
                                strNextString2 = jsonReader.nextString();
                            } else if (strNextName2.equals("v")) {
                                hnVarHnj2 = gjv.hnj(jsonReader, dseVar);
                            } else {
                                jsonReader.skipValue();
                            }
                            qorVarHnj = qorVar2;
                            dklVarQor = dklVar2;
                        }
                        qorVarHnj = qorVarHnj;
                        dklVarQor = dklVarQor;
                        jsonReader.endObject();
                        if (strNextString2.equals("o")) {
                            hnVar2 = hnVarHnj2;
                        } else if (strNextString2.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D) || strNextString2.equals("g")) {
                            dseVar.hnj(true);
                            arrayList.add(hnVarHnj2);
                        }
                    }
                    qorVar = qorVarHnj;
                    dklVar = dklVarQor;
                    jsonReader.endArray();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    qorVarHnj = qorVar;
                    dseVar2 = dseVar3;
                    dklVarQor = dklVar;
                    break;
                case 1:
                    dklVarQor2 = gjv.qor(jsonReader, dseVar);
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 2:
                    jsonReader.beginObject();
                    int iNextInt = -1;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        if (strNextName3.equals(CampaignEx.JSON_KEY_AD_K)) {
                            qorVarHnj = gjv.hnj(jsonReader, dseVar, iNextInt);
                        } else if (strNextName3.equals(TtmlNode.TAG_P)) {
                            iNextInt = jsonReader.nextInt();
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 3:
                    gjvVarHn = gjv.hn(jsonReader, dseVar);
                    strNextString = str;
                    dseVar2 = dseVar3;
                    break;
                case 4:
                    dklVarQor = gjv.qor(jsonReader, dseVar);
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 5:
                    dseVar2 = jsonReader.nextInt() == i10 ? com.bytedance.adsdk.hn.qor.hn.dse.LINEAR : com.bytedance.adsdk.hn.qor.hn.dse.RADIAL;
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    break;
                case 6:
                    hnVarHnj = gjv.hnj(jsonReader, dseVar);
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 7:
                    zNextBoolean = jsonReader.nextBoolean();
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 8:
                    hnjVar = com.bytedance.adsdk.hn.qor.hn.oj.hnj.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 9:
                    hnVar = com.bytedance.adsdk.hn.qor.hn.oj.hn.values()[jsonReader.nextInt() - 1];
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 10:
                    fNextDouble = (float) jsonReader.nextDouble();
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                case 11:
                    strNextString = jsonReader.nextString();
                    gjvVarHn = gjvVar;
                    dseVar2 = dseVar3;
                    break;
                default:
                    jsonReader.skipValue();
                    qorVar = qorVarHnj;
                    dklVar = dklVarQor;
                    strNextString = str;
                    gjvVarHn = gjvVar;
                    qorVarHnj = qorVar;
                    dseVar2 = dseVar3;
                    dklVarQor = dklVar;
                    break;
            }
        }
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVar2 = gjvVarHn;
        return new com.bytedance.adsdk.hn.qor.hn.dkl(strNextString, dseVar2, qorVarHnj, gjvVar2 == null ? new com.bytedance.adsdk.hn.qor.hnj.gjv(Collections.singletonList(new com.bytedance.adsdk.hn.dse.hnj(100))) : gjvVar2, dklVarQor, dklVarQor2, hnVarHnj, hnjVar, hnVar, fNextDouble, arrayList, hnVar2, zNextBoolean);
    }
}
