package com.inmobi.media;

import com.google.api.client.http.UrlEncodedParser;
import java.util.HashMap;

/* JADX INFO: renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2881c7 extends Hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f26304a;

    public C2881c7(HashMap payload, int i10) {
        kotlin.jvm.internal.s.h(payload, "payload");
        this.f26304a = payload;
    }

    @Override // com.inmobi.media.Hi
    public final void a(xn.f bufferedSink) {
        kotlin.jvm.internal.s.h(bufferedSink, "bufferedSink");
        bufferedSink.N(J3.a(this.f26304a));
    }

    @Override // com.inmobi.media.Hi
    public final String a() {
        return UrlEncodedParser.CONTENT_TYPE;
    }

    public C2881c7(HashMap payload) {
        kotlin.jvm.internal.s.h(payload, "payload");
        this.f26304a = payload;
    }
}
