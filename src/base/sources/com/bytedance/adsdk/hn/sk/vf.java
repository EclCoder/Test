package com.bytedance.adsdk.hn.sk;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class vf implements xad<PointF> {
    public static final vf hnj = new vf();

    private vf() {
    }

    @Override // com.bytedance.adsdk.hn.sk.xad
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public PointF hn(JsonReader jsonReader, float f10) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        if (jsonTokenPeek == JsonToken.BEGIN_ARRAY) {
            return xn.hn(jsonReader, f10);
        }
        if (jsonTokenPeek == JsonToken.BEGIN_OBJECT) {
            return xn.hn(jsonReader, f10);
        }
        if (jsonTokenPeek != JsonToken.NUMBER) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(jsonTokenPeek)));
        }
        PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f10, ((float) jsonReader.nextDouble()) * f10);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return pointF;
    }
}
