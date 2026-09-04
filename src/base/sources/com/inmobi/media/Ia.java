package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class Ia extends Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f24994a;

    public Ia(JSONObject jsonObject) {
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        this.f24994a = jsonObject;
    }

    @Override // com.inmobi.media.Hi
    public final void a(xn.f bufferedSink) {
        kotlin.jvm.internal.s.h(bufferedSink, "bufferedSink");
        String string = this.f24994a.toString();
        kotlin.jvm.internal.s.g(string, "toString(...)");
        bufferedSink.N(string);
    }

    @Override // com.inmobi.media.Hi
    public final String a() {
        return "application/json";
    }
}
