package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.sdk.component.dkl.hnj.gjv.hn.imh.UHbHibBvYxKnPE;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes2.dex */
class hqh {
    static com.bytedance.adsdk.hn.qor.hn.ta hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar, int i10) throws IOException {
        boolean zNextBoolean = false;
        boolean z10 = i10 == 3;
        String strNextString = null;
        com.bytedance.adsdk.hn.qor.hn.ta.hnj hnjVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVarHn = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj2 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj3 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj4 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj5 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj6 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            byte b10 = -1;
            switch (strNextName.hashCode()) {
                case 100:
                    if (strNextName.equals(UHbHibBvYxKnPE.RrE)) {
                        b10 = 0;
                    }
                    break;
                case ASSET_REQUEST_ERROR_VALUE:
                    if (strNextName.equals(TtmlNode.TAG_P)) {
                        b10 = 1;
                    }
                    break;
                case ASSET_WRITE_ERROR_VALUE:
                    if (strNextName.equals(CampaignEx.JSON_KEY_AD_R)) {
                        b10 = 2;
                    }
                    break;
                case 3324:
                    if (strNextName.equals("hd")) {
                        b10 = 3;
                    }
                    break;
                case 3369:
                    if (strNextName.equals("ir")) {
                        b10 = 4;
                    }
                    break;
                case 3370:
                    if (strNextName.equals("is")) {
                        b10 = 5;
                    }
                    break;
                case 3519:
                    if (strNextName.equals("nm")) {
                        b10 = 6;
                    }
                    break;
                case 3555:
                    if (strNextName.equals("or")) {
                        b10 = 7;
                    }
                    break;
                case 3556:
                    if (strNextName.equals("os")) {
                        b10 = 8;
                    }
                    break;
                case 3588:
                    if (strNextName.equals("pt")) {
                        b10 = 9;
                    }
                    break;
                case 3686:
                    if (strNextName.equals("sy")) {
                        b10 = 10;
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
                    hnVarHnj2 = gjv.hnj(jsonReader, dseVar, false);
                    break;
                case 3:
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case 4:
                    hnVarHnj3 = gjv.hnj(jsonReader, dseVar);
                    break;
                case 5:
                    hnVarHnj5 = gjv.hnj(jsonReader, dseVar, false);
                    break;
                case 6:
                    strNextString = jsonReader.nextString();
                    break;
                case 7:
                    hnVarHnj4 = gjv.hnj(jsonReader, dseVar);
                    break;
                case 8:
                    hnVarHnj6 = gjv.hnj(jsonReader, dseVar, false);
                    break;
                case 9:
                    hnVarHnj = gjv.hnj(jsonReader, dseVar, false);
                    break;
                case 10:
                    hnjVarHnj = com.bytedance.adsdk.hn.qor.hn.ta.hnj.hnj(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.hn.qor.hn.ta(strNextString, hnjVarHnj, hnVarHnj, orlVarHn, hnVarHnj2, hnVarHnj3, hnVarHnj4, hnVarHnj5, hnVarHnj6, zNextBoolean, z10);
    }
}
