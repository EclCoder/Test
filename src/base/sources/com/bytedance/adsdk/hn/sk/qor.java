package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class qor {
    /* JADX WARN: Multi-variable type inference failed */
    private static boolean hn(com.bytedance.adsdk.hn.qor.hnj.hn hnVar) {
        if (hnVar != null) {
            return hnVar.hn() && ((Float) ((com.bytedance.adsdk.hn.dse.hnj) hnVar.qor().get(0)).hnj).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x0109  */
    public static com.bytedance.adsdk.hn.qor.hnj.bug hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) {
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj;
        com.bytedance.adsdk.hn.dse dseVar2 = dseVar;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_OBJECT;
        if (z10) {
            jsonReader.beginObject();
        }
        com.bytedance.adsdk.hn.qor.hnj.hn hnVar = null;
        com.bytedance.adsdk.hn.qor.hnj.sk skVarHnj = null;
        com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVarHn = null;
        com.bytedance.adsdk.hn.qor.hnj.dse dseVarGjv = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj2 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj3 = null;
        com.bytedance.adsdk.hn.qor.hnj.gjv gjvVarHn = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj4 = null;
        com.bytedance.adsdk.hn.qor.hnj.hn hnVarHnj5 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "a":
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals(CampaignEx.JSON_KEY_AD_K)) {
                            skVarHnj = hnj.hnj(jsonReader, dseVar);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    dseVar2 = dseVar;
                    break;
                case "o":
                    gjvVarHn = gjv.hn(jsonReader, dseVar);
                    dseVar2 = dseVar;
                    break;
                case "p":
                    orlVarHn = hnj.hn(jsonReader, dseVar);
                    dseVar2 = dseVar;
                    break;
                case "r":
                    hnVarHnj = gjv.hnj(jsonReader, dseVar2, false);
                    if (hnVarHnj.qor().isEmpty()) {
                        if (((com.bytedance.adsdk.hn.dse.hnj) hnVarHnj.qor().get(0)).hnj == 0) {
                            hnVar = hnVarHnj;
                            dseVar2 = dseVar;
                        } else {
                            hnVarHnj.qor().set(0, new com.bytedance.adsdk.hn.dse.hnj(dseVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(dseVar.dse())));
                        }
                        break;
                    } else {
                        hnVarHnj.qor().add(new com.bytedance.adsdk.hn.dse.hnj(dseVar2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(dseVar2.dse())));
                    }
                    dseVar2 = dseVar;
                    hnVar = hnVarHnj;
                    break;
                case "s":
                    dseVarGjv = gjv.gjv(jsonReader, dseVar);
                    break;
                case "eo":
                    hnVarHnj5 = gjv.hnj(jsonReader, dseVar2, false);
                    break;
                case "rz":
                    dseVar2.hnj("Lottie doesn't support 3D layers.");
                    hnVarHnj = gjv.hnj(jsonReader, dseVar2, false);
                    if (hnVarHnj.qor().isEmpty()) {
                        if (((com.bytedance.adsdk.hn.dse.hnj) hnVarHnj.qor().get(0)).hnj == 0) {
                            hnVar = hnVarHnj;
                            dseVar2 = dseVar;
                        } else {
                            hnVarHnj.qor().set(0, new com.bytedance.adsdk.hn.dse.hnj(dseVar, fValueOf, fValueOf, null, 0.0f, Float.valueOf(dseVar.dse())));
                        }
                        break;
                    } else {
                        hnVarHnj.qor().add(new com.bytedance.adsdk.hn.dse.hnj(dseVar2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(dseVar2.dse())));
                    }
                    dseVar2 = dseVar;
                    hnVar = hnVarHnj;
                    break;
                case "sa":
                    hnVarHnj3 = gjv.hnj(jsonReader, dseVar2, false);
                    break;
                case "sk":
                    hnVarHnj2 = gjv.hnj(jsonReader, dseVar2, false);
                    break;
                case "so":
                    hnVarHnj4 = gjv.hnj(jsonReader, dseVar2, false);
                    break;
                default:
                    jsonReader.skipValue();
                    dseVar2 = dseVar;
                    break;
            }
        }
        if (z10) {
            jsonReader.endObject();
        }
        return new com.bytedance.adsdk.hn.qor.hnj.bug(hnj(skVarHnj) ? null : skVarHnj, hnj(orlVarHn) ? null : orlVarHn, hnj(dseVarGjv) ? null : dseVarGjv, hnj(hnVar) ? null : hnVar, gjvVarHn, hnVarHnj4, hnVarHnj5, hn(hnVarHnj2) ? null : hnVarHnj2, qor(hnVarHnj3) ? null : hnVarHnj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean qor(com.bytedance.adsdk.hn.qor.hnj.hn hnVar) {
        if (hnVar != null) {
            return hnVar.hn() && ((Float) ((com.bytedance.adsdk.hn.dse.hnj) hnVar.qor().get(0)).hnj).floatValue() == 0.0f;
        }
        return true;
    }

    private static boolean hnj(com.bytedance.adsdk.hn.qor.hnj.sk skVar) {
        if (skVar != null) {
            return skVar.hn() && skVar.qor().get(0).hnj.equals(0.0f, 0.0f);
        }
        return true;
    }

    private static boolean hnj(com.bytedance.adsdk.hn.qor.hnj.orl<PointF, PointF> orlVar) {
        if (orlVar != null) {
            return !(orlVar instanceof com.bytedance.adsdk.hn.qor.hnj.ojm) && orlVar.hn() && orlVar.qor().get(0).hnj.equals(0.0f, 0.0f);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean hnj(com.bytedance.adsdk.hn.qor.hnj.hn hnVar) {
        if (hnVar != null) {
            return hnVar.hn() && ((Float) ((com.bytedance.adsdk.hn.dse.hnj) hnVar.qor().get(0)).hnj).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean hnj(com.bytedance.adsdk.hn.qor.hnj.dse dseVar) {
        if (dseVar != null) {
            return dseVar.hn() && ((com.bytedance.adsdk.hn.dse.qor) ((com.bytedance.adsdk.hn.dse.hnj) dseVar.qor().get(0)).hnj).hn(1.0f, 1.0f);
        }
        return true;
    }
}
