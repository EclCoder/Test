package com.facebook.internal;

import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes4.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f15464a = new w0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f15465b = new ConcurrentHashMap();

    private w0() {
    }

    public static final JSONObject a(String accessToken) {
        kotlin.jvm.internal.s.h(accessToken, "accessToken");
        return (JSONObject) f15465b.get(accessToken);
    }

    public static final void b(String key, JSONObject value) {
        kotlin.jvm.internal.s.h(key, "key");
        kotlin.jvm.internal.s.h(value, "value");
        f15465b.put(key, value);
    }
}
