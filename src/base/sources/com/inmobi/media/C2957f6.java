package com.inmobi.media;

/* JADX INFO: renamed from: com.inmobi.media.f6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2957f6 implements Ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC2931e6 f26534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xn.h f26535b;

    public C2957f6(String url, EnumC2931e6 errorCode) {
        kotlin.jvm.internal.s.h(url, "url");
        kotlin.jvm.internal.s.h(errorCode, "errorCode");
        this.f26534a = errorCode;
        this.f26535b = xn.h.f56913e;
    }

    @Override // com.inmobi.media.Ve
    public final Object a() {
        return null;
    }

    @Override // com.inmobi.media.Ve
    public final Qe b() {
        return new Qe(0L, gl.l0.h(), 0, "");
    }

    @Override // com.inmobi.media.Ve
    public final int c() {
        return this.f26534a.f26471a;
    }

    @Override // com.inmobi.media.Ve
    public final xn.h d() {
        return this.f26535b;
    }

    @Override // com.inmobi.media.Ve
    public final String e() {
        return this.f26534a.name();
    }
}
