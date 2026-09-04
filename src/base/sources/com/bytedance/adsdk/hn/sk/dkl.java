package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.sdk.openadsdk.LXL.vHmGJpUTWNVV;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class dkl {
    static com.bytedance.adsdk.hn.qor.hn.hn hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, int i10) throws IOException {
        boolean z10 = i10 == 3;
        boolean zNextBoolean = false;
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVarHn = null;
        com.bytedance.adsdk.hn.qor.hnj.dkl dklVarQor = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case 100:
                    if (strNextName.equals(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D)) {
                        b10 = 0;
                    }
                    break;
                case ASSET_REQUEST_ERROR_VALUE:
                    if (strNextName.equals(vHmGJpUTWNVV.MeAuQHDJcjtru)) {
                        b10 = 1;
                    }
                    break;
                case INVALID_INDEX_URL_VALUE:
                    if (strNextName.equals("s")) {
                        b10 = 2;
                    }
                    break;
                case 3324:
                    if (strNextName.equals("hd")) {
                        b10 = 3;
                    }
                    break;
                case 3519:
                    if (strNextName.equals("nm")) {
                        b10 = 4;
                    }
                    break;
            }
            switch (b10) {
                case 0:
                    z10 = jsonReader.nextInt() == 3;
                    break;
                case 1:
                    orlVarHn = hnj.hn(jsonReader, dseVar);
                    break;
                case 2:
                    dklVarQor = gjv.qor(jsonReader, dseVar);
                    break;
                case 3:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 4:
                    strNextString = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.hn.qor.hn.hn(strNextString, orlVarHn, dklVarQor, z10, zNextBoolean);
    }
}
