package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class We implements Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xn.h f25944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Qe f25945c;

    public We(String resolvedUrl, int i10, xn.h bodyBytes, Qe responseMetaData) {
        kotlin.jvm.internal.s.h(resolvedUrl, "resolvedUrl");
        kotlin.jvm.internal.s.h(bodyBytes, "bodyBytes");
        kotlin.jvm.internal.s.h(responseMetaData, "responseMetaData");
        this.f25943a = i10;
        this.f25944b = bodyBytes;
        this.f25945c = responseMetaData;
    }

    @Override // com.inmobi.media.Ve
    public final Object a() {
        kotlin.jvm.internal.s.h(C3265r4.class, "clazz");
        kotlin.jvm.internal.s.h(C3265r4.class, "type");
        JSONObject jsonObject = new JSONObject(this.f25944b.F(bm.d.f9079b));
        kotlin.jvm.internal.s.h(jsonObject, "jsonObject");
        kotlin.jvm.internal.s.h(C3265r4.class, "type");
        return C3265r4.class.cast(AbstractC3323ta.a(jsonObject, C3265r4.class, null, null));
    }

    @Override // com.inmobi.media.Ve
    public final Qe b() {
        return this.f25945c;
    }

    @Override // com.inmobi.media.Ve
    public final int c() {
        return this.f25943a;
    }

    @Override // com.inmobi.media.Ve
    public final xn.h d() {
        return this.f25944b;
    }

    @Override // com.inmobi.media.Ve
    public final String e() {
        return null;
    }
}
