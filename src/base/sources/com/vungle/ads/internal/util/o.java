package com.vungle.ads.internal.util;

import gl.l0;
import kotlinx.serialization.json.d0;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class o {
    public static final o INSTANCE = new o();

    private o() {
    }

    public final String getContentStringValue(d0 json, String key) {
        kotlin.jvm.internal.s.h(json, "json");
        kotlin.jvm.internal.s.h(key, "key");
        try {
            return kotlinx.serialization.json.k.k((kotlinx.serialization.json.i) l0.i(json, key)).a();
        } catch (Exception unused) {
            return null;
        }
    }
}
