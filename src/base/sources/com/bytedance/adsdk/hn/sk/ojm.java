package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ojm implements xad<com.bytedance.adsdk.hn.qor.hn> {
    public static final ojm hnj = new ojm();

    private ojm() {
    }

    @Override // com.bytedance.adsdk.hn.sk.xad
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.hn.qor.hn hn(JsonReader jsonReader, float f10) throws IOException {
        com.bytedance.adsdk.hn.qor.hn.hnj hnjVar = com.bytedance.adsdk.hn.qor.hn.hnj.CENTER;
        jsonReader.beginObject();
        com.bytedance.adsdk.hn.qor.hn.hnj hnjVar2 = hnjVar;
        String strNextString = null;
        String strNextString2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        float fNextDouble4 = 0.0f;
        int iNextInt = 0;
        int iHnj = 0;
        int iHnj2 = 0;
        boolean zNextBoolean = true;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "f":
                    strNextString2 = jsonReader.nextString();
                    break;
                case "j":
                    int iNextInt2 = jsonReader.nextInt();
                    hnjVar2 = com.bytedance.adsdk.hn.qor.hn.hnj.CENTER;
                    if (iNextInt2 <= hnjVar2.ordinal() && iNextInt2 >= 0) {
                        hnjVar2 = com.bytedance.adsdk.hn.qor.hn.hnj.values()[iNextInt2];
                        break;
                    } else {
                        break;
                    }
                    break;
                case "s":
                    fNextDouble = (float) jsonReader.nextDouble();
                    break;
                case "t":
                    strNextString = jsonReader.nextString();
                    break;
                case "fc":
                    iHnj = xn.hnj(jsonReader);
                    break;
                case "lh":
                    fNextDouble2 = (float) jsonReader.nextDouble();
                    break;
                case "ls":
                    fNextDouble3 = (float) jsonReader.nextDouble();
                    break;
                case "of":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "ps":
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case "sc":
                    iHnj2 = xn.hnj(jsonReader);
                    break;
                case "sw":
                    fNextDouble4 = (float) jsonReader.nextDouble();
                    break;
                case "sz":
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case "tr":
                    iNextInt = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new com.bytedance.adsdk.hn.qor.hn(strNextString, strNextString2, fNextDouble, hnjVar2, iNextInt, fNextDouble2, fNextDouble3, iHnj, iHnj2, fNextDouble4, zNextBoolean, pointF, pointF2);
    }
}
