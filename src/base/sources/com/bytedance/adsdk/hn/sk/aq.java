package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.b;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class aq {
    static com.bytedance.adsdk.hn.qor.hn.qor hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) {
        com.bytedance.adsdk.hn.qor.hn.qor qorVarHnj;
        String strNextString;
        jsonReader.beginObject();
        byte b10 = 2;
        int iNextInt = 2;
        while (true) {
            qorVarHnj = null;
            if (!jsonReader.hasNext()) {
                strNextString = null;
                break;
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (!strNextName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                if (strNextName.equals("ty")) {
                    strNextString = jsonReader.nextString();
                    break;
                }
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
            }
        }
        if (strNextString == null) {
            return null;
        }
        switch (strNextString.hashCode()) {
            case 3239:
                b10 = !strNextString.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b10 = !strNextString.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strNextString.equals("gf")) {
                    b10 = -1;
                }
                break;
            case 3307:
                b10 = !strNextString.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b10 = !strNextString.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b10 = !strNextString.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b10 = !strNextString.equals(DownloadCommon.DOWNLOAD_REPORT_RETRY_COUNT) ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b10 = !strNextString.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b10 = !strNextString.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b10 = !strNextString.equals(b.JSON_KEY_SH) ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b10 = !strNextString.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b10 = !strNextString.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b10 = !strNextString.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b10 = !strNextString.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
                qorVarHnj = dkl.hnj(jsonReader, dseVar, iNextInt);
                break;
            case 1:
                qorVarHnj = fvt.hnj(jsonReader, dseVar);
                break;
            case 2:
                qorVarHnj = jip.hnj(jsonReader, dseVar);
                break;
            case 3:
                qorVarHnj = orp.hnj(jsonReader, dseVar);
                break;
            case 4:
                qorVarHnj = uua.hnj(jsonReader, dseVar);
                break;
            case 5:
                qorVarHnj = tu.hnj(jsonReader);
                dseVar.hnj("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                qorVarHnj = nyv.hnj(jsonReader, dseVar);
                break;
            case 7:
                qorVarHnj = gm.hnj(jsonReader, dseVar);
                break;
            case 8:
                qorVarHnj = pty.hnj(jsonReader, dseVar);
                break;
            case 9:
                qorVarHnj = sq.hnj(jsonReader, dseVar);
                break;
            case 10:
                qorVarHnj = hqh.hnj(jsonReader, dseVar, iNextInt);
                break;
            case 11:
                qorVarHnj = jbd.hnj(jsonReader, dseVar);
                break;
            case 12:
                qorVarHnj = ff.hnj(jsonReader, dseVar);
                break;
            case 13:
                qorVarHnj = qor.hnj(jsonReader, dseVar);
                break;
        }
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endObject();
        return qorVarHnj;
    }
}
