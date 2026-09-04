package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class ul implements xad<com.bytedance.adsdk.hn.dse.qor> {
    public static final ul hnj = new ul();

    private ul() {
    }

    @Override // com.bytedance.adsdk.hn.sk.xad
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.hn.dse.qor hn(JsonReader jsonReader, float f10) throws IOException {
        boolean z10 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z10) {
            jsonReader.beginArray();
        }
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z10) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.hn.dse.qor((fNextDouble / 100.0f) * f10, (fNextDouble2 / 100.0f) * f10);
    }
}
