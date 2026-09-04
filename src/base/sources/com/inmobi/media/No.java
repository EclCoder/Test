package com.inmobi.media;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class No {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f25373a = new ConcurrentHashMap();

    public final JSONObject a() {
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : this.f25373a.entrySet()) {
                jSONObject.put(String.valueOf(Mf.a((Lf) entry.getKey())), ((Mo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (Exception e10) {
            fl.k kVar = W9.f25935a;
            W9.a(new M2(e10));
            return new JSONObject();
        }
    }
}
