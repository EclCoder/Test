package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class dnm {
    private com.bytedance.adsdk.hn.qor.hnj.hn gjv;

    /* JADX INFO: renamed from: hn, reason: collision with root package name */
    private com.bytedance.adsdk.hn.qor.hnj.hn f12131hn;
    private com.bytedance.adsdk.hn.qor.hnj.hnj hnj;
    private com.bytedance.adsdk.hn.qor.hnj.hn qor;

    /* JADX INFO: renamed from: sk, reason: collision with root package name */
    private com.bytedance.adsdk.hn.qor.hnj.hn f12132sk;

    private void hn(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        jsonReader.beginObject();
        String strNextString = "";
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("v")) {
                strNextString.getClass();
                switch (strNextString) {
                    case "Distance":
                        this.gjv = gjv.hnj(jsonReader, dseVar);
                        break;
                    case "Opacity":
                        this.f12131hn = gjv.hnj(jsonReader, dseVar, false);
                        break;
                    case "Direction":
                        this.qor = gjv.hnj(jsonReader, dseVar, false);
                        break;
                    case "Shadow Color":
                        this.hnj = gjv.dse(jsonReader, dseVar);
                        break;
                    case "Softness":
                        this.f12132sk = gjv.hnj(jsonReader, dseVar);
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            } else if (strNextName.equals("nm")) {
                strNextString = jsonReader.nextString();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
    }

    ta hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) throws IOException {
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar2;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar3;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar4;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("ef")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    hn(jsonReader, dseVar);
                }
                jsonReader.endArray();
            } else {
                jsonReader.skipValue();
            }
        }
        com.bytedance.adsdk.hn.qor.hnj.hnj hnjVar = this.hnj;
        if (hnjVar == null || (hnVar = this.f12131hn) == null || (hnVar2 = this.qor) == null || (hnVar3 = this.gjv) == null || (hnVar4 = this.f12132sk) == null) {
            return null;
        }
        return new ta(hnjVar, hnVar, hnVar2, hnVar3, hnVar4);
    }
}
