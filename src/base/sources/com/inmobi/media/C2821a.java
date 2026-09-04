package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C2821a extends R0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f26161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f26162c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2821a(byte[] response, long j10, C3348u9 c3348u9) {
        super(c3348u9);
        kotlin.jvm.internal.s.h(response, "response");
        this.f26161b = response;
        this.f26162c = j10;
    }

    @Override // com.inmobi.media.R0
    public final fl.g0 a(AdResponse adResponse, Function1 function1) {
        C3348u9 c3348u9 = this.f25576a;
        if (c3348u9 != null) {
            c3348u9.a("ABAdResponseManager", "Instance PLId: " + this.f26162c + ", Response PLId: " + adResponse.getPlacementId());
        }
        V0.a(adResponse, this.f25576a, function1);
        return fl.g0.f38750a;
    }

    @Override // com.inmobi.media.R0
    public final Object a(kl.f fVar) {
        return new String(this.f26161b, bm.d.f9079b);
    }
}
