package com.bytedance.adsdk.hn.sk;

import android.util.JsonReader;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes.dex */
public class oj implements xad<Integer> {
    public static final oj hnj = new oj();

    private oj() {
    }

    @Override // com.bytedance.adsdk.hn.sk.xad
    /* JADX INFO: renamed from: hnj, reason: merged with bridge method [inline-methods] */
    public Integer hn(JsonReader jsonReader, float f10) {
        return Integer.valueOf(Math.round(xn.hn(jsonReader) * f10));
    }
}
