package com.inmobi.media;

import com.inmobi.media.core.config.models.SignalsConfig;

/* JADX INFO: renamed from: com.inmobi.media.of, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-1868b3f846f91b929d17a1f0de6da199bc8101b6e9bb94a36f131322636ef84b */
/* JADX INFO: loaded from: classes6.dex */
public final class C3199of extends AbstractC3134m2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3147mf f27135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3348u9 f27136c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3199of(SignalsConfig.NovatiqConfig mConfig, C3147mf data, C3348u9 c3348u9) {
        super(mConfig.getBeaconUrl());
        kotlin.jvm.internal.s.h(mConfig, "mConfig");
        kotlin.jvm.internal.s.h(data, "data");
        this.f27135b = data;
        this.f27136c = c3348u9;
    }

    public final Re a() {
        C3348u9 c3348u9 = this.f27136c;
        if (c3348u9 != null) {
            C3147mf c3147mf = this.f27135b;
            c3348u9.a("Novatiq", "preparing Novatiq request with data - hyperId - " + c3147mf.f26995a + " - sspHost - " + c3147mf.f26996b + " - pubId - inmobi");
        }
        String str = this.f26970a;
        fl.q qVarA = fl.w.a("sptoken", this.f27135b.f26995a);
        this.f27135b.getClass();
        fl.q qVarA2 = fl.w.a("sspid", "i6i");
        fl.q qVarA3 = fl.w.a("ssphost", this.f27135b.f26996b);
        this.f27135b.getClass();
        return new Re(str, null, null, gl.l0.l(qVarA, qVarA2, qVarA3, fl.w.a("pubid", "inmobi")), null, false, 54);
    }
}
