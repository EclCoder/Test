package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;
import android.util.JsonToken;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
class tgn {
    static com.bytedance.adsdk.hn.hnj.hn.ojm hnj(JsonReader jsonReader, com.bytedance.adsdk.hn.dse dseVar) {
        return new com.bytedance.adsdk.hn.hnj.hn.ojm(dseVar, apu.hnj(jsonReader, dseVar, com.bytedance.adsdk.hn.dkl.dkl.hnj(), xyo.hnj, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
