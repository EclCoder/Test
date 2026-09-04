package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ua implements xad<com.bytedance.adsdk.hn.qor.hn.mjg> {
    public static final ua hnj = new ua();

    private ua() {
    }

    @Override // com.bytedance.adsdk.hn.sk.xad
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.hn.qor.hn.mjg hn(JsonReader jsonReader, float f10) throws IOException {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> listHnj = null;
        List<PointF> listHnj2 = null;
        List<PointF> listHnj3 = null;
        boolean zNextBoolean = false;
        while (true) {
            if (!jsonReader.hasNext()) {
                jsonReader.endObject();
                if (jsonReader.peek() == JsonToken.END_ARRAY) {
                    jsonReader.endArray();
                }
                if (listHnj == null || listHnj2 == null || listHnj3 == null) {
                    throw new IllegalArgumentException("Shape data was missing information.");
                }
                if (listHnj.isEmpty()) {
                    return new com.bytedance.adsdk.hn.qor.hn.mjg(new PointF(), false, Collections.EMPTY_LIST);
                }
                int size = listHnj.size();
                PointF pointF = listHnj.get(0);
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 1; i10 < size; i10++) {
                    PointF pointF2 = listHnj.get(i10);
                    int i11 = i10 - 1;
                    arrayList.add(new com.bytedance.adsdk.hn.qor.hnj(com.bytedance.adsdk.hn.dkl.sk.hnj(listHnj.get(i11), listHnj3.get(i11)), com.bytedance.adsdk.hn.dkl.sk.hnj(pointF2, listHnj2.get(i10)), pointF2));
                }
                if (zNextBoolean) {
                    PointF pointF3 = listHnj.get(0);
                    int i12 = size - 1;
                    arrayList.add(new com.bytedance.adsdk.hn.qor.hnj(com.bytedance.adsdk.hn.dkl.sk.hnj(listHnj.get(i12), listHnj3.get(i12)), com.bytedance.adsdk.hn.dkl.sk.hnj(pointF3, listHnj2.get(0)), pointF3));
                }
                return new com.bytedance.adsdk.hn.qor.hn.mjg(pointF, zNextBoolean, arrayList);
            }
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "c":
                    zNextBoolean = jsonReader.nextBoolean();
                    break;
                case "i":
                    listHnj2 = xn.hnj(jsonReader, f10);
                    break;
                case "o":
                    listHnj3 = xn.hnj(jsonReader, f10);
                    break;
                case "v":
                    listHnj = xn.hnj(jsonReader, f10);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
    }
}
